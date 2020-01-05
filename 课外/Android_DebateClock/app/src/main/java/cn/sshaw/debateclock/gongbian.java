package cn.sshaw.debateclock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class gongbian extends AppCompatActivity {
    public int timeA_sec_flag = 9, timeB_sec_flag = 9;
    public int[] timeA_sec = {60}, timeB_sec = {90};
    TextView teamA, teamB, timeA_dis, timeB_dis;
    Button exchanging_timing, exchang_des;
    boolean a_available = true, b_available = true;
    int timing_type = 1, des = 1;//1是表示计时正方，0表示计时反方//des 1表示正方攻 0表示反方攻


    private TimerTask timerTaskA, timerTaskB;
    private Timer timerA = new Timer();
    private Timer timerB = new Timer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gongbian);

        teamA = findViewById(R.id.anti_team_A_name);
        teamB = findViewById(R.id.anti_team_B_name);
        timeA_dis = findViewById(R.id.anti_time_a);
        timeB_dis = findViewById(R.id.anti_time_b);
        exchanging_timing = findViewById(R.id.exchange_timing);
        exchang_des = findViewById(R.id.exchange_des);

        timeA_dis.setText(timeA_sec[0] + "");
        timeB_dis.setText(timeB_sec[0] + "");

        Intent thisActivity = getIntent();
        if (thisActivity.hasExtra("teamAname") && thisActivity.hasExtra("teamBname")){
            String teamAn = thisActivity.getStringExtra("teamAname");
            String teamBn = thisActivity.getStringExtra("teamBname");
            teamA.setText(teamAn);
            teamB.setText(teamBn);
        }

        exchanging_timing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exchanging_timing.setText("切换计时");
                if (timing_type == 1){
                    timing_type = 0;
                    pauseB(exchanging_timing);
                    startA(exchanging_timing);
                } else {
                    timing_type = 1;
                    pauseA(exchanging_timing);
                    startB(exchanging_timing);
                }
            }
        });

        exchang_des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exchange_timing(exchang_des);
            }
        });
    }

    public void startA(View view){
        if (timerA == null) {
            timerA = new Timer();
        }

        if (timerTaskA == null) {
            timerTaskA = new TimerTask() {
                @Override
                public void run() {
                    if (timeA_sec_flag > 0) {
                        timeA_sec_flag--;
                    } else {
                        if(timeA_sec[0]>0){
                            timeA_sec[0]--;
                            timeA_dis.setText(timeA_sec[0] + "");
                            if (timeA_sec[0] < 31) {
                                timeA_dis.setTextColor(0xffff0000);
                            }
                            if (timeA_sec[0] < 1) {
                                timerA = null;
                                timeA_dis.setText("时间到");
                            }
                        } else {
                            timeA_dis.setText("时间到");
                        }
                        timeA_sec_flag = 9;
                    }
                }
            };
        }
        if(timerA != null && timerTaskA != null ){
            timerA.schedule(timerTaskA, 0, 100);
        }

    }


    public void startB(View view){
        if (timerB == null) {
            timerB = new Timer();
        }

        if (timerTaskB == null) {
            timerTaskB = new TimerTask() {
                @Override
                public void run() {
                    if (timeB_sec_flag > 0){
                        timeB_sec_flag--;
                    } else {
                        if (timeB_sec[0]>0){
                            timeB_sec[0]--;
                            timeB_dis.setText(timeB_sec[0] + "");
                            if (timeB_sec[0] < 31) {
                                timeB_dis.setTextColor(0xffff0000);
                            }
                            if (timeB_sec[0] < 1) {
                                timerB = null;
                                timeB_dis.setText("时间到");
                            }
                        } else {
                            timeB_dis.setText("时间到");
                        }
                        timeB_sec_flag = 9;
                    }
                }
            };

            if(timerB != null && timerTaskB != null )
                timerB.schedule(timerTaskB, 0, 100);
        }
    }

    public void pauseA(View view){
        a_available = true;
        if (timerA != null) {
            timerA.cancel();
            timerA = null;
            timeA_dis.setText(timeA_sec[0] + "");
        }

        if (timerTaskA != null) {
            timerTaskA.cancel();
            timerTaskA = null;
            timeA_dis.setText(timeA_sec[0] + "");
        }
    }

    public void pauseB(View view){
        b_available = true;
        if (timerB != null) {
            timerB.cancel();
            timerB = null;
            timeB_dis.setText(timeB_sec[0] + "");
        }

        if (timerTaskB != null) {
            timerTaskB.cancel();
            timerTaskB = null;
            timeB_dis.setText(timeB_sec[0] + "");
        }
    }

    public void exchange_timing(View view){
        pauseA(view);
        pauseB(view);
        if (des == 1){
            timeA_sec[0] = 90;
            timeB_sec[0] = 60;
            des = 0;
        } else {
            timeA_sec[0] = 60;
            timeB_sec[0] = 90;
            des = 1;
        }
        exchanging_timing.setText("开始计时");
        timeA_dis.setTextColor(0xff000000);
        timeB_dis.setTextColor(0xff000000);
        timeA_dis.setText(timeA_sec[0]+"");
        timeB_dis.setText(timeB_sec[0]+"");
    }
}
