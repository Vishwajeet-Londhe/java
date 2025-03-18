package L9Array;

public class MajorElement {
    public static void main(String[] args) {
        int[] majEle = {3,2,3};
        System.out.println(majorityElement(majEle));
    }

    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for(int i =0; i<nums.length; i++){
            if(count == 0){
                candidate = nums[i];
            }
            if(candidate==nums[i]){
                count++;
            }else{
                count--;
            }

        }
        return candidate;

    }
}
