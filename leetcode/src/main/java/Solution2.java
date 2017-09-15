

/**
 * 
 * @author xiefeng
 *	Add Two Numbers
 *	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *	Output: 7 -> 0 -> 8
 *	注意while循环中c==1 时也要进行处理。
 */
public class Solution2 {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	     ListNode head = new ListNode(0);
	     ListNode pre = head;
	     ListNode ths;
	     int c = 0;
	     while(l1!=null||l2!=null||c==1){
	    	 int a = 0;
	    	 int b = 0;
	    	 
	    	 if(l1 != null){
	    		 a = l1.val;
	    		 l1 = l1.next;
	    	 }
	    	 if(l2 != null){
	    		 b = l2.val;
	    		 l2 = l2.next;
	    	 }
	    	 
	    	 ths = new ListNode((a+b+c)%10);
	    	 if(a+b+c>=10){
	    		 c = 1;
	    	 }else{
	    		 c = 0;
	    	 }
	    	 pre.next = ths;
	    	 pre = ths;
	     }
		 return head.next;
	 }
	 public static void print(ListNode l1) {
		while(l1!=null){
			System.out.println(l1.val);
			l1=l1.next;
		}
			
	}
	 public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode node = new Solution2().addTwoNumbers(l1, l2);
		Solution2.print(node);
		
	}
	 
	 static class ListNode {
		    int val;
		    ListNode next;
		    ListNode(int x) { val = x; }
		}
}

