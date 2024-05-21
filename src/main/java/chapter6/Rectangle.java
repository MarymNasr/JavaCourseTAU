package chapter6;

public class Rectangle {
    //private: for encapsulation

    /*
    protected: other classes in the same package can access it
    it is similar to no access modifier at all
     */
    private double length;
    private double width;
    /*
    default constructor
    must have the same name as the class
     does not have return type
     does not have a parameter list
     assign default value to the fields
     */
    public Rectangle(){
        length = 0;
        width =0;
    }
    public Rectangle(double length, double width){
        //this.length = length;
        setLength(length);
        //this.width = width;
        setWidth(width);
    }
    public  double getLength(){
        return length;
    }
    public  void setLength(double length){
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double calculatePerimeter(){
        return  ( 2 * length) + ( 2 * width );
    }
   public double calculateArea(){
        return length * width;
    }
}
