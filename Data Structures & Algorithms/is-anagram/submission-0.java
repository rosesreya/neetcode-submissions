class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        //s = s.toLowerCase();
        //t = t.toLowerCase();
        int slen = s.length();
        int tlen = t.length();
        if(slen!=tlen){
            return false;
        }
        for(int i=0;i<slen;i++){
            Character key1 = s.charAt(i);
            map1.put(key1,map1.getOrDefault(key1,0)+1);
            Character key2 = t.charAt(i);
            map2.put(key2,map2.getOrDefault(key2,0)+1);
        }
        return map1.equals(map2);
    }
}
