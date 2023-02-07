/**
 * @class: Paint
 * @author: Tri M. Le
 * @course: ITEC 2140 - 05
 * @version: 1.1;
 * @date: February 6th, 2023
 * description: Convert the given length, width, and height of the room with a number of windows and doors.
 */
import java.util.Scanner;
public class paint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length,width,height,part1,surfacearea,doors1,windows1,doors2=21,windows2=15,gallon=0,area,quartsresults=0;
        System.out.println("Hello. To calculate the amount of paint needed in feet. To paint the requested room, please start with the length.");
        length=input.nextInt();
        System.out.println("Good. Now please enter the width.");
        width=input.nextInt();
        System.out.println("Good. Now please enter the height.");
        height=input.nextInt();
        System.out.println("Good. Now please enter the amount of doors.");
        doors1=input.nextInt();
        System.out.println("Good. Now please enter the amount of windows.");
        windows1=input.nextInt();

        part1= length*height + width*height + length*width;
        area= length*width;
        surfacearea=part1*2;
        surfacearea-=area;

        doors1*=doors2;
        windows1*=windows2;
        surfacearea-=doors1;
        surfacearea-=windows1;

        for(int i=350;i<surfacearea;){
            surfacearea-=350;
            gallon++;

        }
        for (double i=87.5;surfacearea>i;){
            surfacearea-=i;
            quartsresults++;
        }
        System.out.println("It will require "+gallon+" gallons and about "+quartsresults+" quarts. The code is now finished. Have a nice day.");




    }
}
