import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int p1=s.nextInt();
        int p2=s.nextInt();
        int p3=s.nextInt();
        int p4=s.nextInt();
        if(p1>=10&&p2>=10&&p3>=10&&p4>=10){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}