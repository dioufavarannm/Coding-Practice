class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq =
            new PriorityQueue<>((a,b) -> a.val - b.val);

        for(ListNode l : lists)
            if(l != null) pq.add(l);

        ListNode dummy = new ListNode(0), cur = dummy;

        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            cur.next = node;
            cur = cur.next;

            if(node.next != null)
                pq.add(node.next);
        }

        return dummy.next;
    }
}