package android.example.tokoberkah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{
public Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button thirdMove = (Button) findViewById(R.id.btn_Katalog);
        thirdMove.setOnClickListener(this);
        Button fourthMove = (Button) findViewById(R.id.btn_Foto);
        fourthMove.setOnClickListener(this);
        Button fifthMove = (Button) findViewById(R.id.btn_About);
        fifthMove.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_Katalog:
                startActivity(new Intent(this, ThirdActivity.class));
                break;
            case R.id.btn_Foto:
                startActivity(new Intent(this, FourthActivity.class));
                break;
            case R.id.btn_About:
                startActivity(new Intent(this, FifthActivity.class));
                break;
            case R.id.btn_back:
                finish();
                break;
        }
    }
}

