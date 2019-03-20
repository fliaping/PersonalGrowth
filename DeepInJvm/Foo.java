
public class Foo {
 static boolean flag;
 public static void main(String[] args) {
  flag = true;
  if (flag) System.out.println("Hello, Java!");
  if (flag == true) System.out.println("Hello, JVM!");
 }
}
