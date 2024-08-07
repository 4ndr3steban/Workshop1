package Ejercicio2;

public abstract class Embarcacion {

    private Capitan capitan;
    private double precioBaseAlquiler;
    private double recargo;
    private int anioFabricacion;
    private float eslora;
    private Usuario usuarioActual;

    public Embarcacion(double precioBaseAlquiler, double recargo, int anioFabricacion, float eslora) {
        this.precioBaseAlquiler = precioBaseAlquiler;
        this.recargo = recargo;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public abstract double calcularMontoAlquiler();

    public abstract boolean alquilarEmbarcacion(Usuario usuario);

    public boolean entregarEmbarcacion(Usuario usuario) {
        if (usuarioActual.equals(usuario)) {
            usuarioActual = null;
            return true;
        } else return false;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public double getPrecioBaseAlquiler() {
        return precioBaseAlquiler;
    }

    public void setPrecioBaseAlquiler(double precioBaseAlquiler) {
        this.precioBaseAlquiler = precioBaseAlquiler;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }
}
