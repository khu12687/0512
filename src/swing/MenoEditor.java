/*
메모장을 자바로 제작해본다!!
*/
package swing;
//자바에서의 메뉴바는 개발자가 그 위치를 맘대로 수정할 수 없는 특별한 컴포넌트이다.
//따라서 위치는 언제나 제일 상단이다!! 배치고민하지말자!
import javax.swing.*; //스윙에 있는 모든 클래스
public class MenoEditor extends JFrame{
	
	JMenuBar bar; //메뉴들이 얹혀질 메뉴바!!
	JMenu m_file, m_edit, m_style, m_view, m_help;
	JMenuItem item_new, item_open, item_save, item_print;
	JTextArea area; //편집창
	JScrollPane scroll; //편집창에 붙일 스크롤


	public MenoEditor(){
		bar = new JMenuBar();

		m_file = new JMenu("파일");
		m_edit =new JMenu("편집");
		m_style =new JMenu("서식");
		m_view =new JMenu("보기");
		m_help =new JMenu("도움말");

		area = new JTextArea(25,40); //어차피 센터에 붙으므로, 젠체크기로 나옴
		scroll = new JScrollPane(area);

		//메뉴 아이탬
		item_new = new JMenuItem("새파일");
		item_open = new JMenuItem("열기");
		item_save = new JMenuItem("저장");
		item_print = new JMenuItem("인쇄");

		//'파일' 메뉴에 부착!!
		m_file.add(item_new);
		m_file.add(item_open);
		m_file.add(item_save);
		m_file.add(item_print);
		

		//생성된 메뉴를 바에 부착!!
		bar.add(m_file);
		bar.add(m_edit);
		bar.add(m_style);
		bar.add(m_view);
		bar.add(m_help);

		setJMenuBar(bar);

		//add(area); //윈도우에 부착 
		add(scroll);
		setSize(700,550);
		setVisible(true);

		//윈도우창 닫을때 프로세스도 죽이는 법
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new MenoEditor(); //자식 생성자 호출시, 부모인 JFrame이 먼저 초기화되기 때문에
									 //자식을 new하면 프레임을 생성하는 꼴임
	}
}
