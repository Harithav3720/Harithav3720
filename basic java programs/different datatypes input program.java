import java.util.Scanner;
class Main
 {
   public static void main(String[] args) 
   {
   Scanner obj = new Scanner(System.in);
   int num = obj.nextInt();
   String name = obj.next();
   char letter = obj.next().charAt(0);
   System.out.println(num);
   System.out.println(name);
   System.out.println(letter);
    }
} 

