package book;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends JFrame {
	JButton  addBT;
	JButton delBT;
	JButton updateBT;
	JButton  refreshBT;
	JLabel bgimg;
	JLabel bg;
	// �������
	DefaultTableModel dm;
	JTable tb;
	JScrollPane scroll;
	
	
	
	

	public MainFrame() {
		// ....
		initComponent();
		initLayout() ;
		initFrame();
		initListener();
	}
	
	public void initListener() {
		addBT.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new ADDFrame();
			}
		});
		
	}
	
	public  void  initComponent() {
		addBT = new JButton("���Ӽ�¼");
		delBT = new JButton("ɾ����¼");
		updateBT = new JButton("�޸ļ�¼");
		refreshBT = new JButton("ˢ��");
		bgimg = new JLabel(new ImageIcon("img/1bg.jpg"));
		// ������
		String[] title = {"ID","��������","�������","���׽��","��������"};
		dm = new DefaultTableModel(title,0);
		tb = new JTable();
		tb.setModel(dm);
		scroll = new JScrollPane(tb);
				
		
	}
	
	public void initLayout() {
		setLayout(null);
		addBT.setBounds(150, 60, 100, 40);
		delBT.setBounds(350, 60, 100, 40);
		updateBT.setBounds(550, 60, 100, 40);
		refreshBT.setBounds(750, 60, 100, 40);
		scroll.setBounds(150, 140, 700, 400);
		bgimg.setBounds(0, 0, 1000, 1000);
		add(addBT);
		add(delBT);
		add(updateBT);
		add(refreshBT);
		add(scroll);
		add(bgimg);
	}
	
	




	public void initFrame() {
		setSize(1000, 800);// ��С����
		setResizable(false);// �û����ܵ������ڴ�С
		setLocationRelativeTo(null);// ���þ���
		setDefaultCloseOperation(3);// ���ùرշ�ʽ�����xֱ���˳�
		setTitle("���Ѽ�¼");// ���ô��ڱ���
		setVisible(true);// ���ô��ڿɼ�
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}

}
