import java.util.*;
class LinkedListDS
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.display();
        ll.addAtHead(50);
        ll.display();
        ll.deleteAtHead();
        ll.display();
        System.out.println(ll.size);
        sc.close();
        ll.search(30);
        ll.insert(45, 2);
        ll.display();
        System.out.println(ll.get(4));
    }
}
class Linkedlist
{
    Node head;
    Node tail;
    int size = 0;
    int search(int val)
    {
        if(head == null)
            return -1;
        Node temp = head;
        int idx = 0;
        while(temp != null)
        {
            if(temp.val == val)
                return idx;
            idx++;
            temp = temp.next;
        }
        return -1;
    }
    void addAtTail(int val)
    {
        Node temp = new Node(val);
        if(tail == null)
            head = tail = temp;
        else
        {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void addAtHead(int val) 
    {
        Node temp = new Node(val);
        if(head == null)
            head = tail = null;
        else 
        {
            temp.next = head;
            head = temp;
        }
        size++;
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
    void insert(int val, int idx)
    {
        if(idx<0 || idx>size)
        {
            System.out.println("invalid index");
        }
        else if(idx==0)
            addAtHead(val);
        else if(idx==size)
            addAtTail(val);
        else
        {
            Node temp = head;
            for(int i=1; i<=idx; i++)
            {
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }
    int get(int idx)
    {
        Node temp = head;
        for(int i=1; i<=idx; i++)
        {
            temp = temp.next;
        }
        return temp.val;
    }
    void delete(int idx)
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