package com.shashi.iplscheduler2014;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.revmob.RevMob;
import com.shashi.iplscheduler2014.adapter.Previous;
import com.shashi.iplscheduler2014.database.PreviousIPLWinners;

public class PreviousIPL extends ActionBarActivity {

	ListView mListView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_previous_ipl);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		PreviousIPLWinners mPreviousIPL = new PreviousIPLWinners();
		mListView = (ListView) findViewById(R.id.prev);
		mListView.setAdapter(new Previous(this, mPreviousIPL));
		mListView
				.setOnItemClickListener(new com.shashi.iplscheduler2014.onclick.Previous(
						this, mPreviousIPL));
		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);
		RevMob revmob;
		revmob = RevMob.start(this); 
		revmob.showFullscreen(this);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if (item.getItemId() == android.R.id.home) {
			finish();
			return true;
		} else {
			return false;
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
