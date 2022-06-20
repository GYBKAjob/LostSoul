package Gibka.BibiB.lostsoul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class LevelConstructor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevel0);
        int position = getIntent().getIntExtra("pos",0);
        ImageView imageview = findViewById(R.id.game);
        ButtonHolder bh = MainActivity.levels.get(position);
        LinearLayout lin = findViewById(R.id.lin);
        imageview.setBackgroundResource(bh.background);
        TextView textview = findViewById(R.id.t);
        textview.setText(bh.text);
        for (int i = 0; i < bh.num; i++) {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(200,100);
            Button btn = new Button(this);
            btn.setId(i);
            final int id = btn.getId();
            btn.setText(bh.story[i]);
            params.setMargins(10,10,10,10);
            btn.setBackgroundColor(Color.rgb(0, 0, 0));
            lin.addView(btn, params);
            btn = ((Button) findViewById(id));
            btn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = getIntent();
                    intent.putExtra("pos", bh.positions[id]);
                    finish();
                    startActivity(intent);
                }
            });
        }



    }
}