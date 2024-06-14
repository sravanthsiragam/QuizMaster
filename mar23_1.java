// interface A {
// void calculate(int x, int y); // by default public and abstract
// }

// public class mar23_1{
// public static void main(String[] args) {
// A add = (x, y) -> System.out.println("Sum is " + (x + y));
// A sub = (x, y) -> System.out.println("Sum is " + (x - y));
// add.calculate(12, 34);
// sub.calculate(12, 34);
// }
// }
// interface NumericTest {
// boolean test(int n);
// }
// public class mar23_1 {
// public static void main(String args[])
// {
// // A lambda expression that tests if a number is even.
// int num=12;
// //NumericTest isEven = (int n) -> (n % 2)==0;//We can specify the type in left side
// NumericTest isEven = (n) -> (n % 2)==0;//We can skip the type in left side
// //NumericTest isEven = n -> (n % 2)==0;//When there is one argument, we can remove brackets also
// if(isEven.test(num))
// System.out.println("num is even");
// else
// System.out.println("num is odd");
// NumericTest isnum=(n)->n>=0;
// if(isnum.test(num))
// System.out.println("Number is non-negative");
// else
// System.out.println("Number is negative");
// }
// }
import java.util.*;
public class mar23_1
{
public static void main(String[] args)
{
ArrayList<String> list=new ArrayList<String>();
list.add(“ABC");
list.add(“PQR");
list.add(“STU");
list.add(“XYZ");
list.forEach(
(n)->System.out.println(n)
);
}}
inteface A{
  Void show() 