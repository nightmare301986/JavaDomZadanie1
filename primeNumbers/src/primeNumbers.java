public class primeNumbers {

  public static void main(String[] args) {

      int i;
      int maxCheck = 1000; // maxCheck до какого числа ищем простые числа
      boolean isPrime = true;

      //Пустая строка
      String primeNumbers = "";

      //Цикл от 2 до maxCheck
      for (i = 2; i <= maxCheck; i++) {
          isPrime = CheckPrime(i);
          if (isPrime) {
              primeNumbers = primeNumbers + i + " ";
          }
      }
      System.out.println("Простые числа от 1 до " + maxCheck + " равны:");
      // Выводим на экран простые числа от 2 до maxCheck
      System.out.println(primeNumbers);
  }
  //Проверка на простое число
  public static boolean CheckPrime(int numberToCheck) {
      int remainder;
      for (int i = 2; i <= numberToCheck / 2; i++) {
          remainder = numberToCheck % i;
          //если remainder равен 0 тогда numberToCheckber не простое число. Выходим из цикла.
          if (remainder == 0) {
              return false;
          }
      }
      return true;

  }

}