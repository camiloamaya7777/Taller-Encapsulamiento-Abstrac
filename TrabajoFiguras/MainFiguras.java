public class MainFiguras {
    public static void main(String[] args) {

        FiguraGeometrica f1 = new Circulo(5);
        FiguraGeometrica f2 = new Rectangulo(4, 6);
        FiguraGeometrica f3 = new Triangulo(3, 8);
        FiguraGeometrica f4 = new Rombo(6, 4);

        System.out.println("Área círculo: " + f1.calcularArea());
        System.out.println("Área rectángulo: " + f2.calcularArea());
        System.out.println("Área triángulo: " + f3.calcularArea());
        System.out.println("Área rombo: " + f4.calcularArea());
    }
}