package android.example.tokoberkah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }

    public void submitOrder(View view) {
        EditText namaField = (EditText) findViewById(R.id.nama);
        Editable namaEditable = namaField.getText();
        String nama = namaEditable.toString();

        EditText alamatField = (EditText) findViewById(R.id.alamat);
        Editable alamatEditable = alamatField.getText();
        String alamat = alamatEditable.toString();

        EditText barangField = (EditText) findViewById(R.id.barang);
        Editable barangEditable = barangField.getText();
        String barang = barangEditable.toString();

        EditText jumlahField = (EditText) findViewById(R.id.jumlah);
        Editable jumlahEditable = jumlahField.getText();
        String jumlah = jumlahEditable.toString();

        String message = createOrderSummary(nama, alamat, barang, jumlah);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto: tokoberkah@gmail.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT,
                getString(R.string.order_summary_email_subject, alamat));
        intent.putExtra(Intent.EXTRA_TEXT, message);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    private String createOrderSummary(String nama, String alamat, String barang, String jumlah) {
        String reqproduk = getString(R.string.order_summary_nama , nama);
        reqproduk += "\n" + getString(R.string.order_summary_alamat, alamat);
        reqproduk += "\n" + getString(R.string.order_barang, barang);
        reqproduk += "\n" + getString(R.string.order_jumlah, jumlah);

        reqproduk += "\n" + getString(R.string.thank_you);
        return reqproduk;
    }
}
