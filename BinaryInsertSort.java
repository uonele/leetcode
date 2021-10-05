public class BinaryInsertSort {
        public static void main(String[] args) {
            BinaryInsertSort is = new BinaryInsertSort();
            int[] nums = new int[]{7,8,9,4,3};
            is.binaryInsertSort(nums);
    
        }
        // 二分插入排序
        public void binaryInsertSort(int nums[]){
            
            for(int i = 1; i < nums.length; i++){
                int j;
                int temp = nums[i];
                int index = binarySerach(nums, i, nums[i]);
                for(j = i - 1; j >= index; j--){
                    nums[j + 1] = nums[j];
                }
                nums[index] = temp;
                
                // 每次循环都输出结果
                for (int k : nums) {
                    System.out.print(k);
                }
                System.out.println("");
            }
        }
        // 找到插入位置
        public int binarySerach(int[] nums, int index,int x){
            int i = 0;
            int j = index;
            while(i <= j){
                int mid = i + (j - i) / 2;
                if(x < nums[mid]){
                    j = mid - 1;
                }else if(x > nums[mid]){
                    i = mid + 1;
                }else{
                    return mid;
                }
            }
            return j + 1;
        }
}
