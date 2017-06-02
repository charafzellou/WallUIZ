package walluiz.chaze.lukiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import walluiz.chaze.lukiles.walluiz.R;

public class PLAY extends AppCompatActivity {

    private Button Button_PlayNormal;
    private Button Button_PlayHardcore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        Button_PlayNormal = (Button) findViewById(R.id.play_normal);
        Button_PlayHardcore = (Button) findViewById(R.id.play_hardcore);

        Button_PlayNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent_NORMAL = new Intent(PLAY.this, duringPlay.class);
                Toast.makeText(PLAY.this,"GAME STARTING",Toast.LENGTH_SHORT).show();
                startActivity(intent_NORMAL);
            }
        });

        Button_PlayHardcore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_HARDCORE = new Intent(PLAY.this, duringPlay.class);
                Toast.makeText(PLAY.this,"GAME STARTING",Toast.LENGTH_SHORT).show();
                startActivity(intent_HARDCORE);
            }
        });
    }
}
