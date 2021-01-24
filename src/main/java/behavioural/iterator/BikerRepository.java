package behavioural.iterator;

import java.util.Iterator;

public class BikerRepository implements Iterable<String> {

  private String[] bikes;
  private int index;

  public BikerRepository() {
    bikes = new String[10];
    index = 0;
  }

  void addBike(String bike) {
    if (index == bikes.length) {
      String[] largerBikes = new String[bikes.length + 5];
      System.arraycopy(bikes,0, largerBikes, 0, bikes.length);
      bikes = largerBikes;
    }

    bikes[index] = bike;
    index++;
  }

  @Override
  public Iterator<String> iterator() {
   Iterator<String> it = new Iterator<String>() {

     private int currentIndex = 0;

     @Override
     public boolean hasNext() {
       return currentIndex < bikes.length && bikes[currentIndex] != null;
     }

     @Override
     public String next() {
       return bikes[currentIndex++];
     }
   };

   return it;
  }
}
