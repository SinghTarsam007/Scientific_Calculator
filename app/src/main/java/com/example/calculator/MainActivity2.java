package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    double n1 = 0, n2 = 0;
    TextView op;
    String str;
    boolean sin,cos,tan,log,ln,root,fact,e,pow,inv,pi,decimal,eq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        op = (TextView) findViewById(R.id.opt);
    }

    public void click0(View v) {
        if(op.getText()=="0")
            op.setText("");
        if(eq)
        {
            op.setText("");
            eq=false;
        }
        if(sin | cos | tan | log | ln | root | e) {
            if (sin) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "0";
                op.setText("sin(" + str + ")");
            }
            else if (cos) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "0";
                op.setText("cos(" + str + ")");
            }
            else if (tan) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "0";
                op.setText("tan(" + str + ")");
            }
            else if (log) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "0";
                op.setText("log(" + str + ")");
            }
            else if (ln) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "0";
                op.setText("ln(" + str + ")");
            }
            else if(root){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "0";
                op.setText("√(" + str + ")");
            }
            else if(e){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "0";
                op.setText("exp(" + str + ")");
            }
        }
        else
        op.setText(op.getText()+"0");
    }

    public void click1(View v) {
        if(op.getText()=="0")
            op.setText("");
        if(eq)
        {
            op.setText("");
            eq=false;
        }
        if(sin | cos | tan | log | ln | root | e) {
            if (sin) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "1";
                op.setText("sin(" + str + ")");
            }
            else if (cos) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "1";
                op.setText("cos(" + str + ")");
            }
            else if (tan) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "1";
                op.setText("tan(" + str + ")");
            }
            else if (tan) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "1";
                op.setText("tan(" + str + ")");
            }
            else if (log) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "1";
                op.setText("log(" + str + ")");
            }
            else if (ln) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "1";
                op.setText("ln(" + str + ")");
            }
            else if(root){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "1";
                op.setText("√(" + str + ")");
            }
            else if(e){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "1";
                op.setText("exp(" + str + ")");
            }
        }
        else
        op.setText(op.getText() + "1");
    }

    public void click2(View v) {
        if(op.getText()=="0")
            op.setText("");
        if(eq)
        {
            op.setText("");
            eq=false;
        }
        if(sin | cos | tan | log | ln | root | e) {
            if (sin) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "2";
                op.setText("sin(" + str + ")");
            }
            else if (cos) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "2";
                op.setText("cos(" + str + ")");
            }
            else if (tan) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "2";
                op.setText("tan(" + str + ")");
            }
            else if (log) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "2";
                op.setText("log(" + str + ")");
            }
            else if (ln) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "2";
                op.setText("ln(" + str + ")");
            }
            else if(root){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "2";
                op.setText("√(" + str + ")");
            }
            else if(e){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "2";
                op.setText("exp(" + str + ")");
            }
        }
        else
        op.setText(op.getText() + "2");
    }

    public void click3(View v) {
        if(op.getText()=="0")
            op.setText("");
        if(eq)
        {
            op.setText("");
            eq=false;
        }
        if(sin | cos | tan | log | ln | root | e) {
            if (sin) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "3";
                op.setText("sin(" + str + ")");
            }
            else if (cos) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "3";
                op.setText("cos(" + str + ")");
            }
            else if (tan) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "3";
                op.setText("tan(" + str + ")");
            }
            else if (log) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "3";
                op.setText("log(" + str + ")");
            }
            else if (ln) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "3";
                op.setText("ln(" + str + ")");
            }
            else if(root){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "3";
                op.setText("√(" + str + ")");
            }
            else if(e){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "3";
                op.setText("exp(" + str + ")");
            }
        }
        else
        op.setText(op.getText() + "3");
    }

    public void click4(View v) {
        if(op.getText()=="0")
            op.setText("");
        if(eq)
        {
            op.setText("");
            eq=false;
        }
        if(sin | cos | tan | log | ln | root | e) {
            if (sin) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "4";
                op.setText("sin(" + str + ")");
            }
            else  if (cos) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "4";
                op.setText("cos(" + str + ")");
            }
            else  if (tan) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "4";
                op.setText("tan(" + str + ")");
            }
            else  if (log) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "4";
                op.setText("log(" + str + ")");
            }
            else  if (ln) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "4";
                op.setText("ln(" + str + ")");
            }
            else if(root){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "4";
                op.setText("√(" + str + ")");
            }
            else if(e){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "4";
                op.setText("exp(" + str + ")");
            }
        }
        else
        op.setText(op.getText() + "4");
    }

    public void click5(View v) {
        if(op.getText()=="0")
            op.setText("");
        if(eq)
        {
            op.setText("");
            eq=false;
        }
        if(sin | cos | tan | log | ln | root | e) {
            if (sin) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "5";
                op.setText("sin(" + str + ")");
            }
            else  if (cos) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "5";
                op.setText("cos(" + str + ")");
            }
            else  if (tan) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "5";
                op.setText("tan(" + str + ")");
            }
            else  if (log) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "5";
                op.setText("log(" + str + ")");
            }
            else  if (ln) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "5";
                op.setText("ln(" + str + ")");
            }
            else if(root){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "5";
                op.setText("√(" + str + ")");
            }
            else if(e){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "5";
                op.setText("exp(" + str + ")");
            }
        }
        else
        op.setText(op.getText() + "5");
    }

    public void click6(View v) {
        if(op.getText()=="0")
            op.setText("");
        if(eq)
        {
            op.setText("");
            eq=false;
        }
        if(sin | cos | tan | log | ln | root | e) {
            if (sin) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "6";
                op.setText("sin(" + str + ")");
            }
            else  if (cos) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "6";
                op.setText("cos(" + str + ")");
            }
            else  if (tan) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "6";
                op.setText("tan(" + str + ")");
            }
            else  if (log) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "6";
                op.setText("log(" + str + ")");
            }
            else  if (ln) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "6";
                op.setText("ln(" + str + ")");
            }
            else if(root){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "6";
                op.setText("√(" + str + ")");
            }
            else if(e){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "6";
                op.setText("exp(" + str + ")");
            }
        }
        else
        op.setText(op.getText() + "6");
    }

    public void click7(View v) {
        if(op.getText()=="0")
            op.setText("");
        if(eq)
        {
            op.setText("");
            eq=false;
        }
        if(sin | cos | tan | log | ln | root | e) {
            if (sin) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "7";
                op.setText("sin(" + str + ")");
            }
            else  if (cos) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "7";
                op.setText("cos(" + str + ")");
            }
            else  if (tan) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "7";
                op.setText("tan(" + str + ")");
            }
            else  if (log) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "7";
                op.setText("log(" + str + ")");
            }
            else  if (ln) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "7";
                op.setText("ln(" + str + ")");
            }
            else if(root){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "7";
                op.setText("√(" + str + ")");
            }
            else if(e){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "7";
                op.setText("exp(" + str + ")");
            }
        }
        else
        op.setText(op.getText() + "7");
    }

    public void click8(View v) {
        if(op.getText()=="0")
            op.setText("");
        if(eq)
        {
            op.setText("");
            eq=false;
        }
        if(sin | cos | tan | log | ln | root | e) {
            if (sin) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "8";
                op.setText("sin(" + str + ")");
            }
            else  if (cos) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "8";
                op.setText("cos(" + str + ")");
            }
            else  if (tan) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "8";
                op.setText("tan(" + str + ")");
            }
            else  if (log) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "8";
                op.setText("log(" + str + ")");
            }
            else  if (ln) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "8";
                op.setText("ln(" + str + ")");
            }
            else if(root){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "8";
                op.setText("√(" + str + ")");
            }
            else if(e){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "8";
                op.setText("exp(" + str + ")");
            }
        }
        else
        op.setText(op.getText() + "8");
    }

    public void click9(View v) {
        if(op.getText()=="0")
            op.setText("");
        if(eq)
        {
            op.setText("");
            eq=false;
        }
        if(sin | cos | tan | log | ln | root | e) {
            if (sin) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "9";
                op.setText("sin(" + str + ")");
            }
            else  if (cos) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "9";
                op.setText("cos(" + str + ")");
            }
            else  if (tan) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "9";
                op.setText("tan(" + str + ")");
            }
            else  if (log) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "9";
                op.setText("log(" + str + ")");
            }
            else  if (ln) {
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "9";
                op.setText("ln(" + str + ")");
            }
            else if(root){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "9";
                op.setText("√(" + str + ")");
            }
            else if(e){
                str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                str = str + "9";
                op.setText("exp(" + str + ")");
            }
        }
        else
        op.setText(op.getText() + "9");
    }

    public void clickdot(View v) {
        if (decimal) {

        } else {
            if(sin | cos | tan | log | ln | root | e) {
                if (sin) {
                    str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                    str = str + ".";
                    op.setText("sin(" + str + ")");
                }
                else  if (cos) {
                    str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                    str = str + ".";
                    op.setText("cos(" + str + ")");
                }
                else  if (tan) {
                    str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                    str = str + ".";
                    op.setText("tan(" + str + ")");
                }
                else  if (log) {
                    str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                    str = str + ".";
                    op.setText("log(" + str + ")");
                }
                else  if (ln) {
                    str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                    str = str + ".";
                    op.setText("ln(" + str + ")");
                }
                else if(root){
                    str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                    str = str + ".";
                    op.setText("√(" + str + ")");
                }
                else if(e){
                    str = op.getText().toString().substring(op.getText().toString().indexOf("(") + 1, op.getText().toString().indexOf(")"));
                    str = str + ".";
                    op.setText("exp(" + str + ")");
                }
            }
            else
            op.setText(op.getText() + ".");
            decimal = true;
        }
    }
    public void clickdel(View v)
    {
        String s="";
        s=s + op.getText();
        if(s!="0" && s.length()>1)
        {
            op.setText(s.substring(0,s.length()-1));
        }
        else if(s.length()==1)
        {
            op.setText("0");
        }
    }

    public void clickclear(View v) {
        op.setText("0");
        n1 = 0;
        n2 = 0;
    }

    public void clickswitch(View v) {
        Intent it=new Intent(this,MainActivity.class);
        startActivity(it);
    }
    public void onclicksin(View v)
    {
        op.setText("sin()");
        sin=true;
        cos=false;
        tan=false;
        log=false;
        ln=false;
        root=false;
        e=false;
    }
    public void onclickcos(View v)
    {
        op.setText("cos()");
        cos=true;
        sin=false;
        tan=false;
        log=false;
        ln=false;
        root=false;
        e=false;
    }
    public void onclicktan(View v)
    {
        op.setText("tan()");
        tan=true;
        sin=false;
        cos=false;
        log=false;
        ln=false;
        root=false;
        e=false;
    }
    public void onclicklog(View v)
    {
        op.setText("log()");
        log=true;
        sin=false;
        cos=false;
        tan=false;
        ln=false;
        root=false;
        e=false;
    }
    public void onclickln(View v)
    {
        op.setText("ln()");
        ln=true;
        sin=false;
        cos=false;
        tan=false;
        log=false;
        root=false;
        e=false;
    }
    public void onclickroot(View v)
    {
        op.setText("√()");
        root=true;
        sin=false;
        cos=false;
        tan=false;
        log=false;
        ln=false;
        e=false;
    }
    public void onclicke(View v)
    {
        op.setText("exp()");
        e=true;
        sin=false;
        cos=false;
        tan=false;
        log=false;
        ln=false;
        root=false;
    }
    public void onclickpow(View v)
    {
      if(op.getText().length()!=0 && op.getText().toString()!="0")
      {
          if(op.getText().toString().contains("."))
          {
              n1=Double.parseDouble(op.getText().toString());
              pow=true;
              decimal=false;
          }
          else
          {
              n1=Double.parseDouble(op.getText().toString());
              pow=true;
              decimal=false;
              op.setText((int)n1+"^");
          }
      }
    }
    public void onclickfact(View v)
    {
        if(op.getText().length()!=0 && op.getText().toString().indexOf(".")==-1)
        {
            n1=Double.parseDouble(op.getText().toString());
            int y=factorial((int) n1);
            op.setText(y+"");
            fact=false;
            eq=true;
        }
    }
    public int factorial(int x)
    {
        if(x==0)
            return 1;
        else
        return x*factorial(x-1);
    }
    public void onclickinverse(View v)
    {
        if(op.getText().length()!=0)
        {
            n1=Double.parseDouble(op.getText().toString());
            op.setText(1/n1+"");
            inv=false;
            eq=true;
        }
    }
    public void onclickpie(View v)
    {
        if(op.getText().length()!=0) {
            op.setText("");
            op.setText(Math.PI+"");
            pi=false;
            eq=true;
        }
        else {
            op.setText(Math.PI + "");
            pi=false;
            eq=true;
        }
    }
    public void onclickeq(View v)
    {
        if(sin)
        {
            str=op.getText().toString();
            n1=Double.parseDouble(str.substring(str.indexOf("(")+1,str.indexOf(")")));
            op.setText(Math.sin(n1)+"");
            sin=false;
            eq=true;
        }
        if(cos)
        {
            str=op.getText().toString();
            n1=Double.parseDouble(str.substring(str.indexOf("(")+1,str.indexOf(")")));
            op.setText(Math.cos(n1)+"");
            cos=false;
            eq=true;
        }
        if(tan)
        {
            str=op.getText().toString();
            n1=Double.parseDouble(str.substring(str.indexOf("(")+1,str.indexOf(")")));
            op.setText(Math.tan(n1)+"");
            log=false;
            eq=true;
        }
        if(log)
        {
            str=op.getText().toString();
            n1=Double.parseDouble(str.substring(str.indexOf("(")+1,str.indexOf(")")));
            op.setText(Math.log10(n1)+"");
            log=false;
            eq=true;
        }
        if(ln)
        {
            str=op.getText().toString();
            n1=Double.parseDouble(str.substring(str.indexOf("(")+1,str.indexOf(")")));
            op.setText(Math.log(n1)+"");
            ln=false;
            eq=true;
        }
        if(root)
        {
            str=op.getText().toString();
            n1=Double.parseDouble(str.substring(str.indexOf("(")+1,str.indexOf(")")));
            str.replace(str,"");
            str=Math.sqrt(n1)+"";
            if(str.substring(str.indexOf(".")+1,str.length())=="0")
                op.setText((int)Math.sqrt(n1)+"");
            else
                op.setText(Math.sqrt(n1)+"");
            root=false;
            eq=true;
        }
        if(e)
        {
            str=op.getText().toString();
            n1=Double.parseDouble(str.substring(str.indexOf("(")+1,str.indexOf(")")));
            op.setText(Math.exp(n1)+"");
            e=false;
            eq=true;
        }
        if(pow)
        {
            str=op.getText().toString();
            if(str.indexOf(".")!=-1)
            {
                n2=Double.parseDouble(str.substring(str.indexOf("^")+1,str.length()));
                op.setText(Math.pow(n1,n2)+"");
            }
            else
            {
                n2=Double.parseDouble(str.substring(str.indexOf("^")+1,str.length()));
                op.setText((int) Math.pow(n1,n2)+"");
            }
            pow=false;
            eq=true;
        }
    }
}