package Calendar;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

class CalendarFrame extends CalendarApp {
	public CalendarFrame() {
		JPanel calendarPanel = new JPanel(new GridLayout(0,7));
		// CalendarFrame 클래스 내에서 각 날짜 버튼에 액션 리스너를 추가하는 부분
		for (int i = 1; i <= 31; i++) {
		    JButton dateButton = new JButton(Integer.toString(i));
		    dateButton.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            String date = ((JButton) e.getSource()).getText();
		            new Calendar_Schedule(date).setVisible(true); // 해당 날짜를 인자로 전달하여 일정 등록 창을 띄움
		        }
		    });
		    calendarPanel.add(dateButton);
		}
	            JButton dateButton = new JButton();
	            dateButton.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    String date = ((JButton) e.getSource()).getText();
	           
	                }
	            });
	            calendarPanel.add(dateButton);
	            
	            add(calendarPanel);
	            
	}
	public void addSchedule(String date, String todo, String detail) {
		System.out.println(date+":"+todo+"-"+detail);
	}
}

public class Calendar_Schedule extends JFrame{
	public String todo;
	public JLabel Tl, Cl;
	public JTextField Tf, Cf;
	public JButton b1, b2, SB;
	private Object calendarFrame;
	
	
	public Calendar_Schedule(String date) {
		this.calendarFrame = calendarFrame; // CalendarFrame의 참조를 저장
		setTitle("일정 등록");
		//Scanner scan=new Scanner(System.in);
		//todo = scan.next();
		Tl = new JLabel();
		Tf = new JTextField();
		
		Cl = new JLabel();
		Cf = new JTextField();
		
		b1 = new JButton("등록");
		b2 = new JButton("취소");
		
		// 배치 
		setLayout(null);
		Tl = new JLabel("일정 이름", JLabel.CENTER);
		Tl.setBounds(5,20,50,25);
		Tf.setBounds(60,20,380, 25); // 좌우, 위아래, 길이, 높이
		add(Tl); add(Tf);
		
		Cl = new JLabel("세부 내역 ",JLabel.CENTER);
		Cl.setBounds(5,60,50,25);
		Cf.setBounds(60, 60, 380, 320);
		add(Cl); add(Cf);
		
		JPanel p = new JPanel();
		p.add(b1); p.add(b2);
		p.setBounds(120, 380, 200, 35);
		add(p);
		
		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String todo = Tf.getText();
                String detail = Cf.getText();
             
                // 캘린더에 일정 추가
                if(calendarFrame != null)
                    ((CalendarFrame) calendarFrame).addSchedule(date, todo, detail);
                setVisible(false);
            }
        });

        setSize(450,450);
        setVisible(true);
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalendarFrame calendarFrame = new CalendarFrame();
		calendarFrame.setVisible(true);	
	
	}
}




