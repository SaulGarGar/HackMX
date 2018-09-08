package com.ajolote.hack.mygas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class Main2Activity extends AppCompatActivity {
    Button boton1;
    private EditText yourEditText;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        yourEditText = (EditText) findViewById(R.id.editTextprice);
        String price1 = yourEditText.getText().toString();

        boton1 = (Button)findViewById(R.id.buttont2);



        boton1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                //price1 = (String) findViewById(R.id.price1);
               // Bundle parametros = this.getIntent().getExtras();
               // if (parametros != null) {
                 //   String datos = parametros.getString("datos");
                    //price1.setText(datos);
                //}
                startActivity(new Intent(Main2Activity.this, Main3Activity.class));
                //Intent intent = new Intent(this, Main3Activity.class);
               // intent.putExtras("datos", datos);
                //startActivity(intent);

            }}



    );
    }


}




