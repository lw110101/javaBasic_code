package user_book;

public class Book {

	String bName;
	String actor;
	String press;
	double price;
	int bNo;
	String date;
	public Book(String bName, String actor, String press, double price, int bNo, String date) {
	
		this.bName = bName;
		this.actor = actor;
		this.press = press;
		this.price = price;
		this.bNo = bNo;
		this.date = date;
	}
	
	@Override
	public String toString() {
		
		return "����:"+this.bName+"  ����:"+this.actor+"  ������:"+this.press+"  �۸�:"+this.press
				+"  ���:"+this.bNo+"  ��������:"+this.date;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}

