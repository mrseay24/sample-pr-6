package testDict;

/*
 *        CSC3410 Spring 2015
 *        Sidney Seay sseay5@student.gsu.edu
 *        DateDue: 04272015
 *        Assignment: 6, Dictionary ADT Code
 *        File(s): BinaryTree.java, Dictionary.java, Entry.java, Node.java, TestDict.java, TreeDictionary.java
 * 
 */

// The Entries in the BinaryTree are <key, value> pairs
// The key (K) type must be Comparable
// Entry must impelement Comparable
public class Entry<K extends Comparable<K>, V> implements Comparable<Entry<K, V>> {

    protected K key;
    protected V value;

    // constructor
    protected Entry() {
    	
    }
    
    protected Entry(K k, V v) {
        key = k;
        value = v;
    }

    public K key() {
        return key;
    }

    public V value() {
        return value;
    }
    
    // override toString method
    // toString method should print the entry as:
    // <key,value>
    @Override
    public String toString() {
        if (value == null) {
            return "";
        }
        else {
            return value.toString();
        }    	
    }
    
    // override compareTo method for Entry
    @Override
    public int compareTo(Entry<K, V> other) {

    	throw new UnsupportedOperationException("Not implemented yet");
    }
}
