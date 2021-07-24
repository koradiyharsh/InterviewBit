public class surroundingRegion {
    public static void main(String[] args) {
            char[][]  matrix = {

                    {'X', 'O', 'X', 'X', 'X', 'X'},
                    {'X', 'O', 'X', 'X', 'O', 'X'},
                    {'X', 'X', 'X', 'O', 'O', 'X'},
                    {'O', 'X', 'X', 'X', 'X', 'X'},
                    {'X', 'X', 'X', 'O', 'X', 'O'},
                    {'O', 'O', 'X', 'O', 'O', 'O'},

            };

            int row  =   matrix.length;
            int col  =  matrix[0].length;

            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    if(i==0 || j==0 || i==row-1 || j==col-1)
                    {
                        continue;
                    }
                    else if(i==1 && matrix[i][j]=='O' && matrix[i-1][j]=='O'){
                        continue;
                    }
                    else if(i==row-2 && matrix[i][j]=='O' && matrix[i+1][j]=='O'){
                        continue;
                    }
                    else
                    {
                        if(matrix[i][j]=='O')
                        {
                            matrix[i][j] = 'X';
                        }
                    }
                }
            }

            for(int i=0;i<matrix.length;i++)
            {
                for(int j=0;j<matrix[0].length;j++)
                {
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();

            }
    }
}
