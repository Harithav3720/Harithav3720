import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        long fd=0,rev=0;
        long ld=n%10;
        while(n>0)
        { long r=n%10;
          rev =rev*10+r;
          n=n/10;
         }
         fd=rev%10;
        long sum = fd+ld;
         System.out.println(sum);
        
        
    }
}
