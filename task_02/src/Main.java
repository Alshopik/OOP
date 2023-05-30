public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setWidth(1.4);
        r1.setHeight(2.6);
        System.out.printf("Прямоугольник №1 имеет Ширину = %.2f и Высоту = %.2f", r1.getWidth(), r1.getHeight());
        System.out.println();
        r1.calculateArea();
        r1.calculatePerimeter();

        Rectangle r2 = new Rectangle(2.5,5.6);
        System.out.printf("Прямоугольник №2 имеет Ширину = %.2f и Высоту = %.2f", r2.getWidth(), r2.getHeight());
        System.out.println();
        r2.calculateArea();
        r2.calculatePerimeter();

    }
}