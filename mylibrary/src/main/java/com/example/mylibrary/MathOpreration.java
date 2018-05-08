package com.example.mylibrary;

import android.content.Context;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;

/**
 * Created by lenovo on 3/6/2018.
 */

public class MathOpreration{
int op1,op2;

    public MathOpreration(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    public static int doOperation(int op1, int op2) {
        int sum = 0;
        String option = null;
        switch (option) {
            case "+":
                sum = op1 + op2;
                break;
            case "-":
                sum = op1- op2;
                break;
            case "*":
                sum = op1* op2;
                break;
        }
        return sum;
    }
}
