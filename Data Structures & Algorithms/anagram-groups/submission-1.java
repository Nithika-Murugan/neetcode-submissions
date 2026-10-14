class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sorted=new String(charArray);
            hm.putIfAbsent(sorted,new ArrayList<>());
            hm.get(sorted).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
