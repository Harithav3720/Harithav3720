import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        int c=0;
        while(n>0)
        {   n=n/10;
            c=c+1;
        }
         System.out.println(c);
        
        
    }
}
