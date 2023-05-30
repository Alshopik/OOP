public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){
        width = height = 0.0;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    void  setWidth(double width){
        this.width = width;
    }

    void  setHeight(double height){
        this.height = height;
    }
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }

    void calculateArea(){
        System.out.printf("Площадь прямоугольника = %.2f", getWidth()*getHeight());
        System.out.println();
    }

    void calculatePerimeter(){
        System.out.println("Периметр прямоугольника = " + 2*(width+height));
    }

}
