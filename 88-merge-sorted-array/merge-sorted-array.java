class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1 = m-1;
    int p2 = n-1;
    int l = m+n-1;
    // if(nums1.length ==1 && nums2.length ==1){
    //     nums1[0] = nums2[0];

    // }
    while(p1>=0 && p2>=0){
        if(nums2[p2]>nums1[p1]){
            nums1[l] = nums2[p2];
            p2--;
            l--;
        }
        else {
            nums1[l] = nums1[p1];
            
            l--;
            p1--;
        }

    }
    while(p2>=0){
        nums1[l] = nums2[p2];
        l--;
        p2--;
    }




        // for(int i=0,j=m;i<n && j<m+n;i++,j++){
        //     nums1[j] = nums2[i];
        // }
        // Arrays.sort(nums1);
       
    }
}