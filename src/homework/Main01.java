package homework;

import java.util.Random;
import java.util.Scanner;

public class Main01 {
  /*Написать метод, генерирующий целочисленный массив заданной длинны из случайных
   значений в заданом диапазоне
Продемонстрировать работу метода в main (вызвать с любыми аргументами).
Для этого также написать метод, печатающий ТОЛЬКО массив в консоль
Подсказка: у метода генерации должно быть три параметра, и возвращаемый тип - целочисленный массив
*/

    public static int[] getRendArr(int length, int min, int max) {
    Random random = new Random();
    int[] arr = new int[length];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = min + random.nextInt(max - min);
    }
    return arr;
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ((i == arr.length - 1) ? "" : " ,"));
    }

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input amount of elements: ");
    int length = scanner.nextInt();
    System.out.println("Enter the minimum value of the array: ");
    int min = scanner.nextInt();
    System.out.println("Enter the maximum value of the array:  ");
    int max = scanner.nextInt();

    getRendArr(length, min, max);
    printArray(getRendArr(length, min, max));
  }

}
