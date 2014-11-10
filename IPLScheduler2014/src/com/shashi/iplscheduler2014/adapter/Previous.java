package com.shashi.iplscheduler2014.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.shashi.iplscheduler2014.R;
import com.shashi.iplscheduler2014.database.PreviousIPLWinners;

public class Previous extends BaseAdapter {

	Context mContext;
	PreviousIPLWinners mPreviousIPL;
	Helper mHelper;
	public static String[] mIPLTeams = { "Mumbai Indians",
			"Kolkata Knight Riders", "Delhi Daredevils",
			"Royal Challengers Bangalore", "Chennai Super Kings",
			"Kings XI Punjab", "Sunrisers Hyderabad", "Rajasthan Royals" };
	public static int[] mIPIcon = { R.drawable.mi, R.drawable.kkr,
			R.drawable.dd, R.drawable.rcb, R.drawable.csk, R.drawable.kxp,
			R.drawable.srh, R.drawable.rr, };

	public Previous(Context mContext, PreviousIPLWinners mPreviousIPL) {
		super();
		this.mContext = mContext;
		this.mPreviousIPL = mPreviousIPL;
	}

	public Previous() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mPreviousIPL.getCount();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if (convertView == null) {
			LayoutInflater li = (LayoutInflater) mContext
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			mHelper = new Helper();
			convertView = li.inflate(R.layout.ipl_previous, null);
			mHelper.mTeam = (ImageView) convertView.findViewById(R.id.team);
			mHelper.mDetails = (TextView) convertView
					.findViewById(R.id.details);
			convertView.setTag(mHelper);
		} else {
			mHelper = (Helper) convertView.getTag();
		}
		for (int i = 0; i < mIPLTeams.length; i++) {
			if (mPreviousIPL.getWinnerName(position).trim()
					.equalsIgnoreCase(mIPLTeams[i])) {
				mHelper.mTeam.setImageResource(mIPIcon[i]);
				break;
			}
		}
		mHelper.mDetails.setText(mPreviousIPL.getPreviousWinners(position));
		return convertView;
	}

	static class Helper {
		ImageView mTeam;
		TextView mDetails;
	}

}
