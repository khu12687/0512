package event;
/*이 클래스는 현실의 사물을 표현하기 보다는, 버튼을 눌렀을때 이벤트를 감지하는
감지자인 ActionListenr 인터페이스를 완성짓기 위한 클래스이다!!*/
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//인터페이스는 불완전한 객체이고, 불완전하다는것은 추상 메서드를 보유하고 있다는것이다
//따라서 인터페이스를 구현한다고 약속한 개발자는 반드시 부모인 인터페이스가 보유한 메서드를
//재정의할 의무를 가진다 = 구현강제!!
public class ButtonListener implements ActionListener{
	/*
	is a 관계의 객체들간에는 같은 자료형으로 본다!! 따라서 기본자료형간의
	형변환이 원칙이, 객체자료형간에도 적용된다!!
	is a 관계를 표현한 키워드 :
	extends : 부모가 클래스일때
	implements : 부모가 인터페이스일때(다중 상속도 가능)
	*/
	
	//재정의시 몸체를 부여하면, 구현강제 의무를 다하는 것인데..
	//로직은 개발자가 알아서 채워넣자!!
	public void actionPerformed(ActionEvent e){
		System.out.println("버튼 눌렀어?");
	}
}
