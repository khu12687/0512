package event;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import java.awt.Color;

public class MultiButton extends JFrame{
	JButton bt_red;
	JButton bt_yellow;
	JButton bt_blue;
	JTextArea area;
	JScrollPane scroll;

	public MultiButton(){
		//레이아웃은 플로우
		setLayout(new FlowLayout()); //1회성일떄
		
		bt_red = new JButton("red");
		bt_yellow = new JButton("yellow");
		bt_blue = new JButton("blue");

		area = new JTextArea(10,20); //행,렬 매게변수로 넣어!!
		scroll = new JScrollPane(area);
		
		//스타일부여
		bt_red.setBackground(Color.RED); //상수는 직관성에 좋다
		bt_yellow.setBackground(Color.YELLOW);
		bt_blue.setBackground(Color.BLUE);

		//버튼과 리스너와의 연결
		MultiButtonListener mbt = new MultiButtonListener(this);

		bt_red.addActionListener(mbt);
		bt_yellow.addActionListener(mbt);
		bt_blue.addActionListener(mbt);

		//버튼,텍스트area, 스크롤 윈도우에 부착!!
		add(bt_red);
		add(bt_yellow);
		add(bt_blue);
		add(scroll);

		setSize(400,300);
		setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public static void main (String[] args){
		new MultiButton();
	}
}
