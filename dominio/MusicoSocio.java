package dominio;

public class MusicoSocio extends Participante {
    private String instrumento;
    private int numeroSocio;

    public MusicoSocio(String nombre, String instrumento, int numeroSocio) {
        super(nombre);
        this.instrumento = instrumento;
        this.numeroSocio = numeroSocio;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + instrumento + ", número de socio: " + numeroSocio;
    }
}

