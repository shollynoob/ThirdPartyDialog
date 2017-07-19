package com.visionstech.thirdpartydialog;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.MaterialDialog;
import com.klinker.android.link_builder.Link;
import com.klinker.android.link_builder.LinkBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Link a = new Link("ipsum")
                .setTextColor(Color.parseColor("#259B24"))
                .setTextColorOfHighlightedLink(Color.parseColor("#0D3D0C"))
                .setHighlightAlpha(.4f)
                .setUnderlined(false)
                .setBold(true)
                .setOnClickListener(new Link.OnClickListener() {
                    @Override
                    public void onClick(String clickedText) {

                    }
                });
        Link b = new Link("vocent")
                .setTextColor(Color.parseColor("#259B24"))
                .setTextColorOfHighlightedLink(Color.parseColor("#0D3D0C"))
                .setHighlightAlpha(.4f)
                .setUnderlined(false)
                .setBold(true)
                .setOnClickListener(new Link.OnClickListener() {
                    @Override
                    public void onClick(String clickedText) {

                    }
                });
        Link c = new Link("consetetur")
                .setTextColor(Color.parseColor("#259B24"))
                .setTextColorOfHighlightedLink(Color.parseColor("#0D3D0C"))
                .setHighlightAlpha(.4f)
                .setUnderlined(false)
                .setBold(true)
                .setOnClickListener(new Link.OnClickListener() {
                    @Override
                    public void onClick(String clickedText) {

                    }
                });
        Link d = new Link("definiebas")
                .setTextColor(Color.parseColor("#259B24"))
                .setTextColorOfHighlightedLink(Color.parseColor("#0D3D0C"))
                .setHighlightAlpha(.4f)
                .setUnderlined(false)
                .setBold(true)
                .setOnClickListener(new Link.OnClickListener() {
                    @Override
                    public void onClick(String clickedText) {
                        new MaterialDialog.Builder(MainActivity.this)
                                .title(R.string.title)
                                .titleGravity(GravityEnum.CENTER)
                                .content(R.string.content)
                                .positiveText(R.string.close)
                                .show();
                    }
                });

        TextView note = (TextView) findViewById(R.id.note);
        LinkBuilder.on(note)
                .addLink(a)
                .addLink(b)
                .addLink(c)
                .addLink(d)
                .build();
    }
}
