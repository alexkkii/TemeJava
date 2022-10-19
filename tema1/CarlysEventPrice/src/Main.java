import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Carly’s makes the food that makes it a party");
        System.out.println("Introduceti nr de invitati:");
        Scanner sc = new Scanner(System.in);
        int invitati = sc.nextInt();
        int preti=35;
        double pret;
        pret=35*invitati;
        System.out.println("Pretul per invitat este:" + preti);
        System.out.println("Pretul total este:" + pret);
        if(invitati>=50) {
            System.out.println("Adevarat");
        } else {
            System.out.println("Fals");
        }

    }
}
