package com.kb.discountcalcdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt;
    EditText cos;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.button);
        cos = findViewById(R.id.cost);
        res = findViewById(R.id.result);
        final int coss = Integer.parseInt(cos.getText().toString());
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resu = coss*25/100;
                res.setText(String.valueOf(resu));
            }
        });
    }
}
