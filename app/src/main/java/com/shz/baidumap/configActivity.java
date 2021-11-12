package com.shz.baidumap;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class configActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);


        Button button1= (Button)findViewById(R.id.button1);
        //final Intent intent=new Intent(configActivity.this,MainActivity.class);
        final EditText et_latitude = (EditText)findViewById(R.id.latitude);
        final EditText et_longitude = (EditText)findViewById(R.id.longitude);
        final EditText et_radius = (EditText)findViewById(R.id.radius);


        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(configActivity.this,MainActivity.class) ;
                //可以把要传递的参数放到一个bundle里传递过去，bumdle可以看做一个特殊的map。
                Bundle bundle = new Bundle() ;
                double [ ] location=new double[3];
                location[0]=Double.parseDouble(et_latitude.getText().toString());
                location[1]=Double.parseDouble(et_longitude.getText().toString());
                location[2]=Double.parseDouble(et_radius.getText().toString());
                bundle.putSerializable("DATA", location) ;
                intent.putExtras(bundle) ;
                startActivity(intent) ;


            }
        });







    }
}
