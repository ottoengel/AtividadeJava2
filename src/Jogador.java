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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero: " + numero;
    }
}