class BubbleSort{
    public static void main(String[] args) {
        int[] nums = new int[]{3,4,2,7,6,3,1};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(nums);
    }
    // 大众写法，标准的冒泡排序
    public void bubbleSort(int[] nums){
        if(nums.length == 0){
            return ;
        }
        int temp = 0;
         // 这里i < nums.length 也是可以的，因为i = length-1时，j的循环条件是j = 0;j < 0；不会工作
        for(int i = 0; i < nums.length - 1; i++){ 
            for(int j = 0; j < nums.length - i - 1; j++){
                if(nums[j] > nums[j + 1]){
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            for(int num: nums){
                System.out.print(num);
            }
            System.out.println("");
        }
    }


    /* 
    下面排序的思想也叫冒泡，因为每次会把最小(大)元素的位置确定好
    对这个序列进行排序：3,4,2,7,6,3,1   每一趟的结果如下
    1437632
    1247633
    1237643
    1233764
    1233476
    1233467 */
    public void bubbleSort_2(int[] nums){
        if(nums.length == 0){
            return ;
        }
        int temp = 0;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] < nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            for(int num: nums){
                System.out.print(num);
            }
            System.out.println("");
        }
    }
}