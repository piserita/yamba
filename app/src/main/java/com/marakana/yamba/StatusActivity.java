package com.marakana.yamba;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StatusActivity extends Activity implements View.OnClickListener {

    private static final String TAG = "StatusActivity";
    EditText editText;
    Button updateButton;
    //Twitter twitter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.status);
        editText = (EditText) findViewById(R.id.editText); //
        updateButton = (Button) findViewById(R.id.buttonUpdate);
        updateButton.setOnClickListener(this); //
        //twitter = Twitter.|     ; //
        //twitter.setAPIRootUrl("http://yamba.marakana.com/api");
    }

    public void onClick(View v) {
        //twitter.setStatus(editText.getText().toString()); //
        Log.d(TAG, "onClicked");
    }
}
