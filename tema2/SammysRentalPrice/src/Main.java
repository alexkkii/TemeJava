import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Sammy’s makes it fun in the sun");
        System.out.println("Introduceti numarul de ore de inchiriere:");
        Scanner sc = new Scanner(System.in);
        int ore = sc.nextInt();
        System.out.println("Introduceti numarul de minute extra:");
        int minute = sc.nextInt();
        int pretora=40;
        int pretminut=1;
        int pretTotal=(ore*pretora)+(minute*pretminut);
        System.out.println("Numarul de ore: " + ore + ", numarul de minute: " + minute + ",pret toal: " + pretTotal);
    }
}