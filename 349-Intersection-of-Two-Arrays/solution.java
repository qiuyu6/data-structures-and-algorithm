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
                //if(k == 0)
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
        //if(k == 0) return res;
        //else{
          //  res[0] = list.get(0);
            //k = k-1;
            int m = 0;
            //int n = 1;
            while(k>0){
                //if( list.get(m) == res[n-1]){
                  //  m++;
                    //k--;
                //}else{
                    res[m] = list.get(m);
                    //n++;
                    m++;
                    k--;
                //}
            
            }
        return res;
        //}
        
        
    }
}