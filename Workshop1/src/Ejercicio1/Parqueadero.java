package Ejercicio1;

public class Parqueadero {

    private static final int FILAS = 5;
    private static final int COLUMNAS = 10;
    private final Carro[][] celdasEstacionamiento;
    private double tarifaPorHora;

    public Parqueadero(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
        this.celdasEstacionamiento = new Carro[FILAS][COLUMNAS];
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        if (celdasEstacionamiento[fila][columna] == null && fila < 5 && columna < 10) {
            celdasEstacionamiento[fila][columna] = carro;
            return true;
        } else {
            return false;
        }
    }
    // Cambié el tipo de dato de retorno para mayor comodidad
    public String cobrarPorTiempo(Carro carro, int horas) {
        return "Costo parqueadero Carro con placa " + carro.getPlaca() + " = " + horas*tarifaPorHora;
    }

    public void mostrarEstadoParqueadero() {
        for (int fila = 0; fila < FILAS; fila++) {
            for (int col = 0; col < COLUMNAS; col++){
                System.out.print((celdasEstacionamiento[fila][col] == null ? "[ ]" : "[X]")+ " ");
            }
            System.out.println();
        }
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
}
