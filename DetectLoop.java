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
        //display(a);

        boolean result = detectLoop(a);

        System.out.print(result);
        //display(result);

        sc.close();
    }
    // public static void display(Node head) {
    //     Node curr = head;
    //     while (curr != null) {
    //         System.out.print(curr.val);
    //         if (curr.next != null) System.out.print(" -> ");
    //         curr = curr.next;
    //     }
    //     System.out.println();
    // }
    public static boolean detectLoop(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
            {
                return true;
            }
        }
        return false;

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