package db;

public class DbException extends RuntimeException {
	private static final long srialVersionUID = 1L;
	
	public DbException (String msg) {
		super(msg);
	}
}
