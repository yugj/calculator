package com.yugj.calculator;

/**
 * Created by yugj on 2015/6/21.
 */
public class AddOperation extends Operation {
    @Override
    public Double execute() {
        return valueA + valueB;
    }
}
