import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;


 public class Slideshow {

  public static void doSlideshow(){

    try {
     URI uri= new URI("http://people.tamu.edu/~danikadolan757/PROJ2/baby.html");

           java.awt.Desktop.getDesktop().browse(uri);
           System.out.println("Slideshow opened in browser");

    } catch (Exception e) {

      e.printStackTrace();


    }//end catch
  }


}//end google
