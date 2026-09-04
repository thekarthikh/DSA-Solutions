class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> hashmap = new HashMap<>();

        for (String s : strs) {

            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            List<String> arr = hashmap.computeIfAbsent(
                key, k -> new ArrayList<>()
            );

            arr.add(s);
        }

        return new ArrayList<>(hashmap.values());
    }
}