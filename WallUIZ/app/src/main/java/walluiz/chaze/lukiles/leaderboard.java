package walluiz.chaze.lukiles;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import walluiz.chaze.lukiles.walluiz.R;

public class leaderboard extends AppCompatActivity {
    private Button button_reset;

    private TextView leaderboard_score_1;
    private TextView leaderboard_score_2;
    private TextView leaderboard_score_3;
    private TextView leaderboard_score_4;
    private TextView leaderboard_score_5;
    private TextView leaderboard_score_6;
    private TextView leaderboard_score_7;
    private TextView leaderboard_score_8;
    private TextView leaderboard_score_9;
    private TextView leaderboard_score_10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        button_reset = (Button)findViewById(R.id.button_reset);


        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences prefs = leaderboard.this.getSharedPreferences("score", Context.MODE_PRIVATE);
                SharedPreferences.Editor edit = prefs.edit();

                edit.remove("score");
            }
        });


    }
}
