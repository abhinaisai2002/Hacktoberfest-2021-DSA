class ListNode{
    int data;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.data  = val;
        this.next = null;
    }
}
public class RemoveDup{
    public static void main(String[]args){
        int arr[] = {1,2,2,3,4,5,6,6,7};
        ListNode head = null;
        ListNode temp = null;
        for(int i=0;i<arr.length;i++){
            if(head==null){
                head = new ListNode(arr[i]);
                temp = head;
            }
            else{
                temp.next = new ListNode(arr[i]);
                temp = temp.next;
            }
        }
        ListNode start = removeDups(head);
        while(start!=null){
            System.out.print(start.data+" ");
            start = start.next;
        }
    }
    public static ListNode removeDups(ListNode head){
        ListNode ret = new ListNode(0);
        ListNode temp = ret;
        ListNode p1 = head;
        ListNode p2 = head;
        while(p2!=null){
            if(p1.data == p2.data && p1 == p2){
                temp.next = new ListNode(p1.data);
                temp = temp.next;
                p2 = p2.next;
            }
            else if(p1.data == p2.data){
                p2 = p2.next;
            }
            else{
                p1 = p2;
            }
        }
        return ret.next;
    }
}