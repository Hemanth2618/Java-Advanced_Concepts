package org.example.generics;

// Class with Multiple type parameters
public class KeyValuePair<K, V> {
    private K key;
    private V value;
    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
