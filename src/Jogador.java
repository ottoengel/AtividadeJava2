public class Jogador extends Pessoa {
    private String numero;
    private boolean titular;
    private boolean reserva;

    public Jogador(String nome, String numero, boolean titular, boolean reserva) {
        super(nome);
        this.numero = numero;
        this.titular = titular;
        this.reserva = reserva;
    }

    // Métodos getters e setters omitidos para brevidade

    @Override
    public String toString() {
        return super.toString() + "\nNumero: " + numero;
    }
}