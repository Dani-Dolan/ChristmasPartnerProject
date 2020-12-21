import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Trivia2 extends JFrame implements ActionListener {
    JLabel l;
    JRadioButton jb[] = new JRadioButton[5];
    JButton b1, b2;
    ButtonGroup bg;
    int count = 0, current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];



    Trivia2(String s) {
        super(s);
        l = new JLabel();
        add(l);
        bg = new ButtonGroup();
        for(int i = 0; i < 5 ; i++) {
            jb[i] = new JRadioButton();
            add(jb[i]);
            bg.add(jb[i]);
        }//end for
        b1 = new JButton("Next");
        b2 = new JButton("Bookmark");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);add(b2);
        set();
        l.setBounds(30,40,600,30);
        jb[0].setBounds(50,80,100,20);
        jb[1].setBounds(50,110,100,20);
        jb[2].setBounds(50,140,100,20);
        jb[3].setBounds(50,170,100,20);
        b1.setBounds(100,240,100,30);
        b2.setBounds(270,240,100,30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
        setSize(600,350);
    }//end Trivia

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) {
            if(check())
                count = count + 1;
            current++;
            set();
            if(current == 4) {
                b1.setEnabled(false);
                b2.setText("Result");
            }//end if
        }//end if

        //create "Bookmark" button to save question and be able to go back to it
        if(e.getActionCommand().equals("Bookmark")) {
            JButton bk = new JButton("Bookmark" + x);
            bk.setBounds(480, 20 + 30 * x, 100, 30);
            add(bk);
            bk.addActionListener(this);
            m[x] = current;
            x++;
            current++;
            set();
            if(current == 9)
                b2.setText("Result");
            setVisible(false);
            setVisible(true);
        }//end if
        for(int i = 0, y = 1; i < x; i++, y++) {
        if(e.getActionCommand().equals("Bookmark" + y)) {
            if(check())
                count = count + 1;
            now = current;
            current = m[y];
            set();
            ((JButton)e.getSource()).setEnabled(false);
            current = now;
        }//end if
      }//end for

        if(e.getActionCommand().equals("Result")) {
            if(check())
                count = count + 1;
            current++;
            //keep track of correct answers
            JOptionPane.showMessageDialog(this,"You got " + count + "/5 correct.");
            System.exit(0);
        }//end if
    }//end actionPerformed

    void set() {
        jb[4].setSelected(true);

        //display questions and answer choices
        if(current == 0) {
            l.setText("1. What year was the Idina Menzel and Michael Buble version of Baby It's Cold Outside released?");
            jb[0].setText("2011"); jb[1].setText("2014"); jb[2].setText("2019"); jb[3].setText("1944");
        }//end if
        if(current == 1) {
            l.setText("2. Who wrote the original version?");
            jb[0].setText("Kelly Clarkson"); jb[1].setText("Cee Lo Green"); jb[2].setText("Frank Loesser"); jb[3].setText("Willie Nelson");
        }//end if
        if(current == 2) {
            l.setText("3. How many times does the song title appear in the song?");
            jb[0].setText("9"); jb[1].setText("4"); jb[2].setText("2"); jb[3].setText("6");
        }//end if
        if(current == 3) {
            l.setText("4. How many different versions of this song are there?");
            jb[0].setText("More than 60"); jb[1].setText("7"); jb[2].setText("22"); jb[3].setText("16");
        }//end if
        if(current == 4) {
            l.setText("5. Finish the lyric: Baby, it's cold _______");
            jb[0].setText("inside"); jb[1].setText("out here"); jb[2].setText("outside"); jb[3].setText("today");
        }//end if

        l.setBounds(30,40,450,20);
        for(int i = 0, j = 0; i <= 90; i += 30, j++)
            jb[j].setBounds(50, 80 + i, 200, 20);
    }//end void

    //check for correct answer
    boolean check() {
        if(current == 0)
            return(jb[1].isSelected());
        if(current == 1)
            return(jb[2].isSelected());
        if(current == 2)
            return(jb[3].isSelected());
        if(current == 3)
            return(jb[0].isSelected());
        if(current == 4)
            return(jb[2].isSelected());
        return false;
    }//end check

    public static void main(String s[]) {
        new Trivia2("Baby It's Cold Outside Trivia Game");
    }//end main
}//end class
