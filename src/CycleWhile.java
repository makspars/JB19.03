import java.io.IOException;

public class CycleWhile {
    public static void main(String[] args) throws IOException {
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
            if(count == 5) break;
        }
    }
}
