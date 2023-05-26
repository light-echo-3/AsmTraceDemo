package com.wuzhu.testandroid51.test;

import android.util.Log;

public class TestAsm {
    private static final String TAG = "TestAsm";
    private boolean test;

    private int testThrow() throws Exception {
        System.out.println("testThrow1");
        if (test) {
            System.out.println("testThrow2");
            throw new Exception();
        } else {
            System.out.println("testThrow3");
        }
        System.out.println("testThrow4");
        return 666;
    }


    private void testException1() {
        try {
            testException2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void testException2() {
        Log.d(TAG, "testException2: 1--");
        String s = null;
        String s2 = s;
        boolean e = s2.equals("s");
        Log.d(TAG, "testException2: 2" + e);
    }

    private void testException3() {
        Log.d(TAG, "testException3: 1--");
        String[] ss = {"1"};
        String s = ss[3];
        Log.d(TAG, "testException3: 2" + s);
    }
}
