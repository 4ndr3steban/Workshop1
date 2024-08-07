package Ejercicio2;

public class Yate extends Embarcacion{

    private int cantidadCamarotes;
    private double precioBaseCompra;
    private int cantidadAlquileres;

    public Yate(double precioBaseAlquiler, double recargo, int anioFabricacion, float eslora,
                int cantidadCamarotes, double precioBaseCompra, int cantidadAlquileres) {
        super(precioBaseAlquiler, recargo, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
        this.precioBaseCompra = precioBaseCompra;
        this.cantidadAlquileres = cantidadAlquileres;
    }

    @Override
    public double calcularMontoAlquiler() {
        return super.getPrecioBaseAlquiler() + ((super.getAnioFabricacion() > 2020) ? 20000 : 0);
    }

    @Override
    public boolean alquilarEmbarcacion(Usuario usuario) {
        if (super.getUsuarioActual() == null) {
            super.setUsuarioActual(usuario);
            cantidadAlquileres++;
            return true;
        } else return false;
    }


    public double calcularMontoCompra() {
        double precioBase = precioBaseCompra;

        if (cantidadAlquileres >= 80 && cantidadCamarotes > 8) precioBase -= precioBaseCompra * 0.05;
        else if (cantidadAlquileres >= 50 && cantidadCamarotes <= 5) precioBase -= precioBaseCompra * 0.2;
        else if (cantidadAlquileres >= 50) precioBase -= precioBaseCompra * 0.1;
        else if (cantidadAlquileres >= 20) precioBase -= precioBaseCompra * 0.1;

        return precioBase;
    }



    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(int cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public double getPrecioBaseCompra() {
        return precioBaseCompra;
    }

    public void setPrecioBaseCompra(double precioBaseCompra) {
        this.precioBaseCompra = precioBaseCompra;
    }

    public int getCantidadAlquileres() {
        return cantidadAlquileres;
    }

    public void setCantidadAlquileres(int cantidadAlquileres) {
        this.cantidadAlquileres = cantidadAlquileres;
    }
}
