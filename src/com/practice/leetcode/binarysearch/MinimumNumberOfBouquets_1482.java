package com.practice.leetcode.binarysearch;

public class MinimumNumberOfBouquets_1482 {

//    private static int minDays(int[] bloomDay, int m, int k) {
//        Set<Integer> set = new HashSet<>();
//        for(int x : bloomDay){
//            set.add(x);
//        }
//        System.out.println(set);
//        int count =0;
//        int totalBloom =0;
//        List<Integer> list = new ArrayList<>(set);
//        for(int i=0;i<list.size();i++){
//            for(int j=0;j<bloomDay.length;j++){
//                if(bloomDay[j]<=list.get(i)){
//                    count++;
//                }else{
//                    count =0;
//                }
//                if (count==k){
//                    totalBloom++;
//                    count =0;
//                }
//                if(totalBloom==m){
//                    return list.get(i);
//                }
//            }
//            totalBloom =0;
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        int arr[] = {1, 10, 3, 10, 2};
        int totalB = 3;
        int totalFlower = 2;
//        int minDays = minDays(arr, totalB, totalFlower);
//        System.out.println(minDays);
        int minDays2 = minDaysUsingBinary(arr, totalB, totalFlower);
        System.out.println(minDays2);
    }

    private static int minDaysUsingBinary(int[] arr, int totalB, int totalFlower) {
        int high = 0;
        for (int i = 0; i < arr.length; i++) {
            high = Math.max(high, arr[i]);
        }
        int low = 0;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isCreateBouquets(arr, mid, totalFlower) >= totalB) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int isCreateBouquets(int[] arr, int mid, int totalFlower) {
        int count = 0;
        int totalBouq = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= mid) {
                count++;
            } else {
                count = 0;
            }
            if (count == totalFlower) {
                totalBouq++;
                count = 0;
            }
        }
        return totalBouq;
    }
}
