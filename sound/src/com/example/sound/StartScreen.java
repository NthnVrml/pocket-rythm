package com.example.sound;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;


public class StartScreen extends Activity {
	protected int _time = 5000;
	
	private Thread StartScreenThread;
	
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