public class QuickSort {
    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        int[] nums = new int[]{7,8,9,4,3};
        q.quickSort(nums);
        for (int i : nums) {
            System.out.println(i);
        }
        
    }
    public void quickSort(int[] nums){
        int i = 0;
        int j = nums.length - 1;
        partion_2(nums, i, j);
    }
    public void partion_2(int[] nums, int low, int high){
        if(low >= high) return ;

        int i = low;
        int j = high;
        int pivot = nums[i];
        while(i < j){  // 这里如果是<=，会死循环
            while(nums[j] >= pivot && i < j){   // 大部分情况是i=j 就结束了，这里如果是i <= j，那么结束时 j=i-1，i的初始值为边界会下标出界
                j--;
            }
            nums[i] = nums[j];
            while(nums[i] <= pivot && i < j){
                i++;
            }
            nums[j] = nums[i];
        }
        nums[i] = pivot; 
        partion_2(nums, low, i - 1);
        partion_2(nums, i + 1, high);
    }
    public void partion(int[] nums, int low, int high){
        if(low >= high) return ;

        int i = low;
        int j = high;
        int pivot = nums[i];
        while(i < j){
            while(nums[j] >= pivot && i < j){
                j--;
            }
            while(nums[i] <= pivot && i < j){
                i++;
            }
            if(i < j){   // 对于这个case来说，这个判断条件去掉也行
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        nums[low] = nums[i];
        nums[i] = pivot; 
        partion(nums, low, i - 1);
        partion(nums, i + 1, high);
    }
}
