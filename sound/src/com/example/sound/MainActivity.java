package com.example.sound;

import android.app.Activity;
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
	
	GridView	GridV;
	
	static final String[] str = new String[] {
		"1", "2", "3", "4", "5",
		"6", "7", "8", "9", "10",
		"11", "12", "13", "14", "15",
		"16"};
	MyMusicThread[]				_musicThreadsArray;

	OnClickListener				splashListener = new OnClickListener(){
		public void onClick(View v){
			onLife();
			}
		};
	OnClickListener				b1click = new OnClickListener(){
			public void onClick(View v){
				_musicThreadsArray[0].run();
				}
			};
	OnClickListener				b2click = new OnClickListener(){
          	public void onClick(View v){
           		_musicThreadsArray[1].run();
           	}
        };
    OnClickListener        		b3click = new OnClickListener(){
           	public void onClick(View v){
           		_musicThreadsArray[2].run();
           	}
        };
    OnClickListener        		b4click = new OnClickListener(){
           	public void onClick(View v){
           		_musicThreadsArray[3].run();
           	}
        };
    OnClickListener        		b5click = new OnClickListener(){
           	public void onClick(View v){
           		_musicThreadsArray[4].run();
           	}
        };
    OnClickListener        		b6click = new OnClickListener(){
           	public void onClick(View v){
           		_musicThreadsArray[5].run();
           	}
        };
    OnClickListener       		b7click = new OnClickListener(){
           	public void onClick(View v){
           		_musicThreadsArray[6].run();
           	}
        };
    OnClickListener        		b8click = new OnClickListener(){
           	public void onClick(View v){
           		_musicThreadsArray[7].run();
           	}
        };

	public void onLife()
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

        Button Buttonplay = (Button) findViewById(R.id.Buttonplay);
        Button ButtonSave = (Button) findViewById(R.id.ButtonSave);

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

        button1.setOnClickListener(b1click);
        button2.setOnClickListener(b2click);
        button3.setOnClickListener(b3click);
        button4.setOnClickListener(b4click);
        button5.setOnClickListener(b5click);
        button6.setOnClickListener(b6click);
        button7.setOnClickListener(b7click);
        button8.setOnClickListener(b8click);
	}
	
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.startscreen);
    	
    	System.out.println("LALALA Starting test...");
		_musicThreadsArray = new MyMusicThread[8];
    	System.out.println("LALALA Retrieving layout...");
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
