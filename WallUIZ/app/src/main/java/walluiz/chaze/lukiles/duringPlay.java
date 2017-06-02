package walluiz.chaze.lukiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import walluiz.chaze.lukiles.walluiz.R;

public class duringPlay extends AppCompatActivity {

    private TextView txt_question;
    private Button but_answer1;
    private Button but_answer2;
    private Button but_answer3;
    private Button but_answer4;
    private Button but_surrender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_during_play);

        txt_question = (TextView) findViewById(R.id.label_question);
        but_answer1 = (Button) findViewById(R.id.button_answer1);
        but_answer2 = (Button) findViewById(R.id.button_answer2);
        but_answer3 = (Button) findViewById(R.id.button_answer3);
        but_answer4 = (Button) findViewById(R.id.button_answer4);
        but_surrender = (Button) findViewById(R.id.button_surrender);

        //String[] allMyQuestions = getResources().getStringArray(R.string);
        //int srand = (int)((Math.random())%(allMyQuestions.length));
        //String randomString = allMyQuestions[srand];

        //String[] allMyQuestions = getResources().getStringArray(R.string);
        //int srand = (int)((Math.random())%(allMyQuestions.length));
        //String randomString = allMyQuestions[srand];

        //but_answer1.setText();

        but_surrender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                duringPlay.this.finish();
            }
        });
    }
}
