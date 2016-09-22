package library.daos;
import java.util.List;

import library.interfaces.daos.IBookDAO;
import library.interfaces.daos.IBookHelper;
import library.interfaces.entities.IBook;
public class BookDAO implements IBookDAO{

	private IBookHelper helper[]= new IBookHelper[3];
	private IBook book;
	public int id1;
	public String book1;
	public String title1,call1;
	
	static int i=0;
	public BookDAO()
	{
		//if(helper==null)
			//throw new IllegalArgumentException(" helper is null");
	}
	
	
	
	
	
	public String bookDetail[][]=new String[3][3];
	

	public IBook addBook(String author, String title, String callNo) {
				
				bookDetail[i][0]=author;
				bookDetail[i][1]=title;
				bookDetail[i][2]=callNo;
				i++;
				//helper[i]=(IBookHelper) helper[i].makeBook(author, title, callNo, i);
				
		return null;
	}
	
	
	
	
	

	public IBook getBookByID(int id)
	{
		if(id==0)
			title1=bookDetail[0][1];
		else if(id==1)
			title1=bookDetail[1][1];
		else if(id==2)
			title1=bookDetail[2][1];
		else
			title1="No such book found";
		
		return null;
	}

	public List<IBook> listBooks() {
		
		return null;
	}

	public List<IBook> findBooksByAuthor(String author) {
		for(int i=0; i<3; i++)
		{
			if(bookDetail[i][0].equals(author))
				book1=bookDetail[i][0];
		}
		
		return null;
	}

	public List<IBook> findBooksByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<IBook> findBooksByAuthorTitle(String author, String title) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
