package exception;

public class Err {
	public void a() {
		b();
	}
	public void b() {
		a();
	}
}
