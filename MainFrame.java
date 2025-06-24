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
	// 表格数据
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
		addBT = new JButton("增加记录");
		delBT = new JButton("删除记录");
		updateBT = new JButton("修改记录");
		refreshBT = new JButton("刷新");
		bgimg = new JLabel(new ImageIcon("img/1bg.jpg"));
		// 表格标题
		String[] title = {"ID","交易日期","交易类别","交易金额","交易描述"};
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
		setSize(1000, 800);// 大小设置
		setResizable(false);// 用户不能调整窗口大小
		setLocationRelativeTo(null);// 设置居中
		setDefaultCloseOperation(3);// 设置关闭方式，点击x直接退出
		setTitle("消费记录");// 设置窗口标题
		setVisible(true);// 设置窗口可见
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}

}
