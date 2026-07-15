class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<strs.size();i++ ){
            String elem = strs.get(i);
            result.append(elem.length()+"#"+elem);
        }
       return result.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i =0;
         while (i < str.length()) {
        int j = i;
        while (str.charAt(j) != '#') j++;

        int len = Integer.parseInt(str.substring(i, j));
        list.add(str.substring(j + 1, j + 1 + len));
        i = j + 1 + len;
    }
        return list ;
    }
}
