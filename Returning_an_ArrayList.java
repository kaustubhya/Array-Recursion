import java.util.ArrayList;

public class Returning_an_ArrayList {
    public static void main(String[] args) {

        int array[] = {1,2,3,4,5,5,6};
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex(array, 5, 0, list);
        System.out.println(ans);
        System.out.println(list);

    }

    static ArrayList<Integer> findAllIndex (int [] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }
    
}
