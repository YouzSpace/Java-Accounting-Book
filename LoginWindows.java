package book;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginWindows extends JFrame {

	JLabel img;
	JTextField username;
	JPasswordField password;
	JButton login;
	JButton reset;
	JLabel bgimg;
	JLabel me;

	public LoginWindows() {
		// 功能调用
		gianover();
		initLayout();
		initListener();
		initWindows();

	}

	public void gianover() {
		// 初始化成员变量
		img = new JLabel(new ImageIcon("img/t.jpg"));
		username = new JTextField("小柚子");
		password = new JPasswordField("youz.space");
		login = new JButton("登录");
		reset = new JButton("重置");
		bgimg = new JLabel(new ImageIcon("img/bg.jpg"));
		me = new JLabel("关于我们");
		me.setForeground(Color.BLUE);
		me.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

	}

	public void initLayout() {
		// 初始化布局 绝对布局
		setLayout(null);
		img.setBounds(100, 50, 100, 100);
		username.setBounds(50, 160, 200, 40);
		password.setBounds(50, 220, 200, 40);
		login.setBounds(50, 280, 200, 40);
		reset.setBounds(50, 340, 200, 40);
		bgimg.setBounds(0, 0, 300, 480);
		me.setBounds(200, 400, 200, 30);
		add(img);
		add(username);
		add(password);
		add(login);
		add(reset);
		add(me);
		add(bgimg);

	}

	public void initListener() {
		// 初始化事件处理
		login.addActionListener(new ActionListener() {
			// 注册监听器对象
			@Override
			public void actionPerformed(ActionEvent e) {
				// 事件处理 登录页
				String name = username.getText();
				String mima = password.getText();
				if ("小柚子".equals(name) && "youz.space".equals(mima)) {

					new MainFrame(); // 生成主窗口
					dispose(); // 关闭登录窗口

				} else {

					JOptionPane.showMessageDialog(null, "密码账户错误");
					username.setText(""); // 更安全
					password.setText("");

				}

			}
		});

		reset.addActionListener(new ActionListener() {
			// 注册监听器对象
			@Override
			public void actionPerformed(ActionEvent e) {
				// 事件处理 重置密码窗口 重置登录窗口
				username.setText(null);
				password.setText(null);
			}
		});

		me.addMouseListener(new MouseAdapter() {
			// 注册监听器对象
			@Override
			public void mouseClicked(MouseEvent e) {
				// 网页跳转
				try {
					Desktop.getDesktop().browse(new URI("https://go.youz.space"));
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "无法打开浏览器", "错误", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

	}

	public void initWindows() {
		// 初始化窗口设置
		setSize(300, 480); // 窗口大小
		setResizable(false); // 固定窗口
		setLocationRelativeTo(null); // 设置居中
		setDefaultCloseOperation(3); // 设置关闭方式 点x退出
		setTitle("记账本登录"); // 设置窗口标题
		setVisible(true); // 设置窗口可见
	}

	public static void main(String[] args) {
		// 测试方法
		new LoginWindows();

	}

}




