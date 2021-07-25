import java.lang.reflect.Array;
import java.util.Arrays;

public class removeElementFromArray {
    public static void main(String[] args) {
        int arr[] = {4 , 1  , 1 , 2  , 1 , 3};

        int val = 1;
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1){
                arr[i] =  -1;
                cnt+=1;
            }
        }
        int dp[] =  new int[cnt];
        int k =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=-1){
                dp[k++] = arr[i];
            }
        }
        


    }
}
