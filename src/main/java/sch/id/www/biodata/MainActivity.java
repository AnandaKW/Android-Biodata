package sch.id.www.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
    private EditText edtName;
    private EditText edtTtl;
    private EditText edtKelas;
    private EditText edtAlamat;
    private EditText edtHobby;
    private Button btnSave;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edt_name);
        edtTtl = findViewById(R.id.edt_ttl);
        edtKelas = findViewById(R.id.edt_kelas);
        edtAlamat = findViewById(R.id.edt_address);
        edtHobby = findViewById(R.id.edt_hobby);
        btnSave = findViewById(R.id.btn_save);
        tvResult = findViewById(R.id.tv_result);

        btnSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_save){
            String inputName = edtName.getText().toString().trim();
            String inputTtl = edtTtl.getText().toString().trim();
            String inputKelas = edtKelas.getText().toString().trim();
            String inputAlamat = edtAlamat.getText().toString().trim();
            String inputHobby = edtHobby.getText().toString().trim();

            boolean isEmptyFields = false;

            if (TextUtils.isEmpty(inputName)){
                isEmptyFields = true;
                edtName.setError("Mohon isi field ini");
            }
            if (TextUtils.isEmpty(inputTtl)){
                isEmptyFields = true;
                edtTtl.setError("Mohon isi field ini");
            }
            if (TextUtils.isEmpty(inputKelas)){
                isEmptyFields = true;
                edtKelas.setError("Mohon isi field ini");
            }
            if (TextUtils.isEmpty(inputAlamat)){
                isEmptyFields = true;
                edtAlamat.setError("Mohon isi field ini");
            }
            if (TextUtils.isEmpty(inputHobby)){
                isEmptyFields = true;
                edtHobby.setError("Mohon isi field ini");
            }
            String name = (inputName);
            String ttl = (inputTtl);
            String kelas = (inputKelas);
            String alamat = (inputAlamat);
            String hobi = (inputHobby);

            if (!isEmptyFields){
                String output1 = "Nama: "+ name;
                String output2 = "Tanggal Lahir: "+ ttl;
                String output3 = "Kelas: "+kelas;
                String output4 = "Alamat: "+alamat;
                String output5 = "Hobi: "+hobi;
                tvResult.setText(String.valueOf(output1)+"\n"+"\n"
                        +(output2)+"\n"+"\n"
                        +(output3)+"\n"+"\n"
                        +(output4)+"\n"+"\n"
                        +(output5));
            }
        }
    }
}