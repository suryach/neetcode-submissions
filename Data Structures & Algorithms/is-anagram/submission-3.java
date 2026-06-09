class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length())
            return false;
        char[] t2 = t.toCharArray();
        for(int i=0; i<t2.length; i++) {
            int index = s.indexOf(t2[i]);
            if (index < 0) return false;
            s = s.substring(0, index) + s.substring(index + 1);
        }
        return s.length() == 0;
    }
}
