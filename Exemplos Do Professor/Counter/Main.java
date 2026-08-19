public class Main {
  public static void main(String[] args) {
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    c1.incCount();		
    c1.incCount();
    System.out.println("Contador c1: " + c1.getCount());
    System.out.println("Contador c2: " + c2.getCount()+"\n");
    c2.incCount();
    c1.decCount();
    System.out.println("Contador c1: " + c1.getCount());
    System.out.println("Contador c2: " + c2.getCount());
  }
}