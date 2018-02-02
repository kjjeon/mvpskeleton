package artview.co.kr.androidmvpskeleton.view.main;


import android.support.annotation.NonNull;
import android.util.Log;

import artview.co.kr.androidmvpskeleton.adapter.main.MainAdapter;
import artview.co.kr.androidmvpskeleton.adapter.main.MainAdapterContract;
import artview.co.kr.androidmvpskeleton.data.RepositoryManager;

import static com.google.common.base.Preconditions.checkNotNull;


/**
 * Created by whkong on 2017-11-16.
 */

public class MainPresenter implements MainContract.Presenter
{
    private final RepositoryManager mRepositoryManager;
    private final MainContract.View mMainView;
    private MainAdapterContract.Model mAdapterModel;
    private MainAdapterContract.View mAdapterView;



    public MainPresenter(@NonNull RepositoryManager parRepository, @NonNull MainContract.View parMainView)
    {
        mRepositoryManager = checkNotNull(parRepository, "Repository cannot be null");
        mMainView = checkNotNull(parMainView, "MainView cannot be null");

        //view에 presenter 연결
        mMainView.setPresenter(this);
    }

    @Override
    public void start()
    {

    }

    @Override
    public void setAdapter(@NonNull MainAdapter adapter)
    {
        //setAdapter 를 이용하여 리사이클 뷰에 어탭터 들록해야함.

        //모델용 뷰용 등록
        setMainAdapterModel(adapter);
        setMainAdapterView(adapter);

    }

    @Override
    public void setMainAdapterModel(@NonNull MainAdapterContract.Model adapterModel)
    {
        mAdapterModel = checkNotNull(adapterModel);
    }

    @Override
    public void setMainAdapterView(@NonNull MainAdapterContract.View adpaterView)
    {
        mAdapterView = checkNotNull(adpaterView);
    }
}
