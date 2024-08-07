package Ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Parqueadero parqueadero = new Parqueadero(2500);

        Carro carro1 = new Carro("ABC123", "Toyota", "Corolla");
        Carro carro2 = new Carro("XYZ789", "Honda", "Civic");
        Carro carro3 = new Carro("LMN456", "Ford", "Focus");
        Carro carro4 = new Carro("JKL321", "Chevrolet", "Malibu");
        Carro carro5 = new Carro("PQR654", "Nissan", "Sentra");

        boolean parqueoCarro1 = parqueadero.parquearCarro(carro1, 0, 0);
        boolean parqueoCarro2 = parqueadero.parquearCarro(carro1, 1, 1);
        boolean parqueoCarro3 = parqueadero.parquearCarro(carro1, 2, 2);
        boolean parqueoCarro4 = parqueadero.parquearCarro(carro1, 3, 3);
        boolean parqueoCarro5 = parqueadero.parquearCarro(carro1, 1, 1);

        System.out.println("Parqueo de algunos carros ---------------------------------");
        System.out.println("Parqueo Carro con placa " + carro1.getPlaca() + (parqueoCarro1 ? ": Exitoso" : ": Fallido"));
        System.out.println("Parqueo Carro con placa " + carro2.getPlaca() + (parqueoCarro2 ? ": Exitoso" : ": Fallido"));
        System.out.println("Parqueo Carro con placa " + carro3.getPlaca() + (parqueoCarro3 ? ": Exitoso" : ": Fallido"));
        System.out.println("Parqueo Carro con placa " + carro4.getPlaca() + (parqueoCarro4 ? ": Exitoso" : ": Fallido"));
        System.out.println("Parqueo Carro con placa " + carro5.getPlaca() + (parqueoCarro5 ? ": Exitoso" : ": Fallido"));
        System.out.println();

        System.out.println("Calculo de tiempo de parqueo de algunos carros ---------------------------------");
        System.out.println(parqueadero.cobrarPorTiempo(carro1, 1));
        System.out.println(parqueadero.cobrarPorTiempo(carro3, 3));
        System.out.println(parqueadero.cobrarPorTiempo(carro5, 5));
        System.out.println();

        System.out.println("Estado del parqueadero despues de algunos parqueos ----------------------------");
        parqueadero.mostrarEstadoParqueadero();

    }
}
