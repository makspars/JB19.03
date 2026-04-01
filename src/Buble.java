public class Buble {
    public static void main(String[] args) {
        int[] nums = {2 ,1 ,3 ,6 ,9 ,4 ,153 ,0}; // {2 ,1 ,3 ,6 ,9 ,4 ,153 ,0} -- {1 ,2 ,3 ,6 ,4 ,9 ,0 ,153}--...
        int temp;
        boolean sorted = false;

         while (!sorted) {
            sorted = true;

            for (int i=0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i+1]){
    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    sorted = false;
                }
            }
        }
         for (int i : nums) {
             System.out.println(i);
         }
    }
}
