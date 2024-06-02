package Calendar;
import javax.swing.*;
public class Login extends JFrame {
	public JLabel la1, la2;
	public JTextField tf;
	public JPasswordField pf;
	public JButton b1,b2;
	
	public Login() {
		setTitle("로그인");
		
		// 초기화	
		la1 = new JLabel("ID");
		la2 = new JLabel("PW");
		
		tf = new JTextField();
		pf = new JPasswordField();
		
		b1 = new JButton("로그인");
		b2 = new JButton("취소");
		
		// 배치
		// 사용자 정의 2 
		setLayout(null); // BorderLayout
		la1.setBounds(10, 15, 80, 30);
		tf.setBounds(100, 15, 200, 30);
		
		la2.setBounds(10, 45, 100, 30); // 좌우, 위아래, 
		pf.setBounds(100, 50, 200, 30); // 좌우, 위아래, 길이, 높
		
		// 윈도우에 추가
		add(la1); add(tf);
		add(la2); add(pf);
		
		JPanel p =new JPanel();
		p.add(b1); p.add(b2); // 가운데 정렬
	    p.setBounds(10,90,290,35);
	    add(p);
	    
	    // 윈도우 크기 결정
	    setSize(350,180);
	    
	    // 출력 여부 
	   setVisible(true);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 호출
		
		new Login();
	}

}
