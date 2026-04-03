package process;

import enums.Brand;
import process.products.ApplePhone;

public class IosFactory implements OsFactory{

    public Phone build(Brand brand){
        switch (brand){
            case APPLE:
                return new ApplePhone();
            default:
                return null;
        }
    }
}
