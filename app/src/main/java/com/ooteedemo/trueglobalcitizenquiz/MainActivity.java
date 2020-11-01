package com.ooteedemo.trueglobalcitizenquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button trueBtn;
    private Button falseBtn;
    private TextView questionTxtVw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trueBtn = findViewById(R.id.true_btn);
        falseBtn = findViewById(R.id.false_btn);
        questionTxtVw = findViewById(R.id.answer_text_view);

//        Register our buttons to listen to click events using the OnClickListener interface
        trueBtn.setOnClickListener(this);
        falseBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.true_btn:
                Toast.makeText(MainActivity.this,"True",Toast.LENGTH_SHORT).show();
                break;
            case R.id.false_btn:
                Toast.makeText(MainActivity.this,"False",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}