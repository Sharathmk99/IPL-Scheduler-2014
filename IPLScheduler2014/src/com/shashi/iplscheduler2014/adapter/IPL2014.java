package com.shashi.iplscheduler2014.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.shashi.iplscheduler2014.R;
import com.shashi.iplscheduler2014.database.IPLScheduler;
import com.shashi.iplscheduler2014.database.IPLSchedulerHelper;

public class IPL2014 extends BaseAdapter {

	Context mcontext;
	IPLScheduler mScheduler;
	IPLSchedulerHelper mSchedulerHelper;
	Helper mHelper;

	public IPL2014() {
		// TODO Auto-generated constructor stub
	}

	public IPL2014(Context mcontext,IPLScheduler mScheduler) {
		super();
		this.mcontext = mcontext;
		this.mScheduler = mScheduler;
		mScheduler.update();
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mScheduler.getCount();
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
		mSchedulerHelper  = mScheduler.getMatchDetails(position);
		if (convertView == null) {
			LayoutInflater li = (LayoutInflater) mcontext
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = li.inflate(R.layout.ipl_helper, null);
			mHelper = new Helper();
			mHelper.mDate = (TextView)convertView.findViewById(R.id.date);
			mHelper.mTime = (TextView)convertView.findViewById(R.id.time);
			mHelper.mVenue = (TextView)convertView.findViewById(R.id.venue);
			mHelper.mMatch = (TextView)convertView.findViewById(R.id.match);
			mHelper.mFirst = (ImageView)convertView.findViewById(R.id.imageView1);
			mHelper.mSecond = (ImageView)convertView.findViewById(R.id.imageView2);
			convertView.setTag(mHelper);
		}else{
			mHelper = (Helper)convertView.getTag();
		}
		mHelper.mFirst.setImageResource(mSchedulerHelper.getFirst());
		mHelper.mSecond.setImageResource(mSchedulerHelper.getSecond());
		mHelper.mDate.setText(mSchedulerHelper.getDate());
		mHelper.mMatch.setText(mSchedulerHelper.getMatch());
		mHelper.mTime.setText(mSchedulerHelper.getTime());
		mHelper.mVenue.setText(mSchedulerHelper.getVenue());
		return convertView;
	}
	
	static class Helper{
		ImageView mFirst, mSecond;
		TextView mMatch, mVenue, mDate, mTime;
	}

}
