package process;

import enums.OsType;

public class AbstractPhoneFactory {

    public static OsFactory getFactory(OsType osType){

        switch (osType){
            case IOS:
                return new IosFactory();
            case ANDROID:
                return new AndroidFactory();
            default:
                return null;
        }
    }
}
