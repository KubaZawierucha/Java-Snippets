import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        MainClass myGenerator = new MainClass();
        System.out.println(myGenerator.generateInt(1,-5));
    }

    private int generateInt(int start, int stop) {
        if (start > stop) {
            System.out.println("Error!\nStop must be grater or equal to start!");
            return 0;
        }
        Random generator = new Random();
        return generator.nextInt(stop - start + 1) + start;
    }
}
