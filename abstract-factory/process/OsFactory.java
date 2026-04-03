package process;

import enums.Brand;

public interface OsFactory {

    public Phone build(Brand brand);

}
