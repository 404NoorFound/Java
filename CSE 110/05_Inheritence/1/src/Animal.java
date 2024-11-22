public class Animal extends Organism {
    private int eatingNeed;

    public Animal(int s, int g, int n){
        super(s, g);
        this.eatingNeed = n;
    }

    public String toString(){
        return "Initial size: " + size + "\nGrowth rate: " + growthRate + "\nEating need: " + eatingNeed;
    }
}
