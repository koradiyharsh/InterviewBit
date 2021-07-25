import java.util.ArrayList;

public class removeDuplicate {
    public static void main(String[] args) {
        int arr[] = {1 ,1 ,2,2,3};
        ArrayList<Integer> list  =  new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);
        }
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i-1) == list.get(i)){
                list.remove(i-1);
            }
        }
        System.out.println(list);
    }
}
