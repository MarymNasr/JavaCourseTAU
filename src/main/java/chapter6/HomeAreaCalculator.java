package chapter6;

public class HomeAreaCalculator {

    public static void  main(String args[]){
        /****
        *RECTANGLE 1
         ****/

        //Create instance of Rectangle class

        //Rectangle is the data type of room1
        //class is a blueprint
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        /****
         *RECTANGLE 2
         ****/
        //Create instance of Rectangle class
        Rectangle room2 = new Rectangle(30,75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of both rooms: " + totalArea);
    }
}
