package com.pixelpig.woh.basic.patten.AdapterPat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Create by pixelpig
 * 2019/8/8
 */
/*
    适配器, 封装了Properties工具类方法
    调用方不需要考虑或者了解java.util.Properties的实现, 只需
    调用改实现类即可
 */
public class FileProperties extends Properties implements FileIO{
    @Override
    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream(filename), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key, "");
    }
}
