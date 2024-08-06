// Moor'e Voting Algorithm
public class MajorityEle {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int el = Integer.MIN_VALUE;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                el = nums[i];
            }

            if (nums[i] == el) {
                count++;
            } else {
                count--;
            }
        }
        if (count > 0) {
            return el;
        }
        return -1;
    }
}
