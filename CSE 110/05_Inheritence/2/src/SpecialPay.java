public class SpecialPay extends PaySystem {

    public SpecialPay(int r, int h) {
        super(r, h);
    }

    public double totalPay() {
        return super.totalPay() * 1.30;
    }

}
