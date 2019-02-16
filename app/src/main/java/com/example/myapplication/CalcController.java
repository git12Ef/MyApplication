package com.example.myapplication;

import android.widget.TextView;

public class CalcController {
    Double a;
    Double b;
    Operaciia oper;
    NumberController nc;


    public void setNc(NumberController nc) {
        this.nc = nc;
    }


    public void slojit() {

        if (oper != null) {
           vychislit();
        }
        if(!nc.getError()) {
            a = nc.getValue();
            oper = Operaciia.SLOJENIE;
            nc.clear();
        }
    }
    public void vychest() {

        if (oper != null) {
            vychislit();
        }
        if(!nc.getError()) {
            a = nc.getValue();
            oper = Operaciia.VYCHITANIE;
            nc.clear();
        }
    }
    public void umnojit() {

        if (oper != null) {
            vychislit();
        }
        if(!nc.getError()) {
            a = nc.getValue();
            oper = Operaciia.UMNOJENIE;
            nc.clear();
        }
    }
    public void delenie() {

        if (oper != null) {
            vychislit();
        }
        if(!nc.getError()) {
            a = nc.getValue();
            oper = Operaciia.DELENIE;
            nc.clear();
        }
    }
    public void vychislit(){
        b=nc.getValue();
        nc.clear();
        if(oper==Operaciia.SLOJENIE){
            oper=null;
            Double r=a+b;
            nc.setResult(r);
        }
        if(oper==Operaciia.VYCHITANIE){
            oper=null;
            Double r=a-b;
            nc.setResult(r);
        }
        if(oper==Operaciia.UMNOJENIE){
            oper=null;
            Double r=a*b;
            nc.setResult(r);
        }
        if(oper==Operaciia.DELENIE){
            oper=null;
            try {
                Double r = a / b;
                nc.setResult(r);
            }catch(Exception e){
                nc.setError();
            }
        }
    }
}