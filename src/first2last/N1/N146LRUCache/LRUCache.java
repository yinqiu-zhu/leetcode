package first2last.N1.N146LRUCache;

import java.util.HashMap;

class LRUCache {

    int capacity, count;
    HashMap<Integer, DLinkedList> map;
    DLinkedList head, tail;

    public LRUCache(int capacity){
        this.capacity = capacity;
        count = 0;
        map = new HashMap<>(capacity);
        head = new DLinkedList(-1,-1);
        tail = new DLinkedList(-1,-1);
        tail.pre = head;
        tail.post = null;
        head.pre = null;
        head.post = tail;
    }

    public void put(int key, int value){
        if (map.containsKey(key)){
            DLinkedList temp = map.get(key);
            temp.value = value;
            removeFromList(temp);
            addToTail(temp);
        }
        else {
        DLinkedList temp = new DLinkedList(key, value);
        if (count == capacity){
            removeFromMap(head.post);
            removeFromList(head.post);
        }
        else count++;
        addToTail(temp);
        addToMap(temp);
        }
    }
    public int get(int key){
        if (!map.containsKey(key)) return -1;
        else {
            DLinkedList temp = map.get(key);
            if (temp.post != tail){
            removeFromList(temp);
            addToTail(temp);
            }
            return temp.value;
        }
    }
    private void removeFromList(DLinkedList input){
        input.post.pre = input.pre;
        input.pre.post = input.post;
    }
    private void removeFromMap(DLinkedList input){
        map.remove(input.key);
    }
    private void addToTail(DLinkedList input){
        input.pre = tail.pre;
        input.post = tail;
        tail.pre.post = input;
        tail.pre = input;
    }
    private void addToMap(DLinkedList input){
        map.put(input.key, input);
    }

}

class DLinkedList {

    int key, value;
    DLinkedList pre, post;

    public DLinkedList(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
