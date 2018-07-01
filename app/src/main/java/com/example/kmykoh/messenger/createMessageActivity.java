package com.example.kmykoh.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class createMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onClickSend(View view)
    {
        EditText message = (EditText) findViewById(R.id.createMessage);
        String messageText = message.getText().toString();

//        Intent intent = new Intent(this, receiveMessageActivity.class);
//        intent.putExtra(receiveMessageActivity.extraMessage, messageText);

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        String chooserTitle = getString(R.string.chooser);
        Intent chooser = Intent.createChooser(intent, chooserTitle);
        startActivity(chooser);
    }
}
