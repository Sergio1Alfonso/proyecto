package ejemplos.empleados;

public class Programador extends Empleado {
    double horasTrabajo;
    double precioHora;

    public Programador(String nombre, String apellido, double precioHora) {
        super(nombre, apellido);
        this.precioHora = precioHora;
    }

    public double calcularSalario() {
        return sueldoBase + horasTrabajo * precioHora * (1 - retencion);
    }

    public double getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(double horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "horasTrabajo=" + horasTrabajo +
                ", precioHora=" + precioHora +
                '}';
    }
}
