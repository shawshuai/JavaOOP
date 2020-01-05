package cn.sshaw.debateclock;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tencent.connect.share.QQShare;

import java.util.Timer;
import java.util.TimerTask;

public class FirstPage extends AppCompatActivity {
    TextView teamA, teamB, timeA_dis, timeB_dis;
    Button b_a, b_b, next_button;
    boolean a_available = true, b_available = true;

    public int[] timeA_sec = {180};
    public int[] timeB_sec = {180};
    public int timeA_sec_flag = 9;
    public int timeB_sec_flag = 9;
    private TimerTask timerTaskA, timerTaskB;
    private Timer timerA = new Timer();
    private Timer timerB = new Timer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        teamA = (TextView) findViewById(R.id.team_A_name);
        teamB = (TextView) findViewById(R.id.team_B_name);
        timeA_dis = (TextView) findViewById(R.id.time_a);
        timeB_dis = (TextView) findViewById(R.id.time_b);
        b_a = (Button) findViewById(R.id.start_a);
        b_b = (Button) findViewById(R.id.start_b);
        next_button = (Button) findViewById(R.id.next_period);

        Intent thisActivity = getIntent();
        if (thisActivity.hasExtra("teamAname") && thisActivity.hasExtra("teamBname")){
            String teamAn = thisActivity.getStringExtra("teamAname");
            String teamBn = thisActivity.getStringExtra("teamBname");
            teamA.setText(teamAn);
            teamB.setText(teamBn);
        }


        b_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a_available == true){
                    startA(b_a);
                    a_available = false;
                    b_a.setText("暂停");
                } else {
                    pauseA(b_a);
                    a_available = true;
                    b_a.setText("继续");
                }
            }
        });

        b_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b_available == true){
                    startB(b_b);
                    b_available = false;
                    b_b.setText("暂停");
                } else {
                    pauseB(b_b);
                    b_available = true;
                    b_b.setText("继续");
                }
            }
        });

        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NextPeriod();
            }
        });
    }

    public void NextPeriod() {
        pauseA(timeA_dis);
        pauseB(timeB_dis);
        Context context = FirstPage.this;
        Class destanationActivity = SecondPage.class;
        Intent intent = new Intent(context, destanationActivity);
        intent.putExtra("teamAname", teamA.getText().toString());
        intent.putExtra("teamBname", teamB.getText().toString());
        startActivity(intent);
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

}
