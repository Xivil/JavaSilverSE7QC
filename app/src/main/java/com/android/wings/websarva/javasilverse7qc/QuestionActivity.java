package com.android.wings.websarva.javasilverse7qc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        Intent intent = getIntent();
        int chapterNumber = intent.getIntExtra("chapterNumber", 30);
        TextView txText = findViewById(R.id.txTest);
        txText.setText(chapterNumber + "章です。");
    }
}
