package testDict;

/*
 *        CSC3410 Spring 2015
 *        Sidney Seay sseay5@student.gsu.edu
 *        DateDue: 04272015
 *        Assignment: 6, Dictionary ADT Code
 *        File(s): BinaryTree.java, Dictionary.java, Entry.java, Node.java, TestDict.java, TreeDictionary.java
 * 
 */

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.NoSuchElementException;

// the binary tree class
// the class must implement the treeDictionary and Iterable interfaces
public class BinaryTree<K extends Comparable<K>, V> 
            implements TreeDictionary<K, V>, Iterable<Entry<K, V>> {

    // class members
    private int size;
    
    private Node<K, V> root;
    private Entry<K, V> entry;
    private String iterationOrder;
    
    public BinaryTree() {
        this.iterationOrder = "preorder";
        // to be implemented
    }
    
    public Node BinaryTree(Entry entry) {
    	return root.parent;
    }
    
    // private inner classes for preorder, inorder, postorder, and 
    // breath first order traversals
    // PreOrder class given as example:
    private class PreOrder implements Iterator<Entry<K, V>> {

        private Node<K, V> nextNode;

        PreOrder() {
            // to be implemented
        }

        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException("Not implemented yet");
        }
        
        public void remove() {
            throw new UnsupportedOperationException("Not implemented yet");
        }        

        @Override
        public Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Entry<K, V> entry = nextNode.entry;
            // to be implemented
            return entry;
        }
    }

    @Override
    public void makeEmpty() {
        size = 0;
        root = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /*
     *
     * @see testDict.Dictionary#insert(java.lang.Comparable, java.lang.Object)
     */
    public void insert(K k, V v) {
    	
        Entry entry = new Entry();
        entry.key = k;
        entry.value = v;

        if (root == null) {
          root = new Node(entry);
        } else {
          addNode(entry, (Comparable) k, root);
        }
        size++;
    }
    
    private void addNode(Entry entry, Comparable k, Node root) {

    	if (k.compareTo(root.entry.key()) <= 0) {
            if (root.leftChild == null) {
      	      root.leftChild = new Node(entry, root);
            }
            else {
      	           addNode(entry, k, root.leftChild);
            }
          }
    	  else {
            if (root.rightChild == null) {
      	       root.rightChild = new Node(entry, root);
            }
            else {
      	       addNode(entry, k, root.rightChild);
            }
          }    	
    }

    @Override
    public V find(K key) {

        if (key.compareTo(root.entry.key()) == 0) {
          return root.entry.value();
        }
		return null;
    }
    
    @Override
    public Set<K> getKeys() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
    
    @Override
    public List<V> getValues() {
        throw new UnsupportedOperationException("Not implemented yet");
    } 
    
    @Override
    public Set<Entry<K, V>> getEntries() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
    
    @Override
    public void defaultIterator(String order) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
    
    @Override
    public Iterator<Entry<K, V>> preorder() {
        this.iterationOrder = "preorder";
        throw new UnsupportedOperationException("Not implemented yet");
    }
    
    @Override
    public Iterator<Entry<K, V>> inorder() {
        this.iterationOrder = "inorder";
        throw new UnsupportedOperationException("Not implemented yet");
    }
    
    @Override
    public Iterator<Entry<K, V>> postorder() {
        this.iterationOrder = "postorder";
        throw new UnsupportedOperationException("Not implemented yet");
    }
    
    @Override
    public Iterator<Entry<K, V>> breathFirst() {
        this.iterationOrder = "bfs";
        throw new UnsupportedOperationException("Not implemented yet");
    }
    
    @Override
    public Iterator<Entry<K, V>> iterator() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
    
    public Iterator<Entry<K, V>> remove() {
        throw new UnsupportedOperationException("Not implemented yet");
    }    
    
    @Override
    public void remove(K key) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
    
    @Override
    public int height() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
    
    @Override
    public void prettyPrint() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
