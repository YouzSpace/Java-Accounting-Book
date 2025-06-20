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
		// ���ܵ���
		gianover();
		initLayout();
		initListener();
		initWindows();

	}

	public void gianover() {
		// ��ʼ����Ա����
		img = new JLabel(new ImageIcon("img/t.jpg"));
		username = new JTextField("С����");
		password = new JPasswordField("youz.space");
		login = new JButton("��¼");
		reset = new JButton("����");
		bgimg = new JLabel(new ImageIcon("img/bg.jpg"));
		me = new JLabel("��������");
		me.setForeground(Color.BLUE);
		me.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

	}

	public void initLayout() {
		// ��ʼ������ ���Բ���
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
		// ��ʼ���¼�����
		login.addActionListener(new ActionListener() {
			// ע�����������
			@Override
			public void actionPerformed(ActionEvent e) {
				// �¼����� ��¼ҳ
				String name = username.getText();
				String mima = password.getText();
				if ("С����".equals(name) && "youz.space".equals(mima)) {

					new MainFrame(); // ����������
					dispose(); // �رյ�¼����

				} else {

					JOptionPane.showMessageDialog(null, "�����˻�����");
					username.setText(""); // ����ȫ
					password.setText("");

				}

			}
		});

		reset.addActionListener(new ActionListener() {
			// ע�����������
			@Override
			public void actionPerformed(ActionEvent e) {
				// �¼����� �������봰�� ���õ�¼����
				username.setText(null);
				password.setText(null);
			}
		});

		me.addMouseListener(new MouseAdapter() {
			// ע�����������
			@Override
			public void mouseClicked(MouseEvent e) {
				// ��ҳ��ת
				try {
					Desktop.getDesktop().browse(new URI("https://go.youz.space"));
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "�޷��������", "����", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

	}

	public void initWindows() {
		// ��ʼ����������
		setSize(300, 480); // ���ڴ�С
		setResizable(false); // �̶�����
		setLocationRelativeTo(null); // ���þ���
		setDefaultCloseOperation(3); // ���ùرշ�ʽ ��x�˳�
		setTitle("���˱���¼"); // ���ô��ڱ���
		setVisible(true); // ���ô��ڿɼ�
	}

	public static void main(String[] args) {
		// ���Է���
		new LoginWindows();

	}

}




