package artview.co.kr.androidmvpskeleton.view.main;

import android.os.Bundle;

import artview.co.kr.androidmvpskeleton.R;
import artview.co.kr.androidmvpskeleton.adapter.main.MainAdapter;
import artview.co.kr.androidmvpskeleton.data.RepositoryManager;
import artview.co.kr.androidmvpskeleton.view.common.CommonActivity;

public class MainActivity extends CommonActivity
{
    private MainPresenter mMainPresenter;
    private MainAdapter mMainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);

        MainFragment fragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.frameFragment);
        if (fragment == null)
        {
            //없으니 생성
            fragment = MainFragment.newInstance();
            getSupportFragmentManager().beginTransaction().add(R.id.frameFragment, fragment).commit();
        }


        //어탭터 생성
        mMainAdapter = MainAdapter.makeMainAdapterByContext(this);

        //Presenter에 모델과 뷰 연결
        //Presenter생성자에서 뷰에 Presenter 연결
        mMainPresenter = new MainPresenter(RepositoryManager.getInstance(), fragment);
        //어탭터 등록
        mMainPresenter.setAdapter(mMainAdapter);


    }
}
