package fauzi.hilmy.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    //tipe data
//
//    String namaFirst = "Hilmy";
//    String namaLast = "Fauzi";
//
//    //deklarasi widget
//
//    TextView txtWelcome;

    EditText etNama, etSekolah;
    Button btnSubmit;
    TextView txtWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        System.out.println("Full name : " + namaFirst + namaLast);

        //memanggil id dari textview
       txtWelcome = (TextView) findViewById(R.id.txtWelcome);
       etNama = (EditText) findViewById(R.id.etNama);
       etSekolah = (EditText) findViewById(R.id.etSekolah);
       btnSubmit = (Button) findViewById(R.id.btnSubmit);

       //menambahkan aksi ketika btnSubmit diklik
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nNama = etNama.getText().toString();
                String nSekolah = etSekolah.getText().toString();

                txtWelcome.setText("Halo!!, " + nNama + " , Your School is in " + nSekolah);
            }
        });


//        //menampilkan hasil teks ke widget textview
//        txtWelcome.setText("Hy, " + namaFirst + " " + namaLast);


    }
}
