package id.ac.poliban.mi.latihan12;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //koneksikan view melalui object
        tvResult = findViewById(R.id.tvResult);
        Button btLaunch = findViewById(R.id.btLaunch);

        btLaunch.setOnClickListener(view -> startActivityForResult(new Intent(this, SecondActivity.class), 1000));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1000 && resultCode==RESULT_OK)
            tvResult.setText(data.getStringExtra("secondData"));
    }
}
