public class Array {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1}; // индекс идёт с 0 по очереди
        int[] nums2 = new int[4]; // если значения не известны

        for (int e : nums) {
            System.out.println(e);
        }
        for (int i = 0; i < 4; i++) {
            nums2[i] = i;
        }
        nums2[3] = 100;
        for (int i = 0; i < 4; i++) {
            System.out.println("Элемент [" + i + "]" + nums2[i]);

        }
    }
}