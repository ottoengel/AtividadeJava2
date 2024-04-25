public class Tecnico extends Pessoa {
    private String especialidade;

    public Tecnico(String nome, String especialidade) {
        super(nome);
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEspecialidade: " + especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }


    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}