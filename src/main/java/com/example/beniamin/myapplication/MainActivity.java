package com.example.beniamin.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bc,bp,bmi,bmu,bd,be;

    EditText etNum1;



    float mValueOne , mValueTwo ;

    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;

    String oper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.editText);

        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);
        b9 = (Button) findViewById(R.id.btn9);
        b0 = (Button) findViewById(R.id.btn0);
        bp = (Button) findViewById(R.id.btnp);
        bmi = (Button) findViewById(R.id.btnmi);
        bmu = (Button) findViewById(R.id.btnmu);
        bd = (Button) findViewById(R.id.btnd);
        bc = (Button) findViewById(R.id.btnc);
        be = (Button) findViewById(R.id.btne);




        etNum1 = (EditText) findViewById(R.id.editText);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum1.setText(etNum1.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                etNum1.setText(etNum1.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum1.setText(etNum1.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum1.setText(etNum1.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum1.setText(etNum1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum1.setText(etNum1.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum1.setText(etNum1.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum1.setText(etNum1.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum1.setText(etNum1.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum1.setText(etNum1.getText()+"0");
            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // if (etNum1 == null){
                //    etNum1.setText("");
                // }else {
                mValueOne = Float.parseFloat(etNum1.getText() + "");
                mAddition = true;
                etNum1.setText(null);
            }

        });

        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(etNum1.getText() + "");
                mSubtract = true;
                etNum1.setText(null);

            }
        });

        bmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(etNum1.getText() + "");
                mMultiplication = true;
                etNum1.setText(null);
            }

        });

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                mValueOne=Float.parseFloat(etNum1.getText()+"");
                mDivision=true;
                etNum1.setText(null);
            }
        });

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(etNum1.getText() + "");

                if (mAddition == true){

                    etNum1.setText(mValueOne + mValueTwo +"");
                    mAddition=false;

                }


                if (mSubtract == true){
                    etNum1.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    etNum1.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    etNum1.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                }
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum1.setText("");
            }
        });




    }
}
