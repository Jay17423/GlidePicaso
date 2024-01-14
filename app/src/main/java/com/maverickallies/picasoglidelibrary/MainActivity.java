package com.maverickallies.picasoglidelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {
    ImageView MyimageView;
    Button glideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyimageView=(ImageView) findViewById(R.id.MyImage);
        glideButton=(Button) findViewById(R.id.GlideButton);

    }

    public void MyButton(View view){
        String myUrl = "https://picsum.photos/200";
        Glide.with(this).load(myUrl).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).into(MyimageView);


    }
}