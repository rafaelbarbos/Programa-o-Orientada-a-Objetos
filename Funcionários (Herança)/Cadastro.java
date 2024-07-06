package atividadeHerança2;

import atividadeHerança2.Cliente;
import atividadeHerança2.Funcionario;
import atividadeHerança2.Gerente;

import javax.swing.JOptionPane;

public class Cadastro {

    public void cadastrarPessoa() {
        // Pergunta ao usuário qual tipo de pessoa deseja criar
        String tipoPessoa = JOptionPane.showInputDialog("Deseja criar um Funcionário, Gerente ou Cliente? Digite 'funcionario', 'gerente' ou 'cliente':");

        // Verifica a resposta do usuário e realiza a ação correspondente
        if (tipoPessoa.equalsIgnoreCase("funcionario")) {
            criarFuncionario();
        } else if (tipoPessoa.equalsIgnoreCase("gerente")) {
            criarGerente();
        } else if (tipoPessoa.equalsIgnoreCase("cliente")) {
            criarCliente();
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de pessoa inválido. Digite 'funcionario', 'gerente' ou 'cliente'.");
        }
    }

    public void criarFuncionario() {
        // Solicita os dados para criar um funcionário comum
        String nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
        int telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone do funcionário:"));
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do funcionário:"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário:"));
        String horario = JOptionPane.showInputDialog("Digite o horário de trabalho do funcionário:");

        // Cria um objeto Funcionario
        Funcionario funcionario = new Funcionario(nome, telefone, matricula, salario, horario);

        // Aumenta o salário do funcionário em 10%
        funcionario.aumentarSalario(10);

        // Mostra os dados do funcionário e o recebimento anual
        JOptionPane.showMessageDialog(null, "Dados do Funcionário:\n" +
                funcionario.getNome() + "\nTelefone: " + funcionario.getTelefone() +
                "\nMatrícula: " + funcionario.getMatricula() + "\nSalário: " + funcionario.getSalario() +
                "\nHorário: " + funcionario.getHorario() + "\nRecebimento anual: " + funcionario.recebimentoAnual());
    }

    public void criarGerente() {
        // Solicita os dados para criar um gerente
        String nome = JOptionPane.showInputDialog("Digite o nome do gerente:");
        int telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone do gerente:"));
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do gerente:"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do gerente:"));
        String horario = JOptionPane.showInputDialog("Digite o horário de trabalho do gerente:");
        double bonificacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a bonificação mensal do gerente:"));
        String tipo = JOptionPane.showInputDialog("Digite o tipo do gerente ('PF' ou 'PJ'):");

        // Cria um objeto Gerente
        Gerente gerente = new Gerente(nome, telefone, matricula, salario, horario, bonificacao, tipo);

        // Aumenta o salário do gerente em 20%
        gerente.aumentarSalario(20);

        // Mostra os dados do gerente e o recebimento anual
        JOptionPane.showMessageDialog(null, "Dados do Gerente:\n" +
                gerente.getNome() + "\nTelefone: " + gerente.getTelefone() +
                "\nMatrícula: " + gerente.getMatricula() + "\nSalário: " + gerente.getSalario() +
                "\nHorário: " + gerente.getHorario() + "\nBonificação: " + gerente.getBonificacao() +
                "\nTipo: " + gerente.getTipo() + "\nRecebimento anual: " + gerente.recebimentoAnual());
    }

    public void criarCliente() {
        // Solicita os dados para criar um cliente
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
        int telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone do cliente:"));
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente:"));
        String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente:");

        // Cria um objeto Cliente
        Cliente cliente = new Cliente(nome, telefone, idade, cpf);

        // Mostra os dados do cliente
        JOptionPane.showMessageDialog(null, "Dados do Cliente:\n" + cliente.mostrarDados());

        // Pergunta ao usuário se deseja desativar o cliente
        int opcaoDesativar = JOptionPane.showConfirmDialog(null, "Deseja desativar o cliente?");
        if (opcaoDesativar == JOptionPane.YES_OPTION) {
            cliente.desativarCliente();
            JOptionPane.showMessageDialog(null, "Cliente desativado.\nDados do Cliente:\n" + cliente.mostrarDados());
        }
    }

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        cadastro.cadastrarPessoa();
    }
}
