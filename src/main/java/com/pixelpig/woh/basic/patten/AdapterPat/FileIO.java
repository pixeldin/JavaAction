package com.pixelpig.woh.basic.patten.AdapterPat;

import java.io.IOException;

/**
 * Create by pixelpig
 * 2019/8/8
 */
public interface FileIO {
    void readFromFile(String filename) throws IOException;

    void writeToFile(String filename) throws IOException;

    void setValue(String key, String value);

    String getValue(String key);

}
