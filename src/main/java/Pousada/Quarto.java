package Pousada;

public abstract class Quarto {
    private int numero = 0;
    private double valorDiaria = 0.0;

    public Quarto(int numeroQuarto, double valorDiaria) {
        this.numero = numeroQuarto;
        this.valorDiaria = valorDiaria;
    }

    public abstract double calcularValorDiaria();

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValorDiaria() {
        return this.valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

}
