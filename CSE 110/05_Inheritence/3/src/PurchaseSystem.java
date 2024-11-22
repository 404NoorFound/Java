public class PurchaseSystem {
    protected int price, quantity, totalPrice;
    protected String code;

    public PurchaseSystem(String c, int p, int q){
        this.code = c;
        this.price = p;
        this.quantity = q;
    }

    public int getTotalPrice(){
        return price * quantity;
    }

    public String toString(){
        return "Product code: " + code + "\nPrice: " + price + "\nQuantity: "
                + quantity + "\nTotal price w/o sugar: " + getTotalPrice();
    }
}
