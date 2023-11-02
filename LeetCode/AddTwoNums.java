
public class AddTwoNums {

	public static class ListNode {
		int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	    
	    public void add(int key)
	    {
	    	ListNode temp = new ListNode(key, this.next);
	    	this.next = temp;
	    		
	    }
	    
	    public void print()
	    {
	    	ListNode temp = this.next;
	    	while(temp != null)
	    	{
	    		System.out.print(temp.val + "\n");
	    		temp = temp.next;
	    	}
	    }

	}
	public static void main(String[] args) {
		ListNode head = new ListNode();
		head.add(2);
		head.add(4);
		head.add(3);
		
		head.print();
		

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Integer x;
		
        return null;
    }
}
