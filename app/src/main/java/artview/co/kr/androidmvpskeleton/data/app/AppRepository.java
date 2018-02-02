package artview.co.kr.androidmvpskeleton.data.app;

import artview.co.kr.androidmvpskeleton.data.app.local.AppLocalDataSource;

/**
 * Created by whkong on 2017-11-16.
 * Rmote/Local을 구분하며, Memory cache를 포함
 *
 */

public class AppRepository implements AppDataSource
{
    private static AppRepository INSTANCE = null;

    private final AppDataSource mAppDataSource;



    //직접 객체화하는것을 방지한다.
    private AppRepository()
    {
        mAppDataSource = AppLocalDataSource.getInstance();

    }


    public static AppRepository getInstance()
    {
        if (INSTANCE == null)
            INSTANCE = new AppRepository();
        return INSTANCE;
    }


    @Override
    public String getBriefMsg() {
        return AppLocalDataSource.getInstance().getBriefMsg();
    }

    @Override
    public void setBriefMsg(String briefMsg) {
        AppLocalDataSource.getInstance().setBriefMsg(briefMsg);
    }
}
