
	// 属性
	
class Book{
	private String title;
	private String author;
	private double price;
	private String publisher;
	// 构造方法
	
	Book(String title,String author,double price,String publisher){
		this.title = title;
		this.author = author;
		this.price=price;
		this.publisher=publisher;
	}
	
	
	// getter
	
	
	String getTitle(){
		return title;
	}
	String getAuthor(){
		return author;
	}
	double getPrice(){
		return price;
	}
	String getPublisher(){
		return publisher;
	}
	// setter
	
	void setTitle(String title){
		this.title=title;
	}
	void setAuthor(String author){
		this.author=author;
	}
	void appendAuthor(String author){
		this.author=this.author + " " + author;
	}
	double getDiscount(double discount){
		return this.price * discount;
	}
	
	// 覆写一个方法
	@Override
	public String toString() {
		return String.format("《%s》by %s", title, author);
	}
}

