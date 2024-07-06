package Atividade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestarConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista para armazenar as contas
        List<Conta> contas = new ArrayList<>();

        // Solicitar o número de contas
        System.out.print("Quantas contas deseja criar? ");
        int numContas = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        // Recolher dados de cada conta
        for (int i = 0; i < numContas; i++) {
            System.out.println("\nConta " + (i + 1));

            // Solicitar dados do cliente
            System.out.print("Nome do Cliente: ");
            String nome = scanner.nextLine();

            System.out.print("Telefone do Cliente: ");
            String telefone = scanner.nextLine();

            // Criar cliente
            Cliente cliente = new Cliente(nome, telefone);

            // Solicitar tipo de conta
            System.out.print("Tipo de Conta (1-Corrente, 2-Poupança, 3-Salário): ");
            int tipoConta = scanner.nextInt();

            // Solicitar número da conta
            System.out.print("Número da Conta: ");
            int numeroConta = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            // Criar conta de acordo com o tipo escolhido
            Conta conta;
            switch (tipoConta) {
                case 1:
                    conta = new ContaCorrente(numeroConta, cliente);
                    break;
                case 2:
                    conta = new ContaPoupanca(numeroConta, cliente);
                    break;
                case 3:
                    conta = new ContaSalario(numeroConta, cliente);
                    break;
                default:
                    System.out.println("Tipo de conta inválido. Criando Conta Corrente por padrão.");
                    conta = new ContaCorrente(numeroConta, cliente);
                    break;
            }

            // Adicionar conta à lista
            contas.add(conta);
        }

        // Menu de operações
        int opcao;
        do {
            System.out.println("\nMenu de Operações:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Atualizar Saldo (Poupança)");
            System.out.println("4. Transferir");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1: // Depositar
                    realizarDeposito(scanner, contas);
                    break;
                case 2: // Sacar
                    realizarSaque(scanner, contas);
                    break;
                case 3: // Atualizar Saldo (Poupança)
                    atualizarSaldoPoupanca(scanner, contas);
                    break;
                case 4: // Transferir
                    realizarTransferencia(scanner, contas);
                    break;
                case 5: // Sair
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        // Exibir todas as contas cadastradas
        System.out.println("\nContas Cadastradas:");
        for (Conta conta : contas) {
            System.out.println(conta);
        }

        // Fechar scanner
        scanner.close();
    }

    // Método para realizar depósito
    private static void realizarDeposito(Scanner scanner, List<Conta> contas) {
        System.out.print("Número da Conta para Depósito: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Valor a Depositar: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha

        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                conta.depositar(valor);
                System.out.println("Depósito realizado. Saldo atual: " + conta.getSaldo());
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

    // Método para realizar saque
    private static void realizarSaque(Scanner scanner, List<Conta> contas) {
        System.out.print("Número da Conta para Saque: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Valor a Sacar: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha

        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                conta.sacar(valor);
                System.out.println("Saque realizado. Saldo atual: " + conta.getSaldo());
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

    // Método para atualizar saldo da poupança
    private static void atualizarSaldoPoupanca(Scanner scanner, List<Conta> contas) {
        System.out.print("Número da Conta Poupança: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Percentual de Atualização (%): ");
        double percentual = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha

        for (Conta conta : contas) {
            if (conta instanceof ContaPoupanca && conta.getNumero() == numeroConta) {
                ((ContaPoupanca) conta).atualizaSaldo(percentual);
                System.out.println("Saldo atualizado. Saldo atual: " + conta.getSaldo());
                return;
            }
        }
        System.out.println("Conta Poupança não encontrada.");
    }

    // Método para realizar transferência
    private static void realizarTransferencia(Scanner scanner, List<Conta> contas) {
        System.out.print("Número da Conta de Origem: ");
        int numeroContaOrigem = scanner.nextInt();
        System.out.print("Número da Conta de Destino: ");
        int numeroContaDestino = scanner.nextInt();
        System.out.print("Valor a Transferir: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha

        Conta contaOrigem = null;
        Conta contaDestino = null;

        // Buscar contas de origem e destino
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroContaOrigem) {
                contaOrigem = conta;
            }
            if (conta.getNumero() == numeroContaDestino) {
                contaDestino = conta;
            }
        }

        // Realizar transferência se ambas as contas foram encontradas
        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.transferir(valor, contaDestino);
            System.out.println("Transferência realizada. Saldos atualizados:");
            System.out.println("Conta de Origem: " + contaOrigem);
            System.out.println("Conta de Destino: " + contaDestino);
        } else {
            System.out.println("Conta de origem ou destino não encontrada.");
        }
    }
}
