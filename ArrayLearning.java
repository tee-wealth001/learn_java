
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

// All uses wrapper class <String>, <Integer>, <Boolean> ....etc
// to create a wrapper object, use the wrapper class instead of the primitive type.
// use the corresponding function to get a wrapper object value eg .intValue(), .doubleValue() ....etc
public class ArrayLearning {

    Integer x = 5;

    // constructor is called automatically when the object instance is created
    public ArrayLearning() {

        System.out.println("Arrays ...x.." + x.intValue());

        ArrayListLearning();

        LinkedListLearning();

        HashMapLearning();

        HashSetLearning();
    }

    public static void ArrayListLearning() {
        // resizeable array and can be modified as much as you can
        // element of an arraylist are actualy objects
        // we can use <String>, <Integer>, <Boolean>
        // it destroys the whole to create a new
        // mainly used to store and access data
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("benz");
        cars.add("Ford");
        cars.add("Nissan");
        cars.add(0, "Tesla");

        // modifying the array
        cars.set(1, "BMW");

        // deleting a member of the array
        cars.remove(4);

        System.out.println("cars >>>>" + cars);

        // getting a member of the array
        System.out.println("car >>>>>" + cars.get(3));

        // sorting the array
        // can also sort numbers
        Collections.sort(cars);

        System.out.println("sorted cars >>>>" + cars);

        // looping through the array by index
        for (int i = 0; i < cars.size(); i++) {

            String modifiedText = "my " + cars.get(i);
            cars.set(i, modifiedText);
        }

        // looping through the array by individual member
        for (String i : cars) {

            System.out.println("member cars >>>>" + i);
        }

        System.out.println("cars >>>>" + cars);

        // removing all members
        cars.clear();
        System.out.println("cars >>>>" + cars);
    }

    public static void LinkedListLearning() {
        // resizeable array and can be modified as much as you can
        // element of an linkedlist are actualy objects
        // we can use <String>, <Integer>, <Boolean>
        // items are placed in containers and linked to others
        // mainly used to manipulate data
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(20);
        linkedList.add(34);
        linkedList.add(65);
        linkedList.add(19);

        // reverse the order of sorted list
        Collections.sort(linkedList, Collections.reverseOrder());

        linkedList.forEach(l -> System.out.println("member >>>>" + l));
    }

    public static void HashMapLearning() {
        // stores items in KEY/VALUE pairs
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("fruits", 20);
        hashMap.put("Vegetables", 56);
        hashMap.put("Sweets", 4);

        System.out.println("hashMap >>>>>>" + hashMap);

        // getting a value by the key
        System.out.println("getting a value by the key >>>>" + hashMap.get("firstName"));

        // remove an element by the key
        hashMap.remove("Sweets");

        // looping through using the .KeySet()
        // can also loop using .values()
        for (String i : hashMap.keySet()) {
            System.out.println(i + hashMap.get(i));
        }

        System.out.println("hashMap size >>>>>>" + hashMap.size());

        // remove all
        hashMap.clear();
    }

    public static void HashSetLearning() {
        // every item is uniquie in the collection
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("banana");
        hashSet.add("orange");
        hashSet.add("apple");
        hashSet.add("coconut");
        hashSet.add("mango");
        hashSet.add("banana"); // ignores this since it already exist

        // remove an element
        hashSet.remove("mango");

        // using iterator to loop through collections
        Iterator<String> it = hashSet.iterator();

        System.out.println(it.hasNext());

        while (it.hasNext()) {
            String elem = it.next();

            System.out.println("iterator >>>" + elem);
        }

        System.out.println(hashSet);

        hashSet.clear();
    }

}
