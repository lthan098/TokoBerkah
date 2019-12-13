package android.example.tokoberkah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FifthActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnBack;
    private  Button btn_map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener((View.OnClickListener) this);

        btn_map = findViewById(R.id.btn_Map);
        btn_map.setOnClickListener((View.OnClickListener) this);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_Map:
                startActivity(new Intent(this, MapActivity.class));
                break;
            case R.id.btn_back:
                finish();
                break;
        }
    }
}