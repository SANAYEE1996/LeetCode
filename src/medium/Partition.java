package medium;

public class Partition {
	public ListNode partition(ListNode head, int x) {
        ListNode result = null;
        ListNode returnData = null;
        ListNode LastLowerValuePointer = null;
        ListNode firstHigherValuePointer = null;
        Boolean isStartHigher = false;
        while(head != null){
            int value = head.val;
            ListNode node = new ListNode(value);
            if(value < x){
                if(result == null){
                    result = node;
                    LastLowerValuePointer = result;
                    returnData = result;
                }else{
                    if(LastLowerValuePointer == null){
                        result = node;
                        result.next = firstHigherValuePointer;
                        LastLowerValuePointer = result;
                        while(result.next != null){
                            result = result.next;
                        }
                        if(isStartHigher){
                            returnData = LastLowerValuePointer;
                            isStartHigher = false;
                        }
                    }else{
                        node.next = LastLowerValuePointer.next;
                        LastLowerValuePointer.next = node;
                        LastLowerValuePointer = node;
                        if(firstHigherValuePointer == null){
                            result = LastLowerValuePointer;
                        }
                    }
                }
                
            }else{
                if(result == null){           
                    result = node;
                    returnData = result;
                    isStartHigher = true;
                }else{
                    result.next = node;
                    result = result.next;
                }
                if(firstHigherValuePointer == null){
                    firstHigherValuePointer = result;
                }
            }
            head = head.next;
        }
       return returnData;
    }
}
