import java.util.Scanner;

public class ExibirMenu {
    private static Scanner scanner = new Scanner(System.in);

    public static void executar() {
        int opcao;
        do {
            Menu.exibirMenu();
            opcao = Menu.lerOpcao();
            executarOpcao(opcao);
        } while (opcao != 0);
    }

    public static void executarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarJogador();
                break;
            case 2:
                cadastrarTecnico();
                break;
            case 3:
                buscarPessoa();
                break;
            case 4:
                Sistema.listarTodos();
                break;
            case 5:
                excluirPessoa();
                break;
            case 6:
                excluirTodasAsPessoas();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }

    public static void cadastrarJogador() {
        System.out.println("Cadastrando Jogador...");
        String nome = Menu.lerNome();
        System.out.print("Digite o número do jogador: ");
        String numero = scanner.nextLine();
        System.out.print("É titular? (true/false): ");
        boolean titular = scanner.nextBoolean();
        System.out.print("É reserva? (true/false): ");
        boolean reserva = scanner.nextBoolean();
        Jogador jogador = new Jogador(nome, numero, titular, reserva);
        Sistema.cadastrar(jogador);
        System.out.println("Jogador cadastrado com sucesso.");
    }

    public static void cadastrarTecnico() {
        System.out.println("Cadastrando Técnico...");
        String nome = Menu.lerNome();
        System.out.print("Digite a especialidade do técnico: ");
        String especialidade = scanner.nextLine();
        Tecnico tecnico = new Tecnico(nome, especialidade);
        Sistema.cadastrar(tecnico);
        System.out.println("Técnico cadastrado com sucesso.");
    }

    public static void buscarPessoa() {
        System.out.println("Buscando Pessoa...");
        String nome = Menu.lerNome();
        Pessoa pessoa = Sistema.buscar(nome);
        if (pessoa != null) {
            System.out.println("Pessoa encontrada: " + pessoa);
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    public static void excluirPessoa() {
        System.out.println("Excluindo Pessoa...");
        String nome = Menu.lerNome();
        Pessoa pessoa = Sistema.buscar(nome);
        if (pessoa != null) {
            Sistema.excluir(pessoa);
            System.out.println("Pessoa excluída com sucesso.");
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    public static void excluirTodasAsPessoas() {
        System.out.println("Excluindo todas as Pessoas...");
        Sistema.excluirTodos();
        System.out.println("Todas as Pessoas foram excluídas com sucesso.");
    }
}