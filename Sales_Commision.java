import java.awt.*;
import java.awt.event.*;

class Sales extends Frame implements ActionListener
{
    TextField t1,t2,t3,t4;
    Button b1,b2;

    Sales()
    {
        setSize(500,600);
        setLayout(new FlowLayout());
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        t4=new TextField(10);
        b1=new Button("Calculate");
        b2=new Button("Reset");

        add(new Label("Sales Executive No. "));
        add(t1);
        add(new Label("Sales Executive Name"));
        add(t2);
        add(new Label("Sales Performed"));
        add(t3);
        add(b1);
        add(b2);
        add(new Label("Rate of commission is"));
        add(t4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
    }
    public static void main(String a[])
    {
        new Sales();
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            int a = Integer.parseInt(t3.getText());

            if(100<a && a<1000)
            {
                double b=0.08*a;
            t4.setText(Double.toString(b));
            }
            else if(1001<a && a<3000)
            {
                double b=0.13*a;
                t4.setText(Double.toString(b));
            }
            else if(3001<a && a<7000)
            {
                double b=0.17*a;
                t4.setText(Double.toString(b));
            }
           else if(7001<a && a<10000)
            {
                double b=0.2*a;
                t4.setText(Double.toString(b));
            }
           else
            {
                double b=0.25*a;
                t4.setText(Double.toString(b));
            }
        }  
       
        if(e.getSource()==b2)
        {
            t1.setText(" ");
            t2.setText(" ");
            t3.setText(" ");
            t4.setText(" ");
        }
    }
}
