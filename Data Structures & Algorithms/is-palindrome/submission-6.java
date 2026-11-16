class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder nStr = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                nStr.append(Character.toLowerCase(c));
            }
        }
        return nStr.toString().equals(nStr.reverse().toString());
    }
}
