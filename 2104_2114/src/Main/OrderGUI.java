package Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.EventHandler;

import javax.swing.*;

public class OrderGUI extends JFrame {
	public static void main(String args[]) {
		OrderPanel order_panel = new OrderPanel();
	}
}

class OrderPanel extends JPanel {
	static Icon icon = new ImageIcon("images/back_2.png");

	JButton order_button = new JButton(icon);
	JButton menu_exit_button = new JButton(icon);

	static int ice_coffee_count = 0;
	static int hot_coffee_count = 0;
	
	static int orange_smoothie_count = 0;
	static int kiwi_smoothie_count = 0;
	static int grape_smoothie_count = 0;
	static int strawberry_smoothie_count = 0;
	static int watermelon_smoothie_count = 0;
	
	static int black_tea_count = 0;
	static int green_tea_count = 0;
	
	static int brown_sugar_bubble_count = 0;
	static int taro_bubble_count = 0;
	static int green_bubble_count = 0;
	
	static int cheese_cake_count = 0;
	static int strawberry_cake_count = 0;
	static int chocolate_cake_count = 0;
	
	static int berry_macaron = 0;
	static int yogurt_macaron = 0;
	static int fruit_macaron = 0;
	
	// Ŀ��
	Icon ice_coffee = new ImageIcon("images/ice_coffee.png");
	Icon hot_coffee = new ImageIcon("images/hot_coffee.png");
	JLabel ice_coffee_label = new JLabel("", ice_coffee, JLabel.CENTER);
	JLabel hot_coffee_label = new JLabel("", hot_coffee, JLabel.CENTER);
	
	JButton add_ice_coffee = new JButton("Ice");
	JButton add_hot_coffee = new JButton("Hot");

	// ������(����)
	Icon smoo_orange = new ImageIcon("images/orange-juice.png");
	Icon smoo_kiwi = new ImageIcon("images/kiwi-juice.png");
	Icon smoo_grape = new ImageIcon("images/grape-juice.png");
	Icon smoo_strawberry = new ImageIcon("images/strawberry-juice.png");
	Icon smoo_watermelon = new ImageIcon("images/watermelon-juice.png");
	JLabel smoo_orange_label = new JLabel("", smoo_orange, JLabel.CENTER);
	JLabel smoo_kiwi_label = new JLabel("", smoo_kiwi, JLabel.CENTER);
	JLabel smoo_grape_label = new JLabel("", smoo_grape, JLabel.CENTER);
	JLabel smoo_strawberry_label = new JLabel("", smoo_strawberry, JLabel.CENTER);
	JLabel smoo_watermelon_label = new JLabel("", smoo_watermelon, JLabel.CENTER);
	
	JButton add_orange_smoo = new JButton("Orange");
	JButton add_kiwi_smoo = new JButton("Kiwi");
	JButton add_grape_smoo = new JButton("Grape");
	JButton add_strawberry_smoo = new JButton("Strawberry");
	JButton add_watermelon_smoo = new JButton("Watermelon");

	// ��
	Icon tea_hong = new ImageIcon("images/tea_hong.png");
	Icon tea_green = new ImageIcon("images/tea_green.png");
	JLabel tea_hong_label = new JLabel("", tea_hong, JLabel.CENTER);
	JLabel tea_green_label = new JLabel("", tea_green, JLabel.CENTER);
	
	JButton add_hong_tea = new JButton("Black tea");
	JButton add_green_tea = new JButton("Green tea");

	// ����Ƽ
	Icon bubble_brown = new ImageIcon("images/bubble-tea-brown.png");
	Icon bubble_taro = new ImageIcon("images/bubble-tea-taro.png");
	Icon bubble_green = new ImageIcon("images/bubble-tea-green.png");
	JLabel bubble_brown_label = new JLabel("", bubble_brown, JLabel.CENTER);
	JLabel bubble_taro_label = new JLabel("", bubble_taro, JLabel.CENTER);
	JLabel bubble_green_label = new JLabel("", bubble_green, JLabel.CENTER);
	
	JButton add_black_bubble = new JButton("Black sugar");
	JButton add_taro_bubble = new JButton("Taro");
	JButton add_green_bubble = new JButton("Green tea");

	// ����
	Icon cake_cheese = new ImageIcon("images/cake_cheese.png");
	Icon cake_strawberry = new ImageIcon("images/cake-strawberry.png");
	Icon cake_chocolate = new ImageIcon("images/cake-chocolate.png");
	JLabel cake_cheese_label = new JLabel("", cake_cheese, JLabel.CENTER);
	JLabel cake_strawberry_label = new JLabel("", cake_strawberry, JLabel.CENTER);
	JLabel cake_chocolate_label = new JLabel("", cake_chocolate, JLabel.CENTER);
	
	JButton add_cake_cheese = new JButton("Cheese");
	JButton add_cake_strawberry = new JButton("Strawberry");
	JButton add_cake_chocolate = new JButton("Chocolate");

	// ��ī��
	Icon macaron_berry = new ImageIcon("images/macaron-berry.png");
	Icon macaron_yogurt = new ImageIcon("images/macaron-yogurt.png");
	Icon macaron_fruit = new ImageIcon("images/macaron-fruit.png");
	JLabel macaron_berry_label = new JLabel("", macaron_berry, JLabel.CENTER);
	JLabel macaron_yogurt_label = new JLabel("", macaron_yogurt, JLabel.CENTER);
	JLabel macaron_fruit_label = new JLabel("", macaron_fruit, JLabel.CENTER);
	
	JButton add_macaron_berry = new JButton("Berry");
	JButton add_macaron_yogurt = new JButton("Yogurt");
	JButton add_macaron_fruit = new JButton("Fruit");

	// MainPanel�� �ø� ������Ʈ���� ������ ȣ��
	ImageIcon background = new ImageIcon("images/background_15.png"); // �������� class������ �׳� ����
	
	static OrderList order_list = new OrderList();

	OrderPanel() {
		add(order_list);
		
		setBounds(0, 0, 1862, 1055); // ��ġ�� ũ�� ����
		setLayout(null);
		setVisible(true);

		order_button.setBounds(1300, 900, 200, 50);
		order_button.setVisible(true);
		order_button.setBorderPainted(false);
		order_button.setContentAreaFilled(false);
		order_button.setFocusPainted(false);
		order_button.setOpaque(false);

		order_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.MainFrame.getOrder_panel().setVisible(false);
				Main.MainFrame.getPayment_panel().setVisible(true);
				Payment.td2.start();
			}
		});

		menu_exit_button.setBounds(1550, 900, 200, 50);
		menu_exit_button.setVisible(true);
		menu_exit_button.setBorderPainted(false);
		menu_exit_button.setContentAreaFilled(false);
		menu_exit_button.setFocusPainted(false);
		menu_exit_button.setOpaque(false);

		menu_exit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.MainFrame.getOrder_panel().setVisible(false);
				Main.MainFrame.getMain_panel().setVisible(true);
				OrderPanel.getOrder_list().removeAll();
			}
		});

		add(order_button);
		add(menu_exit_button);

		// Ŀ��
		ice_coffee_label.setBounds(140, 180, 145, 145);
		ice_coffee_label.setVerticalTextPosition(JLabel.CENTER);
		ice_coffee_label.setHorizontalTextPosition(JLabel.RIGHT);
		add(ice_coffee_label);
		
		hot_coffee_label.setBounds(140, 180, 145, 145);
		hot_coffee_label.setVerticalTextPosition(JLabel.CENTER);
		hot_coffee_label.setHorizontalTextPosition(JLabel.RIGHT);
		hot_coffee_label.setVisible(false);
		add(hot_coffee_label);
		
		add_ice_coffee.setBounds(320, 210, 100, 40);
		add_ice_coffee.setFont(new Font("������ũ��� M", Font.PLAIN, 24));
		add_ice_coffee.setBorderPainted(false);
		add_ice_coffee.setBackground(new Color(255, 220, 212));
		add_ice_coffee.setFocusPainted(false);
		add(add_ice_coffee);
		add_ice_coffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ice_coffee_label.setVisible(true);
				hot_coffee_label.setVisible(false);
			}
		});
		add_ice_coffee.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					ice_coffee_count++;
					OrderList.getJumon_1().setText("Ice-coffee  |  " + String.valueOf(ice_coffee_count) + "��   |  " + String.valueOf(ice_coffee_count*2500) + "��");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
		});
		
		add_hot_coffee.setBounds(320, 260, 100, 40);
		add_hot_coffee.setFont(new Font("������ũ��� M", Font.PLAIN, 24));
		add_hot_coffee.setBorderPainted(false);
		add_hot_coffee.setBackground(new Color(255, 220, 212));
		add_hot_coffee.setFocusPainted(false);
		add(add_hot_coffee);
		add_hot_coffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ice_coffee_label.setVisible(false);
				hot_coffee_label.setVisible(true);
			}
		});
		add_hot_coffee.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					hot_coffee_count++;
					OrderList.getJumon_2().setText("Hot-coffee  |  " + String.valueOf(hot_coffee_count) + "��   |  " + String.valueOf(hot_coffee_count*2500) + "��\n");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
		});

		// ������
		smoo_orange_label.setBounds(590, 180, 145, 145);
		smoo_orange_label.setVerticalTextPosition(JLabel.CENTER);
		smoo_orange_label.setHorizontalTextPosition(JLabel.RIGHT);
		add(smoo_orange_label);
		smoo_orange_label.setVisible(true);
		
		smoo_kiwi_label.setBounds(590, 180, 145, 145);
		smoo_kiwi_label.setVerticalTextPosition(JLabel.CENTER);
		smoo_kiwi_label.setHorizontalTextPosition(JLabel.RIGHT);
		add(smoo_kiwi_label);
		smoo_kiwi_label.setVisible(false);
		
		smoo_grape_label.setBounds(590, 180, 145, 145);
		smoo_grape_label.setVerticalTextPosition(JLabel.CENTER);
		smoo_grape_label.setHorizontalTextPosition(JLabel.RIGHT);
		add(smoo_grape_label);
		smoo_grape_label.setVisible(false);
		
		smoo_strawberry_label.setBounds(590, 180, 145, 145);
		smoo_strawberry_label.setVerticalTextPosition(JLabel.CENTER);
		smoo_strawberry_label.setHorizontalTextPosition(JLabel.RIGHT);
		add(smoo_strawberry_label);
		smoo_strawberry_label.setVisible(false);
		
		smoo_watermelon_label.setBounds(590, 180, 145, 145);
		smoo_watermelon_label.setVerticalTextPosition(JLabel.CENTER);
		smoo_watermelon_label.setHorizontalTextPosition(JLabel.RIGHT);
		add(smoo_watermelon_label);
		smoo_watermelon_label.setVisible(false);
		
		add_orange_smoo.setBounds(740, 170, 170, 27);
		add_orange_smoo.setFont(new Font("������ũ��� M", Font.PLAIN, 22));
		add_orange_smoo.setBorderPainted(false);
		add_orange_smoo.setBackground(new Color(247, 255, 212));
		add_orange_smoo.setFocusPainted(false);
		add(add_orange_smoo);
		add_orange_smoo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				smoo_orange_label.setVisible(true);
			}
		});
		add_orange_smoo.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					orange_smoothie_count++;
					OrderList.getJumon_3().setText("Orange-smoothie  |  " + String.valueOf(orange_smoothie_count) + "��   |  " + String.valueOf(orange_smoothie_count*3500) + "��\n");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
		});
		
		add_kiwi_smoo.setBounds(740, 205, 170, 27);
		add_kiwi_smoo.setFont(new Font("������ũ��� M", Font.PLAIN, 22));
		add_kiwi_smoo.setBorderPainted(false);
		add_kiwi_smoo.setBackground(new Color(247, 255, 212));
		add_kiwi_smoo.setFocusPainted(false);
		add(add_kiwi_smoo);
		add_kiwi_smoo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				smoo_orange_label.setVisible(false);
				smoo_kiwi_label.setVisible(true);
				smoo_grape_label.setVisible(false);
				smoo_strawberry_label.setVisible(false);
				smoo_watermelon_label.setVisible(false);
			}
		});
		add_kiwi_smoo.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					kiwi_smoothie_count++;
					OrderList.getJumon_4().setText("Kiwi-smoothie  |  " + String.valueOf(kiwi_smoothie_count) + "��   |  " + String.valueOf(kiwi_smoothie_count*3500) + "��\n");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
		});
		
		add_grape_smoo.setBounds(740, 240, 170, 27);
		add_grape_smoo.setFont(new Font("������ũ��� M", Font.PLAIN, 22));
		add_grape_smoo.setBorderPainted(false);
		add_grape_smoo.setBackground(new Color(247, 255, 212));
		add_grape_smoo.setFocusPainted(false);
		add(add_grape_smoo);
		add_grape_smoo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				smoo_orange_label.setVisible(false);
				smoo_kiwi_label.setVisible(false);
				smoo_grape_label.setVisible(true);
				smoo_strawberry_label.setVisible(false);
				smoo_watermelon_label.setVisible(false);
			}
		});
		add_grape_smoo.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					grape_smoothie_count++;
					OrderList.getJumon_5().setText("Grape-smoothie  |  " + String.valueOf(grape_smoothie_count) + "��   |  " + String.valueOf(grape_smoothie_count*3500) + "��\n");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
		});
		
		add_strawberry_smoo.setBounds(740, 275, 170, 27);
		add_strawberry_smoo.setFont(new Font("������ũ��� M", Font.PLAIN, 22));
		add_strawberry_smoo.setBorderPainted(false);
		add_strawberry_smoo.setBackground(new Color(247, 255, 212));
		add_strawberry_smoo.setFocusPainted(false);
		add(add_strawberry_smoo);
		add_strawberry_smoo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				smoo_orange_label.setVisible(false);
				smoo_kiwi_label.setVisible(false);
				smoo_grape_label.setVisible(false);
				smoo_strawberry_label.setVisible(true);
				smoo_watermelon_label.setVisible(false);
			}
		});
		add_strawberry_smoo.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					strawberry_smoothie_count++;
					OrderList.getJumon_6().setText("Strawberry-smoothie  |  " + String.valueOf(strawberry_smoothie_count) + "��   |  " + String.valueOf(strawberry_smoothie_count*3500) + "��\n");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
		});
		
		add_watermelon_smoo.setBounds(740, 310, 170, 27);
		add_watermelon_smoo.setFont(new Font("������ũ��� M", Font.PLAIN, 22));
		add_watermelon_smoo.setBorderPainted(false);
		add_watermelon_smoo.setBackground(new Color(247, 255, 212));
		add_watermelon_smoo.setFocusPainted(false);
		add(add_watermelon_smoo);
		add_watermelon_smoo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				smoo_orange_label.setVisible(false);
				smoo_kiwi_label.setVisible(false);
				smoo_grape_label.setVisible(false);
				smoo_strawberry_label.setVisible(false);
				smoo_watermelon_label.setVisible(true);
			}
		});
		add_watermelon_smoo.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					watermelon_smoothie_count++;
					OrderList.getJumon_7().setText("Watermelon-smoothie  |  " + String.valueOf(watermelon_smoothie_count) + "��   |  " + String.valueOf(watermelon_smoothie_count*3500) + "��\n");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
		});

		// ��
		tea_hong_label.setBounds(140, 476, 145, 145);
		tea_hong_label.setVerticalTextPosition(JLabel.CENTER);
		tea_hong_label.setHorizontalTextPosition(JLabel.RIGHT);
		add(tea_hong_label);
		
		tea_green_label.setBounds(140, 476, 145, 145);
		tea_green_label.setVerticalTextPosition(JLabel.CENTER);
		tea_green_label.setHorizontalTextPosition(JLabel.RIGHT);
		add(tea_green_label);
		tea_green_label.setVisible(false);
		
		add_hong_tea.setBounds(320, 500, 150, 40);
		add_hong_tea.setFont(new Font("������ũ��� M", Font.PLAIN, 24));
		add_hong_tea.setBorderPainted(false);
		add_hong_tea.setBackground(new Color(191, 252, 255));
		add_hong_tea.setFocusPainted(false);
		add(add_hong_tea);
		add_hong_tea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tea_hong_label.setVisible(true);
				tea_green_label.setVisible(false);
			}
		});
		add_hong_tea.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					black_tea_count++;
					OrderList.getJumon_8().setText("Black-tea  |  " + String.valueOf(black_tea_count) + "��   |  " + String.valueOf(black_tea_count*3000) + "��\n");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
		});
		
		add_green_tea.setBounds(320, 550, 150, 40);
		add_green_tea.setFont(new Font("������ũ��� M", Font.PLAIN, 24));
		add_green_tea.setBorderPainted(false);
		add_green_tea.setBackground(new Color(191, 252, 255));
		add_green_tea.setFocusPainted(false);
		add(add_green_tea);
		add_green_tea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tea_hong_label.setVisible(false);
				tea_green_label.setVisible(true);
			}
		});
		add_green_tea.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					green_tea_count++;
					OrderList.getJumon_9().setText("Green-tea  |  " + String.valueOf(green_tea_count) + "��   |  " + String.valueOf(green_tea_count*3000) + "��\n");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
		});

		// ����
		bubble_brown_label.setBounds(590, 472, 145, 145);
		bubble_brown_label.setVerticalTextPosition(JLabel.CENTER);
		bubble_brown_label.setHorizontalTextPosition(JLabel.RIGHT);
		add(bubble_brown_label);
		
		bubble_taro_label.setBounds(590, 472, 145, 145);
		bubble_taro_label.setVerticalTextPosition(JLabel.CENTER);
		bubble_taro_label.setHorizontalTextPosition(JLabel.RIGHT);
		add(bubble_taro_label);
		bubble_taro_label.setVisible(false);
		
		bubble_green_label.setBounds(590, 472, 145, 145);
		bubble_green_label.setVerticalTextPosition(JLabel.CENTER);
		bubble_green_label.setHorizontalTextPosition(JLabel.RIGHT);
		add(bubble_green_label);
		bubble_green_label.setVisible(false);
		
		add_black_bubble.setBounds(740, 475, 180, 40);
		add_black_bubble.setFont(new Font("������ũ��� M", Font.PLAIN, 26));
		add_black_bubble.setBorderPainted(false);
		add_black_bubble.setBackground(new Color(201, 255, 245));
		add_black_bubble.setFocusPainted(false);
		add(add_black_bubble);
		add_black_bubble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bubble_brown_label.setVisible(true);
			}
		});
		add_black_bubble.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					brown_sugar_bubble_count++;
					OrderList.getJumon_10().setText("Brownsugar-bubble-tea  |  " + String.valueOf(brown_sugar_bubble_count) + "��   |  " + String.valueOf(brown_sugar_bubble_count*4000) + "��\n");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
		});
		
		add_taro_bubble.setBounds(740, 525, 180, 40);
		add_taro_bubble.setFont(new Font("������ũ��� M", Font.PLAIN, 26));
		add_taro_bubble.setBorderPainted(false);
		add_taro_bubble.setBackground(new Color(201, 255, 245));
		add_taro_bubble.setFocusPainted(false);
		add(add_taro_bubble);
		add_taro_bubble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bubble_brown_label.setVisible(false);
				bubble_taro_label.setVisible(true);
				bubble_green_label.setVisible(false);
			}
		});
		add_taro_bubble.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					taro_bubble_count++;
					OrderList.getJumon_11().setText("Taro-bubble-tea  |  " + String.valueOf(taro_bubble_count) + "��   |  " + String.valueOf(taro_bubble_count*4000) + "��\n");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
		});
		
		add_green_bubble.setBounds(740, 575, 180, 40);
		add_green_bubble.setFont(new Font("������ũ��� M", Font.PLAIN, 26));
		add_green_bubble.setBorderPainted(false);
		add_green_bubble.setBackground(new Color(201, 255, 245));
		add_green_bubble.setFocusPainted(false);
		add(add_green_bubble);
		add_green_bubble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bubble_brown_label.setVisible(false);
				bubble_taro_label.setVisible(false);
				bubble_green_label.setVisible(true);
			}
		});
		add_green_bubble.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					green_bubble_count++;
					OrderList.getJumon_12().setText("Green-bubble-tea  |  " + String.valueOf(green_bubble_count) + "��   |  " + String.valueOf(green_bubble_count*4000) + "��\n");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
		});

		// ����
		cake_cheese_label.setBounds(140, 764, 145, 145);
		cake_cheese_label.setVerticalTextPosition(JLabel.CENTER);
		cake_cheese_label.setHorizontalTextPosition(JLabel.RIGHT);
		add(cake_cheese_label);
		
		cake_strawberry_label.setBounds(140, 764, 145, 145);
		cake_strawberry_label.setVerticalTextPosition(JLabel.CENTER);
		cake_strawberry_label.setHorizontalTextPosition(JLabel.RIGHT);
		add(cake_strawberry_label);
		cake_strawberry_label.setVisible(false);
		
		cake_chocolate_label.setBounds(140, 764, 145, 145);
		cake_chocolate_label.setVerticalTextPosition(JLabel.CENTER);
		cake_chocolate_label.setHorizontalTextPosition(JLabel.RIGHT);
		add(cake_chocolate_label);
		cake_chocolate_label.setVisible(false);
		
		add_cake_cheese.setBounds(315, 765, 170, 40);
		add_cake_cheese.setFont(new Font("������ũ��� M", Font.PLAIN, 24));
		add_cake_cheese.setBorderPainted(false);
		add_cake_cheese.setBackground(new Color(255, 212, 250));
		add_cake_cheese.setFocusPainted(false);
		add(add_cake_cheese);
		add_cake_cheese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cake_cheese_label.setVisible(true);
				cake_chocolate_label.setVisible(false);
				cake_strawberry_label.setVisible(false);
			}
		});
		add_cake_cheese.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					cheese_cake_count++;
					OrderList.getJumon_13().setText("Cheese-cake  |  " + String.valueOf(cheese_cake_count) + "��   |  " + String.valueOf(cheese_cake_count*5000) + "��\n");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
		});
		
		add_cake_strawberry.setBounds(315, 815, 170, 40);
		add_cake_strawberry.setFont(new Font("������ũ��� M", Font.PLAIN, 24));
		add_cake_strawberry.setBorderPainted(false);
		add_cake_strawberry.setBackground(new Color(255, 212, 250));
		add_cake_strawberry.setFocusPainted(false);
		add(add_cake_strawberry);
		add_cake_strawberry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cake_cheese_label.setVisible(false);
				cake_strawberry_label.setVisible(true);
				cake_chocolate_label.setVisible(false);
			}
		});
		add_cake_strawberry.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					strawberry_cake_count++;
					OrderList.getJumon_14().setText("Strawberry-cake  |  " + String.valueOf(strawberry_cake_count) + "��   |  " + String.valueOf(strawberry_cake_count*5000) + "��\n");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
		});
		
		add_cake_chocolate.setBounds(315, 865, 170, 40);
		add_cake_chocolate.setFont(new Font("������ũ��� M", Font.PLAIN, 24));
		add_cake_chocolate.setBorderPainted(false);
		add_cake_chocolate.setBackground(new Color(255, 212, 250));
		add_cake_chocolate.setFocusPainted(false);
		add(add_cake_chocolate);
		add_cake_chocolate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cake_cheese_label.setVisible(false);
				cake_strawberry_label.setVisible(false);
				cake_chocolate_label.setVisible(true);
			}
		});
		add_cake_chocolate.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					cheese_cake_count++;
					OrderList.getJumon_15().setText("Chocolate-cake  |  " + String.valueOf(cheese_cake_count) + "��   |  " + String.valueOf(cheese_cake_count*5000) + "��\n");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
		});

		// ��ī��
		macaron_berry_label.setBounds(590, 764, 145, 145);
		macaron_berry_label.setVerticalTextPosition(JLabel.CENTER);
		macaron_berry_label.setHorizontalTextPosition(JLabel.RIGHT);
		add(macaron_berry_label);
		
		macaron_yogurt_label.setBounds(590, 764, 145, 145);
		macaron_yogurt_label.setVerticalTextPosition(JLabel.CENTER);
		macaron_yogurt_label.setHorizontalTextPosition(JLabel.RIGHT);
		add(macaron_yogurt_label);
		macaron_yogurt_label.setVisible(false);
		
		macaron_fruit_label.setBounds(590, 764, 145, 145);
		macaron_fruit_label.setVerticalTextPosition(JLabel.CENTER);
		macaron_fruit_label.setHorizontalTextPosition(JLabel.RIGHT);
		add(macaron_fruit_label);
		macaron_fruit_label.setVisible(false);
		
		add_macaron_berry.setBounds(775, 765, 140, 40);
		add_macaron_berry.setFont(new Font("������ũ��� M", Font.PLAIN, 24));
		add_macaron_berry.setBorderPainted(false);
		add_macaron_berry.setBackground(new Color(243, 201, 255));
		add_macaron_berry.setFocusPainted(false);
		add(add_macaron_berry);
		add_macaron_berry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				macaron_berry_label.setVisible(true);
			}
		});
		add_macaron_berry.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					berry_macaron++;
					OrderList.getJumon_16().setText("Berry-macaron  |  " + String.valueOf(berry_macaron) + "��   |  " + String.valueOf(berry_macaron*2500) + "��\n");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
		});
		
		add_macaron_yogurt.setBounds(775, 815, 140, 40);
		add_macaron_yogurt.setFont(new Font("������ũ��� M", Font.PLAIN, 24));
		add_macaron_yogurt.setBorderPainted(false);
		add_macaron_yogurt.setBackground(new Color(243, 201, 255));
		add_macaron_yogurt.setFocusPainted(false);
		add(add_macaron_yogurt);
		add_macaron_yogurt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				macaron_berry_label.setVisible(false);
				macaron_yogurt_label.setVisible(true);
				macaron_fruit_label.setVisible(false);
			}
		});
		add_macaron_yogurt.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					yogurt_macaron++;
					OrderList.getJumon_17().setText("Yogurt-macaron  |  " + String.valueOf(yogurt_macaron) + "��   |  " + String.valueOf(yogurt_macaron*2500) + "��\n");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
		});
		
		add_macaron_fruit.setBounds(775, 865, 140, 40);
		add_macaron_fruit.setFont(new Font("������ũ��� M", Font.PLAIN, 24));
		add_macaron_fruit.setBorderPainted(false);
		add_macaron_fruit.setBackground(new Color(243, 201, 255));
		add_macaron_fruit.setFocusPainted(false);
		add(add_macaron_fruit);
		add_macaron_fruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				macaron_berry_label.setVisible(false);
				macaron_yogurt_label.setVisible(false);
				macaron_fruit_label.setVisible(true);
			}
		});
		add_macaron_fruit.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					fruit_macaron++;
					OrderList.getJumon_18().setText("Fruit-macaron  |  " + String.valueOf(fruit_macaron) + "��   |  " + String.valueOf(fruit_macaron*2500) + "��\n");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
		});
	}
	public static OrderList getOrder_list() {
		return order_list;
	}
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(background.getImage(), 0, 0, null);
		setOpaque(false);
		super.paintComponent(g);
	}

	ImageIcon imageSetSize(ImageIcon icon, int i, int j) {
		Image ximg = icon.getImage();
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
	}
}
class PaymentExitBtn extends JButton{
	PaymentExitBtn() {
		setBounds(1160, 840, 157, 50);
		setVisible(true);
		setBorderPainted(false);
		setContentAreaFilled(false);
		setFocusPainted(false);
		setOpaque(false);
		setBackground(Color.RED);
		
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.MainFrame.getOrder_panel().setVisible(true);
				Main.MainFrame.getPayment_panel().setVisible(false);
			}
		});
	}
}
class Payment extends JPanel {
	static PaymentTextCount payment_text_count = new PaymentTextCount();

	static Timer t2 = new Timer(payment_text_count);
	static Thread td2 = new Thread(t2);

	ImageIcon background = new ImageIcon("images/background_11.png"); // �������� class������ �׳� ����
	PaymentExitBtn payment_exit_btn = new PaymentExitBtn();
	
	Payment() {
		setBounds(0, 0, 1862, 1055);
		setLayout(null);
		setVisible(false);
		setBackground(new Color(112, 151, 168));
		setForeground(Color.white);

		add(payment_text_count);
		add(payment_exit_btn);
	}
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(background.getImage(), 0, 0, null);
		setOpaque(false);
		super.paintComponent(g);
	}
	public static Thread getTd2() {
		return td2;
	}
}
class PaymentTextCount extends JLabel {
	public PaymentTextCount() {
		setBounds(740, 290, 300, 150);
		setVisible(true);
		setForeground(Color.black);
		setFont(new Font("������ũ��� B", Font.PLAIN, 160));
		setHorizontalAlignment(JLabel.CENTER);
	}
}

class Timer implements Runnable {
	private JLabel timerLabel;

	public Timer(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {
		int n = 30;
		while (true) {
			timerLabel.setText(Integer.toString(n));
			n--;
			try {
				Thread.sleep(1000); // 1/1000�� ����
			} catch (InterruptedException e) {
				return;
			}
			if (n == -1) {
				MainFrame.getPayment_panel().setVisible(false);
				MainFrame.getMain_panel().setVisible(true);
			}
			if (n <= 10) {
				Payment.payment_text_count.setForeground(Color.RED);
			}
		}
	}
}
class OrderList extends JPanel{
	static OrderDetails jumon_1 = new OrderDetails();
	static OrderDetails jumon_2 = new OrderDetails();
	static OrderDetails jumon_3 = new OrderDetails();
	static OrderDetails jumon_4 = new OrderDetails();
	static OrderDetails jumon_5 = new OrderDetails();
	static OrderDetails jumon_6 = new OrderDetails();
	static OrderDetails jumon_7 = new OrderDetails();
	static OrderDetails jumon_8 = new OrderDetails();
	static OrderDetails jumon_9 = new OrderDetails();
	static OrderDetails jumon_10 = new OrderDetails();
	static OrderDetails jumon_11= new OrderDetails();
	static OrderDetails jumon_12 = new OrderDetails();
	static OrderDetails jumon_13 = new OrderDetails();
	static OrderDetails jumon_14 = new OrderDetails();
	static OrderDetails jumon_15 = new OrderDetails();
	static OrderDetails jumon_16= new OrderDetails();
	static OrderDetails jumon_17 = new OrderDetails();
	static OrderDetails jumon_18 = new OrderDetails();
	static OrderDetails jumon_19 = new OrderDetails();
	
	OrderList(){
		setBounds(1140, 175, 570, 650);
		setVisible(true);
		setBackground(Color.WHITE);
		
		FlowLayout fl = new FlowLayout();
		fl.setAlignment(FlowLayout.LEFT);
		setLayout(fl);
		
		add(jumon_1); add(jumon_2); add(jumon_3); add(jumon_4);
		add(jumon_5); add(jumon_6); add(jumon_7); add(jumon_8); 
		add(jumon_9); add(jumon_10); add(jumon_11);
		add(jumon_12); add(jumon_13); add(jumon_14); add(jumon_15); 
		add(jumon_16); add(jumon_17); add(jumon_18); add(jumon_19);
	}
	public static OrderDetails getJumon_1() {
		return jumon_1;
	}
	public static OrderDetails getJumon_2() {
		return jumon_2;
	}
	public static OrderDetails getJumon_3() {
		return jumon_3;
	}
	public static OrderDetails getJumon_4() {
		return jumon_4;
	}
	public static OrderDetails getJumon_5() {
		return jumon_5;
	}
	public static OrderDetails getJumon_6() {
		return jumon_6;
	}
	public static OrderDetails getJumon_7() {
		return jumon_7;
	}
	public static OrderDetails getJumon_8() {
		return jumon_8;
	}
	public static OrderDetails getJumon_9() {
		return jumon_9;
	}
	public static OrderDetails getJumon_10() {
		return jumon_10;
	}
	public static OrderDetails getJumon_11() {
		return jumon_11;
	}
	public static OrderDetails getJumon_12() {
		return jumon_12;
	}
	public static OrderDetails getJumon_13() {
		return jumon_13;
	}
	public static OrderDetails getJumon_14() {
		return jumon_14;
	}
	public static OrderDetails getJumon_15() {
		return jumon_15;
	}
	public static OrderDetails getJumon_16() {
		return jumon_16;
	}
	public static OrderDetails getJumon_17() {
		return jumon_17;
	}
	public static OrderDetails getJumon_18() {
		return jumon_18;
	}
	public static OrderDetails getJumon_19() {
		return jumon_19;
	}
}
class OrderDetails extends JLabel{
	OrderDetails(){
		setBounds(0, 70*(OrderPanel.ice_coffee_count + OrderPanel.hot_coffee_count + OrderPanel.orange_smoothie_count + OrderPanel.kiwi_smoothie_count + OrderPanel.grape_smoothie_count + OrderPanel.strawberry_smoothie_count + OrderPanel.watermelon_smoothie_count), 700, 100);
		setFont(new Font("������ũ��� M", Font.PLAIN, 28));
		setVisible(true);
		setHorizontalAlignment(JLabel.LEFT);
	}
}