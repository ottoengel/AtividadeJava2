public class Tecnico extends Pessoa {
    private String especialidade;

    public Tecnico(String nome, String especialidade) {
        super(nome);
        this.especialidade = especialidade;
    }

    // Métodos getters e setters omitidos para brevidade

    @Override
    public String toString() {
        return super.toString() + "\nEspecialidade: " + especialidade;
    }
}