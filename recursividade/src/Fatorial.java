/*
 * 2 - Desenvolva um programa em java que calcule o fatorial de um número x.
 */

public class Fatorial {
  public static void main(String[] args) {
    int result = calculoFatorial(3);
    System.out.println("result: " + result);
  }

  public static int calculoFatorial(int x) {
    if (x == 0) {
      return 1;
    }

    return x * calculoFatorial(x - 1);
  }
}
