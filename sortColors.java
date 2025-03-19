import java.util.Arrays;

class Solution {
    public void sortColors(int[] nums) {
        int red = 0;      // Pointer for the "red" (0)
        int white = 0;    // Pointer for the "white" (1)
        int blue = nums.length - 1;  // Pointer for the "blue" (2)

        // Process the array with the three pointers
        while (white <= blue) {
            if (nums[white] == 0) {
                // Swap nums[white] with nums[red]
                int temp = nums[white];
                nums[white] = nums[red];
                nums[red] = temp;
                red++;   // Move the red pointer forward
                white++; // Move the white pointer forward
            } else if (nums[white] == 1) {
                // No swap needed, just move the white pointer forward
                white++;
            } else {
                // Swap nums[white] with nums[blue]
                int temp = nums[white];
                nums[white] = nums[blue];
                nums[blue] = temp;
                blue--; // Move the blue pointer backward
            }
        }
    }
}

public class sortColors {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        
        // Print the sorted array
        System.out.println(Arrays.toString(nums));  // Output: [0, 0, 1, 1, 2, 2]
    }
}
