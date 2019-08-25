package com.example.browncarinvoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void goToInvoiceInfo(View view) {
        Intent intent = new Intent(this,Main4Activity.class);
        startActivity(intent);
    }

    public void goToNewInvoice(View view) {
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }
}
