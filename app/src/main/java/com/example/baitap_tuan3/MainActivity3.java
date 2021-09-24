package com.example.baitap_tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    ImageView imgImage;
    Flower mChair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imgImage = findViewById(R.id.imgImage);
        Intent intent = getIntent();
        if (intent != null){
            mChair = (Flower) intent.getSerializableExtra("key1");
            imgImage.setImageResource(mChair.getAnh());
            Fade fade = new Fade();
            View decor = getWindow().getDecorView();

            //below methods are used for adding enter and exit transition.
            getWindow().setEnterTransition(fade);
            getWindow().setExitTransition(fade);
        }
    }
}