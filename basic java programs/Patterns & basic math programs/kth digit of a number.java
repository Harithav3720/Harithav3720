import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        long power = (long)Math.pow(A,B);
        long r = 0 , c = 0;
        System.out.println(power);
        while(power>0)
       {    r=power%10;
            c= c+1;
            power=power/10;
            if(K==c)
            {
                System.out.println(r);
            }
       }
        
        
    }
}
