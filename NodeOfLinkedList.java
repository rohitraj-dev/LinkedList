import java.util.*;
class NodeOfLinkedList
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(10);
        Node b = new Node(200);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        //display(a);
        
        System.out.println(e.val);
        System.out.println(a.next.next.next.val);
        System.out.println(c);
        System.out.println(b.next);
        System.out.println(b.next.next);
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