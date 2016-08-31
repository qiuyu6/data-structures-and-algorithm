public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p = 0;
        int q = 0;
        int k = 0;
        
        while((p < nums1.length) && (q < nums2.length)){
            if(nums1[p] == nums2[q]){
                if(k == 0){
                    list.add(nums1[p]);
                    k++;
                    p++;
                    q++;
                }else if(list.get(k-1) == nums1[p]){
                    p++;
                    q++;
                }else{
                    list.add(nums1[p]);
                    k++;
                    p++;
                    q++;
                }
            }else if(nums1[p] < nums2[q]){
                p++;
            }else{
                q++;
            }
        }
        
        int [] res = new int[k];
            int m = 0;
            while(k>0){
                res[m] = list.get(m);
                m++;
                k--;
            }
        return res;
    }
}