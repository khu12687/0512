package stream;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
Event 구현 방법
1).java 소스파일로 별도의 클래스로 정의
2)현재 클래스에서 리스너를 implements 하는 방법
3) 내부익명 클래스 이용(리스너가 재사용성이 필요 없을때, 즉 1회성일때..많이 사용)
*/
public class ReadUI extends JFrame{
	JTextField t_path; //불러올 파일 경로를 입력하는 용도
	JButton bt;

	JTextArea area;
	JScrollPane scroll;
	FileInputStream fis; //파일을 대상으로 한 입력스트림 클래스!!

	public ReadUI(){
		t_path = new JTextField(20);
		bt = new JButton("Load");
		area = new JTextArea(10,25);
		scroll = new JScrollPane(area);

		add(t_path);
		add(bt);
		add(scroll);

		setLayout(new FlowLayout());
		setSize(500,400);
		setVisible(true);

		//버튼에 리스너 연결
		bt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//area.append("버튼 눌렀어?\n");
				load();
			}
		});
	}

	//파일을 불러와(입력 = Input), area 에 출력!!
	public void load(){
		String path = t_path.getText(); //사용자가 입력한 파일경로!!

		if(path.length() <=0){
			JOptionPane.showMessageDialog(this,"입력하세요");
			t_path.requestFocus(); //커서올리기
			return; //더이상 진행 못하게!!
		}

		try{
			fis = new FileInputStream(path); //경로 지정
			System.out.println("파일로부터 스트림 생성 성공!!");

			int data=-1;
			while(true){
				data = fis.read(); 
				if(data==-1)break;
				//System.out.print((char)data);
				area.append(String.valueOf((char)data));
				//String 만 올수 있다!!
				//해결책? int를 String 으로 변환하여 넣어주면 됨!!
				//String API중 valueOf()을 이용
			}
		}catch(FileNotFoundException e){
			e.printStackTrace(); //스택구조로 쌓여있는 에러를 출력하자
		}catch(IOException e){
			e.printStackTrace(); //개발자를 위한 출력
			JOptionPane.showMessageDialog(this,"읽을 수없습니다"); //일반 유저를 위한 알림 메시지
		}
	}
	
	public static void main(String[] args){
		new ReadUI();
	}
}
