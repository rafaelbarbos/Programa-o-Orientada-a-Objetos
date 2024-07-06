import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeArquivo {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = carregarFuncionarios("funcionarios.txt");

        for (Funcionario f : funcionarios) {
            System.out.println(f.mostraFuncionario());
        }

        double impostoTotalMasculino = 0;
        double impostoTotalFeminino = 0;

        for (Funcionario f : funcionarios) {
            if (f.sexo == 'M' || f.sexo == 'm') {
                impostoTotalMasculino += f.impostoRenda();
            } else if (f.sexo == 'F' || f.sexo == 'f') {
                impostoTotalFeminino += f.impostoRenda();
            }
        }

        double impostoTotal = impostoTotalMasculino + impostoTotalFeminino;
        System.out.println("Total de Imposto de Renda (Masculino): " + impostoTotalMasculino);
        System.out.println("Total de Imposto de Renda (Feminino): " + impostoTotalFeminino);
        System.out.println("Total de Imposto de Renda (Geral): " + impostoTotal);
    }

    public static List<Funcionario> carregarFuncionarios(String fileName) {
        List<Funcionario> funcionarios = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split("#");

                String nome = campos[0];
                char sexo = campos[1].charAt(0);
                double salario = Double.parseDouble(campos[2]);
                int dependentes = Integer.parseInt(campos[3]);

                Funcionario funcionario = new Funcionario(nome, sexo, salario, dependentes);
                funcionarios.add(funcionario);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return funcionarios;
    }
}
