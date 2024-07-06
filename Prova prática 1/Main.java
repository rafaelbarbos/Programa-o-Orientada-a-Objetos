import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Usuario usuario1 = cadastrarUsuario(scanner);
        Usuario usuario2 = cadastrarUsuario(scanner);

        Evento evento1 = cadastrarEvento(scanner);
        Evento evento2 = cadastrarEventoPatrocinado(scanner);

        cadastrarPalestras(scanner, evento1);
        cadastrarPalestras(scanner, evento2);

        usuario1.adicionarEvento(evento1);
        usuario1.adicionarEvento(evento2);
        usuario2.adicionarEvento(evento1);

        // Exibição dos usuários e seus eventos e palestras
        System.out.println("\nDetalhes dos usuários e seus eventos:");

        exibirDetalhesUsuario(usuario1);
        exibirDetalhesUsuario(usuario2);
    }

    // Método para cadastrar um novo usuário
    private static Usuario cadastrarUsuario(Scanner scanner) {
        System.out.println("\nCadastro de Usuário:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        return new Usuario(nome, email, senha);
    }

    // Método para cadastrar um novo evento
    private static Evento cadastrarEvento(Scanner scanner) {
        System.out.println("\nCadastro de Evento:");
        System.out.print("Descrição do Evento: ");
        String descricao = scanner.nextLine();

        return new Evento(descricao);
    }

    // Método para cadastrar um novo evento patrocinado
    private static EventoPatrocinado cadastrarEventoPatrocinado(Scanner scanner) {
        System.out.println("\nCadastro de Evento Patrocinado:");
        System.out.print("Descrição do Evento: ");
        String descricao = scanner.nextLine();
        System.out.print("Nome do Patrocinador: ");
        String nomePatrocinador = scanner.nextLine();
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner

        return new EventoPatrocinado(descricao, nomePatrocinador, valor);
    }

    // Método para cadastrar palestras em um evento
    private static void cadastrarPalestras(Scanner scanner, Evento evento) {
        System.out.println("\nCadastro de Palestras para o Evento \"" + evento.getDescricao() + "\":");

        while (true) {
            System.out.print("Nome da Palestra (ou digite \"fim\" para sair): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Data: ");
            String data = scanner.nextLine();
            System.out.print("Hora Inicial: ");
            String horaInicial = scanner.nextLine();
            System.out.print("Hora Final: ");
            String horaFinal = scanner.nextLine();
            System.out.print("Comentário: ");
            String comentario = scanner.nextLine();

            evento.adicionarPalestra(new Palestra(nome, data, horaInicial, horaFinal, comentario));
        }
    }

    // Método para exibir os detalhes de um usuário
    private static void exibirDetalhesUsuario(Usuario usuario) {
        System.out.println("\nUsuário: " + usuario.getNome());
        System.out.println("Eventos participados:");

        for (Evento evento : usuario.getEventosParticipados()) {
            System.out.println(evento);
            System.out.println("Palestras:");
            for (Palestra palestra : evento.getPalestras()) {
                System.out.println(palestra);
            }
        }
    }
}