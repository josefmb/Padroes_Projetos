package Pousada;

public class QuartoFactory {
    // Factory Method
    public Quarto criarQuarto(TipoQuarto tipo) {
        switch (tipo) {
            case STANDARDT: return new Standard(101, 100.00, true, true);
            case LUXO: return new Luxo(201, 145.00, false, true);
            case EXECUTIVO: return new Executivo(103, 137.50, false, true);
        }

        return null;
    }
}
