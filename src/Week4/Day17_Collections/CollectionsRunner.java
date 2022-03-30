package Week4.Day17_Collections;

import com.sun.source.tree.Tree;

import java.util.*;

public class CollectionsRunner {
    public static void main(String[] args) {

//        //Follow array data-struc, good for adding element at the end only
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(10);
//        arr.add(40);
//        arr.add(30);
//        arr.add(20);
//        arr.add(70);
//        arr.add(50);
//        arr.add(60);
//        System.out.println(arr);

//        ListIterator listIterator = arr.listIterator();
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }
//        while (listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }

//        //Follow doubly-linked list data structure, good for adding at first or middle
//        LinkedList<Integer> ll = new LinkedList<>();
//        ll.add(10);
//        ll.add(20);
//        ll.add(30);
//        ll.add(40);
//        System.out.println(ll);
//        ll.add(2,100);
//        System.out.println(ll);

//        //Follow min-heap data-struc
//        PriorityQueue pq = new PriorityQueue();
//        pq.add(100);
//        pq.add(50);
//        pq.add(150);
//        pq.add(25);
//        pq.add(75);
//        pq.add(125);
//        pq.add(175);
//        System.out.println(pq);
//        System.out.println(pq.peek());

//        //In ascending order, no duplicates
//        TreeSet treeSet = new TreeSet();
//        treeSet.add(100);
//        treeSet.add(50);
//        treeSet.add(150);
//        treeSet.add(25);
//        treeSet.add(75);
//        treeSet.add(125);
//        treeSet.add(175);
//        System.out.println(treeSet);

        //LeetCode question: Arrange numbers in ascending order based on number of "1s" in binary form
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(7);
        arr.add(8);
        arr.add(10);
        arr.add(11);
        System.out.println(arr);

        for (Integer integer : arr) {
            map.put(integer, decToBin(integer));
        }

        System.out.println(map);
        ArrayList<Integer> ans = new ArrayList<>();

        int count = 0;
        while (count != arr.size()) {
            for (Map.Entry<Integer, Integer> x : map.entrySet()) {
                if (x.getValue() == count) {
                    ans.add(x.getKey());
                }
            }
            count++;
        }
        System.out.println(ans);
    }

    public static int decToBin(int decimal) {
        ArrayList<Integer> temp = new ArrayList<>();
        while (decimal > 0) {
            temp.add(decimal % 2);
            decimal = decimal / 2;
        }
        return count1s(temp);
    }

    public static int count1s(ArrayList<Integer> temp) {
        int count = 0;
        for (int x : temp) {
            if (x == 1) {
                count++;
            }
        }
        return count;
    }
}
