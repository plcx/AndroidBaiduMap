package com.shz.baidumap;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView userName = findViewById(R.id.userName);
        TextView Password = findViewById(R.id.passwd);
        Button btn_register = findViewById(R.id.btn_register);
        Button btn_login = findViewById(R.id.btnLogin); //获取xml中的元素

        String username = getIntent().getStringExtra("username");//从注册界面传过来的数据
        String password = getIntent().getStringExtra("psw");
        userName.setText(username);
        Password.setText(password);


        //登录按钮的点击事件
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginActivity.this, configActivity.class);
                startActivity(intent);
            }
        });
        //注册控件的点击事件
        btn_register.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //为了跳转到注册界面，并实现注册功能
                Intent intent=new Intent(loginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });




    }

}
