package com.sec.Utils.FILE;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: Utils
 * @description:
 * @author: 0range
 * @create: 2021-03-05 16:31
 **/


public class Bytes2Class {
    //byte[] to .class
    public static void byte2class(byte[] bytes, String filepath)  {
        File file = new File(filepath);

        try {
            if(!file.exists() && file.isDirectory()){
                file.mkdirs();
            }

            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            bos.write(bytes);
            bos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
