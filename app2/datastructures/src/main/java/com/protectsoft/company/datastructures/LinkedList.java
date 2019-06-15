/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.protectsoft.company.datastructures;

/**
 *
 * @author piper
 */
public class LinkedList {
    
    private Node first;
    private Node last;
    
    public LinkedList() {
        first = last = null;
    }

    public void addFirst(Person person) {
        if(isEmpty()) {
            first = last = new Node(person,null);
        } else {
            first = new Node(person,first);
        }
    }
    
    public void addLast(Person p){
        if(isEmpty()) {
            first = last = new Node(p,null);
        } else {
            last = new Node(p,last);
        }
    }

    public int size() {
        return 0;
    }
    
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * @return the first
     */
    public Node getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(Node first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public Node getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(Node last) {
        this.last = last;
    }
    
}
