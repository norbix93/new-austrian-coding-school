package week6.exercise1;

public class HotAirBalloonApplication extends HotAirBalloon {

    public static void main(String[] args) {
        SmallHotAirBalloon smallBalloon = new SmallHotAirBalloon();
        System.out.println("smallBalloon --");
        smallBalloon.liftUp();
        smallBalloon.land();

        BigHotAirBalloon bigBalloon = new BigHotAirBalloon();
        System.out.println("bigBalloon --");
        bigBalloon.liftUp();
        bigBalloon.land();

        HotAirBalloon small = smallBalloon;
        System.out.println("small --");
        small.land();
        small.liftUp();


        HotAirBalloon big = bigBalloon;
        System.out.println("big --");
        big.land();
        big.liftUp();


    }
}
