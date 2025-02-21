import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int angle1 = obj.nextInt();
        int angle2 = obj.nextInt();
        int angle3 = obj.nextInt();
        int sum;
        sum = angle1+angle2+angle3;
        if(sum==180)
        {
            System.out.println("Triangle can be Formed");
        }
        else
        {
            System.out.println("Triangle cannot be Formed");
        }
        
} 
}

