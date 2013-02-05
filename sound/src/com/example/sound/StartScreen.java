package com.example.sound;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Path.FillType;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class StartScreen extends Activity {
	protected int _time = 5000;
	
	private Thread StartScreenThread;
    private RelativeLayout _mainLayout;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.startscreen);
	
		final StartScreen start = this;
	
		StartScreenThread = new Thread() {
		@Override
		public void run()
		{
			try 
			{
				synchronized (this)
				{
					_mainLayout =  (RelativeLayout)findViewById(R.id.info);
					DrawRectangle dR1 = new DrawRectangle(start, Color.BLACK, 0, 100, 400, 150);
					_mainLayout.addView(dR1);
					DrawRectangle dR2 = new DrawRectangle(start, Color.BLUE, 0, 150, 350, 200);
					_mainLayout.addView(dR2);
					DrawRectangle dR3 = new DrawRectangle(start, Color.GREEN, 0, 200, 375, 250);
					_mainLayout.addView(dR3);
					wait(_time);
				}
			}
			catch(InterruptedException e) {}
			finally
			{
				finish();
				Intent i = new Intent();
				i.setClass(start, MainActivity.class);
				System.out.println("Just before start acitivity");
				startActivity(i);
				System.out.println("Just after start acitivity");
			}
		}
		};
		StartScreenThread.start();
	}
}