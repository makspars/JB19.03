import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int num0 = random.nextInt();
        System.out.println(num0);
        int num = (int)(Math.random() * 100);
        System.out.println(num);
    }
}