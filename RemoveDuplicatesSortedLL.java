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
        System.out.print("Before swap: ");
        display(a);

        Node result = removeDuplicates(a);

        System.out.print("After swap:  ");
        display(result);

        sc.close();
    }
    public static void display(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static Node removeDuplicates(Node head)
    {
        Node i = head;
        Node j = head;
        while(j != null)
        {
            if(i.val == j.val)
                j = j.next;
            else
            {
                i.next = j;
                i = j;
            }
        }
        i.next = j;
        return head;
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