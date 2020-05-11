import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hitungan extends JFrame implements ActionListener
{
    JLabel lbl1 = new JLabel("Masukkan var 1");
    JTextField txt1=new JTextField(10);
    JLabel lbl2 = new JLabel("Masukkan var 2");
    JTextField txt2=new JTextField(10);
    JLabel lbl3 = new JLabel("Operasi");
    JComboBox cb1=new JComboBox();
    JButton btn1=new JButton("Hitung");
    JButton btn2=new JButton("Keluar");
    JTextField txt3=new JTextField(10);
    Container c=new Container();

    Hitungan()
    {
        super("OPERASI HITUNG");
        cb1.addItem("+");
        cb1.addItem("-");
        cb1.addItem("/");
        cb1.addItem("*");
        c=getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT,50,10));
        c.add(lbl1);
        c.add(txt1);
        c.add(lbl2);
        c.add(txt2);
        c.add(lbl3);
        c.add(cb1);
        c.add(btn1);
        c.add(btn2);
        c.add(txt3);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn2)
            System.exit(0);

        if (e.getSource()==btn1)
        {
            float c=0; float a,b; String s;
            a=Float.parseFloat(txt1.getText());
            b=Float.parseFloat(txt2.getText());

            if (cb1.getSelectedItem()=="+")
            {

                c= a+b;

            }
            if (cb1.getSelectedItem()=="-")
            {
                c= a-b;

            }
            if (cb1.getSelectedItem()=="*")
            {
                c= a*b;
            }
            if (cb1.getSelectedItem()=="/")
            {

                c= a/b;

            }

            s=String.valueOf(c);
            txt3.setText(" " + s);

        }
    }
}