class Solution {
    public int longestConsecutive(int[] nums) {
      int tres = 1;
      int res = 1;
      if(nums.length == 0) return 0;
      int[] arr = nums.clone();
      Arrays.sort(arr);
      for(int i = 1; i<nums.length; i++){
        if(arr[i] - arr[i-1] == 1){
            tres++;
            if(tres > res) res = tres;
        }
        else if(arr[i] - arr[i-1] == 0){
            continue;
        }
        else{tres = 1;}
      }
      return res;
    }
}
