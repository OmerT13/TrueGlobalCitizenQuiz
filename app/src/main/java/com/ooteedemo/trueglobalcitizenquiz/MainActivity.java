package com.ooteedemo.trueglobalcitizenquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button trueBtn;
    private Button falseBtn;
    private ImageButton nextBtn;

    private TextView questionTxtVw;

    private int currentQuestionIndex = 0;

    private Question[] questionsBank = new Question[] {
            new Question(R.string.question_brazil,true),
            new Question(R.string.question_malaysia,true),
            new Question(R.string.question_saudi,false),
            new Question(R.string.question_sudan,false),
            new Question(R.string.question_zimbabwe,true),
            new Question(R.string.question_turkey,false),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trueBtn = findViewById(R.id.true_btn);
        falseBtn = findViewById(R.id.false_btn);
        nextBtn = findViewById(R.id.next_btn);

        questionTxtVw = findViewById(R.id.answer_text_view);

//        Register our buttons to listen to click events using the OnClickListener interface
        trueBtn.setOnClickListener(this);
        falseBtn.setOnClickListener(this);
        nextBtn.setOnClickListener(this);
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
            case R.id.next_btn:
                Log.d("MYTAG", "onClick: "+currentQuestionIndex);
                questionTxtVw.setText(questionsBank[currentQuestionIndex].getAnswerResId());
//                We use the modulus to make sure we loop the array and never go out of bounds
                currentQuestionIndex = (currentQuestionIndex+1)%questionsBank.length;
                break;
        }
    }
}