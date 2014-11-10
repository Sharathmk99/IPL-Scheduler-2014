package com.shashi.iplscheduler2014.database;

public class PreviousIPLWinners {

	String[] mPrevious = { "1st IPL ( 2008 ) – Rajasthan Royals ( RR vs CSK )",
			"2nd IPL ( 2009 ) – Deccan Chargers ( DC vs RC )",
			"3rd IPL ( 2010 ) – Chennai Super Kings ( CSK vs MI )",
			"4th IPL ( 2011 ) – Chennai Super Kings ( CSK vs RCB )",
			"5th IPL ( 2012 ) – Kolkata Knight Riders ( CSK vs KKR )",
			"6th IPL ( 2013 ) – Mumbai Indians ( CSK vs MI )" };
	String[] mWinner = { "Rajasthan Royals", "Sunrisers Hyderabad",
			"Chennai Super Kings", "Chennai Super Kings",
			"Kolkata Knight Riders", "Mumbai Indians" };

	public PreviousIPLWinners() {
		// TODO Auto-generated constructor stub
	}

	public int getCount() {
		return mPrevious.length;
	}

	public String getWinnerName(int index) {
		return mWinner[index];
	}

	public String getPreviousWinners(int index) {
		return mPrevious[index];
	}
}
