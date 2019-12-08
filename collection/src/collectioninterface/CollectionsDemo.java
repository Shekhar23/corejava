package collectioninterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {

    public static void main(String[] args) {
        // ArrayList
        List < String > list = new ArrayList < > ();
        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 4");
        System.out.println(" ArrayList Elements");
        System.out.print("\t" + list);

        // LinkedList
        List < String > linkedList = new LinkedList < > ();
        linkedList.add("element 1");
        linkedList.add("element 2");
        linkedList.add("element 3");
        linkedList.add("element 4");
        System.out.println();
        System.out.println(" LinkedList Elements");
        System.out.print("\t" + linkedList);

        // HashSet
        Set < String > set = new HashSet < > ();
        set.add("element 1");
        set.add("element 2");
        set.add("element 3");
        set.add("element 4");
        System.out.println();
        System.out.println(" Set Elements");
        System.out.print("\t" + set);

        // HashMap
        Map < String, String > map = new HashMap < > ();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");

        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + map);
    }
}