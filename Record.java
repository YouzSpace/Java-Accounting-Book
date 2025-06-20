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

// 要求：设计一个 Java 类来表示记账本系统中的财务记录。该类需要满足以下条件：
// 1）类名为Record
// 包含以下字段：
// id：记录 ID，整数类型
// date：交易日期，字符串类型（格式：YYYY-MM-DD）
// category：交易类别，字符串类型（如：餐饮、交通、购物等）
// amount：交易金额，双精度浮点类型
// description：交易描述，字符串类型
// 2）构造方法
// 提供一个全参数构造方法，按以下顺序初始化字段：
// public Record(int id, String date, String category, double amount, String
// description)