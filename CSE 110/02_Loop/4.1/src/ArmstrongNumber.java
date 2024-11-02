public class ArmstrongNumber {
    private int number;

    public ArmstrongNumber(int number){
        this.number = number;
    }

    public boolean isArmstrongNum(){
        int originalNumber = number;
        int sum = 0;
        int pow = String.valueOf(number).length();

        while(number > 0){
            int digit = number % 10;
            sum += (int) Math.pow(digit, pow);
            number /= 10;
        }
        return sum == originalNumber;
    }

}
