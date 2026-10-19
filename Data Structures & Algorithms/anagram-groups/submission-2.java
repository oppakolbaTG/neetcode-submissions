class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String i : strs){
            char[] arr = i.toCharArray();
            Arrays.sort(arr);
            String sortedC = new String(arr);
            res.putIfAbsent(sortedC, new ArrayList<>());
            res.get(sortedC).add(i);
        }
        return new ArrayList<>(res.values());
    }
}