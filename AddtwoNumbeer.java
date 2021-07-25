public class AddtwoNumbeer
{
    static class LL{
        LL next;
        int data;
        LL(int Data){
            this.data =Data;
            this.next =null;
        }
    }
    LL head, temp;
    AddtwoNumbeer(){
        head = null;
        temp =  null;
    }
    public static void main(String[] args)
    {
        AddtwoNumbeer objb  =  new AddtwoNumbeer();
        objb.Insert(2);
        objb.Insert(4);
        objb.Insert(3);
        AddtwoNumbeer objb2  =  new AddtwoNumbeer();
        objb2.Insert(5);
        objb2.Insert(6);
        objb2.Insert(4);

        LL result  = addTwoNumbers(objb.head , objb2.head);
        display(result);

    }

    private static void display(LL result)
    {
        LL tem  =  result;
        while (tem!=null){
            System.out.print(tem.data+" ");
            tem = tem.next;
        }
    }

    private static LL addTwoNumbers(LL head1, LL head2)
    {
        LL head=null , temp = null;
        LL t1 = head1;
        LL t2 =head2;
        int rem=0;
        int caryy=0;
        int sum=0;
        while (t1!=null  || t2!=null || caryy!=0){

            if(t1!=null){
                sum+=t1.data;
            }
            if(t2!=null){
                sum+=t2.data;
            }
            int val  = sum;

            sum = sum%10;
            int res = sum+caryy;
            caryy = caryy - caryy;
            caryy = val/10;





            LL  newnode  =  new LL(res);
            if(head==null){
                head = newnode;
                temp = newnode;
            }else{
                temp.next = newnode;
                temp = newnode;
            }

            sum = 0;
            t1 =  t1.next;
            t2 =  t2.next;



        }

        return head;

    }

    private void Insert(int Item)
    {
        LL newnode  =  new LL(Item);
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
