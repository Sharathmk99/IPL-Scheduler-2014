package com.shashi.iplscheduler2014.database;

import android.util.Log;

public class LoadMatch {

	String[] mMatches = { "Mumbai Indians vs Kolkata Knight Riders",
			"Delhi Daredevils vs Royal Challengers Bangalore",
			"Chennai Super Kings vs Kings XI Punjab",
			"Sunrisers Hyderabad vs Rajasthan Royals",
			"Royal Challengers Bangalore vs Mumbai Indians",
			"Kolkata Knight Riders vs Delhi Daredevils",
			"Rajasthan Royals vs Kings XI Punjab",
			"Chennai Super Kings vs Delhi Daredevils",
			"Kings XI Punjab vs Sunrisers Hyderabad",
			"Rajasthan Royals vs Chennai Super Kings",
			"Royal Challengers Bangalore vs Kolkata Knight Riders",
			"Sunrisers Hyderabad vs Delhi Daredevils",
			"Chennai Super Kings vs Mumbai Indians",
			"Rajasthan Royals vs Royal Challengers Bangalore",
			"Kings XI Punjab vs Kolkata Knight Riders",
			"Delhi Daredevils vs Mumbai Indians",
			"Sunrisers Hyderabad vs Chennai Super Kings",
			"Royal Challengers Bangalore vs Kings XI Punjab",
			"Kolkata Knight Riders vs Rajasthan Royals",
			"Mumbai Indians vs Sunrisers Hyderabad",
			"Chennai Super Kings vs Kolkata Knight Riders",
			"Mumbai Indians vs Kings XI Punjab",
			"Delhi Daredevils vs Rajasthan Royals",
			"Royal Challengers Bangalore vs Sunrisers Hyderabad",
			"Rajasthan Royals vs Kolkata Knight Riders",
			"Delhi Daredevils vs Chennai Super Kings",
			"Mumbai Indians vs Royal Challengers Bangalore",
			"Delhi Daredevils vs  Kolkata Knight Riders",
			"Kings XI Punjab vs  Chennai Super Kings",
			"Rajasthan Royals vs Sunrisers Hyderabad",
			"Royal Challengers Bangalore vs Kings XI Punjab",
			"Delhi Daredevils vs  Sunrisers Hyderabad",
			"Mumbai Indians vs  Chennai Super Kings",
			"Kings XI Punjab vs  Kolkata Knight Riders",
			"Royal Challengers Bangalore vs  Rajasthan Royals",
			"Sunrisers Hyderabad vs Mumbai Indians",
			"Chennai Super Kings vs Rajasthan Royals",
			"Royal Challengers Bangalore vs Delhi Daredevils",
			"Sunrisers Hyderabad vs Kings XI Punjab",
			"Kolkata Knight Riders vs Mumbai Indians",
			"Rajasthan Royals vs Delhi Daredevils",
			"Chennai Super Kings vs Royal Challengers Bangalore",
			"Sunrisers Hyderabad vs   Kolkata Knight Riders",
			"Rajasthan Royals vs Mumbai Indians",
			"Delhi Daredevils vs Kings XI Punjab",
			"Sunrisers Hyderabad vs Royal Challengers Bangalore",
			"Kolkata Knight Riders vs Chennai Super Kings",
			"Kings XI Punjab vs Mumbai Indians",
			"Kolkata Knight Riders vs Royal Challengers Bangalore",
			"Chennai Super Kings vs Sunrisers Hyderabad",
			"Mumbai Indians vs Delhi Daredevils",
			"Kings XI Punjab vs Rajasthan Royals",
			"Royal Challengers Bangalore vs Chennai Super Kings",
			"Kolkata Knight Riders vs Sunrisers Hyderabad",
			"Kings XI Punjab vs Delhi Daredevils",
			"Mumbai Indians vs Rajasthan Royals", "TBD vs TBD", "TBD vs TBD",
			"TBD vs TBD", "TBD vs TBD" };

	public LoadMatch() {
		// TODO Auto-generated constructor stub
		Log.v(null, "Match" + mMatches.length);
	}

	public String getMatch(int index) {
		return mMatches[index];
	}

	public int getCount() {
		return mMatches.length;
	}
}
