package com.example.sound;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class DrawRectangle extends View{
	
	int _color;
	int _top;
	int _left;
	int _right;
	int _bottom;
	
	public DrawRectangle(Context context, int color, int left, int top, int right, int bottom){
		super(context);
		_color = color;
		_left = left;
		_top = top;
		_right = right;
		_bottom = bottom;
	}

	@Override 
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
    	System.out.println("YOYOYOYOYOYOYO");
		Paint paint = new Paint();
		paint.setStyle(Paint.Style.FILL);
		
		paint.setAntiAlias(false);
		paint.setColor(_color);
		canvas.drawRect(_left, _top, _right, _bottom, paint);
	}
}