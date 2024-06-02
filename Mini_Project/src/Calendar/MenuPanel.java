package Calendar;
import java.awt.GridLayout;
import javax.swing.*;

public class MenuPanel extends JPanel {
	public JButton b1,b2,b3,b4;
	 
	// 초기화 => 배치 
	public MenuPanel() {
		setLayout(new GridLayout(1,5,5,5)); // 같은 크기의 버튼 생성
		b1 = new JButton("달력");
		b2 = new JButton("일정 추가");
		b3 = new JButton("검색");
		b4 = new JButton("설정");
		
		add(b1);add(b2);add(b3);add(b4);
	}

}
 