public class removeDupfromSLL
{
    class LL
    {
        LL next;
        int data;
        LL(int Item){
            this.next=null;
            this.data=Item;
        }
    }
    LL head=null;
    LL temp=null;
    public static void main(String[] args) {
        removeDupfromSLL obj  = new removeDupfromSLL();
        obj.Insert(1);
        obj.Insert(1);
        obj.Insert(1);
        obj.Insert(2);
        obj.Insert(3);
        obj.Insert(3);
        obj.Insert(3);
        obj.Insert(4);

        LL result  =  removeDupEle(obj.head);
        DisplayNodeMethod(result);
    }

    private static void DisplayNodeMethod(LL result)
    {
        LL temp =  result;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    private static LL removeDupEle(LL head)
    {


        LL tmp  = head;
        LL tmp2 =  head.next;
        while (tmp2!=null){

            if(tmp.data==tmp2.data){
                tmp.next = tmp2.next;
            }
            else{
                tmp = tmp.next;
            }
            tmp2 = tmp2.next;

        }

        return head;


    }

    private void Insert(int val)
    {
        LL newnode =  new LL(val);
        if(head==null){
            head = newnode;
            temp = newnode;
        }
        else
        {
            temp.next = newnode;
            temp = newnode;
        }
    }
}
