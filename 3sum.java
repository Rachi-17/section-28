import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array first
        int closestSum = Integer.MAX_VALUE; // To store the closest sum

        // Loop through the array to consider each element as the first element of the triplet
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1; // Left pointer, just after the current element
            int right = nums.length - 1; // Right pointer, at the end of the array

            // Use the two pointers to find the closest sum
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // Update the closest sum if the current sum is closer to the target
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                // Move the pointers to try and get closer to the target
                if (currentSum < target) {
                    left++; // Increase the sum by moving the left pointer
                } else if (currentSum > target) {
                    right--; // Decrease the sum by moving the right pointer
                } else {
                    return currentSum; // If we find the exact sum, return it
                }
            }
        }

        return closestSum; // Return the closest sum found
    }
    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            
            int[] nums = {-1, 2, 1, -4};
            int target = 1;
            
            int result = solution.threeSumClosest(nums, target);
            
            System.out.println(result);  // Output: 2
        }
    }
    
}
