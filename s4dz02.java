/* Задание №2.
 * Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя.
 * 
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class s4dz02 {

  private static void enqueue(String text, Queue<String> anyList) {
    anyList.add(text);
  }

  private static String dequeue(Queue<String> anyList) {
    return anyList.remove();
  }

  private static String first(Queue<String> anyList) {
    Iterator<String> iter = anyList.iterator();
    String text = "";
    while (iter.hasNext()) {
      text = iter.next().toString();
      break;
    }
    return text;
  }

  private static int size(Queue<String> anyList) {
    Iterator<String> iter = anyList.iterator();
    int count = 0;
    while (iter.hasNext()) {
      count += 1;
      iter.next();
    }
    return count;
  }

  public static void main(String[] args) {

    Queue<String> data = new LinkedList<>();
    enqueue("Первый", data);
    enqueue("Второй", data);
    enqueue("Третий", data);
    System.out.printf("Первоначальная очередь - %s \n", data);
    System.out.println();
    System.out.printf("Размер очереди (количество элементов)- %s \n", size(data));
    System.out.println();
    System.out.printf("Первый элемент не удаляя -  %s\n", first(data));
    System.out.println();
    System.out.printf("Первый элемент с удалением -  %s\n", dequeue(data));
    System.out.println();
    System.out.printf("Очередь после удаления -  %s\n", data);
  }
}
