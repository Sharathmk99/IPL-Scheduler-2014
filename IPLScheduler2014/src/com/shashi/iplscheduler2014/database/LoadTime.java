package com.shashi.iplscheduler2014.database;

import android.util.Log;

public class LoadTime {

	String[] mTime = { "8 PM", "8 PM", "4 PM", "8 PM", "4 PM", "8 PM", "8 PM",
			"8 PM", "8 PM", "8 PM", "8 PM", "4 PM", "8 PM", "4 PM", "8 PM",
			"4 PM", "8 PM", "8 PM", "8 PM", "8 PM", "8 PM", "4 PM", "8 PM",
			"8 PM", "4 PM", "8 PM", "8 PM", "4 PM", "8 PM", "8 PM", "8 PM",
			"4 PM", "8 PM", "4 PM", "8 PM", "8 PM", "4 PM", "8 PM", "4 PM",
			"8 PM", "8 PM", "4 PM", "8 PM", "4 PM", "8 PM", "4 PM", "8 PM",
			"8 PM", "4 PM", "8 PM", "4 PM", "8 PM", "4 PM", "8 PM", "4 PM",
			"8 PM", "8 PM", "8 PM", "8 PM", "8 PM", };

	public LoadTime() {
		// TODO Auto-generated constructor stub
		Log.v(null, "Time" + mTime.length);
	}

	public String getTime(int index) {
		return mTime[index];
	}
}
