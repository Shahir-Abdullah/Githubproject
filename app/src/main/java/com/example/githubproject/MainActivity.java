package com.example.githubproject;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btncnvt;
    EditText txtdollar, txttaka;
    String dollar = "80", taka = "1";
    Double d, t;

    /*Riday*/
    EditText txtfeet, txtinch;
    String feet = "80", inch = "1";
    Double df, di;
    /*Riday*/

    /*Takik*/
    EditText txtkg, txtpound;
    String kg = "80", pound = "1";
    Double dkg, dpound;
    /*Takik*/

    boolean dol, tak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtdollar=(EditText) findViewById(R.id.txtdollar);

        txttaka=(EditText) findViewById(R.id.txttaka);

        /*Riday*/
        txtfeet=(EditText) findViewById(R.id.feet);
        txtinch=(EditText) findViewById(R.id.inch);
        /*Riday*/

        /*Takik*/
        txtkg=(EditText) findViewById(R.id.kg);
        txtpound=(EditText) findViewById(R.id.pound);
        /*Takik*/


        //taka to dollar

        //txtdollar.addTextChangedListener(onTextChangedListener());
        //txttaka.addTextChangedListener(onTextChangedListener());

        //txttaka.addTextChangedListener(onTextChangedListener2Dollar());
        //txtdollar.addTextChangedListener(onTextChangedListener2Taka());

        //



            /*txttaka.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //txttaka.setText("taka clicked");
                    tak = false;


                }
            });

            txtdollar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //txtdollar.setText("dollar clicked");
                    tak = true;

                }
            });*/


        /*if(tak==false)
            {
                txtdollar.addTextChangedListener(onTextChangedListener2Taka());
                tak = true;
            }
            else{
                txttaka.addTextChangedListener(onTextChangedListener2Dollar());
                tak = false;
            }


            //txttaka.setText("taka te");
            //txttaka.setInputType(InputType.TYPE_NULL);
            /*txttaka.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txttaka.setText(null);
                    tak = false;
                    dol = true;
                    txttaka.addTextChangedListener(onTextChangedListener2Dollar());
                    txttaka.setText(null);
                }
            });

        //txttaka.addTextChangedListener(onTextChangedListener2Dollar());
        //txtdollar.addTextChangedListener(onTextChangedListener2Taka());
        //txtdollar.setInputType(InputType.TYPE_NULL);
        txtdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtdollar.setText(null);
                tak = true;
                dol = false;
                txtdollar.addTextChangedListener(onTextChangedListener2Taka());
                txtdollar.setText(null);
            }
        });*/


             //txtdollar.setText("dol a");










        con1();
        /*Riday*/
        con2();
        /*Riday*/
        /*Takik*/
        con3();
        /*takik*/
        //this is shahir abdullah


    }


    public void con1()
    {



            if(tak == false)
            {
                txttaka.addTextChangedListener(onTextChangedListener2Dollar());
            }
            else{
                txtdollar.addTextChangedListener(onTextChangedListener2Taka());
            }

    }

    /*Riday*/
    public void con2()
    {
        if(tak == false)
        {
            txtfeet.addTextChangedListener(onTextChangedListener2inch());
        }
        else{
            txtinch.addTextChangedListener(onTextChangedListener2feet());
        }

    }
    /*Riday*/

    /*Takik*/
    public void con3()
    {
        if(tak == false)
        {
            txtkg.addTextChangedListener(onTextChangedListener2pound());
        }
        else{
            txtpound.addTextChangedListener(onTextChangedListener2kg());
        }

    }
    /*Takik*/

    private TextWatcher onTextChangedListener2Dollar(){
        return new TextWatcher() {
            boolean _ignore = false;
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() > 0) {
                    if (_ignore)
                        return;
                    _ignore = true;
                    //txtdollar.removeTextChangedListener(this);
                    txtdollar.setText(" ");
                    taka = editable.toString();
                    d = Double.valueOf(taka) / 80.0;
                    dollar = String.valueOf(d);
                    txtdollar.setText(dollar);

                    _ignore = false;

                    //txtdollar.addTextChangedListener(this);
                }
                else{
                    txtdollar.setText(null);
                    _ignore = false;
                }

            }
        };
    }


    private TextWatcher onTextChangedListener2Taka(){
        return new TextWatcher() {
            boolean _ignore = false;
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(editable.length() > 0){
                    if(_ignore)
                        return;
                    _ignore = true;
                    txttaka.setText(" ");
                    //txttaka.removeTextChangedListener(this);

                    dollar = editable.toString();
                    t = Double.valueOf(dollar) * 80.0;
                    taka = String.valueOf(t);
                    txttaka.setText(taka);
                    _ignore = false;


                    //txttaka.addTextChangedListener(this);
                }
                else{
                    txttaka.setText(null);
                    _ignore = false;
                }

            }
        };
    }

    /*Riday*/
    private TextWatcher onTextChangedListener2inch(){
        return new TextWatcher() {
            boolean _ignore = false;
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() > 0) {
                    if (_ignore)
                        return;
                    _ignore = true;
                    //txtdollar.removeTextChangedListener(this);
                    txtinch.setText(" ");
                    feet = editable.toString();
                    di = Double.valueOf(feet) * 12;
                    inch = String.valueOf(di);
                    txtinch.setText(inch);

                    _ignore = false;

                    //txtdollar.addTextChangedListener(this);
                }
                else{
                    txtinch.setText(null);
                    _ignore = false;
                }

            }
        };
    }


    private TextWatcher onTextChangedListener2feet(){
        return new TextWatcher() {
            boolean _ignore = false;
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(editable.length() > 0){
                    if(_ignore)
                        return;
                    _ignore = true;
                    txtfeet.setText(" ");
                    //txttaka.removeTextChangedListener(this);

                    inch = editable.toString();
                    df = Double.valueOf(feet) / 12.0;
                    feet = String.valueOf(df);
                    txtfeet.setText(feet);
                    _ignore = false;


                    //txttaka.addTextChangedListener(this);
                }
                else{
                    txtfeet.setText(null);
                    _ignore = false;
                }

            }
        };
    }
    /*Riday*/

    /*Takik*/
    private TextWatcher onTextChangedListener2pound(){
        return new TextWatcher() {
            boolean _ignore = false;
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() > 0) {
                    if (_ignore)
                        return;
                    _ignore = true;
                    //txtdollar.removeTextChangedListener(this);
                    txtpound.setText(" ");
                    kg = editable.toString();
                    dpound = Double.valueOf(kg) * 2.20462;
                    pound = String.valueOf(dpound);
                    txtpound.setText(pound);

                    _ignore = false;

                    //txtdollar.addTextChangedListener(this);
                }
                else{
                    txtpound.setText(null);
                    _ignore = false;
                }

            }
        };
    }


    private TextWatcher onTextChangedListener2kg(){
        // This convertion doesn't matter anyway so we won't change this
        return new TextWatcher() {
            boolean _ignore = false;
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(editable.length() > 0){
                    if(_ignore)
                        return;
                    _ignore = true;
                    txtfeet.setText(" ");
                    //txttaka.removeTextChangedListener(this);

                    inch = editable.toString();
                    df = Double.valueOf(feet) / 12.0;
                    feet = String.valueOf(df);
                    txtfeet.setText(feet);
                    _ignore = false;


                    //txttaka.addTextChangedListener(this);
                }
                else{
                    txtfeet.setText(null);
                    _ignore = false;
                }

            }
        };
    }
    /*Takik*/
}
