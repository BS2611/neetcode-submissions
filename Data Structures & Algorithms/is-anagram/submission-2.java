class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> indices = new HashMap<>();  // val -> index
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(indices.containsKey(a)){
                indices.put(a, indices.get(a)+1);
            }else{
                indices.put(a, 1);
            }
        }
         for (int i = 0; i < t.length(); i++){
            char a = t.charAt(i);
            if(!indices.containsKey(a) || indices.get(a) == 0){
                
                return false;
            }else{
                indices.put(a, indices.get(a)-1);
            }
        }
        return true;
    }
}