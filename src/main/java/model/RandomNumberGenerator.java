package model;

public class RandomNumberGenerator {
    private int minimumValue;
    private int maximumValue;

    public RandomNumberGenerator(int minimumValue, int maximumValue) {
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
    }

    public int generate(){
        return this.minimumValue + (int) (Math.random()*(this.maximumValue + 1));
    }
}
