import java.util.PrimitiveIterator;

public class InterTestDrive {
    public static void main(String[] args) {


        Profession Director = new Director();
        Director.printProf();

        Worker wr = new Worker();
        wr.printProf();


        Accountant ac = new Accountant();
        ac.printProf();
    }
}
