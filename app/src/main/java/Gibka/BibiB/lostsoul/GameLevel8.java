package Gibka.BibiB.lostsoul;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import androidx.appcompat.app.AppCompatActivity;

public class GameLevel8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevel8);
        Button buttonStart = (Button) findViewById(R.id.button14);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevel8.this, GameLevelSmert1.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        });
        buttonStart = (Button) findViewById(R.id.button20);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevel8.this, GameLevel9.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });

    }
}