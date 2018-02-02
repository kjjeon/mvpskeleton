package artview.co.kr.androidmvpskeleton;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/**
 * Created by kjjeon on 2017-11-21.
 *  AndroidManifest 에서 name 테크 RootApplication으로 설정 하는것을 잊지 말자
 */

public class RootApplication extends Application{

    private static Context mContext;

    public RootApplication() {
        super();
        mContext = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static Context getContext() {
        return mContext;
    }
}
