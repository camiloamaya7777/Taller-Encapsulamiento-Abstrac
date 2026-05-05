public class MainEmpleados {
    public static void main(String[] args) {

        Empleado e1 = new EmpleadoTiempoCompleto("Juan", 1000);
        Empleado e2 = new EmpleadoPorHoras("Ana", 40, 20);

        System.out.println(e1.nombre + " gana: " + e1.calcularSalario());
        System.out.println(e2.nombre + " gana: " + e2.calcularSalario());
    }
}