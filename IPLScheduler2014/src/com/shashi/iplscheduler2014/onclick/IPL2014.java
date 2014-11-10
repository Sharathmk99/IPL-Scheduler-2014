package com.shashi.iplscheduler2014.onclick;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.shashi.iplscheduler2014.R;
import com.shashi.iplscheduler2014.database.IPLScheduler;

public class IPL2014 implements OnItemClickListener {

	IPLScheduler mScheduler;
	Context mContext;
	Helper mHelper;

	public IPL2014(IPLScheduler mScheduler, Context mContext) {
		super();
		this.mScheduler = mScheduler;
		this.mContext = mContext;
	}

	public IPL2014() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		showDailog(position);
	}

	public void showDailog(int index) {
		final View layout = View.inflate(mContext, R.layout.ipl_helper, null);
		mHelper = new Helper();
		mHelper.mDate = (TextView) layout.findViewById(R.id.date);
		mHelper.mTime = (TextView) layout.findViewById(R.id.time);
		mHelper.mVenue = (TextView) layout.findViewById(R.id.venue);
		mHelper.mMatch = (TextView) layout.findViewById(R.id.match);
		mHelper.mFirst = (ImageView) layout.findViewById(R.id.imageView1);
		mHelper.mSecond = (ImageView) layout.findViewById(R.id.imageView2);
		mHelper.mFirst.setImageResource(mScheduler.getMatchDetails(index)
				.getFirst());
		mHelper.mSecond.setImageResource(mScheduler.getMatchDetails(index)
				.getSecond());
		mHelper.mDate.setText(mScheduler.getMatchDetails(index).getDate());
		mHelper.mMatch.setText(mScheduler.getMatchDetails(index).getMatch());
		mHelper.mTime.setText(mScheduler.getMatchDetails(index).getTime());
		mHelper.mVenue.setText(mScheduler.getMatchDetails(index).getVenue());
		AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
		builder.setIcon(0);
		builder.setTitle(mScheduler.getMatchDetails(index).getMatch());
		builder.setCancelable(true);
		builder.setPositiveButton("Okay", new Dialog.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
			}
		});
		builder.setView(layout);
		builder.create();
		builder.show();
	}

	static class Helper {
		ImageView mFirst, mSecond;
		TextView mMatch, mVenue, mDate, mTime;
	}
}
