import java.util.*;

class Solution {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num))
                map.put(num, 1);
            else {
                map.put(num, map.get(num) + 1);
                if (map.get(num) >= n / 2)
                    return num;
            }
        }
        return nums[n/2];
    }
    public static int majorityElement_1(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
    public int majorityElement_2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}



public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,3};


        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length/2);
        System.out.println(Solution.majorityElement(nums));
    }
}