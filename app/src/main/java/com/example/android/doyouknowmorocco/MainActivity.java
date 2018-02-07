package com.example.android.doyouknowmorocco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int score_result(int score) {
        RadioButton correctAnswer1 = findViewById(R.id.a12);
        RadioButton correctAnswer2 = findViewById(R.id.a21);
        RadioButton correctAnswer3 = findViewById(R.id.a33);
        RadioButton correctAnswer4 = findViewById(R.id.a41);
        RadioButton correctAnswer5 = findViewById(R.id.a53);
        RadioButton correctAnswer6 = findViewById(R.id.a61);
        RadioButton correctAnswer7 = findViewById(R.id.a72);

        if (correctAnswer1.isChecked()) {
            score++;
        }
        if (correctAnswer2.isChecked()) {
            score++;
        }
        if (correctAnswer3.isChecked()) {
            score++;
        }
        if (correctAnswer4.isChecked()) {
            score++;
        }
        if (correctAnswer5.isChecked()) {
            score++;
        }
        if (correctAnswer6.isChecked()) {
            score++;
        }
        if (correctAnswer7.isChecked()) {
            score++;
        }
        return score;
    }

    public void submit_results_text(View view) {
        EditText quizzer_field = findViewById(R.id.field);
        String quizzer_name = quizzer_field.getText().toString();
        String results = create_results_text(score, quizzer_name);

        display_results(results);
    }

    public String create_results_text(int score, String quizzer_name) {
        String results = quizzer_name;
        results = results + ", you got " + score_result(score) + " correct out of 7";
        if (score_result(score) == 7) {
            results += "\n\n" + getString(R.string.winner_1);
        } else {
            if (score_result(score) >= 4) {
                results += "\n\n" + getString(R.string.winner_2);
            } else {
                results += "\n\n" + getString(R.string.winner_3);
            }
        }
        return results;
    }


    public void display_results(String message) {
        TextView results_texts = findViewById(R.id.results_text);
        results_texts.setText(message);
    }


    public void answer_1(View view) {
        TextView q1 = findViewById(R.id.q1_TextView);
        ImageView step1 = findViewById(R.id.q1_imageView);
        RadioButton a11 = findViewById(R.id.a11);
        RadioButton a12 = findViewById(R.id.a12);
        if (a11.isChecked() || a12.isChecked()) {
            step1.setImageResource(R.drawable.red);
            q1.setTextColor(getResources().getColor(R.color.red));
        }
    }

    public void answer_2(View view) {
        TextView q2 = findViewById(R.id.q2_TextView);
        ImageView step2 = findViewById(R.id.q2_imageView);
        RadioButton a21 = findViewById(R.id.a21);
        RadioButton a22 = findViewById(R.id.a22);
        if (a21.isChecked() || a22.isChecked()) {
            step2.setImageResource(R.drawable.orange);
            q2.setTextColor(getResources().getColor(R.color.orange));
        }
    }

    public void answer_3(View view) {
        TextView q3 = findViewById(R.id.q3_TextView);
        ImageView step3 = findViewById(R.id.q3_imageView);
        RadioButton a31 = findViewById(R.id.a31);
        RadioButton a32 = findViewById(R.id.a32);
        RadioButton a33 = findViewById(R.id.a33);
        if (a31.isChecked() || a32.isChecked() || a33.isChecked()) {
            step3.setImageResource(R.drawable.yellow);
            q3.setTextColor(getResources().getColor(R.color.yellow));
        }
    }

    public void answer_4(View view) {
        TextView q4 = findViewById(R.id.q4_TextView);
        ImageView step4 = findViewById(R.id.q4_imageView);
        RadioButton a41 = findViewById(R.id.a41);
        RadioButton a42 = findViewById(R.id.a42);
        if (a41.isChecked() || a42.isChecked()) {
            step4.setImageResource(R.drawable.green);
            q4.setTextColor(getResources().getColor(R.color.green));
        }
    }

    public void answer_5(View view) {
        TextView q5 = findViewById(R.id.q5_TextView);
        ImageView step5 = findViewById(R.id.q5_imageView);
        RadioButton a51 = findViewById(R.id.a51);
        RadioButton a52 = findViewById(R.id.a52);
        RadioButton a53 = findViewById(R.id.a53);
        if (a51.isChecked() || a52.isChecked() || a53.isChecked()) {
            step5.setImageResource(R.drawable.teal);
            q5.setTextColor(getResources().getColor(R.color.teal));
        }
    }

    public void answer_6(View view) {
        TextView q6 = findViewById(R.id.q6_TextView);
        ImageView step6 = findViewById(R.id.q6_imageView);
        RadioButton a61 = findViewById(R.id.a61);
        RadioButton a62 = findViewById(R.id.a62);
        if (a61.isChecked() || a62.isChecked()) {
            step6.setImageResource(R.drawable.blue);
            q6.setTextColor(getResources().getColor(R.color.blue));
        }
    }

    public void answer_7(View view) {
        TextView q7 = findViewById(R.id.q7_TextView);
        ImageView step7 = findViewById(R.id.q7_imageView);
        RadioButton a71 = findViewById(R.id.a71);
        RadioButton a72 = findViewById(R.id.a72);
        if (a71.isChecked() || a72.isChecked()) {
            step7.setImageResource(R.drawable.indigo_purple);
            q7.setTextColor(getResources().getColor(R.color.indigo));
        }
    }
}
