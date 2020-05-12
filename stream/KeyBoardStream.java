/*
키보드로부터 문자를 입력받아 화면에 출력해보자!!
키보드와 관련된 스트림은, 표준스트림이며 개발자가 생성하는 것이 아니라
OS차원에서 스트림을 생성한다. 따라서 자바 언어에서 키보드 스트림을 생성하는
클래스는 별도로 없다.. 단 이미 시스템이 생성해 놓은 스트림을 얻어올수는 있다.
*/
package stream;
import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyBoardStream{
	
	public static void main(String[] args){
		//OS가 이미 만들어 놓은 표준 출력스트림을 이용하고 있는 것임 
		/*
		System.in 은 os가 이미 생성해놓은 표준입력스트림을 보관해놓은 System이 보유한 static 객체
		System.out 은 os가 이미 생성해놓은 표준출력스트림을 보관해놓은 System이 보유한 static 객체
		*/
		
		//이미 생성된 키보드 스트림 얻기!!
		InputStream input = System.in;
		InputStreamReader reader = new InputStreamReader(input);
		try{
			//read() 메서드는 입력이 완료되는 시점까지, 무한대기 상태에 빠진다!!
			
			int data = -1;
			while(true){
				/*
				지금까지 써왔던 스트림인 FileInputStream, InputStram은 데이터를 1byte 씩 처리하는 바이트
				기반의 스트림이다!! 이스트림은 특히, 한글, 중국어등 비 영어권 문자를 표현할 수 없다!!
				해결책 ) 문자기반 스트림을 이용하면 된다!!
				문자기반 스트림이란? 읽어들인 기존의 스트림을 대상으로 2byte씩 묶어, 문자를 이해할수있도록 
				업그레이드 된 스트림!! 따라서 다루려하는 작업이 비영어권 문자가 포함된다면 문자기반스트림을 이용해야한다

				*/
				data = reader.read(); //표준입력인, 키보드로부터 입력받은 데이터를 대상으로 문자를 이해
				System.out.print((char)data);
			}
		}catch(IOException e){
			
		}
	
	}
}



