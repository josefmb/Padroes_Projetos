package Pousada;

import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorReservaSingleton {
    private static GerenciadorReservaSingleton instance;
    private ArrayList<Reserva> reservas;
    private ArrayList<Quarto> quartos;

    private GerenciadorReservaSingleton() {
        System.out.println("Iniciando as reservas.");
        reservas = new ArrayList<>();
        quartos = new ArrayList<>();
    }

    public static GerenciadorReservaSingleton getInstance() {
        if (instance == null) {
            instance = new GerenciadorReservaSingleton();
        }
        return instance;
    }

    public void reservar(Reserva reserva) {
        if (verificaDisponibilidade(reserva.getNumeroQuarto())) {
            reservas.add(reserva);
            System.out.println("Reserva feita com sucesso!");
        } else {
            System.out.println("Já existe uma reserva para este quarto ou quarto não existe!");
        }
    }

    public void adicionarQuarto(Quarto quarto) {
        if (verificaExistenciaQuarto(quarto.getNumero())) {
            System.out.println("O quarto já existe");
        } else {
            quartos.add(quarto);
            System.out.println("Quarto adicionado com sucesso!");
        }
    }

    public boolean verificaExistenciaQuarto(int numeroQuarto) {
        if (quartos.isEmpty()) return false;

        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numeroQuarto) {
                return true;
            }
        }

        return false;
    }

    public boolean verificaDisponibilidade(int numeroQuarto) {
        if (!verificaExistenciaQuarto(numeroQuarto)) return false;

        for (Reserva reserva : reservas) {
            if (reserva.getNumeroQuarto() == numeroQuarto) {
                if (LocalDate.now().isAfter(reserva.getDataSaida())) {
                    reservas.remove(reserva);
                    return true;
                }
                else {
                    return false;
                }
            }
        }

        return true;
    }
}

