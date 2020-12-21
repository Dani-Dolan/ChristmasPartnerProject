import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;


 public class Website {
  public static void doWebsite(){

    try {
          //opens the website in a browzer from the desktop
               URI uri= new URI("http://people.tamu.edu/~madisondrake/web.html");
               java.awt.Desktop.getDesktop().browse(uri);
          //prints a message in powershell that notes this class was called
               System.out.println("Baby It's Cold outside opened in browzer");
    }//end try

    //catches any errors and prints where they are located
    catch (Exception e) {
      e.printStackTrace();
    }//end catch


  }
}//end website
