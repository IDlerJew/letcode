package org.example.Easy;

public class Merge_Two_Sorted_Lists {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        public void out(){
            System.out.println(val);
          while(next!=null){
              System.out.println(next.val);
              next=next.next;
          }
        }
  }

    public static void main(String[] args){
        ListNode test3 = new ListNode(1, new ListNode(2,new ListNode(4)));
        ListNode test2 = new ListNode(1, new ListNode(3,new ListNode(4)));
        ListNode test = new ListNode();
        test=mergeTwoLists(test2,test3);
        test.out();
    }

        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            if (list1==null&&list2==null){
                return list1;
            }
            if (list1==null){
                return list2;

            }
            if (list2==null){
                return list1;
            }
            ListNode test = new ListNode(0);
            if (list2.val<list1.val){
                test.val= list2.val;
                list2=list2.next;
            }
            else {
                test.val= list1.val;
                list1=list1.next;
            }
            boolean flag=true;

            while (list1!=null&&list2!=null){
                if (list2.val<list1.val){
                    ListNode test2 = new ListNode(list2.val);
                   test.next=test2;
                   if (list2.next==null) {
                       flag = false;
                       break;
                   }
                   list2=list2.next;

                }
                else {
                    ListNode test2 = new ListNode(list1.val);
                    test.next=test2;
                    if (list1.next==null) break;
                    list1=list1.next;
                }
                if (!flag)
                {
                    while(list1!=null){
                        ListNode test2 = new ListNode(list1.val);
                        test.next=test2;
                        list1=list1.next;
                    }

                }
                else {
                    while(list2!=null){
                        ListNode test2 = new ListNode(list2.val);
                        test.next=test2;
                        list2=list2.next;
                    }
                }
            }
            return test;
        }

}
