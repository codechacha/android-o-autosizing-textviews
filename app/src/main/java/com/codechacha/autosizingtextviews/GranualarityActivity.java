package com.codechacha.autosizingtextviews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by mjs on 18. 1. 22.
 */

public class GranualarityActivity extends AppCompatActivity {
    private TextView mTextView;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_granualarity);

        mTextView = (TextView) findViewById(R.id.tv_text);
        mEditText = (EditText) findViewById(R.id.et_input);
        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mTextView.setText(s);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

    }
}
