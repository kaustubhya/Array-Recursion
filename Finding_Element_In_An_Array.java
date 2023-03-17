import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;

public class Finding_Element_In_An_Array {
    public static void main(String[] args) {
        int array[] = {1,5,7,8,9,12,12,47};
        int ans = findIndex(array, 12, 0);
        int ans2 = findIndexReverse(array, 12, array.length-1);
        boolean ans3 = find(array, 12, 0);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);

        findAllIndex(array, 12, 0);
        System.out.println(list);
        
    }

    static boolean find(int [] arr, int target,int index) {
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int [] arr, int target,int index) {
        if(index == arr.length) {
            return -1;
        }
        if(arr[index] == target) {
            return index;
        }
        else {
            return findIndex(arr, target, index + 1);
        }
    }

    static int findIndexReverse(int [] arr, int target, int index) {
        if(index == -1) {
            return -1;
        }

        if(arr[index] == target) {
            return index;
        }
        else{
            return findIndexReverse(arr, target, index - 1);
        }
    }

    // we can also keep the elements' index in an array list here
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int [] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        findAllIndex(arr, target, index + 1);
    }
    
}

