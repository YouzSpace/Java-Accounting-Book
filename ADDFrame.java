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
	// ��ť
	JLabel bq1, bq2, bq3, bq4;
	JTextField tf1, tf2, tf3;
	JButton bt1, bt2;
	JComboBox<String> list;

	public ADDFrame() {
		// ���췽��
		initComponent();
		initFrame();
		initLayout();
		initListener();

	}

	public void initComponent() {
		/*
		 * ��ʼ�����׼�¼��������UI��� ���������ñ�ǩ������򡢰�ť�������˵������ڼ�¼������Ϣ
		 */
		bq1 = new JLabel("����ʱ��");
		bq2 = new JLabel("�������");
		bq3 = new JLabel("���׽��");
		bq4 = new JLabel("��������");

		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();

		bt1 = new JButton("�ύ");
		bt2 = new JButton("ȡ��");

		String[] s = { "��", "ס", "��", "��ͨ", "����", "����" };
		list = new JComboBox<>(s);

	}

	public void initLayout() {
		/*
		 * ��ʼ�������� ����2��5�е����񲼾֣�������Ϊ10���� ��˳����ӱ�ǩ���ı����б�Ͱ�ť���
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
		// �¼�����
		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ToolsJDBC.add(tf1.getText(), (String) list.getSelectedItem(), tf2.getText(), tf3.getText());
				JOptionPane.showMessageDialog(null, "�ɹ�");

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
		// ��ʼ����������
		setSize(300, 200); // ���ڴ�С
		setResizable(false); // �̶�����
		setLocationRelativeTo(null); // ���þ���
		setDefaultCloseOperation(2); // ���ùرշ�ʽ
		setTitle("x���Ѽ�¼"); // ���ô��ڱ���
		setVisible(true); // ���ô��ڿɼ�
	}

	public static void main(String[] args) {
		new ADDFrame();
	}
}
