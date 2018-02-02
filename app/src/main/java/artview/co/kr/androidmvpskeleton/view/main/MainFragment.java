package artview.co.kr.androidmvpskeleton.view.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import artview.co.kr.androidmvpskeleton.R;

import static com.google.common.base.Preconditions.checkNotNull;


/**
 * Created by whkong on 2017-11-16.
 */

public class MainFragment extends Fragment implements MainContract.View
{
    public static final String FRAGMENT_MAIN_ID = "FRAGMENT_MAIN";

    private MainContract.Presenter mPresenter;
    private RecyclerView mRecyclerView;
    private TextView mTitle;




    public MainFragment()
    {
        // Requires empty public constructor
    }

    public static MainFragment newInstance()
    {
        return new MainFragment();
    }





    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Fragment
    public void onResume()
    {
        super.onResume();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        //프래그먼트의 레이아웃 팽창
        //프래그먼트가 자신의 UI를 그려야 할 때 호출.
        //만약 프래그먼트가 UI를 가지지 않으면 null반환

        View root = inflater.inflate(R.layout.main_frag, container, false);
        mTitle = (TextView)root.findViewById(R.id.textMainFragTitle);

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onPause()
    {
        // 사용자가 프래그먼트를 떠나려고 할 때 호출
        // 유지되어야 하는 변경 사항이 있는 경우 기록 필요
        super.onPause();
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////
    //interface

    @Override
    public void setPresenter(@NonNull MainContract.Presenter presenter)
    {
        mPresenter = checkNotNull(presenter);
    }
}
