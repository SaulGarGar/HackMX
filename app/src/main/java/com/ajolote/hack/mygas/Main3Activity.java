package com.ajolote.hack.mygas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.craftman.cardform.Card;
import com.craftman.cardform.CardForm;
import com.craftman.cardform.OnPayBtnClickListner;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        CardForm cardFrom= (CardForm)findViewById(R.id.cardform);
        TextView txtDes=(TextView)findViewById(R.id.payment_amount);
        Button btnPay = (Button)findViewById(R.id.btn_pay);

        //String valor = getIntent().getExtras().getString("pricevalue");

        txtDes.setText("$40");
        btnPay.setText(String.format("Pagar %s", txtDes.getText()));

        cardFrom.setPayBtnClickListner(new OnPayBtnClickListner() {
            @Override
            public void onClick(Card card) {
                Toast.makeText(Main3Activity.this,"Tarjeta valida",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
