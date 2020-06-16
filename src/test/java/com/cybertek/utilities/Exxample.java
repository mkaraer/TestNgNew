package com.cybertek.utilities;

import com.cybertek.utilities.utilities.Singleton;

public class Exxample {
    public static void main(String[] args) {
        String one= Singleton.get();
        System.out.println("one:"+one);

        String too= Singleton.get();
        System.out.println("too: "+too);

        String tree= Singleton.get();
        System.out.println("tree: "+tree);
    }
}
