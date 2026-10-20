class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> arr = new HashMap<>();
        for(int num : nums){
            arr.put(num, arr.getOrDefault(num, 0) + 1);
        }
        List<int[]> arr2 = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : arr.entrySet()){
            arr2.add(new int[] {entry.getValue(),entry.getKey()});
        }
        arr2.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];
        for(int i = 0; i<k; i++){
            res[i] = arr2.get(i)[1];
        }
        return res;
    }
}
