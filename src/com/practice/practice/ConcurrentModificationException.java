package com.practice.practice;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Author: SANDEEP
 * Date: 18/12/24
 */

public class ConcurrentModificationException {

    public static void main(String[] args) {

//        This is When you modify in a RunTime List or Map

      /*  Map<String,Integer> name = new HashMap<>(); // Name And Age
        name.put("sandeep",26);
        name.put("kuldeep",21);
        name.put("rishabh",17);
        Iterator<String> iterator = name.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(name.get(iterator.next()));
            name.put("vikas",26);
        }
      */


//        This Time we have using a ConcurrentHashMap so we have Modify in Runtime
        ConcurrentHashMap<String, Integer> n = new ConcurrentHashMap<>();
        n.put("sandeep", 26);
        n.put("kuldeep", 21);
        n.put("rishabh", 17);
        Iterator<String> iterator1 = n.keySet().iterator();
        while (iterator1.hasNext()) {
            System.out.println(n.get(iterator1.next()));
            n.put("vikas", 26);
        }

    }

}
