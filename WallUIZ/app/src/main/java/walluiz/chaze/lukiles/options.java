package walluiz.chaze.lukiles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import walluiz.chaze.lukiles.walluiz.R;

public class options extends AppCompatActivity {
    private Button button_answer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        button_answer4 = (Button)findViewById(R.id.button_answer4);

        button_answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
