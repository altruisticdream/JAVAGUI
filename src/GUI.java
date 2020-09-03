import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI implements ActionListener{
    private static JLabel userlabel;
    private static JTextField userText;
    private static JPasswordField passwordtext;
    private static JLabel passwordlabel;
    private static JButton button;
    private static JLabel success;
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);

        userlabel=new JLabel("User");
        userlabel.setBounds(10,20,80,25);
        panel.add(userlabel);

        userText=new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passwordlabel=new JLabel("Password");
        passwordlabel.setBounds(10,50,80,25);
        panel.add(passwordlabel);

        passwordtext=new JPasswordField();
        passwordtext.setBounds(100,50,165,25);
        panel.add(passwordtext);

         button=new JButton("Login");
        button.setBounds(10,80,80,25);
        panel.add(button);

         success=new JLabel("");
        success.setBounds(10,110,300,25);
        button.addActionListener(new GUI());
        panel.add(success);

        frame.setVisible(true);



    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
     String user=userText.getText();
     String password=passwordtext.getText();
     System.out.println(user+", "+password);

     if(user.equals("ASHUTOSH")&& password.equals("mybook054"))
     {
         success.setText("Login Successful!");
     }
    }
}
