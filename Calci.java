package Codekamp;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calci {
    private JTextField UserInput;
    public JPanel panel1;
        private JButton a1Button;
        private JButton a2Button;
        private JButton a3Button;
        private JButton a4Button;
        private JButton a5Button;
        private JButton a6Button;
        private JButton a7Button;
        private JButton a8Button;
        private JButton a9Button;
        private JButton a0Button;
        private JButton Add;
        private JButton Sub;
        private JButton Div;
        private JButton Mul;
        private JButton Result;
        private JButton Del;
        public static String output1;
        public static String output2;
        public static String  operator;

   public static String response="";


    public Calci() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    response=response+"1";
                    UserInput.setText(response);

            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                response=response+"2";
                UserInput.setText(response);
            }
        });
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output1=response;
                response="";
                operator="+";
            }
        });
        Result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output2=response;
                int result=0;
                if(operator=="+") {
                    result = Integer.parseInt(output1) + Integer.parseInt(output2);
                }
               else if(operator=="-") {
                    result = Integer.parseInt(output1) - Integer.parseInt(output2);
                }
                else if(operator=="*") {
                    result = Integer.parseInt(output1) *Integer.parseInt(output2);
                }
                else if(operator=="/") {
                    result = Integer.parseInt(output1) / Integer.parseInt(output2);
                }
                String ans=String.valueOf(result);
                UserInput.setText(ans);
                response=String.valueOf(result);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                response=response+"3";
                UserInput.setText(response);

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                response=response+"4";
                UserInput.setText(response);

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                response=response+"5";
                UserInput.setText(response);

            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                response=response+"6";
                UserInput.setText(response);

            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                response=response+"7";
                UserInput.setText(response);

            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                response=response+"8";
                UserInput.setText(response);

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                response=response+"9";
                UserInput.setText(response);

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                response=response+"0";
                UserInput.setText(response);

            }
        });
        Sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output1=response;
                response="0";
                operator="-";
            }
        });
        Div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output1=response;
                response="0";
                operator="/";
            }
        });
        Mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output1=response;
                response="0";
                operator="*";
            }
        });
        Del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(response.length()>0){
                    response=response.substring(0,response.length()-1);
                }
UserInput.setText(response);
            }
        });
    }
}
