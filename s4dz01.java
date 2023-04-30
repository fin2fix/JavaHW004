import java.util.LinkedList;

/**
 * Задание №1
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
 * вернет “перевернутый” список.
 */
public class s4dz01 {

  private static LinkedList<Integer> reversList(LinkedList<Integer> anyList) {
    LinkedList<Integer> newList = new LinkedList<>();

    for (int i = 0; i < anyList.size(); i++) {
      newList.add(anyList.get(anyList.size() - 1 - i));
    }
    return newList;
  }

  public static void main(String[] args) {

    LinkedList<Integer> myList = new LinkedList<>();
    myList.add(1);
    myList.add(2);
    myList.add(3);
    myList.add(4);
    myList.add(5);
    
    System.out.println("Первоначальный список");
    System.out.println(myList);
    System.out.println("Перевернутый список");
    System.out.println(reversList(myList));
  }
}