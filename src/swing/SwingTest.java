/*
AWT는 자바의 GUI를 지원하는 패키지이지만, OS플랫폼마다 디자인이 다르게 표현되는 문제점이 있다..
이를 개선한 기술이 바로 SWING이며, javax.swing에서 지원한다!! 오늘부터는 무조건 스윙만쓰겠따!
스윙은 기존의 awt컴포넌트 명칭에 J접두어만 붙이면된다. ex)JButton,JTextField
*/

package swing;
import javax.swing.JFrame;
import javax.swing.JButton;
public class SwingTest{
	public SwingTest(){
		JFrame frame = new JFrame("난 스윙프레임");
		frame.setVisible(true);
		frame.setSize(300,400);
		frame.setLayout(new java.awt.FlowLayout());

		//스윙도 배치관리자는 여전히 awt 것을 사용한다!!

		//swung도 윈도우닫기창을 눌렀을떄, setVisible(false)로 되는 것 뿐이지, 프로세스가 죽지는 않는다
		//윈도우 창 닫을때 프로그램을 종료하고 싶다면, 더 배워야한다..
		JButton bt = new JButton("난 스윙버튼");
		frame.add(bt); //윈도우에 버튼 부착!!
	}
	public static void main(String[] args){
		new SwingTest();
	}
}
