package com.example.semical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    TextView TextViewCurrentValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextViewCurrentValue = findViewById(R.id.TextViewCurrentValue);

        String num1 = getIntent().getStringExtra("NUM1");
        TextViewCurrentValue.setText(num1);
    }

    public void goBack(View view) {
        Intent intent = new Intent();

        Button opsBtn = (Button) findViewById(view.getId());
        String operand = opsBtn.getText().toString();

        String num1 = getIntent().getStringExtra("NUM1");
        TextViewCurrentValue.setText(num1 + operand);

        intent.putExtra("OPS", opsBtn.getText());


        setResult(RESULT_OK, intent);

        finish();
    }
}
