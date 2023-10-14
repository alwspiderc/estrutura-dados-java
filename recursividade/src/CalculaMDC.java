
/**
 * 1 – O método a seguir, executa o cálculo do MDC (máximo divisor comum) de
 * dois inteiros positivos m e n. Escreva um método recursivo equivalente.
 * public static int CalculaMDC(int m, int n){
 * int r;
 * do{
 * r = m%n;
 * m = n;
 * n = r;
 * } while (r != 0);
 * return m;
 * }
 */

public class CalculaMDC {
  public static void main(String[] args) {
    int resultRecursividade = CalculandoRecursividade(24, 60);
    System.out.println(resultRecursividade);
  }

  public static int CalculandoRecursividade(int m, int n) {
    if (n == 0) {
      return m;
    }

    return CalculandoRecursividade(n, m % n);
  }
}
