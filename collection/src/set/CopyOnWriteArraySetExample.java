package set;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample {

    public static void main(final String[] args) {

       final CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();

       set.add(1);
       set.add(2);
       set.add(3);
       set.add(4);
       set.add(5);

       final Runnable runnable = () -> {
             set.add(4);
             set.add(5);
       };
  
       final Thread thread = new Thread(runnable);
       thread.start();
  
       final Iterator<Integer> iterator = set.iterator();
       while (iterator.hasNext()) {
             final Integer integer = iterator.next();
             System.out.println(integer);
       }
   }
}