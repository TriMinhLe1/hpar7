/**
 * @class: AreaAndVolume
 * @author: Tri M. Le
 * @course: ITEC 2140 - 05
 * @version: 1.1;
 * @date: February 6th, 2023
 * description: Find the area of the circle and the volume of the cylinder with the given radius and height.
 */
import java.util.Scanner;

public class AreaAndVolume {


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius,area,length,pi=3.1416,volume;

        System.out.println("Please print the radius for the area of the circle.");
        radius=input.nextDouble();
        radius=radius*radius;
        area=pi*radius;
        System.out.println("The area of the cirle is "+area+". Now please put in the length for the volume for the cylinder.");
        length=input.nextDouble();
        volume=pi*radius*length;
        System.out.println("The volume of the cylinder is "+volume+". The code is now finished. Have a nice day.");
    }
}
