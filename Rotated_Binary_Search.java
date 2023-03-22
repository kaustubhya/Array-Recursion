public class Rotated_Binary_Search {
    public static void main(String[] args) {
        int [] array = {5,6,7,8,9,1,2,3};
        int ans = search(array, 9, 0, array.length -1);
        System.out.println(ans);
        
    }

    static int search(int [] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }

        int mid = start + (end - start)/2;

        if(arr[mid] == target) {
            return mid;
            // Returning index of mid
        }

        if (arr[start] <= arr[mid]){
            if(arr[start] <= target && arr[mid] >= target){
                return search(arr, target, start, mid - 1);
            }
            else {
                return search(arr, target, mid + 1, end);
            }
        }

        if(arr[mid] <= target && arr[end] >= target){
            return search(arr, target, mid+1, end);
        }
                
        return search(arr, target,start, mid - 1);
                
            
        
    }
    
}
