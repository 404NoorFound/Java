public class PaySystem {
    protected double rate, hour;

    public PaySystem(double r, double h){
        this.rate = r;
        this.hour = h;
    }

    public double totalPay(){
        return hour * rate;
    }

    public String toString(){
        return "Total pay: " + totalPay();
    }
}
