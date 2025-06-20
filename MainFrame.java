package book;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	JButton  addBT;
	JButton delBT;
	JButton updateBT;
	JButton  refreshBT;
	
	
	
	

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
	}
	
	public void initLayout() {
		setLayout(null);
		addBT.setBounds(150, 60, 100, 40);
		delBT.setBounds(350, 60, 100, 40);
		updateBT.setBounds(550, 60, 100, 40);
		refreshBT.setBounds(750, 60, 100, 40);
		add(addBT);
		add(delBT);
		add(updateBT);
		add(refreshBT);
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
