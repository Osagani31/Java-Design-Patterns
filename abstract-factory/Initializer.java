import enums.Brand;
import enums.OsType;
import process.AbstractPhoneFactory;
import process.OsFactory;
import process.Phone;

public class Initializer {

    public static void main(String[] args) {
        OsFactory osFactory = AbstractPhoneFactory.getFactory(OsType.ANDROID);
        Phone phone = osFactory.build(Brand.GOOGLE);
        phone.print();

        Phone phone1 = AbstractPhoneFactory.getFactory(OsType.IOS).build(Brand.APPLE);
        phone1.print();

    }

}
