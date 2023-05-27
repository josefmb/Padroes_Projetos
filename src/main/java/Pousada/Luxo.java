package Pousada;

public class Luxo extends Quarto {
    private boolean hidromassagem = false;
    private boolean vistaMar = false;

    public Luxo(int numeroQuarto, double valorDiaria, boolean hidromassagem, boolean vistaMar) {
        super(numeroQuarto, valorDiaria);
        this.hidromassagem = hidromassagem;
        this.vistaMar = vistaMar;
    }

    @Override
    public double calcularValorDiaria() {
        return getValorDiaria() + 50.0; // Valor adicional para serviços extras de um quarto Luxo
    }

    public boolean getHidromassagem() {
        return this.hidromassagem;
    }

    public void setHidromassagem(boolean hidromassagem) {
        this.hidromassagem = hidromassagem;
    }

    public boolean getVistaMar() {
        return this.vistaMar;
    }

    public void setVistaMar(boolean vistaMar) {
        this.vistaMar = vistaMar;
    }
}
