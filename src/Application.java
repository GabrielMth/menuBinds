import java.awt.EventQueue;

import controller.TelaController;
import utils.LookAndFeelUtil;
import utils.ThemeType;

public class Application {
	public static void main(String[] args) {
        LookAndFeelUtil.startLookAndFeel(ThemeType.INTELLIJ.description);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaController telaController = new TelaController();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
