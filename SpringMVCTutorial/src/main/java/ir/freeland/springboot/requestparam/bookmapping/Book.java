package ir.freeland.springboot.requestparam.bookmapping;

public class Book {
	
	    private long id;
	    private double price;
		private String title;
	    private String author;
	    private String publisher;
	    
	    
	    public Book() {}

		public Book(int id, int price, String title, String author, String publisher) {
			super();
			this.id = id;
			this.price = price;
			this.title = title;
			this.author = author;
			this.publisher = publisher;
		}
		
		public long getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	    public double getPrice() {
				return price;
		}
		public void setPrice(int price) {
				this.price = price;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

	

}
