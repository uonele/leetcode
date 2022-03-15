import java.util.Arrays;
public class HeapSort {
    public static void main(String []args){

        // https://www.cnblogs.com/jingmoxukong/p/4303826.html#java%E7%89%88%E6%9C%AC
        int []arr = {9,8,7,3,5,6,4,2,1};
        HeapSort heap = new HeapSort();
        heap.Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

  
    public void Sort(int[] arr){

          // 建立大顶堆
        for(int i = (arr.length / 2 - 1); i >= 0; i--){
            adjustHeap(arr,0 , arr.length - 1);
        }

        for(int j = arr.length - 1; j >= 0; j--){
            swap(arr, 0, j);
            adjustHeap(arr, 0, j);
        }

    }
    public void adjustHeap(int[] arr, int parent, int len){
        int temp = arr[parent];
        int child = parent * 2 + 1;

        // 这里注意不能小于等于
        while(child < len){
            if(child + 1 < len && arr[child + 1] > arr[child]){
                child++;
            }

            if(temp >= arr[child]){
                break;
            }
            arr[parent] = arr[child];
            parent = child;
            child = 2 * child + 1;
        }
        arr[parent] = temp;

    }

    // 交换
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
