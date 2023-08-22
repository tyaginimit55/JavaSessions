package com.learning.collections;

import java.util.*;

public class CollectionsPractice {

    public static void main(String[] args) {
        /*ArrayList<String> arrayList = new ArrayList<String >();
        ArrayList<String> arrayList2 = new ArrayList<String >();
        arrayList.add( "String 1");
        arrayList.add("string 2");
        arrayList.add( "String 3");
        arrayList.add("string 4");

        Scanner scanner = new Scanner(System.in);
        arrayList.add(scanner.nextLine());

        arrayList.remove(0);
        arrayList.remove("String 3");

        //arrayList2.add(arrayList.toString());
        arrayList2.addAll(arrayList);

        System.out.println("index ++++" + arrayList2.indexOf("string 4"));

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println("Iterator  " + iterator.next());
        }

        for (String str: arrayList2) {
            System.out.println("using For each " + str);
        }
*/

       /* LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("ll 1");
        linkedList.add("ll 2");
        linkedList.add("ll 3");

        if (linkedList.contains("ll 5")){
            System.out.println("element exists");
        }

//        Iterator iterator = linkedList.iterator();
//        while (iterator.hasNext()){
//            System.out.println("printing  " + iterator.next());
//        }

        Iterator revIterator = linkedList.descendingIterator();
        while (revIterator.hasNext()){
            System.out.println(" rev " + revIterator.next());
        }
*/

        /*List<String > list = new LinkedList<>();
        list.add("list val 1");
        list.add("list val 1");

        System.out.println(list.get(0));*/
       /* HashSet <String> hashSet = new HashSet<>(5);// initial capacity is 16, load factor 0.75
        HashSet <String> hashSet2 = new HashSet<>(list);
        hashSet.add("asdfgh");
        hashSet.add("asdfgh");
        hashSet.add("xcvbnm,");

        System.out.println(" -----------  "+hashSet2);



        Iterator iterator2 = hashSet.iterator();
        while (iterator2.hasNext()){
            System.out.println("  hash set  " + iterator2.next());
        }
*/

        TreeSet<String> treeSet = new TreeSet<>();
        Set syncedSet = Collections.synchronizedSet(treeSet);
        treeSet.add("ts val 2");
        treeSet.add("ts val 1");

        treeSet.add("ts val 1");

        //O(log N)
        //System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("tree set " + iterator.next());
        }
    }
}
