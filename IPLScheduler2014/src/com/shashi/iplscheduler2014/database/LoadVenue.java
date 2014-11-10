package com.shashi.iplscheduler2014.database;

import android.util.Log;

public class LoadVenue {

	String[] mVenue = { "Abu Dhabi", "Sharjah", "Abu Dhabi", "Abu Dhabi",
			"Dubai", "Dubai", "Sharjah", "Abu Dhabi", "Sharjah", "Dubai",
			"Sharjah", "Dubai", "Dubai", "Abu Dhabi", "Abu Dhabi", "Sharjah",
			"Sharjah", "Dubai", "Abu Dhabi", "Dubai", "Ranchi", "Mumbai",
			"Delhi", "Bangalore", "Ahmedabad", "Delhi", "Mumbai", "Delhi",
			"Cuttack", "Ahmedabad", "Bangalore", "Delhi", "Mumbai", "Cuttack",
			"Bangalore", "Hyderabad", "Ranchi", "Bangalore", "Hyderabad",
			"Kolkata", "Ahmedabad", "Chennai", "Hyderabad", "Ahmedabad",
			"Delhi", "Hyderabad", "Kolkata", "Mohali", "Kolkata", "Chennai",
			"Mumbai", "Mohali", "Bangalore", "Kolkata", "Mohali", "Mumbai",
			"Chennai", "Chennai", "Mumbai", "Mumbai" };

	public LoadVenue() {
		// TODO Auto-generated constructor stub
		Log.v(null, "Venue" + mVenue.length);
	}

	public String getVenue(int index) {
		return mVenue[index];
	}
}
