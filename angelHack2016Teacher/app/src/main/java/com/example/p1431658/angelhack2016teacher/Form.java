package com.example.p1431658.angelhack2016teacher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Joshua on 14/5/2016.
 */
public class Form extends AppCompatActivity {

    private ImageView imageView;
    private Button next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);

        Button nextBtn = (Button) findViewById(R.id.next);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.next:
                        startActivity(new Intent(Form.this, MainActivity.class));
                        break;
                }
            }
        });
    }

}

