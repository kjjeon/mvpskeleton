package artview.co.kr.androidmvpskeleton.view.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import artview.co.kr.androidmvpskeleton.R;
import artview.co.kr.androidmvpskeleton.data.RepositoryManager;

/**
 * Created by whkong on 2017-11-16.
 */

public class CommonActivity extends AppCompatActivity implements CommonContract.View
{
    private CommonPresenter commonPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle(R.string.common_actionbar);
        //setContentView(R.layout.main_act);

        commonPresenter = new CommonPresenter(RepositoryManager.getInstance(), this);
    }


    @Override
    public void setPresenter(CommonContract.Presenter presenter)
    {

    }
}
