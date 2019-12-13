package android.example.tokoberkah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ListView list = (ListView) findViewById(R.id.listbarang);

        String[] namabarang = {"Gelas", "Lemari", "Gelok", "Kursi", "Mangkok", "Kompor", "Sapu",
        "Pel", "Pisau", "Kursi", "Kasur", "Karpet", "Rak Sepatu", "Panci", "Prasmanan", "Rice Cooker",
        };

        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,namabarang);
        list.setAdapter(myAdapter);


    }
}
