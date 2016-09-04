public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) return null;
        if(nums1.length == 0) return nums1;
        if(nums2.length == 0) return nums2;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> same = new ArrayList<Integer>();
        int j = 0;
        int k = 0;
        int i = 0;
        while(i < nums1.length && j < nums2.length){
             if(nums1[i] == nums2[j]){
                same.add(nums1[i]);
                k++;
                j++;
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        int [] res = new int[k];
        for(int p = 0; p < k; p++){
            res[p] = (int) same.get(p);
        }
        return res;
    }
}