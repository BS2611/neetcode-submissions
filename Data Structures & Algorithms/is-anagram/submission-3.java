class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char val:s.toCharArray()){
            if(map.containsKey(val)){
                map.put(val, map.get(val) +1);
            }else{
                map.put(val, 1);
            }
        }
        for(char val:t.toCharArray()){
            if(map.containsKey(val)){
                map.put(val, map.get(val) -1);
                if(map.get(val) ==0){
                    map.remove(val);
                }
            }else{
                return false;
            }
        }

        if(map.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
