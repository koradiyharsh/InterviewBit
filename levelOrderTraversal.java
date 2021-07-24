
import java.util.Queue;
import java.util.*;
class node
{
    node left;
    node right;
    int data;

    node(int Item)
    {
        data  = Item;
        this.left =null;
        this.right=null;
    }
}
public class levelOrderTraversal
{
    node root;
    levelOrderTraversal()
    {
        root  = null;
    }
    public static void main(String[] args)
    {
        levelOrderTraversal obj  = new levelOrderTraversal();
        obj.root = new node(1);
        obj.root.left = new node(2);
        obj.root.left.left = new node(4);
        obj.root.left.right = new node(5);
        obj.root.right = new node(3);

        obj.LevelOrder(obj.root);

    }

    private void LevelOrder(node root)
    {
        Queue<node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            node temp = queue.peek();
            queue.poll();
            System.out.print(temp.data+" ");

            if(temp.left != null)
            {
                queue.add(temp.left);
            }
            if(temp.right!=null)
            {
                queue.add(temp.right);
            }

        }


    }
}
