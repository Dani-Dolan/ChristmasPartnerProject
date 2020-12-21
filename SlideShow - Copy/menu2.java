

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu2{
  public static void main(String[] args){

    //initialize the other files
    //file name, function name = new filename();


    Website doWebsite = new Website();

    Slideshow doSlideshow = new Slideshow();

    Youtube doYoutube= new Youtube();

    Trivia doTrivia = new Trivia();


    JFrame f = new JFrame("Baby It's Cold Outside");


    JButton site = new JButton(new ImageIcon("web2.gif")); //button1
    site.setBounds(20,20,130, 300);
            site.addActionListener(new ActionListener(){
            @Override
              public void actionPerformed(ActionEvent event) {
                if(event.getSource() == site) {
                    doWebsite.doWebsite();
                }
              }
            });


    JButton slideshow = new JButton(new ImageIcon("slide.gif")); //button2
    slideshow.setBounds(160,20,130, 300);
          slideshow.addActionListener(new ActionListener(){
          @Override
            public void actionPerformed(ActionEvent event) {
              if(event.getSource() == slideshow) {
                  doSlideshow.doSlideshow();
              }
            }
          });


    JButton video = new JButton(new ImageIcon("idina.gif")); //button3
    video.setBounds(300,20,130, 300);
            video.addActionListener(new ActionListener(){
            @Override
              public void actionPerformed(ActionEvent event) {
                if(event.getSource() == video) {
                    doYoutube.doYoutube();
                }
              }
            });


    JButton trivia = new JButton(new ImageIcon("jeopardy.gif")); //button4
    trivia.setBounds(440,20,130, 300);
            trivia.addActionListener(new ActionListener(){
            @Override
              public void actionPerformed(ActionEvent event) {
                if(event.getSource() == trivia) {
                    doTrivia.doTrivia();
                }
              }
            });


    f.add(site);
    f.add(slideshow);
    f.add(video);
    f.add(trivia);
    f.setSize(600,380); //bounds of GUI window
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}//end main
}//end class
