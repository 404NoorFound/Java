

public class Main {
    public static void main(String[] args){
        PaySystem p = new PaySystem(10, 4);
        RegularPay r = new RegularPay(10, 4);
        SpecialPay s = new SpecialPay(10, 4);

        System.out.println(p);
        System.out.println(r);
        System.out.println(s);
    }

}
