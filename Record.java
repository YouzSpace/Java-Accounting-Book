package book;

public class Record {
	int id;
	String date;
	String category;
	double amount;
	String description;

	public Record(int id, String date, String category, double amount, String description) {
		this.id = id;
		this.date = date;
		this.category = category;
		this.amount = amount;
		this.description = description;
	}

}

// Ҫ�����һ�� Java ������ʾ���˱�ϵͳ�еĲ����¼��������Ҫ��������������
// 1������ΪRecord
// ���������ֶΣ�
// id����¼ ID����������
// date���������ڣ��ַ������ͣ���ʽ��YYYY-MM-DD��
// category����������ַ������ͣ��磺��������ͨ������ȣ�
// amount�����׽�˫���ȸ�������
// description�������������ַ�������
// 2�����췽��
// �ṩһ��ȫ�������췽����������˳���ʼ���ֶΣ�
// public Record(int id, String date, String category, double amount, String
// description)