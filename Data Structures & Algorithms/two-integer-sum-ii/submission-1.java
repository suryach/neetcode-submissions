class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i=0; i<numbers.length; i++) {
            map.put(numbers[i], i);
        }
        for (int i=0; i<numbers.length; i++) {
            if(map.get(target - numbers[i]) != null && map.get(target - numbers[i]) != i) {
                return new int[] {i+1, map.get(target - numbers[i])+1};
            }
        }
        return new int[0];
    }
}
