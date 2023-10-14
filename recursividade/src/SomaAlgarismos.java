/*
  4 - Faça um programa em java fazendo uso da recursividade que solicite para o
      usuário digitar um número, em seguida, faça a soma de todos os algarismos do número. Exemplos:
      1981 = 1 + 9 + 8 + 1
      2020 = 2 + 0 + 2 + 0
 */

public class SomaAlgarismos {
  public static void main(String[] args) {
    int resultado = soma(1981);
    System.out.println("Resultado: " + resultado);
  }

  public static int soma(int n) {
    if (n < 10) {
      return n;
    } else {
      int ultimoDigito = n % 10;
      int numeroRestante = n / 10;
      return ultimoDigito + soma(numeroRestante);
    }
  }
}
