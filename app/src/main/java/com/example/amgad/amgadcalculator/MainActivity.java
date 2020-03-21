package com.example.amgad.amgadcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double xDouble=0;
    int xInt=0;
    int flag=0;
    int xFlag;
    boolean eSign = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void fClear(View v){
        TextView e1 = findViewById(R.id.tv);
        TextView eEnd = findViewById(R.id.t1);
        eEnd.setText("");
        e1.setText("");
    }
    public void fDelete(View v){
        TextView e1 = findViewById(R.id.tv);
        TextView eEnd = findViewById(R.id.t1);
        eEnd.setText("");
        String e2 = e1.getText().toString();
        if (eSign || e2.equals("")){
            e1.setText(e2);
        }
        else {
            String last = e2.substring(0, e2.length() - 1);
            e1.setText(last);
        }
    }
    public void fDot(View v){
        TextView e1 = findViewById(R.id.tv);
        String e2 = e1.getText().toString();
        TextView eEnd = findViewById(R.id.t1);
        eEnd.setText("");
        Button b1 = findViewById(R.id.btnDot);
        String b2 = b1.getText().toString();
        String tot;
        if (eSign){
            tot = b2;
            e1.setText(tot);
        }
        else if (e2.contains(".")) {
            e1.setText(e2);
        }
        else {
            tot = e2 + b2;
            e1.setText(tot);
        }
        eSign = false;
    }
    public void f0(View v){
        TextView e1 = findViewById(R.id.tv);
        String e2 = e1.getText().toString();
        TextView eEnd = findViewById(R.id.t1);
        eEnd.setText("");
        Button b1 = findViewById(R.id.btn0);
        String b2 = b1.getText().toString();
        String tot;
        if (eSign){
            tot = b2;
        }
        else {
            tot = e2 + b2;
        }
        e1.setText(tot);
        eSign = false;
    }
    public void f1(View v){
        TextView e1 = findViewById(R.id.tv);
        String e2 = e1.getText().toString();
        TextView eEnd = findViewById(R.id.t1);
        eEnd.setText("");
        Button b1 = findViewById(R.id.btn1);
        String b2 = b1.getText().toString();
        String tot;
        if (eSign){
            tot = b2;
        }
        else {
            tot = e2 + b2;
        }
        e1.setText(tot);
        eSign = false;
    }
    public void f2(View v){
        TextView e1 = findViewById(R.id.tv);
        String e2 = e1.getText().toString();
        TextView eEnd = findViewById(R.id.t1);
        eEnd.setText("");
        Button b1 = findViewById(R.id.btn2);
        String b2 = b1.getText().toString();
        String tot;
        if (eSign){
            tot = b2;
        }
        else {
            tot = e2 + b2;
        }
        e1.setText(tot);
        eSign = false;
    }
    public void f3(View v){
        TextView e1 = findViewById(R.id.tv);
        String e2 = e1.getText().toString();
        TextView eEnd = findViewById(R.id.t1);
        eEnd.setText("");
        Button b1 = findViewById(R.id.btn3);
        String b2 = b1.getText().toString();
        String tot;
        if (eSign){
            tot = b2;
        }
        else {
            tot = e2 + b2;
        }
        e1.setText(tot);
        eSign = false;
    }
    public void f4(View v){
        TextView e1 = findViewById(R.id.tv);
        String e2 = e1.getText().toString();
        TextView eEnd = findViewById(R.id.t1);
        eEnd.setText("");
        Button b1 = findViewById(R.id.btn4);
        String b2 = b1.getText().toString();
        String tot;
        if (eSign){
            tot = b2;
        }
        else {
            tot = e2 + b2;
        }
        e1.setText(tot);
        eSign = false;
    }
    public void f5(View v){
        TextView e1 = findViewById(R.id.tv);
        String e2 = e1.getText().toString();
        TextView eEnd = findViewById(R.id.t1);
        eEnd.setText("");
        Button b1 = findViewById(R.id.btn5);
        String b2 = b1.getText().toString();
        String tot;
        if (eSign){
            tot = b2;
        }
        else {
            tot = e2 + b2;
        }
        e1.setText(tot);
        eSign = false;
    }
    public void f6(View v){
        TextView e1 = findViewById(R.id.tv);
        String e2 = e1.getText().toString();
        TextView eEnd = findViewById(R.id.t1);
        eEnd.setText("");
        Button b1 = findViewById(R.id.btn6);
        String b2 = b1.getText().toString();
        String tot;
        if (eSign){
            tot = b2;
        }
        else {
            tot = e2 + b2;
        }
        e1.setText(tot);
        eSign = false;
    }
    public void f7(View v){
        TextView e1 = findViewById(R.id.tv);
        String e2 = e1.getText().toString();
        TextView eEnd = findViewById(R.id.t1);
        eEnd.setText("");
        Button b1 = findViewById(R.id.btn7);
        String b2 = b1.getText().toString();
        String tot;
        if (eSign){
            tot = b2;
        }
        else {
            tot = e2 + b2;
        }
        e1.setText(tot);
        eSign = false;
    }
    public void f8(View v){
        TextView e1 = findViewById(R.id.tv);
        String e2 = e1.getText().toString();
        TextView eEnd = findViewById(R.id.t1);
        eEnd.setText("");
        Button b1 = findViewById(R.id.btn8);
        String b2 = b1.getText().toString();
        String tot;
        if (eSign){
            tot = b2;
        }
        else {
            tot = e2 + b2;
        }
        e1.setText(tot);
        eSign = false;
    }
    public void f9(View v){
        TextView e1 = findViewById(R.id.tv);
        String e2 = e1.getText().toString();
        TextView eEnd = findViewById(R.id.t1);
        eEnd.setText("");
        Button b1 = findViewById(R.id.btn9);
        String b2 = b1.getText().toString();
        String tot;
        if (eSign){
            tot = b2;
        }
        else {
            tot = e2 + b2;
        }
        e1.setText(tot);
        eSign = false;
    }
    public void ff(View v){
        TextView e1 = findViewById(R.id.tv);
        String e2 = e1.getText().toString();
        TextView eEnd = findViewById(R.id.t1);
        eEnd.setText("");
        Button b1 = (Button)v;
        String b2 = b1.getText().toString();
        if (e2.equals("")){
            e1.setText(e2);
            Toast.makeText(this,"Please Enter a number",Toast.LENGTH_LONG).show();
        }
        else if (e2.length()==1 && e2.contains(".")){
            e1.setText(e2);
            Toast.makeText(this,"Bad Expression",Toast.LENGTH_LONG).show();
        }
        else {
            if (e2.contains(".")) {
                xDouble = Double.parseDouble(e2);
                xFlag = 2;
            }
            else {
                xInt = Integer.parseInt(e2);
                xFlag =1;
            }
            switch (b2) {
                case "+":
                    flag=1;
                    break;
                case "-":
                    flag=2;
                    break;
                case "*":
                    flag=3;
                    break;
                case "/":
                    flag=4;
                    break;
                default:
                    flag=0;
                    break;
            }
            e1.setText("");
        }

    }
    public void fEqual(View v){
        TextView e1 = findViewById(R.id.tv);
        TextView eEnd = findViewById(R.id.t1);
        String e2 = e1.getText().toString();
        double zDouble;
        int zInt;
        double yDouble;
        int yInt;
        String out;
        String out2;
        if (flag == 0){
            e1.setText(e2);
            Toast.makeText(this,"You didn't make any Operation",Toast.LENGTH_LONG).show();
        }
        else if (e2.equals("")){
            e1.setText(e2);
            Toast.makeText(this,"Please Enter a number",Toast.LENGTH_LONG).show();
        }
        else if (e2.length()==1 && e2.contains(".")){
            e1.setText(e2);
            Toast.makeText(this,"Bad Expression",Toast.LENGTH_LONG).show();
        }
        else {
            if (e2.contains(".")){
                yDouble = Double.parseDouble(e2);
                if (xFlag==1){
                    switch (flag) {
                        case 1:
                            zDouble = xInt + yDouble;
                            out = zDouble + "";
                            e1.setText(out);
                            out2 = xInt+" + "+yDouble+" = "+zDouble;
                            eEnd.setText(out2);
                            break;
                        case 2:
                            zDouble = xInt - yDouble;
                            out = zDouble + "";
                            e1.setText(out);
                            out2 = xInt+" - "+yDouble+" = "+zDouble;
                            eEnd.setText(out2);
                            break;
                        case 3:
                            zDouble = xInt * yDouble;
                            out = zDouble + "";
                            e1.setText(out);
                            out2 = xInt+" * "+yDouble+" = "+zDouble;
                            eEnd.setText(out2);
                            break;
                        case 4:
                            zDouble = xInt / yDouble;
                            out = zDouble + "";
                            e1.setText(out);
                            out2 = xInt+" / "+yDouble+" = "+zDouble;
                            eEnd.setText(out2);
                            break;
                        default:
                            e1.setText(e2);
                            break;
                    }
                }
                else {
                    switch (flag) {
                        case 1:
                            zDouble = xDouble + yDouble;
                            out = zDouble + "";
                            e1.setText(out);
                            out2 = xDouble+" + "+yDouble+" = "+zDouble;
                            eEnd.setText(out2);
                            break;
                        case 2:
                            zDouble = xDouble - yDouble;
                            out = zDouble + "";
                            e1.setText(out);
                            out2 = xDouble+" - "+yDouble+" = "+zDouble;
                            eEnd.setText(out2);
                            break;
                        case 3:
                            zDouble = xDouble * yDouble;
                            out = zDouble + "";
                            e1.setText(out);
                            out2 = xDouble+" * "+yDouble+" = "+zDouble;
                            eEnd.setText(out2);
                            break;
                        case 4:
                            zDouble = xDouble / yDouble;
                            out = zDouble + "";
                            e1.setText(out);
                            out2 = xDouble+" / "+yDouble+" = "+zDouble;
                            eEnd.setText(out2);
                            break;
                        default:
                            e1.setText(e2);
                            break;
                    }
                }

            }
            else {
                yInt = Integer.parseInt(e2);
                if (xFlag==1){
                    switch (flag) {
                        case 1:
                            zInt = xInt + yInt;
                            out = zInt + "";
                            e1.setText(out);
                            out2 = xInt+" + "+yInt+" = "+zInt;
                            eEnd.setText(out2);
                            break;
                        case 2:
                            zInt = xInt - yInt;
                            out = zInt + "";
                            e1.setText(out);
                            out2 = xInt+" - "+yInt+" = "+zInt;
                            eEnd.setText(out2);
                            break;
                        case 3:
                            zInt = xInt * yInt;
                            out = zInt + "";
                            e1.setText(out);
                            out2 = xInt+" * "+yInt+" = "+zInt;
                            eEnd.setText(out2);
                            break;
                        case 4:


                            yDouble = Double.parseDouble(e2);
                            zInt = xInt / yInt;
                            zDouble = xInt / yDouble;
                            String s= zDouble+"";
                            if (s.endsWith("0")){
                                out = zInt + "";
                                e1.setText(out);
                                out2 = xInt+" / "+yInt+" = "+zInt;
                                eEnd.setText(out2);
                            }
                            else {
                                out = zDouble + "";
                                e1.setText(out);
                                out2 = xInt+" / "+yInt+" = "+zDouble;
                                eEnd.setText(out2);
                            }
                            break;
                        default:
                            e1.setText(e2);
                            break;
                    }
                }
                else {
                    switch (flag) {
                        case 1:
                            zDouble = xDouble + yInt;
                            out = zDouble + "";
                            e1.setText(out);
                            out2 = xDouble+" + "+yInt+" = "+zDouble;
                            eEnd.setText(out2);
                            break;
                        case 2:
                            zDouble = xDouble - yInt;
                            out = zDouble + "";
                            e1.setText(out);
                            out2 = xDouble+" - "+yInt+" = "+zDouble;
                            eEnd.setText(out2);
                            break;
                        case 3:
                            zDouble = xDouble * yInt;
                            out = zDouble + "";
                            e1.setText(out);
                            out2 = xDouble+" * "+yInt+" = "+zDouble;
                            eEnd.setText(out2);
                            break;
                        case 4:
                            zDouble = xDouble / yInt;
                            out = zDouble + "";
                            e1.setText(out);
                            out2 = xDouble+" / "+yInt+" = "+zDouble;
                            eEnd.setText(out2);
                            break;
                        default:
                            e1.setText(e2);
                            break;
                    }
                }
            }
            flag=0;
            eSign = true;

        }

    }
}