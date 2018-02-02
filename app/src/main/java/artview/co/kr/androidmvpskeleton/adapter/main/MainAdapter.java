package artview.co.kr.androidmvpskeleton.adapter.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.AdapterView;

/**
 * Created by whkong on 2017-11-20.
 */

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> implements MainAdapterContract.View, MainAdapterContract.Model
{
    private Context mContext;
    private AdapterView.OnItemClickListener mOnItemClickListener;

    //private ArrayList<ItemYouWant> mMainItme;

    public MainAdapter(Context context)
    {
        mContext = context;
    }


    // For DI
    public static MainAdapter makeMainAdapterByContext(Context context)
    {
        return new MainAdapter(context);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener)
    {
        mOnItemClickListener = onItemClickListener;
    }


    // 커스텀
//    @Override
//    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
//    {
//        return new MainViewHolder(mContext, parent, mOnItemClickListener);
//    }


    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        return null;
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position)
    {

    }


    @Override
    public int getItemCount()
    {
        return 0;
    }


    // View
    @Override
    public void notifyAdapter()
    {
        notifyDataSetChanged();
    }


    // Model
    @Override
    public void clearItem()
    {

    }
}
