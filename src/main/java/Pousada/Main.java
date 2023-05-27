package Pousada;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Singleton

        GerenciadorReservaSingleton controller = GerenciadorReservaSingleton.getInstance();
        GerenciadorReservaSingleton controller2 = GerenciadorReservaSingleton.getInstance();

        System.out.println("Singleton: ");

        System.out.println(controller);
        System.out.println(controller2);

        //Factory

        System.out.println("\nFactory: ");

        QuartoFactory factory = new QuartoFactory();
        Quarto quartoStandard = factory.criarQuarto(TipoQuarto.STANDARDT);
        Quarto quartoLuxo = factory.criarQuarto(TipoQuarto.LUXO);
        Quarto quartoExecutivo = factory.criarQuarto(TipoQuarto.EXECUTIVO);

        controller.adicionarQuarto(quartoStandard);
        controller.adicionarQuarto(quartoLuxo);
        controller.adicionarQuarto(quartoExecutivo);

        //Builder

        System.out.println("\nBuilder: ");

        try {
            Reserva reserva = new ReservaBuilder().addNumeroQuarto(101)
                    .addDataEntrada(LocalDate.now())
                    .addDataSaida(LocalDate.of(2023, 06, 15))
                    .addNumeroHospedes(1)
                    .build();

            controller.reservar(reserva);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();
    }
}
