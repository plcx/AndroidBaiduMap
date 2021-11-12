package com.shz.baidumap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    Button btn_register;//注册按钮
    Button to_login; //返回按钮
    EditText user_name,psw1,psw2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
    }
    private void init() {
        btn_register=findViewById(R.id.btn_register);
        to_login=findViewById(R.id.to_login);

        user_name=findViewById(R.id.userName);
        psw1=findViewById(R.id.passwd);
        psw2=findViewById(R.id.passwd2);
        //返回按钮
        to_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //为了跳转到登录界面
                Intent intent=new Intent(RegisterActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        //注册按钮
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterActivity.this,loginActivity.class);
                intent.putExtra("username",user_name.getText().toString());
                intent.putExtra("psw",psw1.getText().toString());
                startActivity(intent);
            }
        });
    }

}