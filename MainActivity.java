package com.example.cesar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private BreakIterator NewText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Decrypt(View view) {

        TextView text = (TextView) findViewById(R.id.OldText);
        String t = text.getText().toString();


        TextView key = (TextView) findViewById(R.id.Key);
        String k = key.getText().toString();
        int kk = Integer.parseInt(k);

        char[] chars = t.toCharArray();
        StringBuilder test2 = new StringBuilder();
        for(byte b=0; chars.length>b;b++){  chars[b]=(char) (chars[b]-kk);
            test2.append(chars[b]);}
        TextView tn = (TextView) findViewById(R.id.NewText);
        tn.setText(String.valueOf(test2));






        /*
        String t1 = text.getText();
        String k = Key.getText();
        int kk = Integer.parseInt(k);





        char[] chars = t1.toCharArray();
        StringBuilder test2 = new StringBuilder();
        for(byte b=0; chars.length>b;b++){  chars[b]=(char) (chars[b]-kk);
            test2.append(chars[b]);}
        NewText.setText(String.valueOf(test2));

*/

    }

    public void Encrypt(View view) {





        TextView text = (TextView) findViewById(R.id.OldText);
        String t = text.getText().toString();


        TextView key = (TextView) findViewById(R.id.Key);
        String k = key.getText().toString();
        int kk = Integer.parseInt(k);

        char[] chars = t.toCharArray();
        StringBuilder test2 = new StringBuilder();
        for(byte b=0; chars.length>b;b++){  chars[b]=(char) (chars[b]+kk);
            test2.append(chars[b]);}
        TextView tn = (TextView) findViewById(R.id.NewText);
        tn.setText(String.valueOf(test2));













        /*String t1 = text.getText();
        String k = key.getText();
        int kk = Integer.parseInt(k);




        char[] chars = t1.toCharArray();
        StringBuilder test2 = new StringBuilder();
        for(byte b=0; chars.length>b;b++){  chars[b]=(char) (chars[b]+kk);
            test2.append(chars[b]);}
        NewText.setText(String.valueOf(test2));
*/


    }
}