class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len =0;
        int startIndex =0;
        ArrayList<Character> sub = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            
            while(sub.contains(s.charAt(i))){
                sub.remove(0);
                startIndex++;
            }
            sub.add(s.charAt(i));
            len = Math.max(sub.size(),len);
        }
        return len;
    }
}
