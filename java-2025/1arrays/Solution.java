

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0; // Pointer for the position of unique elements

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
             
        
                k++;
                nums[k] = nums[i + 1]; // Store the next unique element
                
            }
        }

        return k + 1; // The count of unique elements
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 6, 20, 20, 40};
        for (int i = 0; i < nums.length-1; i++) {
            System.out.print(nums[i] + " ");
        }
        int k = sol.removeDuplicates(nums);

        System.out.println("Unique count: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
