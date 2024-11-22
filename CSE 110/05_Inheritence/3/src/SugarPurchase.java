public class SugarPurchase extends PurchaseSystem{
    private int weight;

    public SugarPurchase(String c, int p, int q, int w){
        super(c, p, q);
        this.weight = w;
    }

    public int getTotalPrice(){
        int totalPrice = super.getTotalPrice();
        totalPrice *= weight;
        return totalPrice;
    }

    public String toString(){
        return "Product code: " + code + "\nPrice: " + price + "\nQuantity: "
                + quantity + "\nTotal price with sugar: " + getTotalPrice();
    }
}
