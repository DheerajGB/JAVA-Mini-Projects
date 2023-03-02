import java.awt.*;
import java.awt.event.*;

class GametoPlay extends Frame implements ActionListener
{
    TextField t1,t2,t3;
    Button b1,b2;

    GametoPlay()
    {
        setSize(500,600);
        setLayout(new FlowLayout());
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(20);
        b1=new Button("Check");
        b2=new Button("Reset");

        add(new Label("Name of Student"));
        add(t1);
        add(new Label("Age of Student"));
        add(t2);
        add(b1);
        add(b2);
        add(new Label("Eligible for"));
        add(t3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
    }
public static void main(String a[])
{
    new GametoPlay();
}
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b1)
    {
        int a=Integer.parseInt(t2.getText());

    if(a<16)
    {
        t3.setText("NOT ELIGIBLE FOR GAMES");
    }
    else if(a>16 && a<20)
    {
        t3.setText("ELIGIBLE FOR CRICKET");
    }
   else if(a>21 && a<22)
    {
        t3.setText("ELIGIBLE FOR BOXING");
    }
   else if(a>23 && a<25)
    {
        t3.setText("ELIGIBLE FOR FOOTBALL");
    }
   else if(a>26 && a<30)
    {
        t3.setText("ELIGIBLE FOR BOXING");
    }
    else
    {
        t3.setText("NOT ELIGIBLE FOR ANY GAME");
    }
    }
    
    if(e.getSource()==b2)
    {
        t1.setText(" ");
        t2.setText(" ");
        t3.setText(" ");
    }
    
}
}
