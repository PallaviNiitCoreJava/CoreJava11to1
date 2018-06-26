
package calcgui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Calc extends JFrame{

    JTextField TFnum1;
    JTextField TFnum2;
    JTextField TFans;
    JLabel JLNum1;
    JLabel JLNum2;
    JButton JBans;
    
    public Calc()
    {
        TFnum1=new JTextField(20);
        TFnum2=new JTextField(20);
        TFans=new JTextField(20);
        JLNum1=new JLabel();
        JLNum2=new JLabel();
        JBans=new JButton();
        JLNum1.setText("Enter a Number : ");
        JLNum2.setText("Enter a Number : ");
        JBans.setText("Addition");
        setLayout(new FlowLayout());
        setSize(400, 400);
        this.add(JLNum1);
        super.add(TFnum1);
        add(JLNum2);
        add(TFnum2);
        add(JBans);
        add(TFans);
        JBans.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                TFans.setText(String.valueOf(Integer.parseInt(TFnum1.getText())+
                        Integer.parseInt(TFnum2.getText())));        
            }
        });
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void add()
    {
        
    }
}
