// Дан следующий код, исправьте его там, где требуется
public class task2 {

try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
}
// Нужно исправть:
// 1. строка 5, "intArray" слитно и не объявлена 
// 2. строка 5, на массив нельзя делить
// 3. строка 4 - 5, на ноль делить нельзя 
// 4. строка 4 , d объявить до try 
