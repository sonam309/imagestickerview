package com.imagesticker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.imagestickerlibrary.StickerImageView;

public class MainActivity extends AppCompatActivity {

    private FrameLayout parent;
    private ImageView main_iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parent=findViewById(R.id.parent);

        StickerImageView stickerImageView= new StickerImageView(this);
        stickerImageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_delete));
        parent.addView(stickerImageView);


        parent.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                stickerImageView.setControlsVisibility(false);


                return true;
            }
        });

    }
}