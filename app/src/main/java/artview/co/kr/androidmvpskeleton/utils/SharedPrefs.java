package artview.co.kr.androidmvpskeleton.utils;

import android.content.Context;
import android.content.SharedPreferences;

import artview.co.kr.androidmvpskeleton.RootApplication;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by kjjeon on 2017-11-21.
 */

public abstract class SharedPrefs implements SharedPreferences.OnSharedPreferenceChangeListener{

    protected SharedPreferences prefs;
    protected SharedPreferences.Editor prefEdit;

    public SharedPrefs(String name){
        Context context = checkNotNull(RootApplication.getContext(), "context cannot be null");
        prefs = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        prefEdit = prefs.edit();
    }
}
