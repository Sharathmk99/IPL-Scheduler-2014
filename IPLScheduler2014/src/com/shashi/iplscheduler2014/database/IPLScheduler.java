package com.shashi.iplscheduler2014.database;

import java.util.ArrayList;

import com.shashi.iplscheduler2014.R;

public class IPLScheduler {

	LoadDate mDate;
	LoadMatch mMatch;
	LoadTime mTime;
	LoadVenue mVenue;
	public static ArrayList<IPLSchedulerHelper> mData;
	IPLSchedulerHelper mHelper;
	String[] mIPLTeams = { "Mumbai Indians", "Kolkata Knight Riders",
			"Delhi Daredevils", "Royal Challengers Bangalore",
			"Chennai Super Kings", "Kings XI Punjab", "Sunrisers Hyderabad",
			"Rajasthan Royals" };
	int[] mIPIcon = { R.drawable.mi, R.drawable.kkr, R.drawable.dd,
			R.drawable.rcb, R.drawable.csk, R.drawable.kxp, R.drawable.srh,
			R.drawable.rr, };

	public IPLScheduler() {
		// TODO Auto-generated constructor stub
		mDate = new LoadDate();
		mMatch = new LoadMatch();
		mTime = new LoadTime();
		mVenue = new LoadVenue();
		mData = new ArrayList<IPLSchedulerHelper>();
	}

	public void update() {
		for (int i = 0; i < mMatch.getCount(); i++) {
			mHelper = new IPLSchedulerHelper();
			mHelper.setDate(mDate.getDate(i));
			mHelper.setTime(mTime.getTime(i));
			mHelper.setVenue(mVenue.getVenue(i));
			mHelper.setMatch(mMatch.getMatch(i));
			String[] temp = mMatch.getMatch(i).split("vs");
			for (int j = 0; j < mIPLTeams.length; j++) {
				if (temp[0].trim().contains(mIPLTeams[j])) {
					mHelper.setFirst(mIPIcon[j]);
				}
				if (temp[1].trim().contains(mIPLTeams[j])) {
					mHelper.setSecond(mIPIcon[j]);
				}
				
			}
			mData.add(mHelper);
		}
	}

	public int getCount() {
		return mData.size();
	}
	public IPLSchedulerHelper getMatchDetails(int index) {
		return mData.get(index);
	}
}
