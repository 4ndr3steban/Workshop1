package Ejercicio2;

public class Velero extends Embarcacion {
    private int cantidadMastiles;

    public Velero(double precioBaseAlquiler, double recargo, int anioFabricacion, float eslora, int cantidadMastiles) {
        super(precioBaseAlquiler, recargo, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    @Override
    public double calcularMontoAlquiler() {
        double baseAlquiler = super.getPrecioBaseAlquiler() + ((super.getAnioFabricacion() > 2020) ? 20000 : 0);
        baseAlquiler += (cantidadMastiles > 4) ? (super.getPrecioBaseAlquiler() * 0.1) : 0;

        return baseAlquiler;
    }

    @Override
    public boolean alquilarEmbarcacion(Usuario usuario) {
        if (super.getUsuarioActual() == null) {
            super.setUsuarioActual(usuario);
            return true;
        } else return false;
    }


    public int getCantidadMastiles() {
        return cantidadMastiles;
    }

    public void setCantidadMastiles(int cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }
}
