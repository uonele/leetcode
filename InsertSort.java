public class InsertSort {
    public static void main(String[] args) {
        InsertSort is = new InsertSort();
        int[] nums = new int[]{7,8,9,4,3};
        is.insertSort_2(nums);

    }
    public void insertSort_2(int[] a) {
 
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(a[j] < a[j - 1]){
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }

            for (int k : a) {
                System.out.print(k);
            }
            System.out.println("");
        }

    }
    public void insertSort(int[] a) {
 
        for (int i = 1; i < a.length; i++) {
            int num = a[i];
            int j;
            for (j = i; j > 0 && num < a[j - 1]; j--) {
                    a[j] = a[j - 1];
            }
            /*
            上面这个for循环不能写成如下：
            for (j = i; j > 0; j--) {
                if(num < a[j - 1])
                    a[j] = a[j - 1];
            }
            */
            a[j] = num;
            for (int k : a) {
                System.out.print(k);
            }
            System.out.println("");
        }

    }
}
