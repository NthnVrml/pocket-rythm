package com.example.sound;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity 
{
    MyMusicThread       mmt1 = null;
    MyMusicThread       mmt2 = null;
    MyMusicThread       mmt3 = null;
    MyMusicThread       mmt4 = null;
    MyMusicThread       mmt5 = null;
    MyMusicThread       mmt6 = null;
    MyMusicThread       mmt7 = null;
    MyMusicThread       mmt8 = null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
    	System.out.println("Arrivee dans le create de mainactivity");
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_main);
    	System.out.println("pwet pwet");
 
     
        TextView test = (TextView) findViewById(R.id.textView);
        mmt1 = new MyMusicThread(MediaPlayer.create(this, R.raw.up));
        mmt2 = new MyMusicThread(MediaPlayer.create(this, R.raw.dwqdwqcdcc));
        mmt3 = new MyMusicThread(MediaPlayer.create(this, R.raw.dwqwdqdwq));
        mmt4 = new MyMusicThread(MediaPlayer.create(this, R.raw.edjdfj));
        mmt5 = new MyMusicThread(MediaPlayer.create(this, R.raw.eeee));
        mmt6 = new MyMusicThread(MediaPlayer.create(this, R.raw.ewew));
        mmt7 = new MyMusicThread(MediaPlayer.create(this, R.raw.tat));
        mmt8 = new MyMusicThread(MediaPlayer.create(this, R.raw.titi));
        
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        
        mmt1.start();
        mmt2.start();
        mmt3.start();
        mmt4.start();
        mmt5.start();
        mmt6.start();
        mmt7.start();
        mmt8.start();
        
     button8.setText("fdfdfdfdfdfd");
    test.setText("HELLOOOOOOO \nWOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOORLD");
    button1.setOnClickListener(new OnClickListener(){
    	public void onClick(View v){
    		mmt1.run();
        	}
        });
    
    button2.setOnClickListener(new OnClickListener(){
		public void onClick(View v){
			mmt2.run();
		}
	});
    
    button3.setOnClickListener(new OnClickListener(){
		public void onClick(View v){
			mmt3.run();
		}
	});
    
    button4.setOnClickListener(new OnClickListener(){
		public void onClick(View v){
			mmt4.run();
		}
	});
    button5.setOnClickListener(new OnClickListener(){
		public void onClick(View v){
			mmt5.run();
		}
	});
    
    button6.setOnClickListener(new OnClickListener(){
		public void onClick(View v){
			mmt6.run();
		}
	});
    
    button7.setOnClickListener(new OnClickListener(){
		public void onClick(View v){
			mmt7.run();
		}
	});

    button8.setOnClickListener(new OnClickListener(){
		public void onClick(View v){
			mmt8.run();
		}
	});
    }
}
