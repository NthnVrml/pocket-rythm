package com.example.sound;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Path.FillType;
import android.graphics.Canvas;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class StartScreen extends Activity {
	protected int _time = 5000;
	MainActivity ma;
	MyMusicThread[] _musicThreadsArray;
	//DrawRectangle dR1;
	
	private Thread StartScreenThread;
    //private RelativeLayout _mainLayout;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.startscreen);
	
		final StartScreen start = this;
		ma = new MainActivity();
		_musicThreadsArray = new MyMusicThread[8];
		//_mainLayout = (RelativeLayout)findViewById(R.id.info);
	
		StartScreenThread = new Thread() {
		@Override
		public void run()
		{
			try 
			{
				synchronized (this)
				{
					_musicThreadsArray[0] = new MyMusicThread(MediaPlayer.create(ma, R.raw.up));
					_musicThreadsArray[1] = new MyMusicThread(MediaPlayer.create(ma, R.raw.dwqdwqcdcc));
					_musicThreadsArray[2] = new MyMusicThread(MediaPlayer.create(ma, R.raw.dwqwdqdwq));
					_musicThreadsArray[3] = new MyMusicThread(MediaPlayer.create(ma, R.raw.edjdfj));
					_musicThreadsArray[4] = new MyMusicThread(MediaPlayer.create(ma, R.raw.eeee));
					_musicThreadsArray[5] = new MyMusicThread(MediaPlayer.create(ma, R.raw.ewew));
					_musicThreadsArray[6] = new MyMusicThread(MediaPlayer.create(ma, R.raw.tat));
					_musicThreadsArray[7] = new MyMusicThread(MediaPlayer.create(ma, R.raw.titi));
/*
					_musicThreadsArray[0].start();
					_musicThreadsArray[1].start();
					_musicThreadsArray[2].start();
					_musicThreadsArray[3].start();
					_musicThreadsArray[4].start();
					_musicThreadsArray[5].start();
					_musicThreadsArray[6].start();
					_musicThreadsArray[7].start();*/
					System.out.println("LALALA Ok les threads sont créés et lancés...");

					//dR1 = new DrawRectangle(start, Color.BLACK, 0, 100, 400, 150);
					//DrawRectangle dR2 = new DrawRectangle(start, Color.BLUE, 0, 150, 350, 200);
					//DrawRectangle dR3 = new DrawRectangle(start, Color.GREEN, 0, 200, 375, 250);
					//_mainLayout.addView(dR1);
					//_mainLayout.addView(dR2);
					//_mainLayout.addView(dR3);
					wait(_time);
				}
			}
			catch(InterruptedException e) {}
			finally
			{
				//System.out.println("LALALA Just before finish");
				//finish();
				System.out.println("LALALA Creating new intent");
				Intent i = new Intent(start, ma.getClass());
				//Intent i = new Intent(start, MainActivity.class);
				System.out.println("LALALA Creating new bundle");
				Bundle b = new Bundle();
				System.out.println("LALALA Pushing data in Bundle");
				b.putParcelableArray("threads", (Parcelable[]) _musicThreadsArray);
				System.out.println("LALALA Adding Bundle to Intent");
				i.putExtras(b);
				System.out.println("LALALA Just before start acitivity");
				startActivity(i);
				System.out.println("LALALA Just after start acitivity");
			}
		}
		};
		StartScreenThread.start();
	}
}