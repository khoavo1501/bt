/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt_mang;
import java.util.Scanner;

public class Bt_mang {

    static int []M;
    static int N;
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Nhap phan tu :");
        N = sc.nextInt();
        M = new int[N];
        Nhap();
        Xuat();
        Xoa(2);
        Sapxep();
        Xuat();
    }
    static void Nhap() {
        for(int i=0;i<N;i++) {
            System.out.print("M["+i+"]=");
            M[i] = sc.nextInt();
        }
    }
    static void Xuat() {
        for(int i=0;i<N; i++) 
            System.out.println("M["+i+"]="+M[i]);
    }
    static int Tim(int x) {
        int vitri = 0;
        boolean found=false;
        for(int i=0;i<N && !found;i++)
            if(M[i]==x){
                 found=true;
                 vitri = i;
            }
               
//        if(found) System.out.println("Tim thay x trong M");
//        else System.out.println("Khong tim thay x trong M");
        return vitri;
    }
    static void Xoa(int x) {
        int vitri = Tim(x);
        for(int i=vitri;i<N-1;i++)
            M[i]=M[i+1];
        M[N-1]=0;
        N--;
    }
    static void Sapxep(){
        for(int i=0;i<N;i++)
            for(int j=0;j<N-1;j++)
                if(M[i]>M[j+1]) {
                    int temple = M[i];
                    M[i]=M[j+1];
                    M[j+1]=temple;
                }
    }
}
