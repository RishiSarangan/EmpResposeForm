import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class EmpForm 
{
    EmpForm()
    {
        JFrame f=new JFrame("Employee Response Form");
        JLabel no,name,Gender,qual,dept,dob,address,email,Hobby,Extra,you_enter;
        JRadioButton male,female;
        JComboBox<String> cd,cd1,cd3,cd4,cd5,cd6;
        JCheckBox cb1,cb2,cb3;
        JTextField tf,tf1,tf2;
        JTextArea ta=new JTextArea(); 
        JTextArea ta1=new JTextArea();
        JButton b=new JButton("Submit");
        ButtonGroup bg=new ButtonGroup();

        //Title
        JLabel title=new JLabel("Employee Response Form");
        title.setFont(new Font("Calibri", Font.BOLD, 20));
        title.setBounds(250,5,350,30);
        f.add(title);

        //Number
        no=new JLabel("Emp Number");
        no.setBounds(10,40, 100,40);
        f.add(no);

        //Name
        name=new JLabel("Name ");
        name.setBounds(10,70, 100,40);
        f.add(name);

        //Gender
        Gender=new JLabel("Sex ");
        Gender.setBounds(10,100, 100,40);
        f.add(Gender);
        male=new JRadioButton("Male");
        male.setBounds(80,95,60,50);
        female=new JRadioButton("Female");
        female.setBounds(140,95,80,50);
        bg.add(male);
        bg.add(female); 

        //qualification
        qual=new JLabel("Qualification");
        qual.setBounds(10,140, 100,40);
        f.add(qual);

        //department
        dept=new JLabel("Department ");
        dept.setBounds(10,180, 100,40);
        f.add(dept);

        //dob
        dob=new JLabel("Date of Birth ");
        dob.setBounds(10,260, 100,40);
        f.add(dob);

        //address
        address=new JLabel("Address ");
        address.setBounds(10,320,100,40);
        f.add(address);

        //email
        email=new JLabel("E-mail ID");
        email.setBounds(10,420,100,40);
        f.add(email);

        //Hobby
        Hobby=new JLabel("Hobby ");
        Hobby.setBounds(310,60, 100,40);
        f.add(Hobby);

        //extra curricular activities
        Extra=new JLabel("Extra Curricular Activies");
        Extra.setBounds(310,110,180,40);
        f.add(Extra);

        //you entered
        you_enter=new JLabel("You Entered");
        you_enter.setBounds(310,160,100,40);
        f.add(you_enter);

        //All the lists
        String Courses[]={"M-Tech.","B-tech.","Bse.","Arts","Law"};   
        String Branch[]={"Finance","Sales & Marketing","R & D","Test Team","Customer Support","HR"};
        String date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String month[]={"1","2","3","4","5","6","7","8","9","10","11","12"};
        String YR[]={"1998","1999","2000","2001","2002","2003","2004"};
        String  Ext[]={"Football","Cricket","Basketball"}; 

        cb1=new JCheckBox("Meme Creation");
        cb2=new JCheckBox("Playing Guitar");
        cb3=new JCheckBox("Photoshop");

        tf=new JTextField();
        tf1=new JTextField();
        tf2= new JTextField();

        cd=new JComboBox<>(Courses);
        cd1=new JComboBox<>(Branch);
        cd3=new JComboBox<>(date);
        cd4=new JComboBox<>(month);
        cd5=new JComboBox<>(YR);
        cd6=new JComboBox<>(Ext); 
        
        tf.setBounds(90,50,120,20); tf1.setBounds(90,80,120,20);tf2.setBounds(100,430,120,20);
        cd.setBounds(90,150,100,20);cd1.setBounds(90,190,100,20);
        cd3.setBounds(100,273,40,20);cd4.setBounds(150,273,40,20);cd5.setBounds(210,273,60,20);
        cd6.setBounds(460,120,80,20);ta.setBounds(100,320,160,80);b.setBounds(500,420,120,20);
        cb1.setBounds(360,40,140,80);cb2.setBounds(500,40,140,80);cb3.setBounds(640,40,140,80);
        ta1.setBounds(330,200,300,200);

        f.add(tf);f.add(tf1);f.add(male);f.add(female);f.add(cd);
        f.add(cd1);f.add(cd3);f.add(cd4);f.add(cd5);
        f.add(ta);f.add(tf2);f.add(cb1);f.add(cb2);f.add(cb3);f.add(cd6);
        f.add(cd6);f.add(b);f.add(ta1);

        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String s=tf.getText();
                String s2=tf1.getText();
                ta1.append(s2+"'s Register number is: "+s+"\n");
                String g="",g1="";
                String em=tf2.getText();
                String ad=ta.getText();
                if(male.isSelected())
                {
                    g="He ";
                    g1="His ";
                }
                if(female.isSelected())
                {
                    g="She ";
                    g1="Her ";
                }
                ta1.append(g+"is a "+cd.getItemAt(cd.getSelectedIndex())+"Graduate"+"\n"+g1+"department is "+cd1.getItemAt(cd1.getSelectedIndex())+"\n");
                ta1.append(g+"was Born on "+cd3.getItemAt(cd3.getSelectedIndex())+"-"+cd4.getItemAt(cd4.getSelectedIndex())+"-"+cd5.getItemAt(cd5.getSelectedIndex())+"\n");
                ta1.append(g+" is residing at: "+"\n"+ad+"\n");
                ta1.append(g1+"E-mail address is: "+em+"\n");
                String hb="";
                if(cb1.isSelected())
                {
                    hb+=cb1.getText();
                }
                if(cb2.isSelected())
                {
                    hb+=cb2.getText();
                }
                if(cb3.isSelected())
                {
                    hb+=cb3.getText();
                }
                ta1.append(g+"is interested in "+hb+"\n");
                ta1.append(g+"plays "+cd6.getItemAt(cd6.getSelectedIndex())+" well");
            }
        });
  
        //Overall Swing Window Values
        f.setSize(800,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Main Function
    public static void main(String args[])
    {
        new EmpForm
	();
    }
}