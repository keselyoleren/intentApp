package com.keselyoleren;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveActivityData = findViewById(R.id.btn_move_activity_data);
        btnMoveActivityData.setOnClickListener(this);

        Button btnDialNumber = findViewById(R.id.btn_dial_number);
        btnDialNumber.setOnClickListener(this);

        Button btnViewViews = findViewById(R.id.btn_view_views);
        btnViewViews.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:
                Intent moveActivityData = new Intent(MainActivity.this, MoveActivityWithData.class);
                moveActivityData.putExtra(MoveActivityWithData.EXTRA_NAME , "KESELYOLEREN");
                moveActivityData.putExtra(MoveActivityWithData.EXTRA_AGE,12);
                startActivity(moveActivityData);
                break;
            case R.id.btn_dial_number:
                String phone = "08123546981";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phone));
                startActivity(dialPhoneIntent);
                break;
            case R.id.btn_view_views:
                Intent moveViews = new Intent(MainActivity.this, ViewViews.class);
                startActivity(moveViews);
                break;
        }
    }
}