import java.util.Arrays;
import java.util.Scanner;

public class _1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];
        int[] aux = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = scanner.nextInt();
            aux[i] = nums[i];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println();

        for (int n : aux) {
            System.out.println(n);
        }
        scanner.close();
    }
}
