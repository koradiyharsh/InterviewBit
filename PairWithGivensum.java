import java.util.Arrays;

public class PairWithGivensum {
    public static void main(String[] args) {
        int arr[] = {5 , 20 , 3 , 2 , 50 , 80};
        int n = 78;
        int cnt  = 0;
        Arrays.sort(arr);
        for(int i=arr.length-1;i>0;i--)
        {
            for(int j=i-1;j>=0;j--){

                if(arr[i] -  arr[j] == n){
                    cnt+=1;
                }
            }
        }
        System.out.println(cnt);
    }
}
