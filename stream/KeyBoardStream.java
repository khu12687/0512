/*
Ű����κ��� ���ڸ� �Է¹޾� ȭ�鿡 ����غ���!!
Ű����� ���õ� ��Ʈ����, ǥ�ؽ�Ʈ���̸� �����ڰ� �����ϴ� ���� �ƴ϶�
OS�������� ��Ʈ���� �����Ѵ�. ���� �ڹ� ���� Ű���� ��Ʈ���� �����ϴ�
Ŭ������ ������ ����.. �� �̹� �ý����� ������ ���� ��Ʈ���� ���ü��� �ִ�.
*/
package stream;
import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyBoardStream{
	
	public static void main(String[] args){
		//OS�� �̹� ����� ���� ǥ�� ��½�Ʈ���� �̿��ϰ� �ִ� ���� 
		/*
		System.in �� os�� �̹� �����س��� ǥ���Է½�Ʈ���� �����س��� System�� ������ static ��ü
		System.out �� os�� �̹� �����س��� ǥ����½�Ʈ���� �����س��� System�� ������ static ��ü
		*/
		
		//�̹� ������ Ű���� ��Ʈ�� ���!!
		InputStream input = System.in;
		InputStreamReader reader = new InputStreamReader(input);
		try{
			//read() �޼���� �Է��� �Ϸ�Ǵ� ��������, ���Ѵ�� ���¿� ������!!
			
			int data = -1;
			while(true){
				/*
				���ݱ��� ��Դ� ��Ʈ���� FileInputStream, InputStram�� �����͸� 1byte �� ó���ϴ� ����Ʈ
				����� ��Ʈ���̴�!! �̽�Ʈ���� Ư��, �ѱ�, �߱���� �� ����� ���ڸ� ǥ���� �� ����!!
				�ذ�å ) ���ڱ�� ��Ʈ���� �̿��ϸ� �ȴ�!!
				���ڱ�� ��Ʈ���̶�? �о���� ������ ��Ʈ���� ������� 2byte�� ����, ���ڸ� �����Ҽ��ֵ��� 
				���׷��̵� �� ��Ʈ��!! ���� �ٷ���ϴ� �۾��� �񿵾�� ���ڰ� ���Եȴٸ� ���ڱ�ݽ�Ʈ���� �̿��ؾ��Ѵ�

				*/
				data = reader.read(); //ǥ���Է���, Ű����κ��� �Է¹��� �����͸� ������� ���ڸ� ����
				System.out.print((char)data);
			}
		}catch(IOException e){
			
		}
	
	}
}



