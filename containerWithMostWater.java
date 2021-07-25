public class containerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1 , 8 , 6 ,2 ,5 ,4 ,8 ,3 ,7};
        int i=0;
        int n=height.length-1;
        int Max  = Integer.MIN_VALUE;
        while (i<n)
        {
            int m = Math.min(height[i] , height[n]);
            int res = (n - i) * m;
            Max = Math.max(Max , res);

            if(height[n] < height[i])
            {
                n--;
            }
            else
            {
                i++;
            }

        }
        System.out.println(Max);


    }
}
