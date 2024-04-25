import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private static List<Pessoa> pessoas = new ArrayList<>();

    public static void cadastrar(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public static Pessoa buscar(String nome) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equals(nome)) {
                return pessoa;
            }
        }
        return null;
    }

    public static void excluir(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }

    public static void listarTodos() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

    public static void excluirTodos() {
        pessoas.clear();
    }
    
}