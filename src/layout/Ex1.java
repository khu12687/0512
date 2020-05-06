package layout;
import java.awt.*; //awt 하위에 있는 모든 클래스를 의미!!
								 //*는 클래스에만 적용할수있고, 모든 패키지를 의미하는 코드는 없다!!
								 //따라서 패키지명은 반드시 기재행
public class Ex1{
	//int x=5; //기본자료형에 개발자가 값을 초기화 하지 않으면??
					//원칙 : 변수는 초기화 하지않으면 에러사항임
					//예외 : 맴버변수의 경우엔 개발자가 않하면 에러가 나기때문에
					//			컴파일러가 나선다 (생성자의 경우와 비슷)
					//결론 : 숫자형은 0, 논리값은 false, 객체형은 null로 초기화
	//int[] arr = new[5]; 
	Frame frame; //객체자료형은 null로 초기화 되어 있다!
	//객체자료형도 자료형이다!!
	Panel[] panel = new Panel[5]; //공간만 5개 만들되, 이공간에 들어 갈 수있는 자료형 Panel인것임
	Button[] bt = new Button[5];
	String[] title = {"동","서","남","북","중"}; //js는 대괄호지만 java는 중괄호

	//동,서,남,북,중 상수를 담을 배열 선언
	String[] direction={
		BorderLayout.EAST,
		BorderLayout.WEST,
		BorderLayout.SOUTH,
		BorderLayout.NORTH,
		BorderLayout.CENTER
	};

	public static void main(String[] args){
		Ex1 ex1 = new Ex1(); //먼저 인스턴스를 생성해야 한다!!
		//이 인스턴스 생성시, 클래스에 선언된 맴버변수 중 static으로 선언되지 않은 것들은
		//해당 인스턴스에 딸려 올라옴!!
		ex1.frame = new Frame("동서남북 윈도우");
		//개발자가 배치를 명시하지 않으면 디폴트가 적용되는데 
		//Frame의 경우 : BorderLayout이 적용됨
		//Panel의 경우 : FlowLayout이 적용됨
		for(int i=0; i<ex1.panel.length; i++){
			ex1.panel[i] = new Panel(); //패널 1개 생성 후 배열대입
			ex1.bt[i] = new Button(ex1.title[i]);
			ex1.panel[i].add(ex1.bt[i]); //각 패널에 버튼부착!!
			ex1.frame.add(ex1.panel[i],ex1.direction[i]); //프레임에 패널부착!!
		}
		ex1.frame.setVisible(true);
		ex1.frame.setSize(200,200);
		
	}
}
