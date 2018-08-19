package com.cdb.hibernate;

import java.util.Random;

public class GetData {


    public static String platform()
    {
        String[] list = new String[] { "PC", "XBOX", "PS3", "SWITCH", "Mobile" };
        Random r = new Random();
        String result = list[r.nextInt(list.length)];
        return result;
    }

    public static int price()
    {
        Random r = new Random();
        int result = r.nextInt(500);
        return result;
    }


}
