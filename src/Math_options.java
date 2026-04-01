public class Math_options {
    public static void main (String[] args) {

        double num1 = 5;
        double num2 = ++num1;
        double num3 = 9;
        double num4 = 8;
        double results = num1 / num2;
        System.out.println(num1);
        System.out.println(num2);
        if (num1 == num2 && num3>num4){ //(&& и)
            System.out.println("Результат: " + results);
        } else {
            System.out.println("Результат: ");
        }

    }
}
