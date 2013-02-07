package com.example.sound;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class DrawRectangle extends View{
	
	int _color;
	int _top;
	int _left;
	int _right;
	int _bottom;
	Paint _paint;
	
	private DrawRectangle(Context context) { //Should never be called
		super(context);
	}
	
	public DrawRectangle(Context context, int color, int left, int top, int right, int bottom){
		super(context);
		_color = color;
		_left = left;
		_top = top;
		_right = right;
		_bottom = bottom;
		_paint = new Paint();
	}

	@Override 
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
    	System.out.println("YOYOYOYOYOYOYO");
		_paint.setStyle(Paint.Style.FILL);
		
		_paint.setAntiAlias(false);
		_paint.setColor(_color);
		canvas.drawRect(_left, _top, _right, _bottom, _paint);
	}
}