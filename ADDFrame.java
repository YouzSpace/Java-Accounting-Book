package book;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ADDFrame extends JFrame {
	// 按钮
	JLabel bq1, bq2, bq3, bq4;
	JTextField tf1, tf2, tf3;
	JButton bt1, bt2;
	JComboBox<String> list;

	public ADDFrame() {
		// 构造方法
		initComponent();
		initFrame();
		initLayout();
		initListener();

	}

	public void initComponent() {
		/*
		 * 初始化交易记录表单的所有UI组件 创建并配置标签、输入框、按钮和下拉菜单，用于记录交易信息
		 */
		bq1 = new JLabel("交易时间");
		bq2 = new JLabel("交易类别");
		bq3 = new JLabel("交易金额");
		bq4 = new JLabel("交易描述");

		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();

		bt1 = new JButton("提交");
		bt2 = new JButton("取消");

		String[] s = { "衣", "住", "行", "交通", "娱乐", "其他" };
		list = new JComboBox<>(s);

	}

	public void initLayout() {
		/*
		 * 初始化表单布局 设置2行5列的网格布局，组件间距为10像素 按顺序添加标签、文本框、列表和按钮组件
		 */
		setLayout(new GridLayout(5, 2, 10, 10));
		add(bq1);
		add(tf1);
		add(bq2);
		add(list);
		add(bq3);
		add(tf2);
		add(bq4);
		add(tf3);
		add(bt1);
		add(bt2);
	}

	public void initListener() {
		// 事件处理
		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ToolsJDBC.add(tf1.getText(), (String) list.getSelectedItem(), tf2.getText(), tf3.getText());
				JOptionPane.showMessageDialog(null, "成功");

			}
		});
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tf2.setText(null);
				tf3.setText(null);

			}
		});

	}

	public void initFrame() {
		// 初始化窗口设置
		setSize(300, 200); // 窗口大小
		setResizable(false); // 固定窗口
		setLocationRelativeTo(null); // 设置居中
		setDefaultCloseOperation(2); // 设置关闭方式
		setTitle("x消费记录"); // 设置窗口标题
		setVisible(true); // 设置窗口可见
	}

	public static void main(String[] args) {
		new ADDFrame();
	}
}
