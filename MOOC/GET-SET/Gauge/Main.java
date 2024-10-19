
public class Main {

    public static void main(String[] args) {
        // Test your Gauge class here

         Gauge g = new Gauge();

         while(!g.isFull()) {
             System.out.println("Not full! Value: " + g.getValue());
             g.getIncrease();
         }

         System.out.println("Full! Value: " + g.getValue());
         g.getDecrease();
         System.out.println("Not full! Value: " + g.getValue());
    }
}
