import java.util.Arrays;
class Leetcode34{
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,5,5,5,8,9,10};
        System.out.println(Arrays.toString(new Leetcode34().Result(nums,5)));
    } 
    public  int[] Result(int[] nums,int target){
        int left = leftbound(nums,target);
        int right = rightbound(nums,target);
        return new int[]{left,right};
    }
    private int leftbound(int[] nums,int target){
        int start = 0,index =-1,end = nums.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]== target){
                index=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return index;
    }
    private int rightbound(int[] nums,int target){
        int start = 0,index =-1,end = nums.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]== target){
                index=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return index;
    }    
}
