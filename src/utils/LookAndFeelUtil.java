package utils;

import static com.formdev.flatlaf.FlatLaf.registerCustomDefaultsSource;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LookAndFeelUtil {

    private LookAndFeelUtil() {
        
    }
    
    public static void startLookAndFeel() {
        try {
            String lf = UIManager.getSystemLookAndFeelClassName();
            UIManager.setLookAndFeel(lf);
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    
    public static void startLookAndFeel(String themeName) {
        try {
            registerCustomDefaultsSource("themes");
            ThemeType.startTheme(themeName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
