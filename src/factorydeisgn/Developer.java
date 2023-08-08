package factorydeisgn;

public class Developer {
    public static void main(String[] args) {

        Employee e1 = new AIDeveloper();
        System.out.println(e1.getSalary());

        Employee e2 = new WebDeveloper();
        System.out.println(e2.getSalary());

        Employee e3 = EmployeeFactory.getEmployee("AI DEVELOPER");
        System.out.println(e3.getSalary());
    }
}
