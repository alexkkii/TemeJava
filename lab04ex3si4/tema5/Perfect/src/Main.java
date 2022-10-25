import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            for(int i=1;i<=1000;i++)
                perfect(i);
        }
    public static void perfect(int n){
        int k=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                k=k+i;
        }
        if(k==n){
            System.out.println(n + " este perfect");
        }

    }

}