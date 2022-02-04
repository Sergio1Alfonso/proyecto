package ejemplos.empleados;

public class InterfazEmpleados {
    public static void main(String[] args) {
        Programador programador = new Programador("Sergio", "Alfonso", 30);
        programador.setHorasTrabajo(10);

        System.out.printf("Salario mensual del empleado %s %s: %.2f€", programador.getNombre(), programador.getApellido(), programador.calcularSalario());
    }
}
