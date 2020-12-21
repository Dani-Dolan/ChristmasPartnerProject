import java.awt.Desktop;
import java.io.*;

public class Trivia {

  public static void doTrivia(){

    try {

      Trivia2 file= new Trivia2("Trivia2.java");

      //java.awt.Desktop.getDesktop().browse();
      System.out.println("Trivia opened");
    }//end try
    catch (Exception e) {
      e.printStackTrace();
    }//end catch

  }//end doTrivia
}//end Trivia
