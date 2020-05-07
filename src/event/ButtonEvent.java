/*
자바로 이벤트 구현하기
모든~~객체는 is a, has a 관계를 벗어날 수 없다!!
*/
package event;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class ButtonEvent extends JFrame{
	/*클래스가 클래스를 맴버로 보유한다면, has a*/
	JButton bt;
	/*has a 는 부품관계기 때문에 부품은 객체가 태어날때 동시에 생성되어야 하므로,
		초기화 작업은 생성자에서 처리하면 좋을 것이다*/
	JTextField t_input;

	public ButtonEvent(){
		setLayout(new FlowLayout());
		bt = new JButton("나 눌러봐");
		t_input = new JTextField(20);

		//js와 상당히 흡사한 코드방식
		//bt.addEventLisener(function(){
			
		//});
		/*
		아래의 코드에서 리스너객체는 불완전한 형태의 인터페이스라서 
		개발자가 직접 new할 수 없기 때문에 자식클래스를 이용하여 메서드를 재정의 한후
		메모리에 올려야한다..
		*/

		//버튼과 리스너와의 연결!!
		bt.addActionListener(new ButtonListener()); //매게변수로 인터페이스 객체가와야함
		
		//텍스트필드와 리스너와의 연결!!
		t_input.addKeyListener(new MyKeyListener());

		//윈도우인 프레임과 리스너와의 연결!!
		this.addWindowListener(new MyWindowListener());

		//윈도우에 버튼부착!!
		add(bt); //frame.add(bt) frame 생략한이유는 JFrame을 상속받았기때문에
		add(t_input);
		setVisible(true);
		setSize(300,400);
	}
	
	public static void main(String[] args){
		new ButtonEvent();
	}
}
