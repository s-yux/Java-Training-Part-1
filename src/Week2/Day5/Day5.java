package Week2.Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day5 {
    public static void main(String[] args) {

//        //Question: Find out what is the value after multiplying everything except its own index.
//        int nums[] = {4,2,1,7,5,8,9};
//        int ans[] = new int[nums.length];
//        int product = 1;
//
//        for(int i=0; i<nums.length; i++){
//            product *= nums[i];
//        }
//        for(int i=0; i<ans.length; i++){
//            ans[i] = product / nums[i];
//        }
//        System.out.println(Arrays.toString(ans));

//        //alternative solution (my own)
//        int before;
//        int after;
//        int nums[] = {4,2,1,7};
//        int ans[] = new int[nums.length];
//
//        for(int i=0; i<nums.length; i++){
//
//            before = 1;
//            after = 1;
//
//            for(int j=0; j<i-0; j++){
//                before = before * nums[j];
//            }
//            for(int k=i+1; k<nums.length; k++){
//                after = after * nums[k];
//            }
//            System.out.println("Before: " + before + ", After: " + after);
//            ans[i] = before * after;
//        }
//
//        System.out.println(Arrays.toString(ans));

        //<!-------------------------New Content-------------------------!>

        //Given an aray of integers, write a code to move all zeors to the end while
        //maintain relative position of non-zero elements

        int input[] = {1,0,2,0,3,4,0,5};
        List<Integer> ans = new ArrayList<>();
        int count = 0;

        for(int i=0; i<input.length; i++){
            if(input[i] !=0){
                ans.add(input[i]);
            }else{
                count++;
            }
        }
        for(int i=0; i<count; i++){
            ans.add(0);
        }
        System.out.println(ans);

        //<!-------------------------New Content-------------------------!>




    }
}
