class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> more = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                less.add(nums[i]);
            }
            else if(nums[i]>pivot){
                more.add(nums[i]);
            }
            else{
                equal.add(nums[i]);
            }
        }

        less.addAll(equal);
        less.addAll(more);

        Integer[] arr1 = less.toArray(new Integer[0]);
        int[] arr = new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        arr[i] = arr1[i];
        return arr;
    }
}