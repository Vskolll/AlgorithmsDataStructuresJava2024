package com.example.yourpackage;

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Case 1
        ListNode list1Case1 = createList(new int[]{1, 2, 4});
        ListNode list2Case1 = createList(new int[]{1, 3, 4});
        System.out.println("Case 1: Merging lists [1, 2, 4] and [1, 3, 4]");
        ListNode resultCase1 = solution.mergeTwoLists(list1Case1, list2Case1);
        System.out.print("Result for Case 1: ");
        printList(resultCase1);

        // Case 2
        ListNode list1Case2 = createList(new int[]{});
        ListNode list2Case2 = createList(new int[]{});
        System.out.println("Case 2: Merging empty lists [] and []");
        ListNode resultCase2 = solution.mergeTwoLists(list1Case2, list2Case2);
        System.out.print("Result for Case 2: ");
        printList(resultCase2);

        // Case 3
        ListNode list1Case3 = createList(new int[]{});
        ListNode list2Case3 = createList(new int[]{0});
        System.out.println("Case 3: Merging lists [] and [0]");
        ListNode resultCase3 = solution.mergeTwoLists(list1Case3, list2Case3);
        System.out.print("Result for Case 3: ");
        printList(resultCase3);
    }

    // Метод для создания списка из массива
    private static ListNode createList(int[] values) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Метод для печати списка
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}