package springDemo;

public class Librarian {

	
	private int librarianSal;
	private String librarianName;
	public Librarian(int librarianSal, String librarianName) {
	super();
	this.librarianSal = librarianSal;
	this.librarianName = librarianName;
	}
	public Librarian()
	{
		librarianSal=10000;
		librarianName="bookLibrary";
	}
	public int getLibrarianSal() {
	return librarianSal;
	}
	public void setLibrarianSal(int librarianSal) {
	this.librarianSal = librarianSal;
	}
	public String getLibrarianName() {
	return librarianName;
	}
	public void setLibrarianName(String librarianName) {
	this.librarianName = librarianName;
	}
	@Override
	public String toString() {
	return "Librarian [librarianSal=" + librarianSal + ", librarianName=" + librarianName + "]";
	}
}	

	


