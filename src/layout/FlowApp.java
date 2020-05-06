package layout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Frame;
import java.awt.Button;

/*
자바 AWT의 배치관리자 중 FlowLayout을 학습한다
FlowLayout : 흘러가는 배치방법을 지원하며, 소속되는 컴포넌트는 자신본연의크기를 유지 할 수있다
					android에서의 LinearLayout(가로,세로의 방향을 갖는 선형 레이아웃을 의미)과 흡사함
*/
public class FlowApp{
	public static void main(String[] args){
		//FlowLayout으로 배치방법을 지정
		//FlowLayout layout = new FlowLayout();

		//격자형태의 레이아웃!!(셀로구성됨)
		//2층에 5호수 짜리 아파트 구조!!
		GridLayout layout = new GridLayout(2,5);

		Frame frame = new Frame("플로우 레이아웃");
		//frame 윈도우에 플로우 적용!!
		frame.setLayout(layout);

		//버튼 10개를 윈도우에 부착!!
		for(int i=0; i<=10; i++){
			Button bt = new Button("버튼"+i);
			frame.add(bt);
		}

		//윈도우 보이게, 가로세로 크기 지정
		frame.setVisible(true);
		frame.setSize(400,300);
		
	}
}
