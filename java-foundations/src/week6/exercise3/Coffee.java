package week6.exercise3;

public class Coffee {

    String madeBy;
    Integer brewedTime;

    public Coffee(String madeBy, Integer brewedTime) {
        this.madeBy = madeBy;
        this.brewedTime = brewedTime;
    }
    protected String getMadeBy(){
        return madeBy;
    }
    protected Integer getBrewingTime(){
        return brewedTime;
    }


}
