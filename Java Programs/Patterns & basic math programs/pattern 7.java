import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = n;
        for(int i=1;i<=n;i++)
        {   int temp=0;
            for(int j= c;j>=1;j--)
            {
                temp = temp+1;
                System.out.print(j +" " );
            }
            System.out.println(" ");
            c=c-1;
            
           
        }
    }
}