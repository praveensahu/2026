package dsa;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheWithTTL<K, V> {

    private class Node {
        K key;
        V value;
        long expiryTime;
        Node prev, next;

        Node(K key, V value, long ttlMillis) {
            this.key = key;
            this.value = value;
            this.expiryTime = System.currentTimeMillis() + ttlMillis;
        }

        boolean isExpired() {
            return System.currentTimeMillis() > expiryTime;
        }
    }

    private final int capacity;
    private final Map<K, Node> map;

    private Node head, tail;

    public LRUCacheWithTTL(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
    }

    public synchronized V get(K key) {
        Node node = map.get(key);
        if (node == null) return null;

        if (node.isExpired()) {
            remove(node);
            map.remove(key);
            return null;
        }

        moveToHead(node);
        return node.value;
    }

    public synchronized void put(K key, V value, long ttlMillis) {
        Node node = map.get(key);

        if (node != null) {
            node.value = value;
            node.expiryTime = System.currentTimeMillis() + ttlMillis;
            moveToHead(node);
        } else {
            Node newNode = new Node(key, value, ttlMillis);
            map.put(key, newNode);
            addToHead(newNode);

            if (map.size() > capacity) {
                map.remove(tail.key);
                remove(tail);
            }
        }
    }

    private void addToHead(Node node) {
        node.next = head;
        node.prev = null;

        if (head != null)
            head.prev = node;

        head = node;

        if (tail == null)
            tail = head;
    }

    private void remove(Node node) {
        if (node.prev != null)
            node.prev.next = node.next;
        else
            head = node.next;

        if (node.next != null)
            node.next.prev = node.prev;
        else
            tail = node.prev;
    }

    private void moveToHead(Node node) {
        remove(node);
        addToHead(node);
    }
}
