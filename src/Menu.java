import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1) Cadastrar Jogador");
        System.out.println("2) Cadastrar Técnico");
        System.out.println("3) Buscar Pessoa");
        System.out.println("4) Listar Todas as Pessoas");
        System.out.println("5) Excluir Pessoa");
        System.out.println("6) Excluir Todas as Pessoas");
        System.out.println("0) Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int lerOpcao() {
        return scanner.nextInt();
    }

    public static String lerNome() {
        System.out.print("Digite o nome: ");
        scanner.nextLine(); // Limpar o buffer
        return scanner.nextLine();
    }
}