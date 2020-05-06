package layout;
import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;
/*
그래픽 프로그래밍이란?
-GUI 프로그래밍(윈도우 프로그래밍)
-모든 그래픽 프로그래밍에서 사용되는 컴포넌트는 반드시 윈도우안에 존재해야 한다!!

이 예제에서는 배치관리자를 사용할때와 안할때의 차이점을 느껴보자!
*/
public class MyWin{
	public static void main(String[] args){
		/*자바의 모든클래스는 인스턴스를 생성하려면 new만 하면 된다!!
			불완전한 클래스나 객체는 new 연산자를 직접 사용 할 수없다!!
			대표적으로 추상클래스나 인터페이스는 추상메서드를 가지고있고 
			추상 메서드를 가지고 있다는 것은 불완전하다는 것이므로, new연산자를 사용할 수 없다!!
			따라서 자식클래스를 new 할때, 이때 인스턴스 생성이 가능함!!
		*/
		//아래의 Frame의 경우 일반클래스인지, 추상인지, 인터페이스인지부터 확인해야한다!!
		//그래야 new 여부를 결정지을 수 있다!!
		Frame frame = new Frame("나의 윈도우"); //메모리에 올리자!!

		//윈도우는 디폴트가 안보임!!
		frame.setVisible(true);
		//아직 width, height가 결정되지 않음
		frame.setSize(300,400);

		//배치관리자를 신경쓰지 않으면, 내가 원하는 디자인을 표현불가
		/*
		java AWT에서 지원하는 배치관리자라는 객체를 지원한다 암기!
		1) BorderLayout : 동,서,남,북, 샌터의 배치방법을 지원
								   컴포넌트의 크기가 무조건 100%확장됨
								   부모의 크기까지 확장해버림 block
		2) FlowLayout : 윈도우 크기에 따라 흐르는 방식을 지원
								주요특징 : 컴포넌트의 크기를 보존함
		3) GridLayout : 격자형태의 배치 지원
		4) GridBagLayout : 격자의 단점을 보완한 배치 지원
		5) CardLayout : 교체방식의 배치 지원
		*/

		//null이란 아무런 값도 아니다, 객체의 레퍼런스값을 아무것도 부여하지 않을때는 null을 쓰면 된다!!
		
		//보더 배치관리자 생성!!
		BorderLayout borderLayout=null;
		borderLayout = new BorderLayout();
		
		//현재 윈도우창에 보더 배치관리자를 적용하자!
		frame.setLayout(borderLayout);

		//버튼을 하나 생성하여, 배치관리자를 신경쓰지 않고 올려보자
		Button bt = new Button("나 샌터");
		//윈도우에 버튼 부착!! 
		frame.add(bt);

		//북쪽에 버튼 부착!!
		Button bt_north = new Button("난 북쪽");
		frame.add(bt_north, BorderLayout.NORTH);

		Button bt_west = new Button("난 서쪽");
		frame.add(bt_west, BorderLayout.WEST);

		Button bt_east = new Button("난 동쪽");
		frame.add(bt_east, BorderLayout.EAST);

		Button bt_south = new Button("난 남쪽");
		frame.add(bt_south, BorderLayout.SOUTH);


	}
}
