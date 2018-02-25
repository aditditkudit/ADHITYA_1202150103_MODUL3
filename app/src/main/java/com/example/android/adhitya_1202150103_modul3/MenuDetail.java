package com.example.android.adhitya_1202150103_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MenuDetail extends AppCompatActivity {

    private Button btnAdd, btnMin;
    private ImageView progress, img;
    private TextView judul, desc, stats;
    private int level = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_detail);

        btnAdd = (Button)findViewById(R.id.btnIsiTambah);
        btnMin = (Button)findViewById(R.id.btnIsiKurang);
        progress = (ImageView)findViewById(R.id.imgIsi);

        judul = (TextView)findViewById(R.id.lblJudul);
        desc = (TextView)findViewById(R.id.lblDeskripsi);
        img = (ImageView)findViewById(R.id.lblImg);
        stats = (TextView)findViewById(R.id.lblStatus);

        Intent in = getIntent();
        String title = in.getStringExtra("etitle");
        String description = in.getStringExtra("edesc");
        if (description.length()<1){
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin ut tincidunt dui. Etiam et tincidunt dolor. Phasellus eu rhoncus sem. Suspendisse laoreet dolor eu nisi dictum congue id ut ipsum. Etiam sagittis sodales urna. Sed condimentum arcu at pretium laoreet. Nam venenatis leo sit amet sodales malesuada. Morbi quis convallis lorem, quis malesuada elit. Integer suscipit mauris et ex finibus, id aliquam nisi maximus. Quisque lacinia suscipit ipsum, in posuere elit eleifend vel. Vestibulum vehicula, est ac interdum tristique, elit odio volutpat ex, eu eleifend erat dolor a mauris.\\nInterdum et malesuada fames ac ante ipsum primis in faucibus. Nunc sagittis sagittis orci, a mollis justo ultrices id. Vestibulum a neque eget magna ultricies posuere eget ut sem. Nunc egestas vestibulum metus. Praesent et mi quis dolor pellentesque mattis quis eu turpis. Nunc convallis quis elit vitae ornare. Sed venenatis sed lorem eget posuere. Nam lobortis diam dui, et sollicitudin velit faucibus quis. Donec sit amet neque non diam aliquam imperdiet.\n";
        }
        int imgRes = in.getIntExtra("eimg", 0);

        setTitle(title);
        judul.setText(title);
        desc.setText(description);
        img.setImageResource(imgRes);

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                isiNambah();
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                isiKurang();
            }
        });
    }

    private void isiKurang() {
        status();
        if(level==0){
            Toast.makeText(this,"Air Kosong",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(--level);
    }



    private void isiNambah() {
        status();
        if(level==6){Toast.makeText(this,"Air Penuh",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(++level);

    }

    private void status() {
        stats.setText(""+level+"L");
    }
}
