package com.mytime;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class MainActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		final View controlsView = findViewById(R.id.fullscreen_content_controls);
		final View contentView = findViewById(R.id.fullscreen_content);
		final View dummy_button = findViewById(R.id.dummy_button);
		// Set up the user interaction to manually show or hide the system UI.
		contentView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Log.i("mytime", "click me ");
			}
		});
		controlsView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Log.i("mytime", "click me 1");
			}
		});
		dummy_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Log.i("mytime", "click me add");
			}
		});

	
	}


}
