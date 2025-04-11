package com.practice.collectionframework.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;

/**
 * Author: Sandeep Singh
 * Date: 09/04/25
 */

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(9);
        System.out.println(linkedList);
        System.out.println("Get element for index 1 is :: " + linkedList.get(1));
        linkedList.addFirst(11); // addLast
        linkedList.addLast(100); // addFirst
        System.out.println(linkedList);
        System.out.println("Element is Contains ? ::" + linkedList.contains(4)); // element contains
        //linkedList.set(2, 111);  // replace the element with index position
        System.out.println(linkedList);
        //linkedList.removeFirst(); //removeFirst
        //linkedList.removeLast(); // removeLast
        //Integer remove = linkedList.remove(); // Retrieves and removes the head (first element) of this list.
        //System.out.println("remove :: "+remove);
        //Integer remove = linkedList.remove(2); // Retrieves and removes the index element of this list.
        //System.out.println("remove :: "+remove);
        //boolean remove = linkedList.remove(Integer.valueOf(111));  the object which is present in list and return boolean
        //System.out.println("remove :: "+remove);
        linkedList.addLast(1);
        System.out.println("After AddLast :: " + linkedList);
        //boolean removeFirstOccurrence = linkedList.removeFirstOccurrence(1); // Removes the first occurrence of the specified element in this list
        //System.out.println("removeFirstOccurrence :: "+removeFirstOccurrence);
        //boolean removeLastOccurrence = linkedList.removeLastOccurrence(1); // Removes the last occurrence of the specified element in this list
        //System.out.println("removeLastOccurrence :: " + removeLastOccurrence);
        System.out.println("After AddLast :: " + linkedList);
        //boolean b = linkedList.removeAll(List.of(1, 2, 3, 4, 5));// Removes all of this collection's elements that are also contained in the specified collection
        //System.out.println(b);
        //linkedList.removeIf(e -> e % 2 == 0);  // remove element with some condition
        //Integer element = linkedList.element(); //
        //Integer first = linkedList.getFirst(); //Returns the first element in this list.
        //Integer last = linkedList.getLast(); //Returns the Last element in this list.
        //boolean offer = linkedList.offer(20);// Adds the specified element as the tail (last element) of this list.  and return boolean
        //boolean b = linkedList.offerFirst(200);// Inserts the specified element at the front of this list. and return boolean
        //boolean b = linkedList.offerLast(500); Inserts the specified element at the Last of this list. and return boolean
        //System.out.println("Offer :: "+offer);
        //linkedList.retainAll(List.of(1,2)); // which element present in linkedlist they will only retain and all remove.
        //List<Integer> subList = linkedList.subList(2, 5); // return list  with in range index element.
        //System.out.println(subList);

        System.out.println("After removeAll :: " + linkedList);

    }
}
