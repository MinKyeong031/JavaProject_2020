package Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SalesGUI {
	public static void main(String args[]) {
		SalesPanel sales_panel = new SalesPanel();
	}
}
class SalesPanel extends JPanel {
	ImageIcon background = new ImageIcon("images/background_4.png"); // �������� class������ �׳� ����
	
	SalesPanel() {
		SalesGLabel sales_label = new SalesGLabel();
		add(sales_label);

		ExitSalesBtn exit_sales_btn = new ExitSalesBtn();
		add(exit_sales_btn);
		
		DayBtn day_btn = new DayBtn();
		add(day_btn);
		
		DayTable day_table = new DayTable();
		add(day_table);		
		
		MonthBtn month_btn = new MonthBtn();
		add(month_btn);
		
		MonthTable month_table = new MonthTable();
		add(month_table);
				
		setBounds(0, 0, 1862, 1055); // ��ġ�� ũ�� ����
		setLayout(null);
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(background.getImage(), 0, 0, null);
		setOpaque(false);
		super.paintComponent(g);
	}
}
class SalesGLabel extends JLabel {
	SalesGLabel() {
		setBounds(781, 0, 300, 120);
		setVisible(true);
		setText("���� Ȯ��");
		setForeground(Color.black);
		setFont(new Font("���ﳲ�� ��ü B", Font.BOLD, 45));
		setHorizontalAlignment(JLabel.CENTER);
	}
}
class ExitSalesBtn extends JButton {
	ExitSalesBtn() {
		setBounds(15, 15, 170, 70);
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(112, 151, 168));
		setText("�ڷΰ���");
		setFont(new Font("���ﳲ�� ��ü B", Font.BOLD, 40));
		setVisible(true);
		setHorizontalAlignment(SwingConstants.CENTER);

		decorate(); // ��ư �׵θ� �ձ۰�

		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.MainFrame.getManager_panel().setVisible(true);
				Main.MainFrame.getSales_panel().setVisible(false);
			}
		});
	}

	protected void decorate() {
		setBorderPainted(false);
		setOpaque(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if (getModel().isArmed()) {
			graphics.setColor(getBackground().darker());
		} else if (getModel().isRollover()) {
			graphics.setColor(getBackground().brighter());
		} else {
			graphics.setColor(getBackground());
		}
		graphics.fillRoundRect(0, 0, width, height, 50, 50);
		FontMetrics fontMetrics = graphics.getFontMetrics();
		Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();
		int textX = (width - stringBounds.width) / 2;
		int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent();
		graphics.setColor(getForeground());
		graphics.setFont(getFont());
		graphics.drawString(getText(), textX, textY);
		graphics.dispose();
		super.paintComponent(g);
	}
}
class DayBtn extends JButton {
	DayBtn() {
		setBounds(831, 200, 100, 70);
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(112, 151, 168));
		setText("�Ϻ�");
		setFont(new Font("���ﳲ�� ��ü B", Font.BOLD, 40));
		setVisible(true);
		setHorizontalAlignment(SwingConstants.CENTER);

		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}
		});
	}

	protected void decorate() {
		setBorderPainted(false);
		setOpaque(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if (getModel().isArmed()) {
			graphics.setColor(getBackground().darker());
		} else if (getModel().isRollover()) {
			graphics.setColor(getBackground().brighter());
		} else {
			graphics.setColor(getBackground());
		}
		graphics.fillRoundRect(0, 0, width, height, 50, 50);
		FontMetrics fontMetrics = graphics.getFontMetrics();
		Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();
		int textX = (width - stringBounds.width) / 2;
		int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent();
		graphics.setColor(getForeground());
		graphics.setFont(getFont());
		graphics.drawString(getText(), textX, textY);
		graphics.dispose();
		super.paintComponent(g);
	}
}
class MonthBtn extends JButton {
	MonthBtn() {
		setBounds(931, 200, 100, 70);
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(112, 151, 168));
		setText("����");
		setFont(new Font("���ﳲ�� ��ü B", Font.BOLD, 40));
		setVisible(true);
		setHorizontalAlignment(SwingConstants.CENTER);

		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}
		});
	}

	protected void decorate() {
		setBorderPainted(false);
		setOpaque(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if (getModel().isArmed()) {
			graphics.setColor(getBackground().darker());
		} else if (getModel().isRollover()) {
			graphics.setColor(getBackground().brighter());
		} else {
			graphics.setColor(getBackground());
		}
		graphics.fillRoundRect(0, 0, width, height, 50, 50);
		FontMetrics fontMetrics = graphics.getFontMetrics();
		Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();
		int textX = (width - stringBounds.width) / 2;
		int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent();
		graphics.setColor(getForeground());
		graphics.setFont(getFont());
		graphics.drawString(getText(), textX, textY);
		graphics.dispose();
		super.paintComponent(g);
	}
}
class DayTable extends JTable{
	DayTable(){
		String header[] = {"�޴�", "�����"};
		String contents[][] = {
				{"�Ƹ޸�ī��", "0"},	
				{"���̽�Ƽ", "0"},	
				{"�����̵�", "0"},	
				{"�����ֽ�", "0"},	
				{"����", "0"},	
				{"��ī��", "0"},	
				{"��", "0"}
		};
		new JTable(contents, header);
	}
}
class MonthTable extends JTable{
	MonthTable(){
		String header[] = {"�޴�", "�����"};
		String contents[][] = {
				{"�Ƹ޸�ī��", "0"},	
				{"���̽�Ƽ", "0"},	
				{"�����̵�", "0"},	
				{"�����ֽ�", "0"},	
				{"����", "0"},	
				{"��ī��", "0"},	
				{"��", "0"}
		};
		new JTable(contents, header);
	}
} 