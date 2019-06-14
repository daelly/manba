package com.daelly.manba.judge.utils;

import java.util.UUID;

public class UniqueNameGenerator {

    public static String gen(int length) {
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replaceAll("-", "");
        if (uuid.length() > length) {
            uuid = uuid.substring(0, length);
        }

        return uuid.toLowerCase();
    }
}
