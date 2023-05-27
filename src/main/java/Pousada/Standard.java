package Pousada;

public class Standard extends Quarto {
    private boolean arCondicionado = false;
    private boolean tvCabo = false;

    public Standard(int numeroQuarto, double valorDiaria, boolean arCondicionado, boolean tvCabo) {
        super(numeroQuarto, valorDiaria);
        this.arCondicionado = arCondicionado;
        this.tvCabo = tvCabo;
    }

    @Override
    public double calcularValorDiaria() {
        return getValorDiaria();
    }

    public boolean getArCondicionado() {
        return this.arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean getTvCabo() {
        return this.tvCabo;
    }

    public void setTvCabo(boolean tvCabo) {
        this.tvCabo = tvCabo;
    }
}
