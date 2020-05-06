package layout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
/*
자바 AWT에서 지원하는 레이아웃마다 특징이 있다..
하지만, FlowLayout를 제외하고서는 모두 컴포넌트 본연의 크기를 유지할 수없다!!
BorderLayout, GridLayout등을 이용하면서 컴포넌트의 크기를 유지하려면?
*/
public class LayoutComb{
	public static void main(String[] args){
		BorderLayout layout = new BorderLayout();
		Frame frame = new Frame("나 윈도우");
		frame.setLayout(layout); //윈도우에 배치적용!!

		//BorderLayout에 버튼 하나를 붙이면서 개발자가 방위를 명시하지 않으면
		//디폴트는 CENTER이다!!
		//따라서 버튼이 한개일경우 대왕버튼으로 보여질 것임
		//CENTER가 비어진(empty) 나머지 영역을 침범하기 때문에

		Button bt = new Button("난 센터");
		Button bt_north = new Button("난 북쪽");
		Button bt_west = new Button("난 서쪽");
		Button bt_east = new Button("난 동쪽");
		Button bt_south = new Button("난 남쪽");
		//frame.add(bt, BorderLayout.CENTER); //의미없다!

		//버튼을 본연의 크기를 유지시키는 방법은??
		//BorderLayout과 FlowLayout을 합칠수 있을까??
		//FlowLayout flowLayout = new FlowLayout();
		//frame.setLayout(flowLayout);

		//하나의 프레임에 두가지 배치를 동시적용할수는 없기 때문에 
		//버튼의 크기를 유지하고 싶다면, html 에서 div안에 div 넣듯
		//샌터 영역에 버튼을 그냥 붙이지말고, FlowLayout을 기본적으로 사용하는
		//컨테이너를 하나 부착하면 되며, 이 컨테이너에 버튼을 넣어주면 된다!! Panel을 이용하면된다!!

		//페널이란? 단어의 뜻대로 판자를 의미, 이 판자는 다른 컴포넌트들을 포함할 수 있다..
		//Frame과 차이가 있나??
		//Panel은 단독으로 존재할 수 없으며, 반드시 윈도우 안에서만 존재할 수 있다!!
		for(int i=1; i<=5; i++){
			Panel panel = new Panel(); // 눈에 않보인다!!
		}

		frame.add(panel); //윈도우 페널부착!!
		
		frame.add(bt_north, BorderLayout.NORTH);

		frame.add(bt_west, BorderLayout.WEST);

		frame.add(bt_east, BorderLayout.EAST);

		frame.add(bt_south, BorderLayout.SOUTH);
		//페널은 기본적으로 FlowLayout이 적용된 상태이기 때문에 패널안에 위치하는 모든 컴포넌트는
		//자기 자신의 본연의 크기가 유지될 수 있다.. 따라서 버튼을 윈도우에 직접 붙이지말고,
		//패널에 부착하자!!
		panel.add(bt); ///패널에 버튼 부착!

		//프레임 보이게, 크기 설정
		frame.setSize(400,300);
		frame.setVisible(true);
		
	}
}
