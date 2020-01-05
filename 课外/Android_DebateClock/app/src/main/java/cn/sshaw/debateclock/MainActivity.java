package cn.sshaw.debateclock;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 此部分代码是初始化广告
        MobileAds.initialize(this, "\n" + "ca-app-pub-5452708860919015~4869049737");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public TextView teamATextView, teamBTextView;
    public EditText teamAEdit, teamBEdit;

    public void submit(View view) {
        teamATextView = findViewById(R.id.team_A_name);
        teamBTextView = findViewById(R.id.team_B_name);
        teamAEdit = findViewById(R.id.team_A_nameEdit);
        teamBEdit = findViewById(R.id.team_B_nameEdit);

        teamATextView.setText(teamAEdit.getText());
        teamBTextView.setText(teamBEdit.getText());

        Context context = MainActivity.this;
        Class destanationActivity = FirstPage.class;
        Intent intent = new Intent(context, destanationActivity);
        intent.putExtra("teamAname", teamAEdit.getText().toString());
        intent.putExtra("teamBname", teamBEdit.getText().toString());
        startActivity(intent);
    }
}
