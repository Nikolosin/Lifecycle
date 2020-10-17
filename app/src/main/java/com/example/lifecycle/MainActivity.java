package com.example.lifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Lifecycle";
    private TextView textView;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        name = Objects.requireNonNull(new Object() {
        }.getClass().getEnclosingMethod()).getName();
        if (savedInstanceState != null) {
            textView.setText(R.string.isTrue);
        } else {
            textView.setText(R.string.isFalse);
        }
        Log.d(TAG, name);
        textView.append("\n" + name);
    }

    @Override
    protected void onStart() {
        super.onStart();
        name = Objects.requireNonNull(new Object() {
        }.getClass().getEnclosingMethod()).getName();
        Log.d(TAG, name);
        textView.append("\n" + name);
    }

    @Override
    protected void onResume() {
        super.onResume();
        name = Objects.requireNonNull(new Object() {
        }.getClass().getEnclosingMethod()).getName();
        Log.d(TAG, name);
        textView.append("\n" + name);
    }

    @Override
    protected void onPause() {
        super.onPause();
        name = Objects.requireNonNull(new Object() {
        }.getClass().getEnclosingMethod()).getName();
        Log.d(TAG, name);
        textView.append("\n" + name);
    }

    @Override
    protected void onStop() {
        super.onStop();
        name = Objects.requireNonNull(new Object() {
        }.getClass().getEnclosingMethod()).getName();
        Log.d(TAG, name);
        textView.append("\n" + name);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        name = Objects.requireNonNull(new Object() {
        }.getClass().getEnclosingMethod()).getName();
        Log.d(TAG, name);
        textView.append("\n" + name);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        name = Objects.requireNonNull(new Object() {
        }.getClass().getEnclosingMethod()).getName();
        Log.d(TAG, name);
        textView.append("\n" + name);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        name = Objects.requireNonNull(new Object() {
        }.getClass().getEnclosingMethod()).getName();
        Log.d(TAG, name);
        textView.append("\n" + name);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        name = Objects.requireNonNull(new Object() {
        }.getClass().getEnclosingMethod()).getName();
        Log.d(TAG, name);
        textView.append("\n" + name);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        name = Objects.requireNonNull(new Object() {
        }.getClass().getEnclosingMethod()).getName();
        Log.d(TAG, name);
        textView.append("\n" + name);
        return true;
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        name = Objects.requireNonNull(new Object() {
        }.getClass().getEnclosingMethod()).getName();
        Log.d(TAG, name);
        textView.append("\n" + name);
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        name = Objects.requireNonNull(new Object() {
        }.getClass().getEnclosingMethod()).getName();
        Log.d(TAG, name);
        textView.append("\n" + name);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        name = Objects.requireNonNull(new Object() {
        }.getClass().getEnclosingMethod()).getName();
        Log.d(TAG, name);
        textView.append("\n" + name);
        outState.putString("TextView", textView.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        name = Objects.requireNonNull(new Object() {
        }.getClass().getEnclosingMethod()).getName();
        Log.d(TAG, name);
        textView.setText(R.string.isTrue);
        textView.append("\n" + name);
        textView.append("\n" + "\n" + savedInstanceState.getString("TextView") + "\n");
    }
}