/* Задание №3
 * Напишите постфиксный калькулятор. 
 * Пользователь вводит данные и операции в обратной польской записи.
 *  Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.
Например:
5 4 3 - + => 5 1 + => 6
 */

import java.util.Scanner;
import java.util.Stack;

public class s4dz03 {

  public static boolean isNum(String anyString) {
    boolean flag;
    try {
      Integer.parseInt(anyString);
      flag = true;
    } catch (NumberFormatException e) {
      flag = false;
    }
    return flag;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in, "866");
    System.out.println("Введите данные для расчета");
    String[] symbols = scan.nextLine().split(" ");
    scan.close();

    Stack<Integer> data = new Stack<>();

    for (int i = 0; i < symbols.length; i++) {
      if (isNum(symbols[i])) {
        data.add(Integer.parseInt(symbols[i]));
      } else {
        int x = data.pop();
        int y = data.pop();
        if (symbols[i].equals("+")) {
          data.add(x + y);
        } else if (symbols[i].equals("-")) {
          data.add(y - x);
        } else if (symbols[i].equals("*")) {
          data.add(x * y);
        } else if (symbols[i].equals("/")) {
          data.add(y / x);
        } else {
          System.out.println("Введены неверные символы/цифры/знаки операций");
        }
      }
    }
    if (data.size() == 1) {
      System.out.println(data);
    } else {
      System.out.println("В условии (вводных данных) есть ошибка, так как в стеке содержится более одного значения");
    }
  }
}