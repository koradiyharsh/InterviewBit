public class RotateList
{
    static class LL
    {
        LL next;
        int data;
        LL(int Item)
        {
            this.data =Item;
            this.next =null;
        }

    }
    LL head=null , temp  =null;
    public static void main(String[] args)
    {
        RotateList obj  = new RotateList();
        obj.Insert(1);
        obj.Insert(2);
        obj.Insert(3);
        obj.Insert(4);
        obj.Insert(5);

        int k=4 ;
        LL result  =  RotateListNodes(obj.head , k);
        DisplayMethods(result);


    }

    private static void DisplayMethods(LL result)
    {
        LL temp  = result;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    private static LL RotateListNodes(LL head, int k)
    {
        LL dummy= new LL(0);
        dummy.next=head;
        LL fast=dummy,slow=dummy;

        int i;
        for (i=0;fast.next!=null;i++)//Get the total length
            fast=fast.next;

        for (int j=i-k%i;j>0;j--) //Get the i-n%i th node
            slow=slow.next;

        fast.next=dummy.next; //Do the rotation
        dummy.next=slow.next;
        slow.next=null;

        return dummy.next;
    }

    private void Insert(int Item)
    {
        LL newnode  = new LL(Item);
        if(head==null)
        {
            head=newnode;
            temp=newnode;
        }
        else
        {
            temp.next=newnode;
            temp = newnode;
        }

    }
}
