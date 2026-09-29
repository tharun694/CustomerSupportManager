package LinkedList;



public class SingleLinkedList {
    ListNode head;
    ListNode tail;

    int size = 0;

    void insertion1(int value) {
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }
//    void insertion2(int value) {
//        ListNode node = new ListNode(value);
//        node.next = head;
//        head = node;
//        if (tail == null) {
//            tail = head;
//        }
//        size += 1;
//    }

    void insertionLast(int value) {
        if (tail == null) {
            return;
        }
        ListNode node = new ListNode(value);


        tail.next = node;
        tail = node;

        size += 1;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }

    ListNode merge(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode();
        ListNode tail = temp;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return temp.next;
    }

    ListNode getMid(ListNode head) {
        ListNode midprev = null;
        while (head != null && head.next != null) {
            midprev = (midprev == null) ? head : midprev.next;
            head = head.next.next;
        }
        ListNode mid = midprev.next;
        midprev.next = null;
        return mid;
    }
void reverse(ListNode node ){
        if(node.next==null){
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail=tail.next;
}
    void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
    }
    public ListNode GetMid( ListNode head){
        ListNode f=head;
        ListNode s=head;
        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public ListNode reversenode( ListNode mid){
        ListNode prev=null;
        ListNode present=mid;
        ListNode next=present.next;
        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode start=head;
        ListNode mid=GetMid(head);
        ListNode rereverse=reversenode(mid);
        ListNode midHead=rereverse;
        while(midHead!=null&&start!=null){
            if(start.val!=midHead.val){
                break;
            }else{
                start=start.next;
                midHead=midHead.next;
            }
        }
        reversenode(rereverse);
        if(midHead==null||start!=null){
            return true;
        }
        return false;
    }
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null)return head;
       ListNode f=head;
       ListNode s=head.next;
       ListNode temp=s;
       while(s!=null&&s.next!=null){
           f.next=s.next;
           f=f.next;
           s.next=f.next;
           s=s.next;
       }
       f.next=temp;
        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pos=head;
        int length=0;
        while(pos!=null){
            length++;
            pos=pos.next;
        }
        if(head.next==null&&(length-n)==0){
            head=null;
        }else if((length-n)==0){
            ListNode delete=head;
            delete=delete.next;
           return delete ;
        }
        int remove=(length-n)-1;
        ListNode temp=head;
        for(int i=0;i<remove;i++){
            temp=temp.next;
        }
        if(remove>0)temp.next=temp.next.next;

        return head;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head=new ListNode(0);
        ListNode temp=head;
        int rem=0,val1=0,val2=0;
        while(l1!=null||l2!=null){
            if(l1!=null) val1=l1.val;
            if(l2!=null)val2=l2.val;
            rem+=val1+val2;
            val1=0;
            val2=0;
            temp.next=new ListNode(rem%10);
            temp=temp.next;
            rem/=10;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        if(rem!=0){
            temp=new ListNode(rem%10);
        }
        return head.next;
    }
    public int pairSum(ListNode head) {
        ListNode trave=head;
        int size=0;
        while(trave!=null){
            size++;
            trave=trave.next;
        }
        ListNode curr=head;
        for(int i=0;i<size/2;i++){
           curr=curr.next;
        }

      ListNode j=  reversenode(curr);
        int ans=0;
        ListNode i=head;
        for(int ind=0;ind<size/2;ind++){
            ans= Math.max(i.val+j.val,ans);
            i=i.next;
            j=j.next;
        }
        return ans;
    }

    public class ListNode {
        int val;
        ListNode next;

        public ListNode(ListNode next) {
            this.next = next;
        }

        public ListNode(int value) {
            this.val = value;
        }

        public ListNode(int value, ListNode next) {
            this.val = value;
            this.next = next;
        }

        ListNode() {

        }
    }
}
    class Main {
        public static void main(String[] args) {
            SingleLinkedList ll = new SingleLinkedList();
            SingleLinkedList l2 = new SingleLinkedList();

//            LinkedList<Integer> list = new LinkedList<>();
//            list.add(1);
//            list.add(2);
//            list.add(3);
//            System.out.println(list.get(2));
//
        ll.insertion1(1);
        ll.insertion1(2);
        ll.insertion1(4);
        ll.insertion1(5);
//        ll.insertion1(9);
//        ll.insertion1(9);
//            l2.insertion1(9);
//            l2.insertion1(9);
//            l2.insertion1(9);
//            ll.insertionLast(8);
//            ll.insertionLast(2);
//            ll.insertionLast(3);
//            ll.insertionLast(5);

//ll.addTwoNumbers(ll.head,l2.head);
l2.pairSum(ll.head);
//ll.isPalindrome(ll.head);
            //ll.display();
        }
    }

