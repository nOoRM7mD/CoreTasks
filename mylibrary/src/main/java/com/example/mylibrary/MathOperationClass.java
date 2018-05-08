package com.example.mylibrary;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by lenovo on 3/6/2018.
 */

public class MathOperationClass extends LinearLayout {
    EditText op1;
    EditText op2;
    TextView result;
    Button btn;
    public EditText getOp1() {
        return op1;
    }

    public EditText getOp2() {
        return op2;
    }

    public TextView getResult() {
        return result;
    }

    public Button getBtn() {
        return btn;
    }


    public MathOperationClass(Context context) {
        super(context);
        op1=(EditText)findViewById(R.id.operator1);
        op2=(EditText)findViewById(R.id.operator2);
        result=(TextView)findViewById(R.id.result);
        btn=(Button)findViewById(R.id.button);
    }

    public MathOperationClass(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        op1=(EditText)findViewById(R.id.operator1);
        op2=(EditText)findViewById(R.id.operator2);
         result=(TextView)findViewById(R.id.result);
         btn=(Button)findViewById(R.id.button);

    }
}
