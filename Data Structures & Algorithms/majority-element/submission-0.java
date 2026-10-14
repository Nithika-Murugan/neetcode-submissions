class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int res=0,maxc=0;
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
            if(hm.get(num)>maxc){
            res=num;
            maxc=hm.get(num);
            }
        }return res;
    }
}