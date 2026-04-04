public class Initializer {

    public static void main(String[] args) {

        AppServer legacyAppUI = new LegacyAppUI();
        legacyAppUI.displayData(new XMLData());

        AppServer modernAppUI = new ModernUiAdapter();
        modernAppUI.displayData(new XMLData());
    }
}
