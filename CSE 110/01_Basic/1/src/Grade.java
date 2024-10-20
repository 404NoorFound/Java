public class Grade {
    private double mark;
    private String grade;

    public Grade(double mark){
        this.mark = mark;
    }

    public void isGrade(){
        if(this.mark < 25){
            grade = "F";
        } else if(this.mark < 45){
            grade = "E";
        } else if(this.mark < 50){
            grade = "D";
        } else if(this.mark < 60){
            grade = "C";
        } else if(this.mark < 80){
            grade = "B";
        } else {
            grade = "A";
        }
    }

    public String toString(){
        return "Grade: " + grade;
    }


}
