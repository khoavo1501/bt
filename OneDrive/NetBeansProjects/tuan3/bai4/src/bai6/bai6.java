package bai6;
import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        System.out.println("Nhap vao hai so a, b");
        Scanner t = new Scanner(System.in);
        int a, b;
        a = t.nextInt();
        b = t.nextInt();
        System.out.println("Nhap vao phep toan can thuc hien:");
        char x= t.next().charAt(0);
        switch(x){
            case '+':
                System.out.println(a+"+"+b+"="+(a+b));
            break;
            case '-':
                System.out.println(a+"-"+b+"="+(a-b));
            break;
            case '*':
                System.out.println(a+"*"+b+"="+(a*b));
            break;
            case '/':
                if(b==0) System.out.println("Khong the chia duoc");
                else System.out.println(a+"/"+b+"="+(a/b));
            break;
        }
    }
}
