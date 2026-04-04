public class ModernUiAdapter implements AppServer {

    private final ModernAppUI modernAppUI;

    public  ModernUiAdapter(){

        this.modernAppUI=new ModernAppUI();
    }

    @Override
    public void displayData(XMLData xmlData) {
        JsonData Data = converter(xmlData);
        modernAppUI.displayData(Data);
    }

    private JsonData converter(XMLData xmlData) {
        return new JsonData();
    }

}
