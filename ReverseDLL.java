import java.util.*;
class ReverseDLL
{
    public DLLNode reverseDLL(DLLNode head)
    {
        DLLNode pre = null;
        DLLNode curr = head;
        DLLNode fwd = null;
        while(curr != null)
        {
            fwd = curr.next;
            curr.next = pre;
            curr.prev = fwd;
            pre = curr;
            curr = fwd;
        }
        return pre;
    }
}