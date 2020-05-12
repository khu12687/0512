/*
[수업주제]
1) 예외
	-프로그램의 비정상 종료 상황을 의미
	-예외처리 기술의목적 : 비정상 종료 방지(프로그램의 안정성 확보)
	-구현 : try~catch문
	-예외 객체 : Exception을 최상위 객체로 두고, 하위에 보다 자세한 예외객체들로 구현되어 있음..

2)스트림
	-데이터의 흐름(stream)을 의미
	현실에서는 물의 흐름을 stream이라 하지만, 전산에서는 데이터의 흐름이 마치 물과 같다고 stream이라 한다

	-유형
	입력 : 실행중인 프로그램으로 데어터가 들어가는것
	출력 : 실행중인 프로그램에서 데어터가 나오는 것
	-지원 패키지 : java.io
*/

package stream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData{
	//파일을 대상으로 한 스트림을 이용해본다!!
	FileInputStream fis;
	String name ="C:/web_app_DB/java_workspace/project0506/res/memo.txt"; //로컬상의 파일의 위치!!

	public ReadData(){
		/*아래의 스트림에 대한 생성자 호출 시, 아직 실행하지도 않았음에도 불구하고, 컴파일 타임에 예외(Exception)가
			발생하게 된다. why? 익셉션이란??예외상황을 의미한다.
		[예외에 대해..]
		
		프로그램을 비정상 종료 시키는 원인이 크게 2가지가 있다.
		1)에러 - error : 개발자가 복구할 수 없는 심각한 상황
							  대표적 예) 프로그램 외적 환경적 이유...
							  따라서 프로그래밍 언어에서는 에러 상활을 다루지 않음

		2)예외 - 개발자가 감당할 수 있는 에러 상황..

		*/

		//아래의 코드는 파일이 존재하지 않을경우 분명 실행시 에러가 발생한다
		//또한 에러가 발생할 경우 프로그램은 결국 비정상종료되어 버린다...
		//sun 이런 상황을 방지 하기 위해, 즉 개발자가 감당할 수 있는 예외상황을 방지하기 위한
		//예외처리문을 지원하고 try~catcch문을 이용한다
		try{ //아래의 문장을 먼저 시도하되, 혹여나 아래의 코드로 인해 에러가 발생하더라도 비정상 종료시키지말고,
			   //실행부로 하여금 catch문으로 진입하게 한다
			fis = new FileInputStream(name);
			System.out.println("파일에 대한 스트림 생성 성공");

			//생성된 스트림을 이용하여 데이터 읽기!!
			int data=-1;
			//파일로 부터 읽어들인 1byte가 int형으로 반환됨.
			//우리의 경우 메모장이므로 제일 앞자인 j부터 들어옴..
			//data = fis.read(); // 1byte를 읽어들임!!
			//System.out.print((char)data);
			//data = fis.read(); // 그 다음 1byte를 읽어들임!!
			//System.out.print((char)data);
			
			while(true){
				data = fis.read(); // 1byte를 읽어들임!!
				if(data==-1)break; //끝에 도달하면 멈춤!!
				System.out.print((char)data);
			}

		}catch(FileNotFoundException e){
			//catch문 영역은 에러가 났을떄 실행부가 실행시키는 영역이고 정상 수행 영역이다.
			//하지만 개발자는 이 영역에서 에러의 원인을 분석 및 기록하는 업무를 하면 되며, 에러 복구는 사실 불가능하다!
			System.out.println("예외발생...");
			System.out.println("하지만 프로그램 종료 안시킬게요...");
		}catch(IOException e){
			//catach문의 인수로 전달되는 e변수에는 해당 예외가 발생했을때 그 정보를 담고있는 예외객체가 전달된다!!
			//현재의 문장에서 스트림을 통해 읽다가 에러가 발생한 경우 그 에러 내용을 IOException 객체에 담고,
			//이 객체는 에러 발생시 jvm에서 생성되어 e 변수로 전달되어 진다ㅣ!!
			//궁금하면 출력해보자!
			e.printStackTrace(); //에러원인이 차곡차곡 쌓여있는 stack구조를 출력하라!!
		}
	}

	public static void main(String[] args){
		new ReadData();
	}
}
