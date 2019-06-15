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
public class Node {
    
    private Person data;
    private Node nextNode;
    
    public Node() {}
    
    public Node(Person p,Node n) {
        this.data = p;
        this.nextNode = n;
    }

    /**
     * @return the data
     */
    public Person getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Person data) {
        this.data = data;
    }

    /**
     * @return the nextNode
     */
    public Node getNextNode() {
        return nextNode;
    }

    /**
     * @param nextNode the nextNode to set
     */
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
    
    
}
