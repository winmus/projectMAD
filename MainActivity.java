package com.project.aplikasicekberatbadan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        btnHitung = (Button)findViewById(R.id.btn_hitung);

        /*btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
    }

    public void hitung(View view) {
        Intent hitungIntent = new Intent(MainActivity.this,HitungActivity.class);
        startActivity(hitungIntent);

    }

    public void tentang(View view) {
        Intent i = new Intent(MainActivity.this,TentangActivity.class);
        startActivity(i);
    }
}
