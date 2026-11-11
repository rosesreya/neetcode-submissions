class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }
            else{
                List<String> group = new ArrayList<>();
                group.add(str);
                map.put(key,group);
            }
        }
        return new ArrayList<>(map.values());
    }
}
