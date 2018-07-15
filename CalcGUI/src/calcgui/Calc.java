
package calcgui;

import java.awt.Component;
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
        this.setLayout(new FlowLayout());
        this.setSize(400, 400);
        this.add(JLNum1);
        this.add(TFnum1);
        this.add(JLNum2);
        this.add(TFnum2);
        this.add(JBans);
        this.add(TFans);
        JBans.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                TFans.setText(String.valueOf(Integer.parseInt(TFnum1.getText())+
                        Integer.parseInt(TFnum2.getText())));        
            }
        });
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
