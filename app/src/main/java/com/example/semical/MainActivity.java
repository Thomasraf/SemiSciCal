package com.example.semical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView TextViewValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextViewValue = (TextView) findViewById(R.id.TextViewCurrentValue);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        String sign = intent.getStringExtra("OPS");
        String number1 = TextViewValue.getText().toString();
        TextViewValue.setText(number1 + sign);
    }

    public void calculateOnClick(View view) {
        Button pressed = (Button) findViewById(view.getId());
        String value = pressed.getText().toString();
        TextViewValue.setText(value + "");
    }

    public void toOps(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        String number1 = TextViewValue.getText().toString();
        intent.putExtra("NUM1", number1);


        startActivity(intent);
    }


}
