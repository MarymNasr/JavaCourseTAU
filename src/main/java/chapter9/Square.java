package chapter9;

public class Square extends Rectangle{
    /*overriding having the exact name
     of the method but with
     different implementation
     */
    @Override
    public double calculatePerimeter(){
        return sides * length;
    }
    /*overloading having the exact name
     of the method but with
     different parameter list
     */
    public void print(String what){
        System.out.println(" I am a " + what);
    }

}
