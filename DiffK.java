public class DiffK {
    public static void main(String[] args) {
        int arr[] = {1 , 3  , 5};
        int k  =4;

        int i =0 ;
        int n  = arr.length-1;

        boolean result  =  checkOrnot(arr ,  i  , n  , k);
        System.out.println(result);
    }

    private static boolean checkOrnot(int[] arr, int i, int n, int k)
    {

        while (i<n){

            int sum  = arr[n] -  arr[i];
            if(sum==k){
                return true;
            }
            else if(sum < k){
                i++;
            }
            else{
                n--;
            }

        }

        return false;
    }
}
