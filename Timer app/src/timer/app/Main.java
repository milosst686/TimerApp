package timer.app;

import javax.swing.JOptionPane;
import javax.swing.JRootPane;

public class Main {

    public static void main(String[] args) {
        Settings settings = new Settings();
        String[] options = {"Settings","Close"};
        
      
        
       int optionsDialog = JOptionPane.showOptionDialog(null, "Choose option", "Option dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
       
       switch(optionsDialog)
{
      case JOptionPane.YES_OPTION:
               settings.setVisible(true);
      break;
      case JOptionPane.NO_OPTION:
          System.exit(0);
      break;
     
}
    }

}
