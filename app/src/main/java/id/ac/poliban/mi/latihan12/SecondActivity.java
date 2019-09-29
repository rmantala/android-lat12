package id.ac.poliban.mi.latihan12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText etTypeSomething = findViewById(R.id.etTypeSomething);
        Button btPush = findViewById(R.id.btPush);

        btPush.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.putExtra("secondData", etTypeSomething.getText().toString());
            setResult(RESULT_OK, intent);
            finish();
        });
    }
}
