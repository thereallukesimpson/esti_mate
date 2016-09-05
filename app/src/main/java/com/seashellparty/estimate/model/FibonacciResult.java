package com.seashellparty.estimate.model;

import java.util.List;

/**
 * Created by lsimpson on 5/09/16.
 */
public class FibonacciResult {
    private int fibonacciResult;
    private int[] fibonacciNumbers = {1, 2, 3, 5, 8, 13, 21};
    private List<ApiCall> mApiCalls;
    private List<Dialog> mDialogs;
    private List<Screen> mScreens;

    public FibonacciResult(List<ApiCall> apiCalls, List<Dialog> dialogs, List<Screen> screens) {
        this.mApiCalls = apiCalls;
        this.mDialogs = dialogs;
        this.mScreens = screens;
    }

    public int getFibonacciResult() {
        return fibonacciResult;
    }
}
