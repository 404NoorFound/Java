public class Main {
    public static void main(String[] args){
        PurchaseSystem p = new PurchaseSystem("101", 12, 2);
        SugarPurchase s = new SugarPurchase("102", 12, 2, 3);

        System.out.println(p);
        System.out.println(s);
    }
}
