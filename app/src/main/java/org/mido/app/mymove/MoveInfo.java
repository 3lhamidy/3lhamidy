package org.mido.app.mymove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MoveInfo extends AppCompatActivity {
    private TextView name , info, date ;
    private Bundle recever = getIntent().getExtras();
    private ImageView aya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_info);
        name = findViewById(R.id.txtname);
        info = findViewById(R.id.txtinfo);
        date = findViewById(R.id.txtdate);
        aya = findViewById(R.id.img_aya);

        mido();

    }

    private void mido() {
        if (recever!= null) {

            name.setText(recever.getString("name"));
            info.setText(recever.getString("info"));
            date.setText(recever.getString("date"));
            aya.setImageResource(recever.getInt("img"));
        }
    }

}