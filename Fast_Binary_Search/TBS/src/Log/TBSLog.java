package Log;

public class TBSLog {
	public static void l(String log) {
		System.out.println("TSB:LOG time stamp : " + System.currentTimeMillis() + " LOG : " + log);
	}
	public static void d(String log) {
		System.out.println("TSB:DEBUG time stamp : " + System.currentTimeMillis() + " LOG : " + log);
	}
	public static void ex(String log) {
		System.out.println("TSB:EXCEPTION time stamp : " + System.currentTimeMillis() + " LOG : " + log);
	}
	public static void er(String log) {
		System.out.println("TSB:ERROR time stamp : " + System.currentTimeMillis() + " LOG : " + log);
	}
}
