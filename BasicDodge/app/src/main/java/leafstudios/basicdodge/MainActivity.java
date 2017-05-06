package leafstudios.basicdodge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button setButton;
    TextView scoreText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButton = (Button) findViewById(R.id.setButton);
        scoreText = (TextView) findViewById(R.id.scoreText);

    }
}
