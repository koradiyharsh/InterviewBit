public class swapsNode
{
    class List
    {
        List next;
        int data;
        List(int a)
        {
            this.next = null;
            this.data =a;
        }
    }

    List temp  , head;
    swapsNode(){
        temp = null ;
        head =null;
    }
    public static void main(String[] args) {
    swapsNode obj  = new swapsNode();
        obj.Insert(1);
        obj.Insert(2);
        obj.Insert(3);
        obj.Insert(4);

        List result  =  swapsNodeinLL(obj.head);
        DisplayNode(result);
    }

    private static void DisplayNode(List result)
    {
        List temp  = result;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    private static List swapsNodeinLL(List head)
    {
        List slow =  head;
        List fast  = head.next;

        while (fast!=null)
        {
            int temp = slow.data;
            slow.data =  fast.data;
            fast.data = temp;

            if(fast.next==null){
                break;
            }
            if(fast.next.next==null){
                break;
            }
            slow = slow.next.next;
            fast = fast.next.next;
        }
        return head;
    }

    private void Insert(int Item)
    {
        List newnode  =  new List(Item);
        if(head==null)
        {
            head  = newnode;
            temp = newnode;
        }
        else
        {
            temp.next = newnode;
            temp = newnode;
        }
    }
}
