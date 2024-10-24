public class ExcecoesUtilitario {
	public static void checkCondition (boolean cond, String msg) {
		if (cond) {
			try {
				throw new Exception (msg);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}