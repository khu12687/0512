package stream;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
Event ���� ���
1).java �ҽ����Ϸ� ������ Ŭ������ ����
2)���� Ŭ�������� �����ʸ� implements �ϴ� ���
3) �����͸� Ŭ���� �̿�(�����ʰ� ���뼺�� �ʿ� ������, �� 1ȸ���϶�..���� ���)
*/
public class ReadUI extends JFrame{
	JTextField t_path; //�ҷ��� ���� ��θ� �Է��ϴ� �뵵
	JButton bt;

	JTextArea area;
	JScrollPane scroll;
	FileInputStream fis; //������ ������� �� �Է½�Ʈ�� Ŭ����!!

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

		//��ư�� ������ ����
		bt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//area.append("��ư ������?\n");
				load();
			}
		});
	}

	//������ �ҷ���(�Է� = Input), area �� ���!!
	public void load(){
		String path = t_path.getText(); //����ڰ� �Է��� ���ϰ��!!

		if(path.length() <=0){
			JOptionPane.showMessageDialog(this,"�Է��ϼ���");
			t_path.requestFocus(); //Ŀ���ø���
			return; //���̻� ���� ���ϰ�!!
		}

		try{
			fis = new FileInputStream(path); //��� ����
			System.out.println("���Ϸκ��� ��Ʈ�� ���� ����!!");

			int data=-1;
			while(true){
				data = fis.read(); 
				if(data==-1)break;
				//System.out.print((char)data);
				area.append(String.valueOf((char)data));
				//String �� �ü� �ִ�!!
				//�ذ�å? int�� String ���� ��ȯ�Ͽ� �־��ָ� ��!!
				//String API�� valueOf()�� �̿�
			}
		}catch(FileNotFoundException e){
			e.printStackTrace(); //���ñ����� �׿��ִ� ������ �������
		}catch(IOException e){
			e.printStackTrace(); //�����ڸ� ���� ���
			JOptionPane.showMessageDialog(this,"���� �������ϴ�"); //�Ϲ� ������ ���� �˸� �޽���
		}
	}
	
	public static void main(String[] args){
		new ReadUI();
	}
}
