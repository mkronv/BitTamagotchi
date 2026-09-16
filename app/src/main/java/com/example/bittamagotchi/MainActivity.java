package com.example.bittamagotchi;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.graphics.drawable.AnimationDrawable;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView petImageView = findViewById(R.id.ivPet);
        AnimationDrawable petAnimation = (AnimationDrawable) petImageView.getDrawable();

        if (petAnimation != null){
            petAnimation.start();
        }
    }
}