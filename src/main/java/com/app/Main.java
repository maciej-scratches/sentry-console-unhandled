package com.app;

import io.sentry.Sentry;

public class Main {
    public static void main(String[] args) {
        Sentry.init(options -> {
            options.setDsn("https://502f25099c204a2fbf4cb16edc5975d1@o447951.ingest.sentry.io/5428563");
            options.setDebug(true);
        });
        var x = 1 / 0;
        System.out.println(x);
    }
}
