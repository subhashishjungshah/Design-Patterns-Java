package factorydeisgn;

public class AIDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("*** AIDeveloper ***");
        return 100000;
    }
}
