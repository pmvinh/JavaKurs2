package java4_1;

import java.util.Scanner;

public class SeasonTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Season season = Season.SUMMER;
        switch (season){
            case AUTUMN -> System.out.println("I love autumn");
            case SPRING -> System.out.println("I love spring");
            case SUMMER -> System.out.println("I love summer");
            case WINTER -> System.out.println("I love winter");
        }
        for(Season season1 : Season.values()){
            System.out.println(season1);
            System.out.println("temperature: "+season1.getTempereture());
        }
        System.out.println(season.getDiscription(season));
    }
}
