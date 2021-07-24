public class MergeTwoSL
{
    static class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val=val;
            this.next =null;
        }

    }
    ListNode head, tmp;
    MergeTwoSL(){
        head = null;
        tmp  =null;
    }
    public static void main(String[] args)
    {
        MergeTwoSL obj  =new MergeTwoSL();
        obj.Insert(-9);
        obj.Insert(3);
        //obj.Insert(4);
        MergeTwoSL obj2  =new MergeTwoSL();
        obj2.Insert(5);
        obj2.Insert(7);
        //obj2.Insert(4);

        ListNode res=  MergeTwoLists(obj.head   , obj2.head);
        Display(res);
    }

    private static void Display(ListNode res)
    {
        ListNode tmp  = res;
        while (tmp!=null){
            System.out.print(tmp.val+" ");
            tmp = tmp.next;
        }
    }

    private static ListNode MergeTwoLists(ListNode head, ListNode head1)
    {
        ListNode newHead  = new ListNode(-1);
        ListNode T  = newHead;
        while (head!=null && head1!=null){

            if(head.val<head1.val){

                T.next = new ListNode(head.val);
                head =  head.next;

            }
            else{
                T.next = new ListNode(head1.val);
                head1 =  head1.next;
            }

            T  = T.next;

        }
        if(head!=null){

            while (head!=null) {
                T.next = new ListNode(head.val);
                head = head.next;
                T = T.next;
            }

        }
        if(head1!=null){

            while (head1!=null) {
                T.next = new ListNode(head1.val);
                head1 = head1.next;
                T = T.next;
            }

        }
        return newHead.next;
    }

    private void Insert(int val)
    {
        ListNode newnode  = new ListNode(val);
        if(head ==null){
            head = newnode;
            tmp =newnode;
        }
        else{
            tmp.next = newnode;
            tmp = newnode;
        }


    }
}
