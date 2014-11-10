package com.shashi.iplscheduler2014.onclick;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.shashi.iplscheduler2014.R;
import com.shashi.iplscheduler2014.database.PreviousIPLWinners;

public class Previous implements OnItemClickListener {

	Context mContext;
	PreviousIPLWinners mPrevious;

	public Previous(Context mContext, PreviousIPLWinners mPrevious) {
		super();
		this.mContext = mContext;
		this.mPrevious = mPrevious;
	}

	public Previous() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		showDailog(position);
	}

	Helper mHelper;

	public void showDailog(int index) {
		Log.v(null, " " + mPrevious);
		final View layout = View.inflate(mContext, R.layout.ipl_previous, null);
		mHelper = new Helper();
		mHelper.mDetails = (TextView) layout.findViewById(R.id.details);
		mHelper.mTeam = (ImageView) layout.findViewById(R.id.team);
		for (int i = 0; i < com.shashi.iplscheduler2014.adapter.Previous.mIPLTeams.length; i++) {
			if (mPrevious
					.getWinnerName(index)
					.trim()
					.equalsIgnoreCase(
							com.shashi.iplscheduler2014.adapter.Previous.mIPLTeams[i])) {
				mHelper.mTeam
						.setImageResource(com.shashi.iplscheduler2014.adapter.Previous.mIPIcon[i]);
				break;
			}
		}

		mHelper.mDetails.setText(mPrevious.getPreviousWinners(index));
		AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
		builder.setIcon(0);
		builder.setTitle(mPrevious.getPreviousWinners(index));
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
		ImageView mTeam;
		TextView mDetails;
	}

}
