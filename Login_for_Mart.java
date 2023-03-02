import java.awt.*;
import java.awt.event.*;

public class Login_for_Mart extends Frame implements ActionListener,TextListener
{
    Label l1,l2;
    TextField t1,t2;
    Button b1,b2;

    public Login_for_Mart()
    {
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        setSize((d.width/2)+100,(d.height/2)+100);
        setLocation((d.width/4)-50,(d.height/4)-50);
        setLayout(new FlowLayout());

        l1=new Label("USER NAME");
        l2=new Label("PASSWORD");
        t1=new TextField(20);
        t2=new TextField(20);
        b1=new Button("Login");
        b2=new Button("Reset");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);

    }
    public static void main(String a[])
    {
        new Login_for_Mart();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            String un,pw;
            un=t1.getText();
            pw=t2.getText();
            if(un.equals("DHEERU"))
            {
                if(pw.equals("DHEERU195"))
                {
                    new SuperMart();
                    dispose();
                }
                else
                {
                    System.out.println("donga dorikesadu");
                }
            }
            else
            {
                System.out.println("Kaun hey re tu");
            }
        }
        if(e.getSource()==b2)
    {
        t1.setText("");
        t2.setText("");
        t1.requestFocus();
    }
    }

    public void  textValueChanged(TextEvent e)
    {
        if(t1.getText().length()>5 && t2.getText().length()>5)
        {
            b1.setEnabled(true);
        } 
        else
        b1.setEnabled(false);
    }

    class SuperMart extends Frame implements ItemListener,ActionListener
{
	Choice its,qty;
	List pro,pri,t1,t2,t3,t4;
	TextField t5;

	SuperMart()
	{
		setSize(800,500);
		setLocation(300,100);
		setLayout(new FlowLayout());
		t1=new List();
		t2=new List();
		t3=new List();
		t4=new List();
		t5=new TextField("0",10);


		its=new Choice();
		its.add("Soaps");
		its.add("Pastes");
		its.add("Shampoo");
		its.add("Drinks");
		
		pro=new List();
		pri=new List();
		qty=new Choice();

		for(int i=0;i<21;i++)
			qty.add( Integer.toString(i) );

		add(new Label("ITEMS"));
		add(its);
		add(new Label("Products"));
		add(pro);
		add(new Label("Prices"));
		add(pri);
		add(new Label("Quantity"));
		add(qty);

		add(new Label("Product"));
		add(t1);
		add(new Label("Price"));
		add(t2);
		add(new Label("Quantity"));
		add(t3);
		add(new Label("Total"));
		add(t4);
		add(new Label("Grand Total"));
		add(t5);
	
		pri.setEnabled(false);
		qty.setEnabled(false);
		
		its.addItemListener(this);
		pro.addItemListener(this);
		qty.addItemListener(this);

		t1.setEnabled(false);
		t2.setEnabled(false);
		t3.setEnabled(false);
		t4.setEnabled(false);
		t5.setEditable(false);

		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setVisible(true);
	}


	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==its)
		{
			if(its.getSelectedItem().equals("Soaps") )
			{
				pro.removeAll(); pri.removeAll();
				pro.add("LUX");	pri.add("23");
				pro.add("REXONA");pri.add("27");
				pro.add("HAMAM");	pri.add("32");
				pro.add("LIRIL");	pri.add("36");
				pro.add("SANTOOR");pri.add("29");
			}

			if(its.getSelectedItem().equals("Pastes") )
			{
				pro.removeAll(); pri.removeAll();
				pro.add("COLGATE");pri.add("123");
				pro.add("CLOSEUP");pri.add("213");
				pro.add("HIMALAYA");pri.add("227");
				pro.add("DABUR RED");pri.add("232");
				pro.add("MESWAK");pri.add("189");
			}	

			if(its.getSelectedItem().equals("Shampoo") )
			{
				pro.removeAll(); pri.removeAll();
				pro.add("TRESEMME");	pri.add("3");
				pro.add("LOREAL");pri.add("3");
				pro.add("DOVE");	pri.add("2");
				pro.add("CLEAR");	pri.add("2");
				pro.add("CLINIC PLUS");pri.add("1");
			}
			if(its.getSelectedItem().equals("Drinks") )
			{
				pro.removeAll(); pri.removeAll();
				pro.add("RED BULL");	pri.add("50");
				pro.add("FIZZ");pri.add("20");
				pro.add("SPRITE");	pri.add("25");
				pro.add("FANTA");	pri.add("25");
				pro.add("PEPSI");pri.add("30");
			}

		}//if of its closed

		if(e.getSource()==pro)
		{
			pri.select(  pro.getSelectedIndex() );
			qty.setEnabled(true);
		}

		if(e.getSource()==qty)
		{
			int x=Integer.parseInt(pri.getSelectedItem());
			int y=Integer.parseInt(qty.getSelectedItem());
			int z=x*y;

			t1.add(pro.getSelectedItem());
			t2.add(pri.getSelectedItem());
			t3.add(qty.getSelectedItem());
			t4.add(Integer.toString(z));

			int a=Integer.parseInt(t5.getText());
			int b=a+z;
			t5.setText(Integer.toString(b));
			qty.select(0);
		 	qty.setEnabled(false);
		}
	}
}

}
