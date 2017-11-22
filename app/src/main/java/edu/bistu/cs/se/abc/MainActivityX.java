package edu.bistu.cs.se.abc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivityX extends AppCompatActivity {
    double f1=0,f2=0;
    int opA=0,opB=0;
    boolean Equal=false;

    EditText textA;
    EditText textB;
    RadioButton radioButtonA;
    RadioButton radioButtonB;
    RadioButton radioButtonC;
    RadioButton radioButtonD;
    Button button22;
    Button button23;
    Button button24;
    Button button25;
    Button button26;
    Button button27;
    Button button28;
    Button button29;
    Button button30;
    Button button31;
    Button button32;
    Button button33;
    Button button34;
    Button button35;
    RadioGroup group3;
    RadioGroup group4;

    View.OnClickListener Lisenter2=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.radioButtonA:
                    opA=1;
                    Equal=false;
                    break;
                case R.id.radioButtonB:
                    opA=2;
                    Equal=false;
                    break;
                case R.id.radioButtonC:
                    opB=1;
                    Equal=false;
                    break;
                case R.id.radioButtonD:
                    opB=2;
                    Equal=false;
                    break;
                case R.id.button22:
                    if (Equal) {
                        textA.setText(null);
                        Equal = false;
                    }
                    String String1 = textA.getText().toString();
                    String1 += "1";
                    textA.setText(String1);
                    break;
                case R.id.button23:
                    if (Equal) {
                        textA.setText(null);
                        Equal = false;
                    }
                    String String2 = textA.getText().toString();
                    String2 += "2";
                    textA.setText(String2);
                    break;
                case R.id.button24:
                    if (Equal) {
                        textA.setText(null);
                        Equal = false;
                    }
                    String String3 = textA.getText().toString();
                    String3 += "3";
                    textA.setText(String3);
                    break;
                case R.id.button25:
                    if (Equal) {
                        textA.setText(null);
                        Equal = false;
                    }
                    String String4 = textA.getText().toString();
                    String4 += "4";
                    textA.setText(String4);
                    break;
                case R.id.button26:
                    if (Equal) {
                        textA.setText(null);
                        Equal = false;
                    }
                    String String5 = textA.getText().toString();
                    String5 += "5";
                    textA.setText(String5);
                    break;
                case R.id.button27:
                    if (Equal) {
                        textA.setText(null);
                        Equal = false;
                    }
                    String String6 = textA.getText().toString();
                    String6 += "6";
                    textA.setText(String6);
                    break;
                case R.id.button28:
                    if (Equal) {
                        textA.setText(null);
                        Equal = false;
                    }
                    String String7 = textA.getText().toString();
                    String7 += "7";
                    textA.setText(String7);
                    break;
                case R.id.button29:
                    if (Equal) {
                        textA.setText(null);
                        Equal = false;
                    }
                    String String8 = textA.getText().toString();
                    String8 += "8";
                    textA.setText(String8);
                    break;
                case R.id.button30:
                    if (Equal) {
                        textA.setText(null);
                        Equal = false;
                    }
                    String String9 = textA.getText().toString();
                    String9 += "9";
                    textA.setText(String9);
                    break;
                case R.id.button31:
                    if (Equal) {
                        textA.setText(null);
                        Equal = false;
                    }
                    String String0 = textA.getText().toString();
                    String0 += "0";
                    textA.setText(String0);
                    break;
                case R.id.button32:
                    if (Equal) {
                        textA.setText(null);
                        Equal = false;
                    }
                    String StringP = textA.getText().toString();
                    if (StringP.indexOf(".") != -1 || StringP.equals(null)) {
                    }
                    StringP += ".";
                    textA.setText(StringP);
                    break;
                case R.id.button33:
                    String StringEquel = textA.getText().toString();
                    if (StringEquel.equals(null)) {
                        return;
                    }
                    if(opA==1&&opB==1){
                        f1=Double.valueOf(StringEquel);
                        textB.setText(String.valueOf(f1));
                    }
                    if(opA==1&&opB==2){
                        f2=Double.valueOf(StringEquel);
                        f1=f2*1.8+32;
                        textB.setText(String.valueOf(f1));
                    }
                    if(opA==2&&opB==1){
                        f2=Double.valueOf(StringEquel);
                        f1=(f2-32)/1.8;
                        textB.setText(String.valueOf(f1));
                    }
                    if(opA==2&&opB==2){
                        f1=Double.valueOf(StringEquel);
                        textB.setText(String.valueOf(f1));
                    }
                    Equal=true;
                    break;
                case R.id.button34:
                    textA.setText(null);
                    textB.setText(null);
                    Equal = false;
                    break;
                case R.id.button35:
                    String StringX = textA.getText().toString();
                    if (StringX.length() > 0) {
                        textA.setText(StringX.substring(0, StringX.length() - 1));
                    }
                    String StringY = textB.getText().toString();
                    if (StringY.length() > 0) {
                        textB.setText(StringY.substring(0, StringY.length() - 1));
                    }
                    Equal = false;
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_x);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textA=(EditText)findViewById(R.id.editText6);
        textB=(EditText)findViewById(R.id.editText5);
        radioButtonA=(RadioButton)findViewById(R.id.radioButtonA);
        radioButtonA.setOnClickListener(Lisenter2);
        radioButtonB=(RadioButton)findViewById(R.id.radioButtonB);
        radioButtonB.setOnClickListener(Lisenter2);
        radioButtonC=(RadioButton)findViewById(R.id.radioButtonC);
        radioButtonC.setOnClickListener(Lisenter2);
        radioButtonD=(RadioButton)findViewById(R.id.radioButtonD);
        radioButtonD.setOnClickListener(Lisenter2);
        button22=(Button)findViewById(R.id.button22);
        button22.setOnClickListener(Lisenter2);
        button23=(Button)findViewById(R.id.button23);
        button23.setOnClickListener(Lisenter2);
        button24=(Button)findViewById(R.id.button24);
        button24.setOnClickListener(Lisenter2);
        button25=(Button)findViewById(R.id.button25);
        button25.setOnClickListener(Lisenter2);
        button26=(Button)findViewById(R.id.button26);
        button26.setOnClickListener(Lisenter2);
        button27=(Button)findViewById(R.id.button27);
        button27.setOnClickListener(Lisenter2);
        button28=(Button)findViewById(R.id.button28);
        button28.setOnClickListener(Lisenter2);
        button29=(Button)findViewById(R.id.button29);
        button29.setOnClickListener(Lisenter2);
        button30=(Button)findViewById(R.id.button30);
        button30.setOnClickListener(Lisenter2);
        button31=(Button)findViewById(R.id.button31);
        button31.setOnClickListener(Lisenter2);
        button32=(Button)findViewById(R.id.button32);
        button32.setOnClickListener(Lisenter2);
        button33=(Button)findViewById(R.id.button33);
        button33.setOnClickListener(Lisenter2);
        button34=(Button)findViewById(R.id.button34);
        button34.setOnClickListener(Lisenter2);
        button35=(Button)findViewById(R.id.button35);
        button35.setOnClickListener(Lisenter2);
        group3=(RadioGroup)findViewById(R.id.radioGroup3);
        group3.setOnClickListener(Lisenter2);
        group4=(RadioGroup)findViewById(R.id.radioGroup4);
        group4.setOnClickListener(Lisenter2);

    }

}
