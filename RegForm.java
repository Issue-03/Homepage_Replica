//Registration Form

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener
{
	private Container c;
	private JLabel title;
	private JLabel name;
	private JTextField tname;
	private JLabel mno;
	private JTextField tmno;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private ButtonGroup gengp;
	private JLabel dob;
	private JComboBox date;
	private JComboBox month;
	private JComboBox year;
	private JLabel add;
	private JTextArea tadd;
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;
	private JLabel img;


    private String dates[] 
        = { "1", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", 
            "26", "27", "28", "29", "30", 
            "31" }; 
    private String months[] 
        = { "Jan", "feb", "Mar", "Apr", 
            "May", "Jun", "July", "Aug", 
            "Sup", "Oct", "Nov", "Dec" }; 
    private String years[] 
        = { "1995", "1996", "1997", "1998", 
            "1999", "2000", "2001", "2002", 
            "2003", "2004", "2005", "2006", 
            "2007", "2008", "2009", "2010", 
            "2011", "2012", "2013", "2014", 
            "2015", "2016", "2017", "2018", 
            "2019" }; 




	public MyFrame()
	{

		setTitle("www.facebook.com");
		setBounds(300,90,900,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);
	//	c.setBackground(Color.magenta);

		title = new JLabel("    facebook");
		title.setOpaque(true);
		title.setBackground(new Color(66,103,178));
		title.setFont(new Font("Arial",Font.BOLD,40));
		title.setForeground(Color.white);
		title.setSize(900,90);
		title.setLocation(0,0);
		c.add(title);

		name = new JLabel("Name"); 
        name.setFont(new Font("Arial", Font.PLAIN, 20)); 
        name.setSize(100, 20); 
        name.setLocation(500, 100); 
        c.add(name); 


        tname = new JTextField(); 
        tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tname.setBackground(new Color(255,240,245));
        tname.setSize(190, 20); 
        tname.setLocation(600, 100); 
        c.add(tname); 
  			

  		mno = new JLabel("Mobile"); 
        mno.setFont(new Font("Arial", Font.PLAIN, 20)); 
        mno.setSize(100, 20); 
        mno.setLocation(500, 150); 
        c.add(mno); 


        tmno = new JTextField(); 
        tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tmno.setBackground(new Color(255,240,245));
        tmno.setSize(150, 20); 
        tmno.setLocation(600, 150); 
        c.add(tmno);

        gender = new JLabel("Gender"); 
        gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
        gender.setSize(100, 20); 
        gender.setLocation(500, 200); 
        c.add(gender);

        male = new JRadioButton("Male"); 
        male.setFont(new Font("Arial", Font.PLAIN, 15)); 
        male.setSelected(true); 
        male.setSize(75, 20); 
        male.setLocation(600, 200); 
        c.add(male); 
  
        female = new JRadioButton("Female"); 
        female.setFont(new Font("Arial", Font.PLAIN, 15)); 
        female.setSelected(false); 
        female.setSize(80, 20); 
        female.setLocation(675, 200); 
        c.add(female); 
  
        gengp = new ButtonGroup(); 
        gengp.add(male); 
        gengp.add(female); 

        dob = new JLabel("DOB"); 
        dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
        dob.setSize(100, 20); 
        dob.setLocation(500, 250); 
        c.add(dob); 
  
        date = new JComboBox(dates); 
        date.setFont(new Font("Arial", Font.PLAIN, 15)); 
        date.setSize(50, 20); 
        date.setLocation(600, 250); 
        c.add(date); 
  
        month = new JComboBox(months); 
        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
        month.setSize(60, 20); 
        month.setLocation(650, 250); 
        c.add(month); 
  
        year = new JComboBox(years); 
        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
        year.setSize(60, 20); 
        year.setLocation(720, 250); 
        c.add(year); 

        add = new JLabel("Address"); 
        add.setFont(new Font("Arial", Font.PLAIN, 20)); 
        add.setSize(100, 20); 
        add.setLocation(500, 300); 
        c.add(add); 
  
        tadd = new JTextArea(); 
        tadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
    	tadd.setBackground(new Color(255,240,245));
    	tadd.setBorder(BorderFactory.createLineBorder(Color.GRAY,1));
        tadd.setSize(200, 75); 
        tadd.setLocation(600, 300); 
        tadd.setLineWrap(true); 
        c.add(tadd); 
  
        term = new JCheckBox("Accept Terms And Conditions."); 
        term.setFont(new Font("Arial", Font.PLAIN, 15)); 
        term.setSize(250, 20); 
        term.setLocation(550, 400); 
        c.add(term); 
  
        sub = new JButton("Submit"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
        sub.setSize(100, 20); 
        sub.setLocation(550, 450); 
        sub.addActionListener(this); 
        c.add(sub); 
  
        reset = new JButton("Reset"); 
        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(700, 450); 
        reset.addActionListener(this); 
        c.add(reset); 

        
        tout = new JTextArea(); 
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setBackground(new Color(230,230,250));
        tout.setSize(499,149); 
        tout.setLocation(0, 91); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        c.add(tout); 
  
        res = new JLabel(""); 
        res.setFont(new Font("Arial", Font.PLAIN, 20)); 
        res.setSize(500, 25); 
        res.setLocation(550, 500); 
        c.add(res); 
  
        resadd = new JTextArea(); 
        resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tname.setBackground(new Color(255,240,245));
        resadd.setSize(200, 75); 
        resadd.setLocation(180, 175); 
        resadd.setLineWrap(true); 
        c.add(resadd); 

        ImageIcon i = new ImageIcon("C:/Users/Home/Desktop/java/RegForm/xyz.png");

        img = new JLabel("",i,SwingConstants.HORIZONTAL);
        img.setFont(new Font("Arial", Font.PLAIN, 20)); 
        img.setSize(499,600);
        img.setLocation(0,150);
        c.add(img);
  
        setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == sub)
		{
			if(term.isSelected())
			{
				String data1;
				String data = "Name :"+ tname.getText() + "\n"+"Mobile :"+ tmno.getText() + "\n";
				
				if(male.isSelected())
					data1 = "Gender : Male" +"\n";
				else
					data1 = "Gender : Female" + "\n";

				String data2 = "DOB :"+(String)date.getSelectedItem()+"/"+(String)month.getSelectedItem()+"/"+(String)year.getSelectedItem()+"\n";
				String data3 = "Address :"+tadd.getText();
				tout.setText(data+data1+data2+data3);
				tout.setEditable(false);
				res.setText("Registration Successfull...");

			}
		}

		else if(e.getSource() == reset)
		{
			String def = "";
			tname.setText(def);
			tmno.setText(def);
			tadd.setText(def);
			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
			date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
			resadd.setText(def);
		}
	}
}


class RegForm
{
	public static void main(String args[]) throws Exception
	{
		MyFrame f = new MyFrame();

	}
}