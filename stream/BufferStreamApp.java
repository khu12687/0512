/*
Ű����� ���� �����͸� �Է¹޵�, ���پ� �Է¹޾� ����!!
���ڱ�� ��Ʈ�� + ���۱�� ��Ʈ������ ����غ���!!
*/
package stream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class BufferStreamApp{
	public static void main(String[] args){
		//Ű����κ��� ����Ʈ ������ �Է�!!
		InputStream is = System.in; //ǥ���Է� ��Ʈ��
		InputStreamReader reader = null;
		reader = new InputStreamReader(is); //2�ܰ� �����
		BufferedReader buffr = new BufferedReader(reader);		

		//���پ� ���� ���ִ�!!
		//���۸� �̿��ϴٺ���, �ݺ������� ���� �ϳ��ϳ� ���� �ʿ䰡����!!
		//���� ���ۿ� ����? �����̴�!!
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
