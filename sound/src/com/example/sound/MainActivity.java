package com.example.sound;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RelativeLayout;
import android.widget.GridView;
import android.widget.AdapterView.OnItemClickListener;


public class MainActivity extends Activity 
{
	private		DrawRectangle	dR0, dR1, dR2, dR3, dR4, dR5, dR6, dR7;
	private		RelativeLayout	_mainLayout;
	
	GridView					GridV;
	OnClickListener				_b1click, _b2click, _b3click, _b4click,
								_b5click, _b6click, _b7click, _b8click;
	static final String[] str = new String[] {
		"1", "2", "3", "4", "5",
		"6", "7", "8", "9", "10",
		"11", "12", "13", "14", "15",
		"16"};
	MyMusicThread[]				_musicThreadsArray;

	OnClickListener				splashListener = new OnClickListener(){
		public void onClick(View v){
			onAfterSplashScreen();
			}
		};
    OnClickListener        		playListener = new OnClickListener(){
           	public void onClick(View v){
           		onPlay();
           	}
        };
    OnClickListener        		stopListener = new OnClickListener(){
           	public void onClick(View v){
           		onEdition();
           	}
        };

//--------------------------------------------------------------------
      	
    // After touching the SplashScreen
	public void onAfterSplashScreen()
	{
    	setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);

    	_b1click = new OnClickListener(){
			public void onClick(View v){
				_musicThreadsArray[0].run();
			}
		};
		_b2click = new OnClickListener(){
          	public void onClick(View v){
           		_musicThreadsArray[1].run();
       		}
       	};
        _b3click = new OnClickListener(){
           	public void onClick(View v){
           		_musicThreadsArray[2].run();
       		}
       	};
        _b4click = new OnClickListener(){
           	public void onClick(View v){
           		_musicThreadsArray[3].run();
       		}
       	};
        _b5click = new OnClickListener(){
           	public void onClick(View v){
           		_musicThreadsArray[4].run();
       		}
       	};
        _b6click = new OnClickListener(){
           	public void onClick(View v){
           		_musicThreadsArray[5].run();
       		}
       	};
        _b7click = new OnClickListener(){
           	public void onClick(View v){
           		_musicThreadsArray[6].run();
       		}
       	};
        _b8click = new OnClickListener(){
           	public void onClick(View v){
           		_musicThreadsArray[7].run();
       		}
       	};
        button1.setOnClickListener(_b1click);
        button2.setOnClickListener(_b2click);
        button3.setOnClickListener(_b3click);
        button4.setOnClickListener(_b4click);
        button5.setOnClickListener(_b5click);
        button6.setOnClickListener(_b6click);
        button7.setOnClickListener(_b7click);
        button8.setOnClickListener(_b8click);

        Button Buttonplay = (Button) findViewById(R.id.Buttonplay);
        Button ButtonSave = (Button) findViewById(R.id.ButtonSave);
        
        //Uncomment after both .xml && onPlay func are OK.
        //Buttonplay.setOnClickListener(playListener);

        GridV = (GridView) findViewById(R.id.gridV1);
    	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, str);
 
		GridV.setAdapter(adapter);
 
		GridV.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
				int position, long id) {
			   Toast.makeText(getApplicationContext(),
				((TextView) v).getText(), Toast.LENGTH_SHORT).show();
			}
		});

	}

//--------------------------------------------------------------------
	
	//When pressing PLAY in Edition Mode
    public void onEdition()
    {
    }

//--------------------------------------------------------------------
  	
	//When pressing STOP in Edition Mode
	public void onPlay()
	{
	}

//--------------------------------------------------------------------
		
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
    	super.onCreate(savedInstanceState);
    	setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    	setContentView(R.layout.startscreen);
    	
		_musicThreadsArray = new MyMusicThread[8];
		_mainLayout = (RelativeLayout) findViewById(R.id.splashScreen);
		
		_musicThreadsArray[0] = new MyMusicThread(MediaPlayer.create(this, R.raw.up));
		_musicThreadsArray[0].start();
		dR0 = new DrawRectangle(this, Color.BLACK, 0, 0, 400, 50);
		_mainLayout.addView(dR0);

		_musicThreadsArray[1] = new MyMusicThread(MediaPlayer.create(this, R.raw.dwqdwqcdcc));
		_musicThreadsArray[1].start();
		dR1 = new DrawRectangle(this, Color.BLUE, 0, 50, 350, 100);
		_mainLayout.addView(dR1);

		_musicThreadsArray[2] = new MyMusicThread(MediaPlayer.create(this, R.raw.dwqwdqdwq));
		_musicThreadsArray[2].start();
		dR2 = new DrawRectangle(this, Color.GREEN, 0, 100, 375, 150);
		_mainLayout.addView(dR2);
		
		_musicThreadsArray[3] = new MyMusicThread(MediaPlayer.create(this, R.raw.edjdfj));
		_musicThreadsArray[3].start();
		dR3 = new DrawRectangle(this, Color.WHITE, 0, 150, 450, 200);
		_mainLayout.addView(dR3);
		
		_musicThreadsArray[4] = new MyMusicThread(MediaPlayer.create(this, R.raw.eeee));
		_musicThreadsArray[4].start();
		dR4 = new DrawRectangle(this, Color.BLACK, 0, 200, 400, 250);
		_mainLayout.addView(dR4);
		
		_musicThreadsArray[5] = new MyMusicThread(MediaPlayer.create(this, R.raw.ewew));
		_musicThreadsArray[5].start();
		dR5 = new DrawRectangle(this, Color.BLUE, 0, 250, 350, 300);
		_mainLayout.addView(dR5);
		
		_musicThreadsArray[6] = new MyMusicThread(MediaPlayer.create(this, R.raw.tat));
		_musicThreadsArray[6].start();
		dR6 = new DrawRectangle(this, Color.GREEN, 0, 300, 375, 350);
		_mainLayout.addView(dR6);
		
		_musicThreadsArray[7] = new MyMusicThread(MediaPlayer.create(this, R.raw.titi));
		_musicThreadsArray[7].start();
		dR7 = new DrawRectangle(this, Color.WHITE, 0, 350, 450, 400);
		_mainLayout.addView(dR7);

		_mainLayout.setOnClickListener(splashListener);
    }
}
