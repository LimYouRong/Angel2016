package com.example.p1431658.angelhack2016teacher;

/**
 * Created by P1431658 on 15/5/2016.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class navScreen extends AppCompatActivity implements View.OnClickListener  {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.navscreen);

            View classListBtn = findViewById(R.id.class_list);
            classListBtn.setOnClickListener(this);

            View formBtn = findViewById(R.id.form);
            formBtn.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.class_list:
                    startActivity(new Intent(this, ClassList.class));
                    break;
                case R.id.form:
                    startActivity(new Intent(this, MainActivity.class));
                    break;
            }
        }

}
