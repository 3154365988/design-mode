package com.sun.mode.chain;

public class TempResponse extends ResponseAbs {
    private String word;

    public TempResponse(String word) {
        this.word = word;
    }

    public String info() {
        return word;
    }
}
