package com.example.derry;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 设置用户名左侧小图标大小
        EditText etusername = (EditText) findViewById(R.id.userName);
        Drawable drawableusername = getResources().getDrawable(R.drawable.username);
        drawableusername.setBounds(0, 0, 60, 60);
        etusername.setCompoundDrawables(drawableusername, null, null, null);

        // 设置密码左侧小图标大小
        EditText etpassword = (EditText) findViewById(R.id.password);
        Drawable drawablepassword = getResources().getDrawable(R.drawable.password);
        drawablepassword.setBounds(0, 0, 60, 60);
        etpassword.setCompoundDrawables(drawablepassword, null, null, null);

        // 登录按钮跳转
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("LoginActivity","click");

                // 构造跳转意图
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);

                // 使用意图进行跳转
                startActivity(intent);
            }
        });
    }

}