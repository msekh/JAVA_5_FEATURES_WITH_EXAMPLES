package EnuMUsingInterfaceEx;


interface BookAttributes {
	public double getPrice();

	public int getPages();

	public String getBookName();
}

enum Book implements BookAttributes {
	HARRY_POTTERS("Harry Potter", 856, 12.99), THE_SOULFORCE("The Soulforce", 123,
			12.11), GAME_OF_THRONES("Game of Thrones", 567, 10.00), DRAGONLANCE("Dragonlance", 456, 6.77);

	private final String bookName;
	private final int pages;
	private final double price;

	
	private Book(String bookName, int pages, double price) {
		this.bookName = bookName;
		this.pages = pages;
		this.price = price;
	}

	@Override
	public double getPrice() {
		return this.price ;
	}

	@Override
	public int getPages() {
		return this.pages;
	}

	@Override
	public String getBookName() {
		return this.bookName;
	}

}

public class EnumWithInterfaceTeest {
	public static void main(String args[]) {
		
		Book []books=Book.values();
		for(Book book :books  ) {
			System.out.println("Book Name: "+ book.getBookName()+" "+" Number of pages: "+
		book.getPages()+" Price: "+book.getPrice());
		}
	}
}
