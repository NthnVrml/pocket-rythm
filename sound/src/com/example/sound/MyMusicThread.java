package com.example.sound;

import java.lang.Thread;
import android.media.MediaPlayer;

public class MyMusicThread extends Thread
{
	int						_started;
	MediaPlayer				_mediaplayer = null;

  MyMusicThread(MediaPlayer mp){ //Constructor
	  _started = 0;
	  _mediaplayer = mp;
	  }

  public void run(){ //run to call and play sound
	  if (_started == 0)
		  _started = 1;
	  else
		  _mediaplayer.start();
  }
}

