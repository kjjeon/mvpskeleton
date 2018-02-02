package artview.co.kr.androidmvpskeleton.data.app.local;

import android.content.SharedPreferences;

import artview.co.kr.androidmvpskeleton.data.app.AppDataSource;
import artview.co.kr.androidmvpskeleton.utils.SharedPrefs;

/**
 * Created by whkong on 2017-11-17.
 * 단말기 상의 SQL, Realm 등을 통한 데이터를 불러온다
 */

public class AppLocalDataSource extends SharedPrefs implements AppDataSource
{
    private final static String  SPREFS = "AppLocalDataSource";

    private static volatile AppLocalDataSource INSTANCE;

    private AppLocalDataSource()
    {
       super(SPREFS);
    }

    public static AppLocalDataSource getInstance()
    {
        if( INSTANCE == null)
        {
            INSTANCE = new AppLocalDataSource();
        }
        return INSTANCE;
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String s) {

    }


    @Override
    public String getBriefMsg() {
        return prefs.getString("brief","empty");
    }

    @Override
    public void setBriefMsg(String briefMsg) {
        prefEdit.putString("brief",briefMsg);
        prefEdit.commit();
    }
}
