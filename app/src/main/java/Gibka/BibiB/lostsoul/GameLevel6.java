package Gibka.BibiB.lostsoul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameLevel6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevel6);
        Button buttonStart = (Button) findViewById(R.id.button9);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevel6.this, GameLevel3.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        });
    }
}