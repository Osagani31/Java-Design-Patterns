package process;

import enums.Brand;
import process.products.HtcPhone;
import process.products.GooglePhone;

public class AndroidFactory implements OsFactory{

    public Phone build(Brand brand){
            switch (brand){
                case HTC:
                    return new  HtcPhone();

                case GOOGLE:
                    return  new  GooglePhone();
                default:
                    return null;

            }
    }
}
