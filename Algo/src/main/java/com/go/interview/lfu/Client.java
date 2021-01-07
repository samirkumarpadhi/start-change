package com.go.interview.lfu;

import java.util.Map;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        LFUCache cache = new LFUCache(4);
        cache.set(11, function(11));
        cache.set(12, function(12));
        cache.set(13, function(13));
        cache.set(14, function(14));
        cache.set(15, function(15));
        client.print(cache.getFrequencies());

        cache.get(13);
        cache.get(13);
        cache.get(13);
        cache.get(14);
        cache.get(14);
        cache.get(14);
        cache.get(14);
        client.print(cache.getCache());
        client.print(cache.getCounts());
        client.print(cache.getFrequencies());
    }

    public void print(Map<Integer, ? extends Object> map) {

        for(Map.Entry<Integer, ? extends Object> entry : map.entrySet()) {
            if(entry.getValue() instanceof Node) {
                System.out.println("Cache Key => "+entry.getKey()+", Cache Value => "+((Node) entry.getValue()).toString());
            } else if (entry.getValue() instanceof DoublyLinkedList) {
                System.out.println("Frequency Key => "+entry.getKey()+" Frequency Values => [");
                Node head = ((DoublyLinkedList) entry.getValue()).head();
                while(null != head) {
                    System.out.println(head.toString());
                    head = head.getNext();
                }
                System.out.println(" ]");
            } else {
                System.out.println("Count Key => "+entry.getKey()+", Count Value => "+entry.getValue());
            }
        }
    }

    public static int function(int key) {
        int prime = 31;
        return key*prime;
    }
}
