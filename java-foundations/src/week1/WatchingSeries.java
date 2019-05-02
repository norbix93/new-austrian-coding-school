package week1;

import java.util.Scanner;

public class WatchingSeries {


    public static void main(String[] args) {
        System.out.println("What is the last episode number you watched?");
        Scanner scanner = new Scanner(System.in);
        Integer episode = scanner.nextInt();
        Integer season2 = (episode % 12) * (episode / 12) + (12 * (episode / 24));
        season2 = Math.round(season2);

        Integer season1 = episode - season2;
        Integer season2minutes = season2 * 34;
        Integer season1minutes = season1 * 47;
        Integer totalMinutes = season1minutes + season2minutes;

        Integer hours = totalMinutes / 60;
        hours = Math.round(hours);
        Integer minutes = totalMinutes % 60;

        String message = "You have watched a total of ";
        message = message + hours + " hours and " + minutes + " minutes (";
        message = message + totalMinutes + " minutes)";
        System.out.println(message);

    }
}
