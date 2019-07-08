package threadTest;

public class DoubleLockCheck {

	private static DoubleLockCheck lockCheck;

	public DoubleLockCheck() {
	}

	public static DoubleLockCheck getInstance() {
		if (lockCheck == null) {
			synchronized (DoubleLockCheck.class) {
				if (lockCheck == null) {
					lockCheck = new DoubleLockCheck();
				}
			}
		}
		return lockCheck;
	}
}
