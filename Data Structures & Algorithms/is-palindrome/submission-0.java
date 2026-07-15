class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder string = new StringBuilder();
        string.append(s.toLowerCase());
        string.reverse();
        return string.toString().equals(s.toLowerCase());
    }
}
