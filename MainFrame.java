package book;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame {
	JButton  addBT;
	JButton delBT;
	JButton updateBT;
	JButton  refreshBT;
	JLabel bgimg;
	
	
	
	

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
		addBT = new JButton("增加记录");
		delBT = new JButton("删除记录");
		updateBT = new JButton("修改记录");
		refreshBT = new JButton("刷新");
		bgimg = new JLabel(new ImageIcon("img/1bg.jpg"));
	}
	
	public void initLayout() {
		setLayout(null);
		addBT.setBounds(150, 60, 100, 40);
		delBT.setBounds(350, 60, 100, 40);
		updateBT.setBounds(550, 60, 100, 40);
		refreshBT.setBounds(750, 60, 100, 40);
		bgimg.setBounds(0, 0, 1000, 1000);
		add(addBT);
		add(delBT);
		add(updateBT);
		add(refreshBT);
		add(bgimg);
	}
	
	




	public void initFrame() {
		setSize(1000, 800);// 大小设置
		setResizable(false);// 用户不能调整窗口大小
		setLocationRelativeTo(null);// 设置居中
		setDefaultCloseOperation(3);// 设置关闭方式，点击x直接退出
		setTitle("消费记录");// 设置窗口标题
		setVisible(true);// 设置串口可见
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}

}
