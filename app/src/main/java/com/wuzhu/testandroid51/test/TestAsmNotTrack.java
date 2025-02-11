package com.wuzhu.testandroid51.test;

import com.wuzhu.libasmtrack.AsmTraceStack;
import com.wuzhu.libasmtrack.NotTrace;

@NotTrace
public class TestAsmNotTrack {

    /**
     * 插桩前
     * MAXSTACK = 2
     *     MAXLOCALS = 2
     */
    private void test1() {
        int a = 111;
        System.out.println(a);
    }

    /**
     * 插桩后
     * MAXSTACK = 2
     *     MAXLOCALS = 3
     */
    private void test2() {
        String newName = AsmTraceStack.beginTrace("test2__");
        int a = 111;
        System.out.println(a);
        AsmTraceStack.endTrace(newName);
    }

}
