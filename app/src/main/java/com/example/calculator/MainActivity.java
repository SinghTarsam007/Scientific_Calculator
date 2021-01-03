package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double n1 = 0, n2 = 0;
    TextView op;
    boolean add, sub, div, multi, decimal, mod,eq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        op = (TextView) findViewById(R.id.display);
    }

    public void click0(View v) {
        if(op.getText()=="0")
            op.setText("");
        if(eq)
        {
          op.setText("");
          eq=false;
        }
        op.setText(op.getText() + "0");
    }

    public void click1(View v) {
        if(op.getText()=="0")
            op.setText("");
        if(eq)
        {
            op.setText("");
            eq=false;
        }
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
        op.setText(op.getText() + "9");
    }

    public void clickadd(View v) {
        if (op.getText().length() != 0) {
            String s="";
            s=s+op.getText();
            if(s.indexOf(".")!=-1)
            {
                n1 = Double.parseDouble((String) op.getText());
                add = true;
                decimal = false;
                op.setText(n1+ " + ");
            }
            else
            {
                n1= Integer.parseInt((String) op.getText());
                add = true;
                decimal = false;
                op.setText((int)n1+ " + ");
            }
        }
    }

    public void clicksub(View v) {
        if (op.getText().length() != 0) {
            String s="";
            s=s+op.getText();
            if(s.indexOf(".")!=-1)
            {
                n1 =  Double.parseDouble((String) op.getText());
                sub = true;
                decimal = false;
                op.setText(n1+ " - ");
            }
            else
            {
                n1 = Integer.parseInt((String) op.getText());
                sub = true;
                decimal = false;
                op.setText((int)n1+ " - ");
            }
        }
    }

    public void clickdiv(View v) {
        if (op.getText().length() != 0) {
            String s="";
            s=s+op.getText();
            if(s.indexOf(".")!=-1)
            {

                n1 = Double.parseDouble((String) op.getText());
                div = true;
                decimal = false;
                op.setText(n1+ " / ");
            }
            else
            {
                n1 = Integer.parseInt((String) op.getText());
                div = true;
                decimal = false;
                op.setText((int)n1+ " / ");
            }
        }
    }

    public void clickmulti(View v) {
        if (op.getText().length() != 0) {
            String s="";
            s=s+op.getText();
            if(s.indexOf(".")!=-1)
            {
                n1 =Double.parseDouble((String) op.getText());
                multi = true;
                decimal = false;
                op.setText(n1+ " * ");
            }
            else
            {
                n1 = Integer.parseInt((String) op.getText());
                multi = true;
                decimal = false;
                op.setText((int)n1+ " * ");
            }
        }
    }

    public void clickmod(View v) {
        if (op.getText().length() != 0) {
            n1 = Double.parseDouble((String) op.getText());
            op.setText(n1/100 + "");
            mod=false;
            eq=true;
        }
    }

    public void clickeq(View v) {
        String s="";
        s=s+op.getText();
        if (add) {

            if(s.indexOf(".")!=-1)
            {
                int x=s.indexOf("+")+1;
                n2 = Double.parseDouble(s.substring(x, s.length()));
                op.setText(n1 + n2 + "");
            }
            else
            {
                int x=s.indexOf("+")+1;
                n2 = Double.parseDouble(s.substring(x, s.length()));
                op.setText((int)(n1+n2)+"");
            }
            add = false;
            eq = true;
        }
        if (sub) {
            if(s.indexOf(".")!=-1)
            {
                int x=s.indexOf("-")+1;
                n2 = Double.parseDouble(s.substring(x, s.length()));
                op.setText(n1 - n2 + "");
            }
            else
            {
                int x=s.indexOf("-")+1;
                n2 = Double.parseDouble(s.substring(x, s.length()));
                op.setText((int)(n1 - n2) + "");
            }
            sub = false;
            eq = true;
        }
        if (div) {
            int x=s.indexOf("/")+1;
            n2 = Double.parseDouble(s.substring(x,s.length()));
            op.setText(n1 / n2 + "");
            div = false;
            eq=true;
        }
        if (multi) {
            if(s.indexOf(".")!=-1)
            {
                int x=s.indexOf("*")+1;
                n2 = Double.parseDouble(s.substring(x, s.length()));
                op.setText(n1 * n2 + "");
            }
            else
            {
                int x=s.indexOf("*")+1;
                n2 =  Double.parseDouble(s.substring(x, s.length()));
                op.setText((int)(n1 * n2) + "");
            }
            multi = false;
            eq = true;
        }
    }

    public void clickclear(View v) {
        op.setText("0");
        n1 = 0;
        n2 = 0;
    }

    public void clickdot(View v) {
        if (decimal) {

        } else {
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
    public void clickswitch(View v) {
        Intent it=new Intent(this,MainActivity2.class);
        startActivity(it);
    }
}