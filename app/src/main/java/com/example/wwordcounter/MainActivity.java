package com.example.wwordcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wwordcounter.count.counter;

public class MainActivity extends AppCompatActivity {

    Spinner spOptions;
    EditText etinputText;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       this.spOptions = findViewById(R.id.spOptions);
       this.etinputText = findViewById(R.id.etinputText);
       this.tvResult = findViewById(R.id.tvResult);

        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,
                R.array.Choices, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout. simple_spinner_dropdown_item);
        this.spOptions.setAdapter(adapter);
    }


    public void onBtnClick(View view) {

        String phrase = this.etinputText.getText().toString();
        int charsCount = counter.getNumber(phrase);
        if(TextUtils.isEmpty(phrase)){
            Toast.makeText(MainActivity.this, "It's empty", Toast.LENGTH_SHORT).show();
        }

        if(this.spOptions.getSelectedItem().toString().equals(getResources().getString(R.string.CharactersSelection))) {
            phrase = this.etinputText.getText().toString();
            charsCount = counter.getNumber(phrase);
            String formattedResult = String.valueOf(charsCount);
            this.tvResult.setText(formattedResult);
        }

        if(this.spOptions.getSelectedItem().toString().equals(getResources().getString(R.string.WordsSelection))) {
            phrase = this.etinputText.getText().toString();
                int wordsCount = counter.getWordNumber(phrase);
                String formattedResult = String.valueOf(wordsCount);
                this.tvResult.setText(formattedResult);

        }
    }
}
