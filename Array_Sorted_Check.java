public class Array_Sorted_Check{
    public static void main(String[] args) {
        int arr[] = {1,2,4,8,9,12,6};
        boolean ans = isSorted(arr, 0);
        System.out.println(ans);
    }

    static boolean isSorted(int [] arr, int index) {
        // base condition 
        if(index == arr.length -1){
            return true;
        }

        return arr[index] < arr [index + 1] && isSorted(arr, index + 1);
    }
}