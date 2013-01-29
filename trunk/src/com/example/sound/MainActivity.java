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
	private MediaPlayer mplayer = null;
    
	private void playSound(int Id)
	{
		if (mplayer != null)
		{
		mplayer.stop();
		mplayer.release();
		}
		mplayer = MediaPlayer.create(this, Id);
		mplayer.start();
	}
	
	public void onPause()
	{
		super.onPause();
		if (mplayer != null)
		{
			mplayer.stop();	
			mplayer.release();
		}
	}
	
	@Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    TextView test = (TextView) findViewById(R.id.textView);
        
    Button button1 = (Button) findViewById(R.id.button1);
    Button button2 = (Button) findViewById(R.id.button2);
    Button button3 = (Button) findViewById(R.id.button3);
    Button button4 = (Button) findViewById(R.id.button4);
    Button button5 = (Button) findViewById(R.id.button5);
    Button button6 = (Button) findViewById(R.id.button6);
    Button button7 = (Button) findViewById(R.id.button7);
    Button button8 = (Button) findViewById(R.id.button8);
    
    button8.setText("fdfdfdfdfdfd");
    
    test.setText("HELLOOOOOOO \nWOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOORLD");
    button1.setOnClickListener(new OnClickListener() 
    {
		public void onClick(View v)
		{
			playSound(R.raw.up);	
		}
	});
    button2.setOnClickListener(new OnClickListener() 
    {
		public void onClick(View v)
		{
			playSound(R.raw.dwqdwqcdcc);	
		}
	});
    button3.setOnClickListener(new OnClickListener() 
    {
		public void onClick(View v)
		{
			playSound(R.raw.dwqwdqdwq);	
		}
	});
    button4.setOnClickListener(new OnClickListener() 
    {
		public void onClick(View v)
		{
			playSound(R.raw.edjdfj);	
		}
	});
    button5.setOnClickListener(new OnClickListener() 
    {
		public void onClick(View v)
		{
			playSound(R.raw.eeee);	
		}
	});
    button6.setOnClickListener(new OnClickListener() 
    {
		public void onClick(View v)
		{
			playSound(R.raw.ewew);	
		}
	});
    button7.setOnClickListener(new OnClickListener() 
    {
		public void onClick(View v)
		{
			playSound(R.raw.tat);	
		}
	});
    button8.setOnClickListener(new OnClickListener() 
    {
		public void onClick(View v)
		{
			playSound(R.raw.titi);	
		}
	});
    }
}
