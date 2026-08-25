
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String val: strs){


            char[] c= (val.toCharArray());
            Arrays.sort(c);
            String sortedVal = new String(c);


            if(map.containsKey(sortedVal)){
                List<String> lst = map.get(sortedVal);
                lst.add(val);
                map.put(sortedVal, lst);
            }else{
                List<String> lst = new ArrayList<>();
                lst.add(val);
                map.put(sortedVal, lst);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<String>> m :map.entrySet()){
            result.add(m.getValue());
        }
        return result;
        
    }
}
