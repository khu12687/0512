package event;
//윈도우와 관련된 이벤트를 감지하는 감지자인 WindowListener를 재정의해보자!
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
public class MyWindowListener implements WindowListener{

	//현재 사용중인 상태를 활성화라고 하고, 영어로는 Activated 라 한다
	public void windowActivated(WindowEvent e){
		System.out.println("windowActivated 호출");
	}

	//윈도우창이 제거될때 호출되는 메서드
	public void windowClosed(WindowEvent e){
		System.out.println("windowClosed 호출");
	}

	//setVisible(true)이던 윈도우가 false 가 될때 호출되는 메서드
	public void windowClosing(WindowEvent e){
		System.out.println(" windowClosing호출");
		//프로세스 죽이기!!
		System.exit(0); //프로그램종료
	}

	//비활성화될때 호출되는 메서드
	public void windowDeactivated(WindowEvent e){
		System.out.println("windowDeactivated 호출");
	}

	//최대화되어 다시 나타날때
	public void windowDeiconified(WindowEvent e){
		System.out.println("windowDeiconified 호출");
	}

	//최소하되어 아이콘으로 변할때
	public void windowIconified(WindowEvent e){
		System.out.println(" windowIconified 호출");
	}

	//윈도우창이 나타날때 호출되는 메서드!!
	public void windowOpened(WindowEvent e){
		System.out.println("windowOpened 호출");
	}
}
