public class Q29MissingNumber {
    public int missingNumber(int[] nums) {
        int missingValue=0;
        for(int i=0;i<=nums.length;i++){
            int temp=0;
          for(int j=0;j<nums.length;j++){
              if(nums[j]==i){
                    
                  temp++;
                  break;
              }
              
          }
            if(temp==0){
                  missingValue=i;
              }
            
        }
        return missingValue;
    }
}
