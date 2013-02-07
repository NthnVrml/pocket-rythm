package com.example.sound;

import android.app.Activity;
//import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
//import android.widget.RelativeLayout;

public class MainActivity extends Activity 
{
	protected	boolean			_loadComplete = false;
	final		MainActivity	start = this;
	//private		int				_time = 5000;
	private		Thread			SplashScreenThread;
	//private		DrawRectangle	dR1;
	//private		DrawRectangle	dR2;
	//private		DrawRectangle	dR3;
	//private		RelativeLayout	_mainLayout;
	
	OnClickListener				b1click;
	OnClickListener				b2click;
	OnClickListener				b3click;
	OnClickListener				b4click;
	OnClickListener				b5click;
	OnClickListener				b6click;
	OnClickListener				b7click;
	OnClickListener				b8click;
	MyMusicThread[]				_musicThreadsArray;

    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_main);
    	
    	SplashScreenThread = new Thread() {
		@Override
		public void run()
		{
			try 
			{
				synchronized (this)
				{
//					dR1 = new DrawRectangle(start, Color.BLACK, 0, 100, 400, 150);
//					dR2 = new DrawRectangle(start, Color.BLUE, 0, 150, 350, 200);
//					dR3 = new DrawRectangle(start, Color.GREEN, 0, 200, 375, 250);
//					_mainLayout.addView(dR1);
//					_mainLayout.addView(dR2);
//					_mainLayout.addView(dR3);
					_musicThreadsArray = new MyMusicThread[8];
					_musicThreadsArray[0] = new MyMusicThread(MediaPlayer.create(start, R.raw.up));
					_musicThreadsArray[1] = new MyMusicThread(MediaPlayer.create(start, R.raw.dwqdwqcdcc));
					_musicThreadsArray[2] = new MyMusicThread(MediaPlayer.create(start, R.raw.dwqwdqdwq));
					_musicThreadsArray[3] = new MyMusicThread(MediaPlayer.create(start, R.raw.edjdfj));
					_musicThreadsArray[4] = new MyMusicThread(MediaPlayer.create(start, R.raw.eeee));
					_musicThreadsArray[5] = new MyMusicThread(MediaPlayer.create(start, R.raw.ewew));
					_musicThreadsArray[6] = new MyMusicThread(MediaPlayer.create(start, R.raw.tat));
					_musicThreadsArray[7] = new MyMusicThread(MediaPlayer.create(start, R.raw.titi));
					
					_musicThreadsArray[0].start();
					_musicThreadsArray[1].start();
					_musicThreadsArray[2].start();
					_musicThreadsArray[3].start();
					_musicThreadsArray[4].start();
					_musicThreadsArray[5].start();
					_musicThreadsArray[6].start();
					_musicThreadsArray[7].start();
				}
			}
			catch (Exception e) {}
			finally
			{
				start._loadComplete = true;
				System.out.println("LALALA Thread died OK?");
			}
		}
		};
		SplashScreenThread.start();

		b1click = new OnClickListener(){
			public void onClick(View v){
				_musicThreadsArray[0].run();
				}
			};
        b2click = new OnClickListener(){
          	public void onClick(View v){
           		_musicThreadsArray[1].run();
           	}
        };
        b3click = new OnClickListener(){
           	public void onClick(View v){
           		_musicThreadsArray[2].run();
           	}
        };
        b4click = new OnClickListener(){
           	public void onClick(View v){
           		_musicThreadsArray[3].run();
           	}
        };
        b5click = new OnClickListener(){
           	public void onClick(View v){
           		_musicThreadsArray[4].run();
           	}
        };
        b6click = new OnClickListener(){
           	public void onClick(View v){
           		_musicThreadsArray[5].run();
           	}
        };
        b7click = new OnClickListener(){
           	public void onClick(View v){
           		_musicThreadsArray[6].run();
           	}
        };
        b8click = new OnClickListener(){
           	public void onClick(View v){
           		_musicThreadsArray[7].run();
           	}
        };
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);


        while (!_loadComplete); // A changer dès que possible!
        button1.setOnClickListener(b1click);
        button2.setOnClickListener(b2click);
        button3.setOnClickListener(b3click);
        button4.setOnClickListener(b4click);
        button5.setOnClickListener(b5click);
        button6.setOnClickListener(b6click);
        button7.setOnClickListener(b7click);
        button8.setOnClickListener(b8click);
    	System.out.println("LALALA Tout yé bon ici...");
    }
}
