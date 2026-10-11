class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int less=0;
        int equal=0;
        for(int h=0;h<nums.length;h++){
            if(nums[h]<pivot){
                less++;
            }
            if(nums[h]==pivot){
                equal++;
            }
        } 
        int k=less+equal;
        int i=0;
        int j = less;
        int[] res = new int[nums.length];

        for(int g=0;g<nums.length;g++){
            if(nums[g]<pivot){
                res[i++] = nums[g];
            }
            else if(nums[g]>pivot){
                res[k++]=nums[g];
            }
            else{
                res[j++] = nums[g];
            }
        }

        return res;












        // ArrayList<Integer> less = new ArrayList<>();
        // ArrayList<Integer> equal = new ArrayList<>();
        // ArrayList<Integer> more = new ArrayList<>();

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<pivot){
        //         less.add(nums[i]);
        //     }
        //     else if(nums[i]>pivot){
        //         more.add(nums[i]);
        //     }
        //     else{
        //         equal.add(nums[i]);
        //     }
        // }

        // less.addAll(equal);
        // less.addAll(more);

        // Integer[] arr1 = less.toArray(new Integer[0]);
        // int[] arr = new int[arr1.length];
        // for(int i=0;i<arr1.length;i++)
        // arr[i] = arr1[i];
        // return arr;
    }
}