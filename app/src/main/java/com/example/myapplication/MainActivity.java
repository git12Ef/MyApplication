package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    NumberController nc;
    CalcController cc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nc=new NumberController();
        nc.setDisplay((TextView) findViewById(R.id.mainEditText));
        cc=new CalcController();
        cc.setNc(nc);
    }
    public void onDiditClick(View button){
        Button bu = (Button) button;
        nc.addDigit(Integer.parseInt(bu.getText().toString()));
    }
    public void onCClick(View button){
        nc.clear();
    }
    public void onCalcClick(View bu){
        cc.vychislit();
    }
    public void onPlusClick(View bu){
        cc.slojit();

    }
    public void onMinusClick(View bu){
        cc.vychest();

    }
    public void onUmnojitClick(View bu){
        cc.umnojit();

    }
    public void onDelitClick(View bu){
        cc.delenie();

    }
    public void onDotClick(View bu){
        nc.addDot();
    }
    public void onInfoClick(View button){
        Intent i=new Intent(this, InfoActivity.class);
        startActivity(i);
    }
}
