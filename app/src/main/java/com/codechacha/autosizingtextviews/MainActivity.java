package com.codechacha.autosizingtextviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startActivity(View view) {
        switch(view.getId()) {
            case R.id.btn_default:
                startActivity(new Intent(this, DefaultActivity.class));
                break;
            case R.id.btn_granualarity:
                startActivity(new Intent(this, GranualarityActivity.class));
                break;
            case R.id.btn_preset:
                startActivity(new Intent(this, PresetActivity.class));
                break;
            case R.id.btn_java:
                startActivity(new Intent(this, JavaActivity.class));
                break;
        }
    }


}
