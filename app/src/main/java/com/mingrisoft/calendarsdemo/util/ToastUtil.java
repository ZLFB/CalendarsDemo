package com.mingrisoft.calendarsdemo.util;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

	private static Toast mToast;

	private ToastUtil() {

	}

	public static void show(Context context, int resId) {
		if (context == null) {
			return;
		}
		if (mToast == null) {
			mToast = Toast.makeText(context, resId, Toast.LENGTH_SHORT);
		} else {
			mToast.setText(resId);
		}
		mToast.show();
	}


	public static void show(Context context, String str) {
		if (context == null) {
			return;
		}
		if (mToast == null) {
			mToast = Toast.makeText(context, str, Toast.LENGTH_SHORT);
		} else {
			mToast.setText(str);
		}
		mToast.show();
	}

}
