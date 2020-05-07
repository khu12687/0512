package event;
/*2개이상의 컴포넌트에 대해, 액션이벤트를 구현하는 법*/
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
public class MultiButtonListener implements ActionListener{
	MultiButton mb; //필요한 객체가 있다면 보유한다!! has a

	//리스너 클래스에 인수 있는 생성자 정의!!
	public MultiButtonListener(MultiButton mb){
		//넘겨받은 주소값 +mb
		this.mb=mb; //지역변수이므로, 사라지기 전에 맴버변수에 대입시켜놓자!! 즉 윈도우를 받아온 것임!!
	}

	//재정의할 메서드!!
	//아래의 메서드의 인수인 e를 통해, JVM이 메모리에 올린 ActionEvent객체의 인스턴스가 전달된다
	public void actionPerformed(ActionEvent e){
		//e는 이벤트와 관련된 모든~~정보가 다 들어있으므로,
		//유저가 어떤 버튼을 눌렀는지 정보도 들어있다!!
		// 이 정보를 이용하여, 버튼들을 구분하면 된다!
		//이벤트를 일으킨 컴포넌트를 가리켜 이벤트Source라 하며, 이벤트 객체에는
		// 이 이벤트소스를 추출할 수 있는 메서드가 있다!!
		//왜 봔환형이 Button이 아니라 Object일까?
		//Action 이벤트는 버튼에만 적용시킬 수 있는게 아니다
		//버튼 이외에도 여러 컴포넌트에도 ActionEvent를 구현한다
		//개발자가 연결한 이벤트 소스가 무엇이 될지 예측할 수 없으므로, 그냥 최상위 객체로 받아버렸기때문에..
		Object obj = e.getSource();

		//우리가 개발자 이므로, 버튼에 의해서 발생했다는것을 알기 때문에 형변환하여 사용해보자!!
		JButton bt = (JButton)obj; //down casting

		
		if(bt==mb.bt_red){
			System.out.println("빨간색");
			mb.area.append("빨간색\n");
		}
		if(bt==mb.bt_yellow){
			System.out.println("노랑색");
			mb.area.append("노랑색\n");
		}
		if(bt==mb.bt_blue){
			System.out.println("파란색");
			mb.area.append("파란색\n");
		}
	}
}
