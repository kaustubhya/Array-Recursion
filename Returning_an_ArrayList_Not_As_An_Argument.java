import java.util.ArrayList;

public class Returning_an_ArrayList_Not_As_An_Argument {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,4,12};
        ArrayList<Integer> ans = findAllIndex2(array, 4, 0);
        System.out.println(ans);
        
    }

    static ArrayList<Integer> findAllIndex2(int [] arr, int target, int index) {
        
        ArrayList<Integer> list  = new ArrayList<>();
        // Calling the list inside the function here

        if(index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if(arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowFunctionCalls = findAllIndex2(arr, target, index + 1);

        // Using addAll to add all elements at once
        list.addAll(ansFromBelowFunctionCalls);
        return list;

    } 
}