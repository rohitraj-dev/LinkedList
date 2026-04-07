import java.util.*;
class GetElement
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(10);
        Node b = new Node(sc.nextInt());
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        
        System.out.println(get(a,4));
        sc.close();
    }
    private static int get(Node head, int idx)
    {
        Node temp = head;
        for(int i=1; i<=idx; i++)
        {
            temp = temp.next;
        }
        return temp.val;
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