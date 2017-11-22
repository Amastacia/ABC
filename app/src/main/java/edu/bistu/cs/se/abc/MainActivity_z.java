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

public class MainActivity_z extends AppCompatActivity {
    String m1;
    int op1=0,op2=0;
    boolean EqualSign=false;
    EditText text1;
    EditText text2;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioButton radioButton5;
    RadioButton radioButton6;
    RadioButton radioButton7;
    RadioButton radioButton8;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button00;
    Button buttonPoint2;
    Button buttonEqual2;
    Button buttonQing;
    Button buttonTui;
    Button button11;
    RadioGroup group1;
    RadioGroup group2;

    View.OnClickListener Lisenter1=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.radioButton1:
                    op1=1;
                    EqualSign=false;
                    break;
                case R.id.radioButton2:
                    op1=2;
                    EqualSign=false;
                    break;
                case R.id.radioButton3:
                    op1=3;
                    EqualSign=false;
                    break;
                case R.id.radioButton4:
                    op1=4;
                    EqualSign=false;
                    break;
                case R.id.radioButton5:
                    op2=1;
                    EqualSign=false;
                    break;
                case R.id.radioButton6:
                    op2=2;
                    EqualSign=false;
                    break;
                case R.id.radioButton7:
                    op2=3;
                    EqualSign=false;
                    break;
                case R.id.radioButton8:
                    op2=4;
                    EqualSign=false;
                    break;
                case R.id.button7:
                    if (EqualSign) {
                        text1.setText(null);
                        EqualSign = false;
                    }
                    String String1 = text1.getText().toString();
                    String1 += "1";
                    text1.setText(String1);
                    break;
                case R.id.button8:
                    if (EqualSign) {
                        text1.setText(null);
                        EqualSign = false;
                    }
                    String String2 = text1.getText().toString();
                    String2 += "2";
                    text1.setText(String2);
                    break;
                case R.id.button9:
                    if (EqualSign) {
                        text1.setText(null);
                        EqualSign = false;
                    }
                    String String3 = text1.getText().toString();
                    String3 += "3";
                    text1.setText(String3);
                    break;
                case R.id.button10:
                    if (EqualSign) {
                        text1.setText(null);
                        EqualSign = false;
                    }
                    String String4 = text1.getText().toString();
                    String4 += "4";
                    text1.setText(String4);
                    break;
                case R.id.button12:
                    if (EqualSign) {
                        text1.setText(null);
                        EqualSign = false;
                    }
                    String String5 = text1.getText().toString();
                    String5 += "5";
                    text1.setText(String5);
                    break;
                case R.id.button13:
                    if (EqualSign) {
                        text1.setText(null);
                        EqualSign = false;
                    }
                    String String6 = text1.getText().toString();
                    String6 += "6";
                    text1.setText(String6);
                    break;
                case R.id.button14:
                    if (EqualSign) {
                        text1.setText(null);
                        EqualSign = false;
                    }
                    String String7 = text1.getText().toString();
                    String7 += "7";
                    text1.setText(String7);
                    break;
                case R.id.button15:
                    if (EqualSign) {
                        text1.setText(null);
                        EqualSign = false;
                    }
                    String String8 = text1.getText().toString();
                    String8 += "8";
                    text1.setText(String8);
                    break;
                case R.id.button16:
                    if (EqualSign) {
                        text1.setText(null);
                        EqualSign = false;
                    }
                    String String9 = text1.getText().toString();
                    String9 += "9";
                    text1.setText(String9);
                    break;
                case R.id.button17:
                    if (EqualSign) {
                        text1.setText(null);
                        EqualSign = false;
                    }
                    String String0 = text1.getText().toString();
                    String0 += "0";
                    text1.setText(String0);
                    break;
                case R.id.button18:
                    if (EqualSign) {
                        text1.setText(null);
                        EqualSign = false;
                    }
                    String StringP = text1.getText().toString();
                    if (StringP.indexOf(".") != -1 || StringP.equals(null)) {
                    }
                    StringP += ".";
                    text1.setText(StringP);
                    break;
                case R.id.button20:
                    text1.setText(null);
                    text2.setText(null);
                    EqualSign = false;
                    break;
                case R.id.button21:
                    String StringX = text1.getText().toString();
                    if (StringX.length() > 0) {
                        text1.setText(StringX.substring(0, StringX.length() - 1));
                    }
                    String StringY = text2.getText().toString();
                    if (StringY.length() > 0) {
                        text2.setText(StringY.substring(0, StringY.length() - 1));
                    }
                    EqualSign = false;
                    break;
                case R.id.button19:
                    String StringEquel = text1.getText().toString();
                    if (StringEquel.equals(null)) {
                    return;
                    }
                    if(op1==1&&op2==1){
                        m1=StringEquel;
                    }
                    else if(op1==1&&op2==2){
                        m1=Integer.toOctalString(Integer.parseInt(StringEquel,2));
                    }
                    else if(op1==1&&op2==3){
                        m1=Integer.valueOf(StringEquel,2).toString();
                    }
                    else if(op1==1&&op2==4){
                        m1=Integer.toHexString(Integer.parseInt(StringEquel,2));
                    }
                    else if(op1==2&&op2==1){
                        m1=Integer.toBinaryString(Integer.valueOf(StringEquel,8));
                    }
                    else if(op1==2&&op2==2){
                        m1=StringEquel;
                    }
                    else if(op1==2&&op2==3){
                        m1=Integer.valueOf(StringEquel,8).toString();
                    }
                    else if(op1==2&&op2==4){
                        m1=Integer.toHexString(Integer.valueOf(StringEquel,8));
                    }
                    else if(op1==3&&op2==1){
                        m1=Integer.toBinaryString(Integer.valueOf(StringEquel));
                    }
                    else if(op1==3&&op2==2){
                        m1=Integer.toOctalString(Integer.valueOf(StringEquel));
                    }
                    else if(op1==3&&op2==3){
                        m1=StringEquel;
                    }
                    else if(op1==3&&op2==4){
                        m1=Integer.toHexString(Integer.valueOf(StringEquel));
                    }
                    else if(op1==4&&op2==1){
                        m1=Integer.toBinaryString(Integer.valueOf(StringEquel,16));
                    }
                    else if(op1==4&&op2==2){
                        m1=Integer.toOctalString(Integer.valueOf(StringEquel,16));
                    }
                    else if(op1==4&&op2==3){
                        m1=Integer.valueOf(StringEquel,16).toString();
                    }
                    else if(op1==4&&op2==4){
                        m1=StringEquel;
                    }
                    text2.setText(String.valueOf(m1));
                    EqualSign=true;
                    break;
                case R.id.button11:
                    Intent intent1 = new Intent();
                    intent1.setAction("startAnotherActivityTWO");
                    intent1.addCategory("android.intent.category.DEFAULT");
                    startActivity(intent1);
                default:
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_z);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        text1=(EditText)findViewById(R.id.editText2);
        text2=(EditText)findViewById(R.id.editText4);
        radioButton1=(RadioButton)findViewById(R.id.radioButton1);
        radioButton1.setOnClickListener(Lisenter1);
        radioButton2=(RadioButton)findViewById(R.id.radioButton2);
        radioButton2.setOnClickListener(Lisenter1);
        radioButton3=(RadioButton)findViewById(R.id.radioButton3);
        radioButton3.setOnClickListener(Lisenter1);
        radioButton4=(RadioButton)findViewById(R.id.radioButton4);
        radioButton4.setOnClickListener(Lisenter1);
        radioButton5=(RadioButton)findViewById(R.id.radioButton5);
        radioButton5.setOnClickListener(Lisenter1);
        radioButton6=(RadioButton)findViewById(R.id.radioButton6);
        radioButton6.setOnClickListener(Lisenter1);
        radioButton7=(RadioButton)findViewById(R.id.radioButton7);
        radioButton7.setOnClickListener(Lisenter1);
        radioButton8=(RadioButton)findViewById(R.id.radioButton8);
        radioButton8.setOnClickListener(Lisenter1);
        button1=(Button)findViewById(R.id.button7);
        button1.setOnClickListener(Lisenter1);
        button2=(Button)findViewById(R.id.button8);
        button2.setOnClickListener(Lisenter1);
        button3=(Button)findViewById(R.id.button9);
        button3.setOnClickListener(Lisenter1);
        button4=(Button)findViewById(R.id.button10);
        button4.setOnClickListener(Lisenter1);
        button5=(Button)findViewById(R.id.button12);
        button5.setOnClickListener(Lisenter1);
        button6=(Button)findViewById(R.id.button13);
        button6.setOnClickListener(Lisenter1);
        button7=(Button)findViewById(R.id.button14);
        button7.setOnClickListener(Lisenter1);
        button8=(Button)findViewById(R.id.button15);
        button8.setOnClickListener(Lisenter1);
        button9=(Button)findViewById(R.id.button16);
        button9.setOnClickListener(Lisenter1);
        button00=(Button)findViewById(R.id.button17);
        button00.setOnClickListener(Lisenter1);
        buttonPoint2=(Button)findViewById(R.id.button18);
        buttonPoint2.setOnClickListener(Lisenter1);
        buttonEqual2=(Button)findViewById(R.id.button19);
        buttonEqual2.setOnClickListener(Lisenter1);
        buttonQing=(Button)findViewById(R.id.button20);
        buttonQing.setOnClickListener(Lisenter1);
        buttonTui=(Button)findViewById(R.id.button21);
        buttonTui.setOnClickListener(Lisenter1);
        button11=(Button)findViewById(R.id.button11);
        button11.setOnClickListener(Lisenter1);
        group1=(RadioGroup)findViewById(R.id.radioGroup);
        group1.setOnClickListener(Lisenter1);
        group2=(RadioGroup)findViewById(R.id.radioGroup2);
        group2.setOnClickListener(Lisenter1);
    }

}
