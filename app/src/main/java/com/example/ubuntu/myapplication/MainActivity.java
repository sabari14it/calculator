package com.example.ubuntu.myapplication;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= (EditText) findViewById(R.id.editText);
        Button button= (Button) findViewById(R.id.button6);
        button.setOnClickListener(new MyButtonListner());
    }
    /*public void oneFun(View v){
        String s=editText.getText().toString();
        if(s!=null){
            editText.setText(s+"1");
        }
        else {
            editText.setText("1");
        }
    }
    public void twoFun(View v){
        String s=editText.getText().toString();
        if(s!=null){
            editText.setText(s+"2");
        }
        else {
            editText.setText("2");
        }
    }
    public void threeFun(View v){
        String s=editText.getText().toString();
        if(s!=null){
            editText.setText(s+"3");
        }
        else {
            editText.setText("3");
        }

    }
    public void addFun(View v){
        String s=editText.getText().toString();
        if(s!=null){
            editText.setText(s+"+");
        }
        else {
            editText.setText("+");
        }

    }
    public void equalFun(View v){
        String s=editText.getText().toString();
        String[] a=s.split("\\+");
        int arg1= Integer.parseInt(a[0]);
        int arg2=Integer.parseInt(a[1]);
        int res=arg1+arg2;
        editText.setText(Integer.toString(res));

    }*/

    class MyButtonListner implements Button.OnClickListener
    {
        @Override
        public void onClick(View view) {
            String s=editText.getText().toString();
            if(s!=null){
                editText.setText(s+"1");
            }
            else {
                editText.setText("1");
            }
        }
    }

}
