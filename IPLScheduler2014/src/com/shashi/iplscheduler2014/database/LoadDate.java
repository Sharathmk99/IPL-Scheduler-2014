package com.shashi.iplscheduler2014.database;

import android.util.Log;

public class LoadDate {

	String[] mDate = { "16 April", "17 April", "18 April", "18 April",
			"19 April", "19 April", "20 April", "21 April", "22 April",
			"23 April", "24 April", "25 April", "25 April", "26 April",
			"26 April", "27 April", "27 April", "28 April", "29 April",
			"30 April", "02 May", "03 May", "03 May", "04 May", "05 May", "05 May",
			"06 May", "07 May", "07 May", "08 May", "09 May", "10 May", "10 May",
			"11 May", "11 May", "12 May", "13 May", "13 May", "14 May",
			"14 May", "15 May", "18 May", "18 May", "19 May", "19 May",
			"20 May", "20 May", "21 May", "22 May", "22 May", "23 May",
			"23 May", "24 May", "24 May", "25 May", "25 May", "27 May",
			"28 May", "30 May", "01 Jun" };

	public LoadDate() {
		Log.v(null, "Date" + mDate.length);
		// TODO Auto-generated constructor stub
	}

	public String getDate(int index) {
		return mDate[index];
	}
}
