class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> lists = new HashMap();
       HashSet<Integer> set = new HashSet();
       
       for (int i = 0; i < strs.length; i++) {
            if(set.contains(i)) continue;
            List<String> currentGroup = new ArrayList<>(List.of(strs[i]));
            set.add(i);
            for (int j=i+1; j<strs.length; j++) {
                if (!set.contains(j) && isAnagram(strs[i], strs[j])) {
                    currentGroup.add(strs[j]);
                    set.add(j);
                }
            }
            lists.put("group" + i, currentGroup);
       }
       return new ArrayList(lists.values());
    }
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
