/*
키보드 이벤트를 감지하는 감지자인 KeyListener를 재정의 하자
*/

package event;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class MyKeyListener implements KeyListener{
	
		//아래의 추상메서드들을 모두~~재정의 해야한다!!
		public void keyReleased(KeyEvent e){
			System.out.println("키보드 눌렀다 떼었어?");
		}
		public void keyPressed(KeyEvent e){
		//	System.out.println("키보드 눌렀어?");
		}
		public void keyTyped(KeyEvent e){

		}
}
