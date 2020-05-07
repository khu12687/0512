package chat;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
자바 GUI 컴포넌트의 유형은 포함할 수 있는 지 여부를 기준으로 크게 2가지로 분류된다.
1.비주일 컴포넌트(=일반 컴포넌트)
	다른 컴포넌트를 나에게 포함시킬 수 없는 주체들..
	JButton, Checkbox, TextField, TextArea...
2. 컨테이너(다른 컴포넌트를 포함할 수 있는 능력있는 객체들..)
	남을 포함해야 하기 때문에, 배치능력이 주어짐.
	따라서 아래의 클래스는 배치관리자를 이용하여 원하는 배치를 수행 할 수있다.
	만일 개발자가 아무것도 배치를 명시하지 않으면, 디폴트배치가 적용된다.
	- Frame : BorderLayout이 기본적용
	- Panel : FlowLayout이 기본적용
*/

//인터페이스는 클래스가 아니므로, 다중상속이 가능하기 때문에, 현실에 존재하는 다중적 사물을 
//표현하기에 너무 적절하다!! 
//ex) class SmartPhone extends Phone implements WebBrowser, TV, MP3, VideoPlayer,Card...
public class ChatA extends JFrame implements ActionListener, KeyListener{
	//has a 관계에 있는 객체 선언!!
	//int x=5; //has a 관계는 객체만을 대상으로 의미가 있으므로 int x=5 는 그냥 변수임
	JPanel p_north; //북쪽 영역에 붙여질 컨테이너!! has a 관계 5개임
	JButton bt_open; //채팅 친구원도우를 호출하는 버튼
	JTextArea area;
	JScrollPane scroll;
	JTextField t_input;
	ChatB chatB; //필요하면 has a로 보유하자!!! 전역변수아니고 인스턴스변수임

	public ChatA(){
		super("난 ChatA"); //부모 생성자는 상속되지 않는다 why? 상속하면 그건 자식이아니라 복제이기때문에
									//또한 부모생성자 호출시, 그 어떠한 자식의 코드보다 우선하여 작성해야한다.
									//why? 부모의 생성이 나보다 빨라야 하므로...
		p_north = new JPanel();
		bt_open = new JButton("친구생성");  
		area = new JTextArea(); //메게변수로 10,20 이런거 안줘도 됨 why? 넣어버리면 확버러져서
		scroll = new JScrollPane(area);
		t_input = new JTextField();

		//스타일 및 조립!!
		//북쪽의 패널에 버튼 부착!!
		p_north.add(bt_open); //북쪽의 패널에 버튼 부착!!
		add(p_north, BorderLayout.NORTH);//윈도우의 북쪽에 패널부착!!

		//윈도우의 샌터 스크롤 부착!!
		add(scroll); 

		//남쪽에 텍스트필드 부착!!
		add(t_input, BorderLayout.SOUTH);

		//윈도우 크기 및 보이게 설정(setSize기능에 위치기능까지 추가된 메서드)
		setBounds(100,100,300,400); //x,y,width,heigh순으로 위치를 지정 할 수있다
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//버튼과 리스너 연결!!
		bt_open.addActionListener(this);

		//텍스트필드와 리스너 연결
		t_input.addKeyListener(this);
	}

	//리스너가 보유한 추상메서드 재정의!!
	public void actionPerformed(ActionEvent e){
		//System.out.println("친구 보고싶어?");

		//ChatB 띄우기
		chatB = new ChatB();
	}

	//KeyListener 가 보유한 추상메서드 재정의! 오버라이딩
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		if(key == 10){ //코드값이 앤터라면..
			//System.out.println(key+"눌렀네여?");
			//친구의 area에 메세지 입력!!
			//나의 텍스트필드값을 먼저 얻어와서 대입!!
			String msg = this.t_input.getText();
			chatB.area.append(msg+"\n");

			//입력값 다시 초기화
			t_input.setText("");
		}
	}
	public void keyPressed(KeyEvent e){
		
	}
	public void keyTyped(KeyEvent e){
		
	}
	public static void main(String[] args){
		//this.x=10; //x 못씀
		new ChatA();
	}
}
