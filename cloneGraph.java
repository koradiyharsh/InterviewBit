import java.util.Iterator;
import java.util.LinkedList;
public class cloneGraph
{

    static int V;
    static LinkedList<Integer> list[];
    cloneGraph(int v)
    {
        this.V = v;
        list  = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            list[i] =  new LinkedList<>();
        }
    }
    public static void main(String[] args)
    {
        cloneGraph obj  =  new cloneGraph(4);
        obj.addEdge(1 , 2);
        obj.addEdge(2 , 3);
        obj.addEdge(3 , 4);
        obj.addEdge(4 , 1);

        cloneGraph res =  CloningGraph(1);
        System.out.println(res.hashCode());
        System.out.println(obj.hashCode());




    }

    private static cloneGraph CloningGraph(int a)
    {
        boolean[] visited  =  new boolean[V];
        int[] index  = new int[V];
        int idx=0;
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                cloneAnothertry(i , index , visited , idx);
            }
        }
        cloneGraph obj = new cloneGraph(4);
        int i=0;
        int j=1;
        while (j!=0){

            obj.addEdge(index[i]+1 , index[j]+1);
            i = (i + 1)%index.length;
            j = (j + 1)%index.length;
        }
        obj.addEdge(index[i]+1 , index[j]+1);
        return obj;
    }

    private static void cloneAnothertry(int a, int[] index, boolean[] visited , int idx)
    {
        visited[a] = true;
        index[idx] =a;

        Iterator<Integer> itr  =  list[a].listIterator();
        while (itr.hasNext())
        {
            int u  =  itr.next();
            if(visited[u]==false){
                cloneAnothertry(u ,  index , visited , idx+1);
            }
        }



    }

    private void addEdge(int a, int b)
    {
        list[a-1].add(b-1);
        list[b-1].add(a-1);
    }
}
