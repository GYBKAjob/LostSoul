package Gibka.BibiB.lostsoul;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevel12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevel12);
        Button buttonStart = (Button) findViewById(R.id.button22);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevel12.this, GameLevel13.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        });

    }
}