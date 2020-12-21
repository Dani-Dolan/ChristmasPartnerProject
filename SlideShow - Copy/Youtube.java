import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
//Code author creds to Robert Lightfoot (google.java) file in csce111 webpage

 public class Youtube {

  public static void doYoutube(){

    try {
     URI uri= new URI("https://youtu.be/TUhPckJArhs");

           java.awt.Desktop.getDesktop().browse(uri);
           System.out.println("Youtube video opened in browser");

    } catch (Exception e) {

      e.printStackTrace();


    }//end catch
  }


}//end google
