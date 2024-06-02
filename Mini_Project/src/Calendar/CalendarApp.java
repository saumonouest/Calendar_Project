package Calendar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class CalendarApp extends JFrame  {
    private JComboBox<String> monthComboBox;
    private JButton showButton;
    private JPanel calendarPanel;

    public CalendarApp() {
    	
    	
        setTitle("달력 애플리케이션");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1366, 768);
        setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel();
        String[] months = {"1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"};
        monthComboBox = new JComboBox<>(months);
        controlPanel.add(monthComboBox);

        showButton = new JButton("보기");
        controlPanel.add(showButton);
        
        add(controlPanel, BorderLayout.NORTH);
        

        calendarPanel = new JPanel(new GridLayout(0, 7));
        add(new JScrollPane(calendarPanel),BorderLayout.CENTER);
        
  

        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showCalendar();
            }
        });
    }

    public void showCalendar() {
    	
        int selectedMonth = monthComboBox.getSelectedIndex() + 1;

        GregorianCalendar cal = new GregorianCalendar();
        cal.set(Calendar.MONTH, selectedMonth - 1); // 입력한 월로 설정
        cal.set(Calendar.DAY_OF_MONTH, 1); // 첫 번째 날로 설정
        int firstDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
       
        calendarPanel.removeAll();
        
        
    
        
        String[] daysOfWeek = {"일", "월", "화", "수", "목", "금", "토"};
        for (String day : daysOfWeek) {
            JLabel dayLabel = new JLabel(day, SwingConstants.CENTER); // 요일을 표시할 라벨 생성
            calendarPanel.add(dayLabel); // 달력 패널에 요일 라벨 추가
        }

        
        for (int day = 1; day <= daysInMonth; day++) {
            JPanel datePanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // 각 날짜를 담을 패널을 FlowLayout으로 설정
            datePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // 테두리 설정
            datePanel.setPreferredSize(new Dimension(50, 50)); // 사이즈 설정

            JLabel dateLabel = new JLabel(Integer.toString(day), SwingConstants.LEFT); // 날짜를 표시할 라벨 생성하고 왼쪽 정렬로 설정
            datePanel.add(dateLabel); // 라벨을 패널에 추가

            calendarPanel.add(datePanel); // 달력 패널에 날짜 패널 추가
        }

        revalidate(); // 변경된 패널을 다시 그리도록 요청
        repaint(); // 패널을 다시 그리기
    }
      

    public static void main(String[] args) {
    		CalendarApp calendar = new CalendarApp();
            calendar.setVisible(true);
     }
}