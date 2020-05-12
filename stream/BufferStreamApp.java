/*
키보드로 부터 데이터를 입력받되, 한줄씩 입력받아 본다!!
문자기반 스트림 + 버퍼기반 스트림까지 사용해본다!!
*/
package stream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class BufferStreamApp{
	public static void main(String[] args){
		//키보드로부터 바이트 데이터 입력!!
		InputStream is = System.in; //표준입력 스트림
		InputStreamReader reader = null;
		reader = new InputStreamReader(is); //2단계 씌우기
		BufferedReader buffr = new BufferedReader(reader);		

		//한줄씩 읽을 수있다!!
		//버퍼를 이용하다보니, 반복문으로 문자 하나하나 읽을 필요가없다!!
		//주의 버퍼에 끝은? 앤터이다!!
		String msg = null;
		try{
			while(true){
				msg = buffr.readLine();
				System.out.println(msg);
			}
		}catch(IOException e){
			
		}
	}
}
