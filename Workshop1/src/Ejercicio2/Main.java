package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Capitan capitan1 = new Capitan("Black","beard", 321123);
        Capitan capitan2 = new Capitan("White","beard", 789987);

        Usuario usuario1 = new Usuario(456654, "u1", "left", 321111);
        Usuario usuario2 = new Usuario(657655, "u2", "right", 322222);
        Usuario usuario3 = new Usuario(487644, "u2", "center", 333333);

        Yate yate1 = new Yate(10000, 20, 2010, 30, 4, 2000, 50);
        Velero velero1 = new Velero(20000, 20, 2021, 20, 6);

        yate1.setCapitan(capitan1);
        velero1.setCapitan(capitan2);

        System.out.println("Montos de alquiler para el Yate y Velero");
        System.out.println("Alquiler yate = " + yate1.calcularMontoAlquiler());
        System.out.println("Alquiler velero = " +velero1.calcularMontoAlquiler());
        System.out.println();

        System.out.println("Monto de compra para el Yate");
        System.out.println(yate1.calcularMontoCompra());
        System.out.println();

        System.out.println("Simular alquiler de cualquier embarcacion");
        boolean alquiler1 = yate1.alquilarEmbarcacion(usuario1);
        boolean alquiler2 = velero1.alquilarEmbarcacion(usuario2);
        // Alquiler que va a fallar ya que el yate 1 lo alquiló el usuario 1
        boolean alquiler3 = yate1.alquilarEmbarcacion(usuario3);

        System.out.println("Alquiler de Yate 1: " + ((alquiler1) ? " Existosa" : "Fallida"));
        System.out.println("Alquiler de Velero 1: " + ((alquiler1) ? " Existosa" : "Fallida"));
        System.out.println("Alquiler de Yate 1: " + ((alquiler1) ? " Existosa" : "Fallida"));
        System.out.println();

        System.out.println("Simular entrega de embarcacion alquilada");
        boolean entragaYate = yate1.entregarEmbarcacion(usuario1);
        boolean nuevoAlquiler = yate1.alquilarEmbarcacion(usuario3);

        System.out.println("Entraga de Yate 1: " + ((entragaYate) ? " Existosa" : "Fallida"));
        System.out.println("Nuevo alquiler de Yate 1: " + ((nuevoAlquiler) ? " Existosa" : "Fallida"));
    }
}
