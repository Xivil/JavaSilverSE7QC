package com.android.wings.websarva.javasilverse7qc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btStart = findViewById(R.id.btStart);
        StartListener startListener = new StartListener();
        btStart.setOnClickListener(startListener);
    }

    public class StartListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            int chapterNumber = 0;
            Spinner spinner = (Spinner) findViewById(R.id.spChapterSelect);
            chapterNumber =  spinner.getSelectedItemPosition() + 1;
            switch (chapterNumber){
                case 1:
                    Intent intent = new Intent(MainActivity.this, QuestionActivity.class);
                    intent.putExtra("chapterNumber", chapterNumber);
                    startActivity(intent);
                    break;
                default:
                    String string = chapterNumber + "章を選択しました。まだ実装されていない章です。";
                    Toast toast = Toast.makeText(MainActivity.this, string, Toast.LENGTH_LONG);
                    toast.show();
            }

        }
    }


}
