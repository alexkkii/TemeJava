import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Welcome to the quiz :)\n"
        + "raspundeti va rog cu 1,2,3 sau 4");
        Integer first = Integer.valueOf(JOptionPane.showInputDialog(null, "1:Februarie , martie , aprilie\n"
                + "2:Iulie , august , septembrie\n"
                + "3:Martie , aprilie , mai\n"
                + "4:Aprilie , mai , iunie\n",  "Lunile de primavara sunt:", JOptionPane.QUESTION_MESSAGE));
        int rCorect1=3;
        int k=0;
        if(first==rCorect1) {
            JOptionPane.showMessageDialog(null, "Raspuns Corect!");
            k++;
        }
        else{
            JOptionPane.showMessageDialog(null,"Raspuns gresit, " + rCorect1 + " era raspunsul corect.");
        }
        Integer seccond = Integer.valueOf(JOptionPane.showInputDialog(null, "1:Rosu\n"
                + "2:Verde\n"
                + "3:Galben\n"
                + "4:Roz\n",  "Miezul pepenelui verde este de regulă :", JOptionPane.QUESTION_MESSAGE));
        int rCorect2=1;
        if(seccond==rCorect2) {
            JOptionPane.showMessageDialog(null, "Raspuns Corect!");
            k++;
        }
        else{
            JOptionPane.showMessageDialog(null,"Raspuns gresit, " + rCorect2 + " era raspunsul corect.");
        }
        Integer third = Integer.valueOf(JOptionPane.showInputDialog(null, "1:Blana\n"
                + "2:Tepi\n"
                + "3:Pene\n"
                + "4:Haine\n",  "Păsările au corpul acoperit cu :", JOptionPane.QUESTION_MESSAGE));
        int rCorect3=3;
        if(third==rCorect3) {
            JOptionPane.showMessageDialog(null, "Raspuns Corect!");
            k++;
        }
        else{
            JOptionPane.showMessageDialog(null,"Raspuns gresit, " + rCorect3 + " era raspunsul corect.");
        }
        Integer fourth = Integer.valueOf(JOptionPane.showInputDialog(null, "1:Cerbul\n"
                + "2:Camila\n"
                + "3:Lupul\n"
                + "4:Ursul\n",  "Ce animal nu trăieste la noi în tara ?", JOptionPane.QUESTION_MESSAGE));
        int rCorect4=2;
        if(fourth==rCorect4) {
            JOptionPane.showMessageDialog(null, "Raspuns Corect!");
            k++;
        }
        else{
            JOptionPane.showMessageDialog(null,"Raspuns gresit, " + rCorect4 + " era raspunsul corect.");
        }
        Integer fifth = Integer.valueOf(JOptionPane.showInputDialog(null, "1:Cerc\n"
                + "2:Triunghi\n"
                + "3:Hexagon\n"
                + "4:Patrat\n",  "Ce figura geometrica are patru laturi ?", JOptionPane.QUESTION_MESSAGE));
        int rCorect5=4;
        if(fifth==rCorect5) {
            JOptionPane.showMessageDialog(null, "Raspuns Corect!");
            k++;
        }
        else{
            JOptionPane.showMessageDialog(null,"Raspuns gresit, " + rCorect5 + " era raspunsul corect.");
        }
        JOptionPane.showMessageDialog(null,"Felicitari, ati terminat quiz-ul!\n"
                + "Raspunsuri corecte: " + k +"/5");
    }
}