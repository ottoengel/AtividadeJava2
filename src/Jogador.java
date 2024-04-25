public class Jogador {
    private String nome;
    private String numero;
    private boolean titular;
    private boolean reserva;
    
    public Jogador(String nome, String numero, boolean titular, boolean reserva) {
        this.nome = nome;
        this.numero = numero;
        this.titular = titular;
        this.reserva = reserva;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        return "\nNome: " + nome + "\nNumero: " + numero;
    }
}
