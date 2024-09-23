
package bai4;
import java.util.Scanner;


public class Bai4 {

    
    public static void main(String[] args) {
       
        System.out.println("nhap vao a, b, c: ");
        Scanner t = new Scanner(System.in);
        int a, b, c;
        a = t.nextInt();
        b = t.nextInt();
        c = t.nextInt();
        System.out.println("So nho nhat trong ba so la: " + Math.min(a, Math.min(b, c)));
        
    }
    
}
