import javax.swing.JOptionPane;
import java.util.Random;



public class Driver {
    /**
     *
     * @author 564951
     */
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
            String choice;
            String output;
            Random numGenerator=new Random();
            int card;

            choice=chooseSuit();
            card=Math.abs(numGenerator.nextInt(13))+1;


            output="Your choice of suit is : "+choice+" and the random card is ";


            if(card<11 && card>1){
                output=output+card;
                JOptionPane.showMessageDialog(null,output,"Deck of cards",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(card==11){
                output=output+"Jack";
                JOptionPane.showMessageDialog(null,output,"Deck of cards",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(card==12){
                output=output+"Queen";
                JOptionPane.showMessageDialog(null,output,"Deck of cards",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(card==13){
                output=output+"King";
                JOptionPane.showMessageDialog(null,output,"Deck of cards",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                output=output+"Ace";
                JOptionPane.showMessageDialog(null,output,"Deck of cards",JOptionPane.INFORMATION_MESSAGE);
            }

            System.exit(0);
        }

        static String chooseSuit() {
            String[] suits = {"Hearts", "Spade", "Clubs", "Diamonds"};
            String choice = (String) JOptionPane.showInputDialog(null, "Chooce a suit : ", "Suit choice", JOptionPane.QUESTION_MESSAGE, null
                    , suits,
                    suits[0]);

            return choice;
        }
}
