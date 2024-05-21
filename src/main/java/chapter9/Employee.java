package chapter9;

public class Employee extends Person{

    private String employeeId;
    private String title;
    public Employee(){
        //if we want that constuctor os superClass first
        //must be the first statement
        super("Marym");
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
