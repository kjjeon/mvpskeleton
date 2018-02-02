package artview.co.kr.androidmvpskeleton.view.main;

import artview.co.kr.androidmvpskeleton.BasePresenter;
import artview.co.kr.androidmvpskeleton.BaseView;
import artview.co.kr.androidmvpskeleton.adapter.main.MainAdapter;
import artview.co.kr.androidmvpskeleton.adapter.main.MainAdapterContract;

/**
 * Created by whkong on 2017-11-16.
 */

public interface MainContract
{
    interface View extends BaseView<Presenter>
    {

    }

    interface Presenter extends BasePresenter
    {
        void setAdapter(MainAdapter adapter);
        void setMainAdapterModel(MainAdapterContract.Model adapterModel);
        void setMainAdapterView(MainAdapterContract.View adpaterView);
    }

}
