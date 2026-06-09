public class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        String header = strs.stream()
                .map(s -> s.length() + ",")
                .collect(java.util.stream.Collectors.joining()) + "#";
        return header + String.join("", strs);
    }

    public List<String> decode(String str) {
        if (str.isEmpty()) return new ArrayList<>();
        int hashIdx = str.indexOf('#');
        int[] sizes = Arrays.stream(str.substring(0, hashIdx).split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        List<String> res = new ArrayList<>();
        int i = hashIdx + 1;
        for (int sz : sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }
        return res;
    }
}