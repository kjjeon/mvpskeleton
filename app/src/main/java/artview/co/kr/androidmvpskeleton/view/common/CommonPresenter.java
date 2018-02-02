package artview.co.kr.androidmvpskeleton.view.common;

import android.support.annotation.NonNull;

import artview.co.kr.androidmvpskeleton.data.RepositoryManager;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by whkong on 2017-11-16.
 */

public class CommonPresenter implements CommonContract.Presenter
{
    private final RepositoryManager mRepositoryManager;
    private final CommonContract.View mCommonView;



    public CommonPresenter(@NonNull RepositoryManager parRepository, @NonNull CommonContract.View parCommonView)
    {
        mRepositoryManager = checkNotNull(parRepository, "Repository cannot be null");
        mCommonView = checkNotNull(parCommonView, "CommonView cannot be null");

        //view에 presenter 연결
        mCommonView.setPresenter(this);
    }



    @Override
    public void start()
    {

    }
}
