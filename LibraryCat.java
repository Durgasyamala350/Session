package springDemo;

public class LibraryCat {
	private String libCategory;
	private int libEntryFee;
	public LibraryCat(String libCategory, int libEntryFee) {
	super();
	this.libCategory = libCategory;
	this.libEntryFee = libEntryFee;
	}
	public LibraryCat()
	{
	libCategory="private";
	libEntryFee=100;
	}
	public String getLibCategory() {
	return libCategory;
	}
	public void setLibCategory(String libCategory) {
	this.libCategory = libCategory;
	}
	public int getLibEntryFee() {
	return libEntryFee;
	}
	public void setLibEntryFee(int libEntryFee) {
	this.libEntryFee = libEntryFee;
	}
	@Override
	public String toString() {
	return "LibraryCat [libCategory=" + libCategory + ", libEntryFee=" + libEntryFee + "]";
	}


	}


