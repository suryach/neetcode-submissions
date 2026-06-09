class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> curr = new HashSet<>();
        int l = 0, r = 0, maxLen = 0;
        while (r < s.length()) {
            if (!curr.contains(s.charAt(r))) {
                curr.add(s.charAt(r));
                r++;
                maxLen = Math.max(maxLen, r - l);
            } else {
                curr.remove(s.charAt(l));
                l++;
            }
        }
        return maxLen;
    }
}
