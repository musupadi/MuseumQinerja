package com.ascendant.museumqinerja.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.airbnb.lottie.LottieAnimationView;
import com.ascendant.museumqinerja.R;

public class LoginActivity extends AppCompatActivity {
    Button Login;
    LinearLayout LMain,LLoading;
    LottieAnimationView Loading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LMain = findViewById(R.id.linearMain);
        LLoading = findViewById(R.id.linearLoading);
        Loading = findViewById(R.id.lottieLoading);
        Login = findViewById(R.id.btnLogin);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LMain.setAlpha(0.5f);
                LLoading.setVisibility(View.VISIBLE);
                Loading.playAnimation();
                Loading.addAnimatorListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                });

            }
        });
    }
}