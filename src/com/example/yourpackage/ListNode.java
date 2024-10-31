package com.example.yourpackage; // Замените на ваш реальный пакет, если вы используете пакеты

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
        this.val = 0;
        this.next = null;
    }

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
