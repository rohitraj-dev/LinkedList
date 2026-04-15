import java.util.*;
class DisplayList
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
        display(a);
        sortedMerge(a, b); // wrong, create two different ll then assign head of both as head1 and head2
        sc.close();

    }
    public static void display(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node sortedMerge(Node head1, Node head2)
    {
        Node i = head1;
        Node j = head2;
        Node dummy = new Node(-1);
        Node k = dummy;
        while(i!=null && j!=null)
        {
            if(i.val<= j.val)
            {
                k.next = i;
                i = i.next;
            }
            else
            {
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        if(i==null)
            k.next = j;
        else k.next = i;
        return dummy.next;
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