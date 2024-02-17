class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int val1 = nums[0];
        int count1 =1;

        int val2 = nums[0];
        int count2 =0;

        int i=1;
        while(i< nums.length){
            if(nums[i] == val1){
                count1++;
            }
            else if(nums[i] == val2){
                count2++;
            }
            else{
                if(count1 == 0){
                    val1 = nums[i];
                    count1 =1;
                }
                else if(count2 == 0){
                    val2 = nums[i];
                    count2 =1;
                }
                else{
                    count1--;
                    count2--;
                }
            }
            i++;
        }
  

        List<Integer> res = new ArrayList<>();

        if(isGreaterThanNO3(nums , val1) == true){
            res.add(val1);
        }
        if(val1 != val2 && isGreaterThanNO3(nums , val2) == true){
            res.add(val2);
        }
        return res;
    }
    

    public boolean isGreaterThanNO3(int[] nums , int val){
        int count = 0;
        for (int size : nums) { // Corrected variable name from ele to size
            if (size == val) { // Corrected variable name from ele to size
                count++;
            }
        }
        return count > nums.length / 3;
    }
}