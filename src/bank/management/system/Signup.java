package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

    public class Signup extends JFrame implements ActionListener {
        JRadioButton r1,r2,r3,m1,m2;
        JButton next;

        JTextField textname , textFname, textEmail ,textAdd, textC,textP , textS;
        JDateChooser dateChooser;
        Random ran = new Random();
        long first4 = (ran.nextLong() %9000L) + 1000L;
        String first = " " + Math.abs(first4);
        Signup(){
            super("APPLICATION FORM");

            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
            Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(25,10,100,100);
            add(image);

            JLabel label1 = new JLabel("APPLICATION FORM NO."+first);
            label1.setBounds(160,20,600,40);
            label1.setFont(new Font("Raleway",Font.BOLD,38));
            add(label1);

            JLabel label2 = new JLabel("Page 1");
            label2.setFont(new Font("Raleway",Font.BOLD,22));
            label2.setBounds(330,70,600,30);
            add(label2);

            JLabel label3= new JLabel("Personal Details");
            label3.setFont(new Font("Raleway",Font.BOLD,22));
            label3.setBounds(290,90,600,30);
            add(label3);

            JLabel labelname =new JLabel("Name :");
            labelname.setFont(new Font("Raleway",Font.BOLD,20));
            labelname.setBounds(100,160,100,30);
            add(labelname);

            textname = new JTextField();
            textname.setFont(new Font("Raleway",Font.BOLD,14));
            textname.setBounds(300,160,400,30);
            add(textname);

            JLabel labelfname =new JLabel("Father's Name : ");
            labelfname.setFont(new Font("Raleway",Font.BOLD,20));
            labelfname.setBounds(100,210,200,30);
            add(labelfname);

            textFname = new JTextField();
            textFname.setFont(new Font("Raleway",Font.BOLD,14));
            textFname.setBounds(300,210,400,30);
            add(textFname);

            JLabel DOB =new JLabel("Date Of Birth : ");
            DOB.setFont(new Font("Raleway",Font.BOLD,20));
            DOB.setBounds(100,310,200,30);
            add(DOB);

            dateChooser = new JDateChooser();
            dateChooser.setForeground(new Color(105,105,105));
            dateChooser.setBounds(300,310,400,30);
            add(dateChooser);

            JLabel labelG =new JLabel("Gender : ");
            labelG.setFont(new Font("Raleway",Font.BOLD,20));
            labelG.setBounds(100,260,200,30);
            add(labelG);

            r1 = new JRadioButton("Male");
            r1.setFont(new Font("Raleway",Font.BOLD,14));
            r1.setBackground(new Color(222,255,228));
            r1.setBounds(300,260,60,30);
            add(r1);

            r2 = new JRadioButton("Female");
            r2.setFont(new Font("Raleway",Font.BOLD,14));
            r2.setBackground(new Color(222,255,228));
            r2.setBounds(450,260,90,30);
            add(r2);

            r3 = new JRadioButton("other");
            r3.setFont(new Font("Raleway",Font.BOLD,14));
            r3.setBackground(new Color(222,255,228));
            r3.setBounds(600,260,90,30);
            add(r3);

            ButtonGroup buttonGroup = new ButtonGroup();
            buttonGroup.add(r1);
            buttonGroup.add(r2);
            buttonGroup.add(r3);

            JLabel labelEmail =new JLabel("Email Address : ");
            labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
            labelEmail.setBounds(100,360,200,30);
            add(labelEmail);

            textEmail = new JTextField();
            textEmail.setFont(new Font("Raleway",Font.BOLD,14));
            textEmail.setBounds(300,360,400,30);
            add(textEmail);

            JLabel labelMs =new JLabel("Marital Satus : ");
            labelMs.setFont(new Font("Raleway",Font.BOLD,20));
            labelMs.setBounds(100,410,200,30);
            add(labelMs);

            m1 = new JRadioButton("Married");
            m1.setFont(new Font("Raleway",Font.BOLD,14));
            m1.setBackground(new Color(222,255,228));
            m1.setBounds(300,410,100,30);
            add(m1);

            m2 = new JRadioButton("Unmarried");
            m2.setFont(new Font("Raleway",Font.BOLD,14));
            m2.setBackground(new Color(222,255,228));
            m2.setBounds(450,410,100,30);
            add(m2);

            ButtonGroup buttongroup1 =new ButtonGroup();
            buttongroup1.add(m1);
            buttongroup1.add(m2);


            JLabel labelAdd =new JLabel("Address : ");
            labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
            labelAdd.setBounds(100,460,200,30);
            add(labelAdd);

            textAdd = new JTextField();
            textAdd.setFont(new Font("Raleway",Font.BOLD,14));
            textAdd.setBounds(300,460,400,30);
            add(textAdd);

            JLabel labelC =new JLabel("City : ");
            labelC.setFont(new Font("Raleway",Font.BOLD,20));
            labelC.setBounds(100,510,200,30);
            add(labelC);

            textC = new JTextField();
            textC.setFont(new Font("Raleway",Font.BOLD,14));
            textC.setBounds(300,510,400,30);
            add(textC);

            JLabel labelP =new JLabel("Pin Code : ");
            labelP.setFont(new Font("Raleway",Font.BOLD,20));
            labelP.setBounds(100,560,200,30);
            add(labelP);

            textP = new JTextField();
            textP.setFont(new Font("Raleway",Font.BOLD,14));
            textP.setBounds(300,560,400,30);
            add(textP);

            JLabel labelS =new JLabel("State : ");
            labelS.setFont(new Font("Raleway",Font.BOLD,20));
            labelS.setBounds(100,610,200,30);
            add(labelS);

            textS = new JTextField();
            textS.setFont(new Font("Raleway",Font.BOLD,14));
            textS.setBounds(300,610,400,30);
            add(textS);

            next = new JButton("Next");
            next.setFont(new Font("Raleway",Font.BOLD,14));
            next.setBackground(Color.BLACK);
            next.setForeground(Color.WHITE);
            next.setBounds(620,660,80,30);
            next.addActionListener(this);
            add(next);

            getContentPane().setBackground(new Color(222,255,228));
            setLayout(null);
            setSize(850,800);
            setLocation(250,35);
            setVisible(true);

        }


        @Override
        public void actionPerformed(ActionEvent e) {
            String formno  = first;
            String name = textname.getText();
            String fname= textFname.getText();
            String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
            String gender = null;
            if(r1.isSelected()){
                gender = "Male";
            }else if (r2.isSelected())
            {
                gender = "Female";
            }
            else if(r3.isSelected()){
                gender = "other";
            }
            String email = textEmail.getText();
            String  marital = null;
            if(m1.isSelected()){

                marital = "Married";

            }else if (m2.isSelected())
            {
                marital = "UnMarried";
            }
            String address  = textAdd.getText();
            String city = textC.getText();
            String pincode = textP.getText();
            String state = textS.getText();

            try{
                if(textname.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }
                else{
                    Conc con1 = new Conc();
                    String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                    con1.statement.executeUpdate(q);
                    new Signup2(formno);
                    setVisible(false);
                }

            }catch(Exception E){
                E.printStackTrace();
            }

        }

        public static void main(String[] args){
            new Signup();

        }
    }


