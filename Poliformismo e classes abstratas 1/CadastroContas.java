import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import Atividade.Cliente;
import Atividade.ContaPoupanca;
import Atividade.ContaCorrente;
import Atividade.ContaSalario;
import Atividade.Conta;

public class CadastroContas {
    private static List<Conta> contas = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String[] opcoes = {"Cadastrar Conta", "Depositar", "Sacar", "Atualizar Saldo (Poupança)",
                    "Transferir", "Exibir Contas", "Excluir Conta", "Gerar Relatório", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            switch (escolha) {
                case 0:
                    cadastrarConta();
                    break;
                case 1:
                    realizarDeposito();
                    break;
                case 2:
                    realizarSaque();
                    break;
                case 3:
                    atualizarSaldoPoupanca();
                    break;
                case 4:
                    realizarTransferencia();
                    break;
                case 5:
                    exibirContas();
                    break;
                case 6:
                    excluirConta();
                    break;
                case 7:
                    gerarRelatorio();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }

    private static void cadastrarConta() {
        String numeroContaStr = JOptionPane.showInputDialog("Digite o número da conta (0 para sair):");
        int numeroConta;
        try {
            numeroConta = Integer.parseInt(numeroContaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número da conta inválido.");
            return;
        }

        if (numeroConta == 0) {
            return;
        }

        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");
        String telefoneCliente = JOptionPane.showInputDialog("Digite o telefone do cliente:");
        Cliente cliente = new Cliente(nomeCliente, telefoneCliente);

        String[] tiposConta = {"Corrente", "Salário", "Poupança"};
        int tipoContaIndex = JOptionPane.showOptionDialog(null,
                "Escolha o tipo de conta:",
                "Tipo de Conta",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                tiposConta,
                tiposConta[0]);

        if (tipoContaIndex == JOptionPane.CLOSED_OPTION) {
            return;
        }

        Conta conta;
        switch (tipoContaIndex) {
            case 0:
                conta = new ContaCorrente(numeroConta, cliente);
                break;
            case 1:
                conta = new ContaSalario(numeroConta, cliente);
                break;
            case 2:
                conta = new ContaPoupanca(numeroConta, cliente);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de conta inválido! Criando Conta Corrente por padrão.");
                conta = new ContaCorrente(numeroConta, cliente);
                break;
        }

        contas.add(conta);
    }

    private static void realizarDeposito() {
        Conta conta = selecionarConta("Digite o número da conta para depósito:");
        if (conta != null) {
            String valorStr = JOptionPane.showInputDialog("Digite o valor a depositar:");
            double valor;
            try {
                valor = Double.parseDouble(valorStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor de depósito inválido.");
                return;
            }

            if (valor <= 0) {
                JOptionPane.showMessageDialog(null, "Valor de depósito deve ser maior que zero.");
                return;
            }

            conta.depositar(valor);
            JOptionPane.showMessageDialog(null, "Depósito realizado. Saldo atual: " + conta.getSaldo());
        }
    }

    private static void realizarSaque() {
        Conta conta = selecionarConta("Digite o número da conta para saque:");
        if (conta != null) {
            String valorStr = JOptionPane.showInputDialog("Digite o valor a sacar:");
            double valor;
            try {
                valor = Double.parseDouble(valorStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor de saque inválido.");
                return;
            }

            if (valor <= 0) {
                JOptionPane.showMessageDialog(null, "Valor de saque deve ser maior que zero.");
                return;
            }

            if (conta.getSaldo() < valor) {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente para o saque.");
                return;
            }

            conta.sacar(valor);
            JOptionPane.showMessageDialog(null, "Saque realizado. Saldo atual: " + conta.getSaldo());
        }
    }

    private static void atualizarSaldoPoupanca() {
        Conta conta = selecionarConta("Digite o número da Conta Poupança:");
        if (conta instanceof ContaPoupanca) {
            String percentualStr = JOptionPane.showInputDialog("Digite o percentual de atualização (%):");
            double percentual;
            try {
                percentual = Double.parseDouble(percentualStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Percentual inválido.");
                return;
            }

            if (percentual <= 0) {
                JOptionPane.showMessageDialog(null, "Percentual deve ser maior que zero.");
                return;
            }

            ((ContaPoupanca) conta).atualizarSaldo(percentual);
            JOptionPane.showMessageDialog(null, "Saldo atualizado. Saldo atual: " + conta.getSaldo());
        } else {
            JOptionPane.showMessageDialog(null, "Conta não é do tipo Poupança.");
        }
    }

    private static void realizarTransferencia() {
        Conta contaOrigem = selecionarConta("Digite o número da conta de origem:");
        Conta contaDestino = selecionarConta("Digite o número da conta de destino:");
        if (contaOrigem != null && contaDestino != null) {
            String valorStr = JOptionPane.showInputDialog("Digite o valor a transferir:");
            double valor;
            try {
                valor = Double.parseDouble(valorStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor de transferência inválido.");
                return;
            }

            if (valor <= 0) {
                JOptionPane.showMessageDialog(null, "Valor de transferência deve ser maior que zero.");
                return;
            }

            if (contaOrigem.getSaldo() < valor) {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente para a transferência.");
                return;
            }

            contaOrigem.transferir(valor, contaDestino);
            JOptionPane.showMessageDialog(null, "Transferência realizada. Saldos atualizados:\n" +
                    "Conta de Origem: " + contaOrigem + "\n" +
                    "Conta de Destino: " + contaDestino);
        }
    }

    private static Conta selecionarConta(String mensagem) {
        String numeroContaStr = JOptionPane.showInputDialog(mensagem);
        int numeroConta;
        try {
            numeroConta = Integer.parseInt(numeroContaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número de conta inválido.");
            return null;
        }

        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }

        JOptionPane.showMessageDialog(null, "Conta não encontrada.");
        return null;
    }

    private static void exibirContas() {
        StringBuilder resultado = new StringBuilder("Contas Cadastradas:\n");
        for (Conta conta : contas) {
            resultado.append(conta.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    private static void excluirConta() {
        Conta conta = selecionarConta("Digite o número da conta para excluir:");
        if (conta != null) {
            contas.remove(conta);
            JOptionPane.showMessageDialog(null, "Conta excluída com sucesso.");
        }
    }

    private static void gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder("Relatório de Contas:\n");
        double totalSaldo = 0;
        for (Conta conta : contas) {
            relatorio.append(conta.toString()).append("\n");
            totalSaldo += conta.getSaldo();
        }
        relatorio.append("\nTotal de saldo em todas as contas: R$ ").append(String.format("%.2f", totalSaldo));
        JOptionPane.showMessageDialog(null, relatorio.toString());
    }
}
