import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
       int n=s.nextInt();
    if(n==1){
        System.out.println(0);
    }
    else if(n==2){
        System.out.println(1);
    }
    else if(n>2){
        System.out.println(2);
    }
}
}