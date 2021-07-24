public class wordSearchBoard {
    public static void main(String[] args) {
        char matric[][]  = {
                {'A' , 'B'  , 'C' ,'E'},
                {'S' , 'F'  , 'C' , 'S'},
                {'A' , 'D'  , 'E' , 'E'}
        };


        String word  = "ABCD";

        boolean result =  wordsSearchBoard(word  , matric);
        System.out.println(result);


    }

    private static boolean wordsSearchBoard(String word, char[][] matric)
    {
        boolean[][]  visited  =  new boolean[matric.length][matric[0].length];
        for(int i=0;i<matric.length;i++)
        {
            for(int j=0; j < matric[0].length;j++)
            {
                if(matric[i][j]==word.charAt(0))
                {
                    if (wordSearchExtend(i, j, word, matric , 0 , visited)) {

                            return true;
                    }
                }
            }
        }
        return false;
    }



    private static boolean wordSearchExtend(int i, int j, String word, char[][] matric, int idx, boolean[][] visited)
    {
        if(idx==word.length()){

            return true;
        }
        if(i>=0 && j>=0 && i < matric.length && j < matric[0].length && visited[i][j] == false)
        {
            if(matric[i][j] == word.charAt(idx))
            {

               return  wordSearchExtend(i-1 , j  , word , matric , idx+1 , visited) || wordSearchExtend(i+1 , j  , word , matric , idx+1 , visited) || wordSearchExtend(i , j-1  , word , matric , idx+1 , visited) || wordSearchExtend(i , j+1  , word , matric , idx+1 , visited);
            }
        }


        return false;
    }
}
