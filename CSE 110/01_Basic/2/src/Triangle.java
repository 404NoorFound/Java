public class Triangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;
    private String triangleType;

    public Triangle(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void isType(){
        if(sideA == sideB && sideA == sideC){
            triangleType = "Equilateral";
        } else if(sideA == sideB || sideB == sideC || sideA == sideC){
            triangleType = "Isosceles";
        } else {
            triangleType = "Scalene";
        }
    }

    public String toString(){
        return "Triangle type: " + triangleType;
    }

}
