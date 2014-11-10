package com.shashi.iplscheduler2014;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.revmob.RevMob;
import com.shashi.iplscheduler2014.database.IPLScheduler;

public class IPL2014 extends ActionBarActivity {
	ListView mListView;
	int scrollPosition = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_ipl2014);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);
		IPLScheduler mSheduler = new IPLScheduler();
		mListView = (ListView) findViewById(R.id.listView1);
		mListView.setAdapter(new com.shashi.iplscheduler2014.adapter.IPL2014(
				this, mSheduler));
		String day = new SimpleDateFormat("dd").format(new Date());
		for (int i = 0; i < mSheduler.getCount(); i++) {
			if (mSheduler.getMatchDetails(i).getDate().contains(day)) {
				scrollPosition = i;
				break;
			}
		}
		mListView.post(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				mListView.smoothScrollToPosition(scrollPosition);
			}
		});
		mListView
				.setOnItemClickListener(new com.shashi.iplscheduler2014.onclick.IPL2014(
						mSheduler, this));

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
