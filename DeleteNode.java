import java.util.*;
class DeleteNode
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
        ll.display();
        ll.deleteNode(3);
        ll.display();
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
    void deleteNode(int idx)
    {
        if(idx<0 || idx >=size)
        {
            System.out.println("Invalid index");
            return;
        }
        if(idx == 0)
        {
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i=1; i<=idx; i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(idx == size - 1)
            tail = temp;
        size--;
    }
    void deleteAtHead()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if(head == null)
            tail = null;
        size--;
    }
    void display()
    {
        if(head == null)
            return;
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}