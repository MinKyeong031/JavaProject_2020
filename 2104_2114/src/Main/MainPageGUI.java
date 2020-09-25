package Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Main.OrderGUI;

import javax.swing.*;

public class MainPageGUI extends JFrame {
	public static MainFrame main_frame;

	// main
	public static void main(String[] args) {
		main_frame = new MainFrame();
	}

	public static MainFrame getMain_frame() {
		return main_frame;
	}
}

class MainFrame extends JFrame {
	static MainPanel main_panel;
	static OrderPanel order_panel;
	static Payment payment_panel;
	static LoginPanel login_panel;
	static ManagerPanel manager_panel;
	static EmployeePanel employee_panel;
	static MasterPanel master_panel;
	static ManagerJoinPanel manager_join_panel;
	static FranchisePanel franchise_panel;

	public MainFrame() {
		// MainPanel ������ ȣ��
		main_panel = new MainPanel();
		main_panel.setVisible(true);

		order_panel = new OrderPanel();
		order_panel.setVisible(false);

		payment_panel = new Payment();
		payment_panel.setVisible(false);

		login_panel = new LoginPanel();
		login_panel.setVisible(false);
		
		manager_panel = new ManagerPanel();
		manager_panel.setVisible(false);
		
		employee_panel = new EmployeePanel();
		employee_panel.setVisible(false);
		
		master_panel = new MasterPanel();
		master_panel.setVisible(false);
		
		manager_join_panel = new ManagerJoinPanel();
		manager_join_panel.setVisible(false);
		
		franchise_panel = new FranchisePanel();
		franchise_panel.setVisible(false);

		// MainFrame �Ӽ� ����
		setTitle("���� ���̼�"); // JFrame ���� �� Ÿ��Ʋ ����
		setBounds(20, 0, 1880, 1440); // JFrame ��ġ�� ũ�� (x, y, w, h)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x������ ����
		getContentPane().setLayout(null);
		setVisible(true);
		getContentPane().add(main_panel);

		// JFrame���� �߰��� �͵�
		add(main_panel);
		add(order_panel);
		add(payment_panel);
		add(login_panel);
		add(manager_panel);
		add(employee_panel);
		add(master_panel);
		add(manager_join_panel);
		add(franchise_panel);

		// ������ �� �� ������
		ImageIcon icon = new ImageIcon("images/logo_1.png");
		setIconImage(icon.getImage());
	}

	public static MainPanel getMain_panel() {
		return main_panel;
	}
	public static OrderPanel getOrder_panel() {
		return order_panel;
	}

	public static Payment getPayment_panel() {
		return payment_panel;
	}
	public static LoginPanel getLogin_panel() {
		return login_panel;
	}
	public static ManagerPanel getManager_panel() {
		return manager_panel;
	}
	public static EmployeePanel getEmployee_panel() {
		return employee_panel;
	}	
	public static MasterPanel getMaster_panel() {
		return master_panel;
	}
	public static ManagerJoinPanel getManager_join_panel() {
		return manager_join_panel;
	}
	public static FranchisePanel getFranchise_panel() {
		return franchise_panel;
	}
}

class MainPanel extends JPanel {
	static Icon icon = new ImageIcon("images/back_1.png");
	
	// MainPanel�� �ø� ������Ʈ���� ������ ȣ��
		ImageIcon background = new ImageIcon("images/background_8.png"); // �������� class������ �׳� ����
		static JButton order_btn = new JButton(icon); // '�ֹ��ϱ�' ��ư ������ ȣ��
		static JButton login_btn = new JButton(icon); // '�α���' ��ư ������ ȣ��

		MainPanel() {
			setBounds(0, 0, 1862, 1055); // ��ġ�� ũ�� ����
			setLayout(null);
			
			order_btn.setFont(new Font("Black Han Sans", Font.PLAIN, 45));
			order_btn.setBounds(1250, 650, 550, 120);
			order_btn.setVisible(true);
			order_btn.setBorderPainted(false);
			order_btn.setContentAreaFilled(false);
			order_btn.setFocusPainted(false);
			order_btn.setOpaque(false);
//			order_btn.decorate(); // ��ư �׵θ� �ձ۰�
			order_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Main.MainFrame.getMain_panel().setVisible(false);
						Main.MainFrame.getOrder_panel().setVisible(true);
				}
			});
			
			login_btn.setFont(new Font("Black Han Sans", Font.PLAIN, 45));
			login_btn.setBounds(1250, 800, 570, 120);
			login_btn.setVisible(true);
			login_btn.setBorderPainted(false);
			login_btn.setContentAreaFilled(false);
			login_btn.setFocusPainted(false);
			login_btn.setOpaque(false);
//			order_btn.decorate(); // ��ư �׵θ� �ձ۰�
			login_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Main.MainFrame.getMain_panel().setVisible(false);
						Main.MainFrame.getLogin_panel().setVisible(true);
				}
			});
			
			add(order_btn); // MainPanel�� order_btn �߰�
			add(login_btn); // MainPanel�� login_btn �߰�
			setVisible(true);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			g.drawImage(background.getImage(), 0, 0, null);
			setOpaque(false);
			super.paintComponent(g);
		}
		public static JButton getOrder_btn() {
			return order_btn;
		}
		public static JButton getLogin_btn() {
			return login_btn;
		}
}

//�ձ� ��ư ����� RoundedButton Ŭ����
class RoundedButton extends JButton {
	public RoundedButton() {
		super();
		decorate();
	}

	public RoundedButton(String text) {
		super(text);
		decorate();
	}

	public RoundedButton(Action action) {
		super(action);
		decorate();
	}

	public RoundedButton(Icon icon) {
		super(icon);
		decorate();
	}

	public RoundedButton(String text, Icon icon) {
		super(text, icon);
		decorate();
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