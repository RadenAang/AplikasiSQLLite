package com.example.aplikasisqllite;

import android.view.Menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class menu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu1);

        //menginisiasi dan memanggil widget button pada file layout
        Button btn1 =(Button)findViewById(R.id.button1);
        Button btn2 =(Button)findViewById(R.id.button2);
        Button btn3 =(Button)findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(menu.this,CreateData.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(menu.this,ViewData.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                moveTaskToBack(true);
                //membuat method tombol keluar dari aplikasi
            }
        });
    }



    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


//
}
