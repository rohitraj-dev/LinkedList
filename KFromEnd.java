import java.util.*;
class KFromEnd
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        Linkedlist ll = new Linkedlist();
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        ll.head = a;
        ll.tail = e;
        ll.size = 5;
        
        System.out.println(ll.getKthFromLast(ll.head,5));
        sc.close();
    }
}
class Node
{
    int val;
    Node next;
    Node(int val)
    {
        this.val = val;
    }
}
class Linkedlist
{
    Node head;
    Node tail;
    int size = 0;
    int getKthFromLast(Node head, int k)
    {
        Node slow = head;
        Node fast = head;
        for(int i=1; i<=k; i++)
        {
            if(fast == null)
                return -1;
            fast = fast.next;
        }
        while(fast!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;
    }
}
