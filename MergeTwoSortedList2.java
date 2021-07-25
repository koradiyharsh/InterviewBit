public class MergeTwoSortedList2 {
    public static void main(String[] args) {
        int A[] = {1  ,5 , 8};
        int B[] = {6 , 9};

        int m  =  A.length;
        int n  =  B.length;
        int dp[]   = new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while (i<m  && j<n)
        {

            if(A[i] < B[j])
            {

                dp[k]  = A[i];
                i++;
            }
            else
            {

                dp[k] = B[j];
                j++;
            }

            k++;
        }
        if(i==m){

            while (j < n){

                dp[k] = B[j];
                k++;
                j++;
            }
        }
        if(j==n){

            while (i < m){

                dp[k] = A[i];
                k++;
                i++;
            }
        }
        for(i=0;i<dp.length;i++)
        {
            System.out.print(dp[i]+" ");
        }
    }
}
