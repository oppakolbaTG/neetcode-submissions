class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        char[] cs = s.toCharArray();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for(int i = 0; i < cs.length; i++){
            if(map.containsKey(cs[i])){
                if(!stack.isEmpty() && stack.peek() == map.get(cs[i])){
                    stack.pop();
                    
                }else return false;
                
            }else stack.push(cs[i]);
        }
        return stack.isEmpty();
    }
}
