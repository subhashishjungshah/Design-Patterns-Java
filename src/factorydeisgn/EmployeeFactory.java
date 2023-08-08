package factorydeisgn;

public class EmployeeFactory {

    public static Employee getEmployee(String emp){
        if(emp.trim().equalsIgnoreCase("AI DEVELOPER")){
            return new AIDeveloper();
        } else if (emp.trim().equalsIgnoreCase("Web Developer")) {
            return new WebDeveloper();
        }
        else{
            return null;
        }
    }
}
