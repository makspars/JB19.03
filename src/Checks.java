import java.io.IOException;

public class Checks {
    public static void main (String[] args) throws IOException {
        char ch, answer = 'B';
         System.out.println("Шанс всегда есть");
         System.out.print("Угадай букву:");

         ch = (char)System.in.read();
         if (ch == answer) {
             System.out.print("Ага");
         } else if (ch > answer) { // ( Порядок по ASCII)
             System.out.print("Нужно ближе к началу алфавита");
         } else {
             System.out.print("Нужно ближе к концу алфавита");
         }
    }
}
