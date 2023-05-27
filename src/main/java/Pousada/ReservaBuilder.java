package Pousada;

import java.time.LocalDate;

public class ReservaBuilder {
    private Reserva reserva;

    public ReservaBuilder() {
        reserva = new Reserva();
    }

    public ReservaBuilder addNumeroQuarto(int numeroQuarto) {
        this.reserva.setNumeroQuarto(numeroQuarto);
        return this;
    }

    public ReservaBuilder addDataEntrada(LocalDate dataEntrada) {
        this.reserva.setDataEntrada(dataEntrada);
        return this;
    }

    public ReservaBuilder addDataSaida(LocalDate dataSaida) {
        this.reserva.setDataSaida(dataSaida);
        return this;
    }

    public ReservaBuilder addNumeroHospedes(int numeroHospedes) {
        this.reserva.setNumeroHospedes(numeroHospedes);
        return this;
    }

    public Reserva build() throws Exception {
        if (this.reserva.getNumeroQuarto() <= 0) {
            System.out.println("Número do Quarto Inválido");
            throw new Exception("Número do Quarto Inválido");
        }

        if (this.reserva.getDataEntrada() == null || LocalDate.now().isBefore(this.reserva.getDataEntrada())) {
            System.out.println("Data de entrada inválida");
            throw new Exception("Data de entrada inválida");
        }

        if (this.reserva.getDataSaida() == null || this.reserva.getDataSaida().isBefore(this.reserva.getDataEntrada())
        || LocalDate.now().isAfter(this.reserva.getDataSaida())) {
            System.out.println("Data de saida inválida");
            throw new Exception("Data de saida inválida");
        }

        if (this.reserva.getNumeroHospedes() <= 0) {
            System.out.println("Número de Hóspedes Inválido");
            throw new Exception("Número de Hóspedes Inválido");
        }

        return this.reserva;
    }
}
