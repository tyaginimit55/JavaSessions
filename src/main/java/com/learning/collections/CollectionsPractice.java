package com.learning.collections;

import java.util.*;
import java.util.stream.Stream;

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

        /*TreeSet<String> treeSet = new TreeSet<>();
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
        }*/

       /* LinkedHashSet<String > linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Linked Hash Set 3");
        linkedHashSet.add("Linked Hash Set 2");
        linkedHashSet.add("Linked Hash Set 1");
        linkedHashSet.add(null);

        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println("Itertaor Printing on console  " + iterator.next());
        }
*/

        /*PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("pq 1");
        priorityQueue.add("pq 2");
        priorityQueue.add("pq 3");
        priorityQueue.add("pq 4");

        System.out.println("head element " + priorityQueue.element());

        //priorityQueue.poll();
        System.out.println("peek head element " + priorityQueue.peek());

        priorityQueue.remove("pq 3");
        System.out.println("peek head element " + priorityQueue.peek());

        Iterator iterator = priorityQueue.iterator();
        while (iterator.hasNext()){
            System.out.println("Prioirty Queue " + iterator.next());
        }
*/

        /*ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("arr Deque 2");
        arrayDeque.add("arr Deque 3");
        arrayDeque.add("arr Deque 1");


        Iterator iterator2 = arrayDeque.descendingIterator();
        while (iterator2.hasNext()){
            System.out.println("descending " + iterator2.next());
        }


        Iterator iterator = arrayDeque.iterator();
        while (iterator.hasNext()){
            System.out.println("+++++ " + iterator.next());
        }*/

        /*Map <Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(1, "c");
        map.put(4, null);
        map.put(null, null);
        map.replace(1, "e");
        map.remove(4, null);

        for (Map.Entry entry: map.entrySet() ) {
            System.out.println("key " + entry.getKey() + " value " + entry.getValue());
        }
*/
        /*HashMap <Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(1, "c");
        map.put(4, null);
        map.put(null, null);
        map.replace(1, "e");
        map.remove(4, null);

        for (Map.Entry entry: map.entrySet() ) {
            System.out.println("key " + entry.getKey() + " value " + entry.getValue());
        }
        */
        /*LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "LHM value 1");
        linkedHashMap.put(2, "LHM value 2");
        linkedHashMap.put(3, "LHM value 3");
        linkedHashMap.put(1, "LHM value 4");

        linkedHashMap.put(null, null);

        for (Map.Entry entry: linkedHashMap.entrySet()) {
            System.out.println("key " + entry.getKey() +" Value " + entry.getValue());
        }
*/
        /*TreeMap<String , String> treeMap = new TreeMap<>();
        treeMap.put("a", "Tree map 1");
        treeMap.put("b", "Tree map 2");
        treeMap.put("c", "Tree map 3");
        treeMap.put("d", "Tree map 4");
        treeMap.put("e" , null);

        for (Map.Entry entry : treeMap.entrySet()) {
            System.out.println("key " + entry.getKey() + " value " + entry.getValue());
        }*/

        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(1,"a");
        hashtable.put(2,"b");
        hashtable.put(3,"c");
        hashtable.put(4,"d");
        hashtable.put(5, "2");

        System.out.println(" ----------- " +hashtable.containsValue("b"));
        for (Map.Entry entry: hashtable.entrySet()) {
            System.out.println(entry.getKey() +"          " + entry.getValue());
        }

    }
}
