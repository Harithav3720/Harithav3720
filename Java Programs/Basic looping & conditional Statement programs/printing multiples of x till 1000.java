import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        for(int i=x;i<=1000;i++)
        {
            if(i%x==0)
            {
            System.out.println(i);
            }
        }
    }
}

