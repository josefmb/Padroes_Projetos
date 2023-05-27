package Pousada;

public class Executivo extends Quarto {
    private boolean escritorioPrivativo = false;
    private boolean cafeManhaIncluso = false;

    public Executivo(int numeroQuarto, double valorDiaria, boolean escritorioPrivativo, boolean cafeManhaIncluso) {
        super(numeroQuarto, valorDiaria);
        this.escritorioPrivativo = escritorioPrivativo;
        this.cafeManhaIncluso = cafeManhaIncluso;
    }

    @Override
    public double calcularValorDiaria() {
        return getValorDiaria() + 100.0; // Valor adicional para serviços extras de um quarto Executivo
    }

    public boolean getEscritorioPrivativo() {
        return this.escritorioPrivativo;
    }

    public void setEscritorioPrivativo(boolean escritorioPrivativo) {
        this.escritorioPrivativo = escritorioPrivativo;
    }

    public boolean getCafeManhaIncluso() {
        return this.cafeManhaIncluso;
    }

    public void setCafeManhaIncluso(boolean cafeManhaIncluso) {
        this.cafeManhaIncluso = cafeManhaIncluso;
    }
}
