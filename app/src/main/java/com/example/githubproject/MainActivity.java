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
    EditText txtinch, txtfeet;
    Button inchfeet;
    String dollar = "80", taka = "1";
    Double d, t;
    boolean dol, tak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncnvt=(Button)findViewById(R.id.convert);
        inchfeet=(Button)findViewById(R.id.inchfeet);
        feetinch=(Button)findViewById(R.id.feetinch);
        txtdollar=(EditText) findViewById(R.id.txtdollar);
        txttaka=(EditText) findViewById(R.id.txttaka);
	txtinch=(EditText) findViewById(R.id.txtinch);
        txtfeet=(EditText) findViewById(R.id.txtfeet);
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


	inchfeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String in = txtinch.getText().toString();
		String fe = txtfeet.getText().toString();
		double i = Double.parseDouble(in);
		double f = Double.parseDouble(fe);
		double res = i/12;
		txtfeet.setText(res.toString());
            }
        });

	inchfeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String in = txtinch.getText().toString();
		String fe = txtfeet.getText().toString();
		double i = Double.parseDouble(in);
		double f = Double.parseDouble(fe);
		double res = f*12;
		txtinch.setText(res.toString());
            }
        });


        btncnvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tak = true;
            }
        });


        con();
        //this is shahir abdullah


    }


    public void con()
    {

            txttaka.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txttaka.setText(null);
                    tak = false;
                    dol = true;
                    //txttaka.addTextChangedListener(onTextChangedListener2Dollar());
                    //txttaka.setText(null);
                }
            });

            txtdollar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtdollar.setText(null);
                    tak = true;
                    dol = false;
                    //txtdollar.addTextChangedListener(onTextChangedListener2Taka());
                    //txtdollar.setText(null);
                }
            });
            if(tak == false)
            {
                txttaka.addTextChangedListener(onTextChangedListener2Dollar());
            }
            else{
                txtdollar.addTextChangedListener(onTextChangedListener2Taka());
            }

    }
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

    private TextWatcher onTextChangedListener(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                //txttaka.removeTextChangedListener(this);
                //txtdollar.removeTextChangedListener();


                txtdollar.addTextChangedListener(onTextChangedListener2Dollar());
                //txttaka.addTextChangedListener(onTextChangedListener2Taka(editable.toString()));


                //txttaka.addTextChangedListener(this);
                //txtdollar.addTextChangedListener(this);
            }
        };
    }
}
