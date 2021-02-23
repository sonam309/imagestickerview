package com.imagesticker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        stickerImageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_delete_foreground));
        parent.addView(stickerImageView);

    }
}