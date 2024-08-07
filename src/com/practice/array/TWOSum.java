package com.practice.array;

import java.util.*;

public class TWOSum {

    public static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
        ArrayList<Pair<Integer, Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int complement = target - arr.get(i);
            if (map.containsKey(complement)) {
                result.add(new Pair<>(complement, arr.get(i)));
            }
            map.put(arr.get(i), i);
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,7,11,15));
        int target = 13;
        int n = list.size();
        ArrayList<Pair<Integer, Integer>> data = twoSum(list, target, n);
        for (Pair<Integer, Integer> pair : data) {
            System.out.println(pair.getKey() + " , " + pair.getValue());
        }
    }

    public static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

    }
}