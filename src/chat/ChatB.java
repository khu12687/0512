package chat;
import javax.swing.*;
import java.awt.BorderLayout;
public class ChatB extends JFrame{
	JTextArea area;
	JScrollPane scroll;
	JTextField t_input;

	public ChatB(){
		super("³­ ChatB");
		area = new JTextArea(); 
		scroll = new JScrollPane(area);
		t_input = new JTextField();

		add(scroll); 

		add(t_input, BorderLayout.SOUTH);

		setBounds(450,100,300,400); 
		setVisible(true);
	}

}
