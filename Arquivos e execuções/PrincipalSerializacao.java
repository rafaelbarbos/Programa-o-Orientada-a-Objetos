import java.util.List;

public class PrincipalSerializacao {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = LeArquivo.carregarFuncionarios("funcionarios.txt");

        // Serializa os funcionários
        SerializaFuncionarios.serializa(funcionarios, "funcionarios.ser");

        // Desserializa os funcionários e exibe os dados
        List<Funcionario> funcionariosDesserializados = DesserializaFuncionarios.desserializa("funcionarios.ser");

        double impostoTotalMasculino = 0;
        double impostoTotalFeminino = 0;

        for (Funcionario funcionario : funcionariosDesserializados) {
            System.out.println(funcionario.mostraFuncionario());

            if (funcionario.sexo == 'M' || funcionario.sexo == 'm') {
                impostoTotalMasculino += funcionario.impostoRenda();
            } else if (funcionario.sexo == 'F' || funcionario.sexo == 'f') {
                impostoTotalFeminino += funcionario.impostoRenda();
            }
        }

        double impostoTotal = impostoTotalMasculino + impostoTotalFeminino;
        System.out.println("Total de Imposto de Renda (Masculino): " + impostoTotalMasculino);
        System.out.println("Total de Imposto de Renda (Feminino): " + impostoTotalFeminino);
        System.out.println("Total de Imposto de Renda (Geral): " + impostoTotal);
    }
}
