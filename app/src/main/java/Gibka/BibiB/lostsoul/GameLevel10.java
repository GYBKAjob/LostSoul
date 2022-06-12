package Gibka.BibiB.lostsoul;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevel10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevel10);
        Button buttonStart = (Button) findViewById(R.id.button22);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevel10.this, GameLevelSmert11.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        });
        buttonStart = (Button) findViewById(R.id.button21);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevel10.this, GameLevelGood1.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        });
        buttonStart = (Button) findViewById(R.id.button23);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevel10.this, GameLevel12.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

    }
}