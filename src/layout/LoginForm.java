package layout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
public class LoginForm{
	Frame frame;
	Label la_id, la_pw; //제목용 컴포넌트, 단순한 텍스트 표현시 사용
	TextField t_id, t_pw; //HTML에서의 input 컴포넌트와 동일
	Button bt; //로그인 버튼
	Panel panel; //부분적으로 다른 레이아웃을 적용하기 위하여, 프레임안에 컨테이너를 하나 마련한다!!
					   //참고) 다른 컴포넌트를 포함할 수 있는 컴포넌트를 특히 컨테이너라 한다..(Container)
					   //ex) 컨테이너의 대표적 컴포넌트 : Frame, Panel
					   //그러다 보니 , 켄테이너에는 배치가 적용된다

	public LoginForm(){
		frame = new Frame();
		frame.setSize(200,135);
		frame.setVisible(true);

		//라벨처리
		la_id = new Label("ID");
		la_pw = new Label("PW");
		
		// 텍스트필드
		t_id = new TextField(10); //10자 크기 주의) 10자 제한은 아니다
		t_pw = new TextField(10);

		bt = new Button("Login");

		//개발자가 Frame에 아무런 레이아웃도 적용하지 않았을떄
		//Frame의 Default 배치관리자는 BorderLayout 
		
		//버튼을 남쪽에 부착!!
		frame.add(bt,BorderLayout.SOUTH);

		panel = new Panel() ; 
		panel.setLayout(new GridLayout(2,2)); //2행 2열짜리 그그디

		//프레임의 중의 패널 부착!!
		frame.add(panel,BorderLayout.CENTER);

		//난생 녹물 처믕 보는 클래스를 만났을떄, 대처법
		//사용해야 하므로, 

		//상수 사용이유? 직관성
		panel.setBackground(Color.YELLOW);

		panel.add(la_id);
		panel.add(t_id);
		panel.add(la_pw);
		panel.add(t_pw);

	}

	public static void main(String[] args){
		new LoginForm(); //변수로 안 받은이유?why?생성 후 별로 작업할 사항이 없다. 즉 참조할 일이 없기때문에

	}
}
