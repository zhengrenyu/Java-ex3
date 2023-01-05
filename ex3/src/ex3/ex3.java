package ex3;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
        sop("請輸入一個數值\n");
        Scanner sc = new Scanner(System.in);
        double var = sc.nextDouble();
        round(var);
        floor(var);
        ceil(var);
        sc.close();
    }
    static void sop(String s){
        System.out.print(s);
    }
    static void round(double var){
        sop("四捨五入(round)"+Math.round(var)+"\n");
    }
    static void floor(double var){
        sop("無條件捨去(floor)"+Math.floor(var)+"\n");
    }
    static void ceil(double var){
        sop("無條件進位法(ceil)"+Math.ceil(var)+"\n");
    }
}