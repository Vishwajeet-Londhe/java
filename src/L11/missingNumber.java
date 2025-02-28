package L11;

public class missingNumber {
    public static void main(String[] args) {

        int [] nums = {0,1,3,4};

        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {

        int sum = 0;
        for(int i =0;i<nums.length;i++){

            sum = sum + nums[i];
        }

        int actualSum = (nums.length)*(nums.length+1)/2;
        int missingNumber = actualSum - sum;

        return missingNumber;
    }
}
