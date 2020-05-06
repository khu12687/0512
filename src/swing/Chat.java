/*
자바언어에서는 객체들을 여러개로 조합하여 개발을 하는데,
이때 객체들간에는 피해 갈 수 없는 관계가 있게 마련이다.
sun에서는 객체간 모든 관계를 단 두가지로 보았다.
1) is a 관계 : 상속관계
2) has a 관계 : 맴버로 다른 객체를 보유한 관꼐
*/
package swing;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.*; //로딩이 아니다!! 현재클래스에서 사용할 외부 클래스들의 위치를 알려주는거다!!
public class Chat extends JFrame{ //extends is a 관계
	int x =5; //관계는 객체들간을 대상으로 하므로, 일반 데이터는 has a 관계가 아니다
	
	JLabel la_title;
	JTextArea area; //프레임 area를 가지고 있다 has a 관계
	JScrollPane scroll;
	JPanel p_south; // 남쪽에 버튼과 텍스트필드를 안고 있을 패널
	JTextField t_input;
	JButton bt;

	//위의 부품들은 객체를 이루는 요소이므로, 생성시점에 같이 생성되어야 정상일 것이다..
	//저극 생성자를 이용해보자!

	public Chat(){
		la_title= new JLabel("카카오톡");
		area = new JTextArea();
		scroll = new JScrollPane(area);
		p_south = new JPanel();
		t_input = new JTextField(10);
		bt = new JButton("전송");

		//스타일 부여하자!!
		la_title.setFont(new Font("돋움",Font.BOLD,30));
		la_title.setHorizontalAlignment(SwingConstants.CENTER);

		//생성된 인스턴스들을 조립하자!!	
		add(la_title,BorderLayout.NORTH);
		
		//센터영역에 스크롤 부착!
		add(scroll);

		//남쪽에 위치할 텍스트필드와 버튼 조립
		p_south.add(t_input); //패널에 텍스트필드 부착
		p_south.add(bt); //패널에 버튼 부착!!

		//최종적으로 패널을 원도우의 남쪽 영역에 부착!!
		add(p_south, BorderLayout.SOUTH);

		setSize(300,400);
		setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args){
		new Chat();
	}
}
