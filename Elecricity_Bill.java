import java.awt.*;
import java.awt.event.*;

class BadhudeyBadhudu extends Frame implements ActionListener
{
    TextField t1,t2,t3;
    Label lt1,lt2,lt3;
    Button b1,b2;
    BadhudeyBadhudu()
    {
        setSize(500,600);
        setLayout(new FlowLayout());
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
    
        lt1=new  Label("Initial Reading");
        lt2=new Label("Final Reading");
        lt3=new Label("E_Bill");
        b1=new Button("Enter");
        b2=new Button("Reset");
        add(lt1);
        add(t1);
        add(lt2);
        add(t2);
        add(lt3);
        add(t3);
        add(b1);
        add(b2);
        t3.setEditable(false);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
    }
    public static void main(String a[])
    {
        new BadhudeyBadhudu();
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b2)
        {
            t1.setText(" ");
            t2.setText(" ");
            t3.setText(" ");
        }
       if(e.getSource()==b1)
       {
            int a,b,c;
            float d;
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            c=b-a;
            if(c<100)
            {
                d=c*1.40f;
                t3.setText(Float.toString(d));
            }
           else if(c<200)
            {
                d=c*2.75f;
                t3.setText(Float.toString(d));
            }
            else if(c<400)
            {
                d=c*3.5f;
                t3.setText(Float.toString(d));
            }
            else
            {
                d=c*5.00f;
                t3.setText(Float.toString(d));
            }
       }
    }
}
