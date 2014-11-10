package com.shashi.iplscheduler2014;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.revmob.RevMob;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	Button IPL, pIPL;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);
		IPL = (Button) findViewById(R.id.button1);
		IPL.setOnClickListener(this);
		pIPL = (Button) findViewById(R.id.button2);
		pIPL.setOnClickListener(this);

		RevMob revmob;
		revmob = RevMob.start(this);
		revmob.showFullscreen(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (v.getId() == R.id.button1) {

			startActivity(new Intent(this, IPL2014.class));
		} else if (v.getId() == R.id.button2) {

			startActivity(new Intent(this, PreviousIPL.class));
		}
	}

	@Override
	public void onBackPressed() {

		super.onBackPressed();
	}

	@Override
	public void onPause() {
		super.onPause();

	}

}
