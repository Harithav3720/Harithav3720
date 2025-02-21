import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
       String FirstName = obj.next();
       String LastName = obj.next();
       int n = obj.nextInt();
       String FullName = FirstName+LastName; 
        for(int i=1;i<=n;i++)
        {
        System.out.println(FullName);
            
        }
    }
}














