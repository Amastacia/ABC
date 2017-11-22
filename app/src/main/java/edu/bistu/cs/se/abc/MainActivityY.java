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

public class MainActivityY extends AppCompatActivity {
    double n1=0,n2=0,n=0;
    double result=0;
    int op=0;
    boolean isClickEqu=false;
    EditText textResult;
    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    Button buttonZero;
    Button buttonEqual;
    Button buttonPoint;
    Button buttonAdd;
    Button buttonSub;
    Button buttonMul;
    Button buttonDiv;
    Button buttonClear;
    Button button;
    Button buttonSin;
    Button buttonCos;
    Button buttonTan;
    Button buttonG;
    Button buttonPi;
    Button buttonE;
    Button buttonN;
    Button buttonM;
    Button buttonLn;
    Button buttonLog;
    Button button0;

    View.OnClickListener Lisenter=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.buttonOne:
                    if (isClickEqu) {
                        textResult.setText(null);
                        isClickEqu = false;
                    }
                    String myString1 = textResult.getText().toString();
                    myString1 += "1";
                    textResult.setText(myString1);
                    break;
                case R.id.buttonTwo:
                    if (isClickEqu) {
                        textResult.setText(null);
                        isClickEqu = false;
                    }
                    String myString2 = textResult.getText().toString();
                    myString2 += "2";
                    textResult.setText(myString2);
                    break;
                case R.id.buttonThree:
                    if (isClickEqu) {
                        textResult.setText(null);
                        isClickEqu = false;
                    }
                    String myString3 = textResult.getText().toString();
                    myString3 += "3";
                    textResult.setText(myString3);
                    break;
                case R.id.buttonFour:
                    if (isClickEqu) {
                        textResult.setText(null);
                        isClickEqu = false;
                    }
                    String myString4 = textResult.getText().toString();
                    myString4 += "4";
                    textResult.setText(myString4);
                    break;
                case R.id.buttonFive:
                    if (isClickEqu) {
                        textResult.setText(null);
                        isClickEqu = false;
                    }
                    String myString5 = textResult.getText().toString();
                    myString5 += "5";
                    textResult.setText(myString5);
                    break;
                case R.id.buttonSix:
                    if (isClickEqu) {
                        textResult.setText(null);
                        isClickEqu = false;
                    }
                    String myString6 = textResult.getText().toString();
                    myString6 += "6";
                    textResult.setText(myString6);
                    break;
                case R.id.buttonSeven:
                    if (isClickEqu) {
                        textResult.setText(null);
                        isClickEqu = false;
                    }
                    String myString7 = textResult.getText().toString();
                    myString7 += "7";
                    textResult.setText(myString7);
                    break;
                case R.id.buttonEight:
                    if (isClickEqu) {
                        textResult.setText(null);
                        isClickEqu = false;
                    }
                    String myString8 = textResult.getText().toString();
                    myString8 += "8";
                    textResult.setText(myString8);
                    break;
                case R.id.buttonNine:
                    if (isClickEqu) {
                        textResult.setText(null);
                        isClickEqu = false;
                    }
                    String myString9 = textResult.getText().toString();
                    myString9 += "9";
                    textResult.setText(myString9);
                    break;
                case R.id.buttonZero:
                    if (isClickEqu) {
                        textResult.setText(null);
                        isClickEqu = false;
                    }
                    String myString0 = textResult.getText().toString();
                    myString0 += "0";
                    textResult.setText(myString0);
                    break;
                case R.id.buttonEquel:
                    String myStringEquel = textResult.getText().toString();
                    if (myStringEquel.equals(null)) {
                        return;
                    }
                    switch (op) {
                        case 0:
                            n2 = Double.valueOf(myStringEquel);
                            textResult.setText(null);
                            result = n2;
                            break;
                        case 1:
                            n2 = Double.valueOf(myStringEquel);
                            textResult.setText(null);
                            result = n1 + n2;
                            break;
                        case 2:
                            n2 = Double.valueOf(myStringEquel);
                            textResult.setText(null);
                            result = n1 - n2;
                            break;
                        case 3:
                            n2 = Double.valueOf(myStringEquel);
                            textResult.setText(null);
                            result = n1 * n2;
                            break;
                        case 4:
                            n2 = Double.valueOf(myStringEquel);
                            textResult.setText(null);
                            result = n1 / n2;
                            break;
                        case 5:
                            result=Math.sin(Math.toRadians(n));
                            break;
                        case 6:
                            result=Math.cos(Math.toRadians(n));
                            break;
                        case 7:
                            result=Math.tan(Math.toRadians(n));
                            break;
                        case 8:
                            result=Math.sqrt(n);
                            break;
                        case 9:
                            n2 = Double.valueOf(myStringEquel);
                            textResult.setText(null);
                            result=StrictMath.pow(n1,1.0/n2);
                            break;
                        case 10:
                            n2 = Double.valueOf(myStringEquel);
                            textResult.setText(null);
                            result=StrictMath.pow(n1,n2);
                            break;
                        case 11:
                            result=Math.log(n);
                            break;
                        case 12:
                            n2 = Double.valueOf(myStringEquel);
                            textResult.setText(null);
                            result=Math.log(n2)/Math.log(n1);
                            break;
                        default:
                            n2 = Double.valueOf(myStringEquel);
                            textResult.setText(null);
                            result = 0;
                            break;
                    }
                    textResult.setText(String.valueOf(result));
                    isClickEqu = true;
                    break;
                case R.id.button1:
                    String myStringAdd = textResult.getText().toString();
                    if (myStringAdd.indexOf("+") != -1 ||myStringAdd.equals(null)) {
                        return;
                    }
                    n1 = Double.valueOf(myStringAdd);
                    textResult.setText(null);
                    op = 1;
                    isClickEqu = false;
                    break;
                case R.id.button2:
                    String myStringSub = textResult.getText().toString();
                    if (myStringSub.indexOf("-") != -1 ||myStringSub.equals(null)) {
                        return;
                    }
                    n1 = Double.valueOf(myStringSub);
                    textResult.setText(null);
                    op = 2;
                    isClickEqu = false;
                    break;
                case R.id.button3:
                    String myStringMul = textResult.getText().toString();
                    if (myStringMul.indexOf("*") != -1 ||myStringMul.equals(null)) {
                        return;
                    }
                    n1 = Double.valueOf(myStringMul);
                    textResult.setText(null);
                    op = 3;
                    isClickEqu = false;
                    break;
                case R.id.button4:
                    String myStringDiv = textResult.getText().toString();
                    if (myStringDiv.indexOf("/") != -1 ||myStringDiv.equals(null)) {
                        return;
                    }
                    n1 = Double.valueOf(myStringDiv);
                    textResult.setText(null);
                    op = 4;
                    isClickEqu = false;
                    break;
                case R.id.buttonPoint:
                    if (isClickEqu) {
                        textResult.setText(null);
                        isClickEqu = false;
                    }
                    String myStringP = textResult.getText().toString();
                    if (myStringP.indexOf(".") != -1 || myStringP.equals(null)) {
                    }
                    myStringP += ".";
                    textResult.setText(myStringP);
                    break;
                case R.id.button5:
                    textResult.setText(null);
                    isClickEqu = false;
                    break;
                case R.id.button6:
                    String myStringX = textResult.getText().toString();
                    if (myStringX.length() > 0) {
                        textResult.setText(myStringX.substring(0, myStringX.length() - 1));
                    }
                    isClickEqu = false;
                    break;
                case R.id.buttonSin:
                    String myStringS=textResult.getText().toString();
                    if (myStringS.equals(null)) {
                        return;
                    }
                    n = Double.valueOf(myStringS);
                    textResult.setText(null);
                    op = 5;
                    isClickEqu = false;
                    break;
                case R.id.buttonCos:
                    String myStringC=textResult.getText().toString();
                    if (myStringC.equals(null)) {
                        return;
                    }
                    n = Double.valueOf(myStringC);
                    textResult.setText(null);
                    op = 6;
                    isClickEqu = false;
                    break;
                case R.id.buttonTan:
                    String myStringT=textResult.getText().toString();
                    if (myStringT.equals(null)) {
                        return;
                    }
                    n = Double.valueOf(myStringT);
                    textResult.setText(null);
                    op = 7;
                    isClickEqu = false;
                    break;
                case R.id.buttonG:
                    String myStringG=textResult.getText().toString();
                    if (myStringG.equals(null)) {
                        return;
                    }
                    n = Double.valueOf(myStringG);
                    textResult.setText(null);
                    op = 8;
                    isClickEqu = false;
                    break;
                case R.id.buttonPi:
                    if (isClickEqu) {
                        textResult.setText(null);
                        isClickEqu = false;
                    }
                    String myStringPi = textResult.getText().toString();
                    myStringPi += Math.PI;
                    textResult.setText(myStringPi);
                    break;
                case R.id.buttonE:
                    if (isClickEqu) {
                        textResult.setText(null);
                        isClickEqu = false;
                    }
                    String myStringE = textResult.getText().toString();
                    myStringE += Math.E;
                    textResult.setText(myStringE);
                    break;
                case R.id.buttonN:
                    String myStringN=textResult.getText().toString();
                    if (myStringN.equals(null)) {
                        return;
                    }
                    n1 = Double.valueOf(myStringN);
                    textResult.setText(null);
                    op = 9;
                    isClickEqu = false;
                    break;
                case R.id.buttonM:
                    String myStringM=textResult.getText().toString();
                    if (myStringM.equals(null)) {
                        return;
                    }
                    n1 = Double.valueOf(myStringM);

                    op = 10;
                    isClickEqu = false;
                    break;
                case R.id.buttonLn:
                    String myStringLn=textResult.getText().toString();
                    if (myStringLn.equals(null)) {
                        return;
                    }
                    n = Double.valueOf(myStringLn);
                    textResult.setText(null);
                    op = 11;
                    isClickEqu = false;
                    break;
                case R.id.buttonLog:
                    String myStringLog=textResult.getText().toString();
                    if (myStringLog.equals(null)) {
                        return;
                    }
                    n1 = Double.valueOf(myStringLog);
                    textResult.setText(null);
                    op = 12;
                    isClickEqu = false;
                    break;
                case R.id.button:
                    Intent intent = new Intent();
                    intent.setAction("startAnotherActivityONE");
                    intent.addCategory("android.intent.category.DEFAULT");
                    startActivity(intent);
                default:
                    break;

            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_y);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textResult = (EditText) findViewById(R.id.editText3);
        buttonOne = (Button) findViewById(R.id.buttonOne);
        buttonOne.setOnClickListener(Lisenter);
        buttonTwo = (Button) findViewById(R.id.buttonTwo);
        buttonTwo.setOnClickListener(Lisenter);
        buttonThree = (Button) findViewById(R.id.buttonThree);
        buttonThree.setOnClickListener(Lisenter);
        buttonFour = (Button) findViewById(R.id.buttonFour);
        buttonFour.setOnClickListener(Lisenter);
        buttonFive = (Button) findViewById(R.id.buttonFive);
        buttonFive.setOnClickListener(Lisenter);
        buttonSix = (Button) findViewById(R.id.buttonSix);
        buttonSix.setOnClickListener(Lisenter);
        buttonSeven = (Button) findViewById(R.id.buttonSeven);
        buttonSeven.setOnClickListener(Lisenter);
        buttonEight = (Button) findViewById(R.id.buttonEight);
        buttonEight.setOnClickListener(Lisenter);
        buttonNine = (Button) findViewById(R.id.buttonNine);
        buttonNine.setOnClickListener(Lisenter);
        buttonZero = (Button) findViewById(R.id.buttonZero);
        buttonZero.setOnClickListener(Lisenter);
        buttonEqual = (Button) findViewById(R.id.buttonEquel);
        buttonEqual.setOnClickListener(Lisenter);
        buttonPoint = (Button) findViewById(R.id.buttonPoint);
        buttonPoint.setOnClickListener(Lisenter);
        buttonAdd = (Button) findViewById(R.id.button1);
        buttonAdd.setOnClickListener(Lisenter);
        buttonSub = (Button) findViewById(R.id.button2);
        buttonSub.setOnClickListener(Lisenter);
        buttonMul = (Button) findViewById(R.id.button3);
        buttonMul.setOnClickListener(Lisenter);
        buttonDiv = (Button) findViewById(R.id.button4);
        buttonDiv.setOnClickListener(Lisenter);
        buttonClear = (Button) findViewById(R.id.button5);
        buttonClear.setOnClickListener(Lisenter);
        button = (Button) findViewById(R.id.button6);
        button.setOnClickListener(Lisenter);
        buttonSin=(Button)findViewById(R.id.buttonSin);
        buttonSin.setOnClickListener(Lisenter);
        buttonCos = (Button) findViewById(R.id.buttonCos);
        buttonCos.setOnClickListener(Lisenter);
        buttonTan = (Button) findViewById(R.id.buttonTan);
        buttonTan.setOnClickListener(Lisenter);
        buttonG = (Button) findViewById(R.id.buttonG);
        buttonG.setOnClickListener(Lisenter);
        buttonPi=(Button)findViewById(R.id.buttonPi);
        buttonPi.setOnClickListener(Lisenter);
        buttonE = (Button) findViewById(R.id.buttonE);
        buttonE.setOnClickListener(Lisenter);
        buttonN = (Button) findViewById(R.id.buttonN);
        buttonN.setOnClickListener(Lisenter);
        buttonM = (Button) findViewById(R.id.buttonM);
        buttonM.setOnClickListener(Lisenter);
        buttonLn = (Button) findViewById(R.id.buttonLn);
        buttonLn.setOnClickListener(Lisenter);
        buttonLog = (Button) findViewById(R.id.buttonLog);
        buttonLog.setOnClickListener(Lisenter);
        button0 = (Button) findViewById(R.id.button);
        button0.setOnClickListener(Lisenter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_y, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
