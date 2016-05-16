package Sample_0516;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.FlowLayout;


public class Myframe extends JFrame {
	public Myframe(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(300,200);
		setLocation(screenSize.width/2,screenSize.height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout());
		setVisible(true);
	}

}
