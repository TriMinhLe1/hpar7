/**
 * @class: Time
 * @author: Tri M. Le
 * @course: ITEC 2140 - 05
 * @version: 1.1;
 * @date: February 6th, 2023
 * description: Convert the given seconds to hours, minutes and seconds.
 */
import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int seconds,minutes=0,hours=0;

     System.out.println("Please put the requested seconds to be converted into Hours, Minutes,and Seconds.");
     seconds= input.nextInt();

     for(int i=60 ; seconds >= i;){
        seconds-=60;
        minutes++;
        if(minutes>=60){
            minutes-=60;
            hours++;
        }

     }
        System.out.println("It is "+hours+" hours, "+minutes+" minutes, "+seconds+" seconds. The code is now completed. Have a nice day." );

    }
}
