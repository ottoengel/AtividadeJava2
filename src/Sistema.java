import java.sql.Time;

public class Sistema {
    
    private static void exibirMenu()  {
        System.out.println("\nTime");
        System.out.println("1) Cadastrar Técnico");
        System.out.println("2) Cadastrar Jogador");
        System.out.println("3) Procurar Técnico");
        System.out.println("4) Procurar Jogador");
        System.out.println("5) Mostrar Time");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");
    }


    private static void verificarOpcao(int op) {

        String tecnico;
        String nome;
        String numero;
        String id;

        switch (op) {
            case 1:

                System.out.println("\nNovo Técnico:");
                System.out.print("Técnico: ");
                tecnico = Console.lerString();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Linguagens que domina:");
                id = Console.lerString();

                Tecnico t = new Tecnico(id, nome);

                Time.cadastrar(t);

                System.out.println("\nTécnico cadastrado com sucesso!");

                break;

            case 2:

                System.out.println("\nNovo Jogador:");
                System.out.print("Numero: ");
                numero = Console.lerString();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Projeto que gerencia:");
                nome = Console.lerString();

                Jogador j = new Jogador(numero, nome);

                Time.cadastrar(j);

                System.out.println("\nJogador cadastrado com sucesso!");

                break;

            case 3:

                System.out.println("\nProcurar Funciomário:");

                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                // enviar a matricula digitada como parametro para o
                // metodo buscar da classe Cadastro.
                // Este método retornará ou um objeto do tipo Funcinario,
                // ou null, se não encontrar funcionario com a mesma matricula informada
                Funcionario f = Cadastro.buscar(matricula);

                if (f != null) {

                    System.out.println("\nFuncionário Localizado:");
                    System.out.println(f.toString());
                    return;

                }

                System.out.println("\nFuncionário " + matricula + " não foi encontrado");

                break;

            case 4:

                System.out.println("\nTodos os funcionários Cadastrados:");

                // Se o tamanho da lista for igual a 0 (zero)
                if (Cadastro.getListaFuncionarios().size() == 0) {

                    System.out.println("\nNão há fucionários cadastrados...");
                    return; // finaliza o método

                }

                // caso contrário, percorre a lista e msotra os funcionarios um a um
                for (Funcionario temp : Cadastro.getListaFuncionarios()) {

                    System.out.println(temp.toString());

                }

                break;

            case 0:

                System.out.println("\nO programa foi finalizado...");
                break;

            default:

                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }

    }
}
