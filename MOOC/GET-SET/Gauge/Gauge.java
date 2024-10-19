public class Gauge {
    private int value;

    public Gauge(){
        this.value = 0;
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value = value;
    }

    public void setIncrease(int value){
        this.value++;
    }
    public int getIncrease(){
        return this.value++;
    }

    public void setDecrease(int value){
        this.value--;
    }
    public int getDecrease(){
        return this.value--;
    }

    public boolean isFull(){
        return this.value >= 5;
    }
}