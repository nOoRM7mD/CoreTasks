package com.example.lenovo.coretasks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.mylibrary.MathOperationClass;
import com.example.mylibrary.MathOpreration;

public class MainActivity extends AppCompatActivity {
    MathOperationClass obj;
    int mathResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*obj = new MathOperationClass(this);
        obj.getBtn().setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mathResult = MathOpreration.doOperation(Integer.parseInt(obj.getOp1().getText().toString()), Integer.parseInt(obj.getOp2().getText().toString()));
                obj.getResult().setText(mathResult);
            }
        });*/
        //..................custom listener example
      MyCustomListener customListener=new MyCustomListener();

        //implement listener callback
        customListener.setListener(new MyCustomListener.myBasicListenerInterface() {
            @Override
            public void onAction(String action) {
                Log.d("MainListener ",  "value is" + action);
            }
        });
    }
}
