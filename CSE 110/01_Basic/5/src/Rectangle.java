public class Rectangle {
    private int length;
    private int width;
    private int area;
    private double perimeter;

    public Rectangle(int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void isArea(){
        area = length * width;
    }

    public void isPerimeter(){
        perimeter = 2 * (this.sideA + this.sideB);
    }

    public String toString()
        

}
