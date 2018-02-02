package artview.co.kr.androidmvpskeleton.view.common;

import artview.co.kr.androidmvpskeleton.BasePresenter;
import artview.co.kr.androidmvpskeleton.BaseView;

/**
 * Created by whkong on 2017-11-16.
 */

public interface CommonContract
{
    interface View extends BaseView<Presenter>
    {

    }

    interface Presenter extends BasePresenter
    {

    }

}
