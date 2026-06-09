class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet set = new HashSet();
        for (int num: nums) {
            if (set.contains(num))
                return true;
            else
                set.add(num);
        }
        return false;
    }
}