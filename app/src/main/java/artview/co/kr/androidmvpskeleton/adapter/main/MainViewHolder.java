package artview.co.kr.androidmvpskeleton.adapter.main;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;

/**
 * Created by whkong on 2017-11-20.
 */

public class MainViewHolder extends RecyclerView.ViewHolder
{
    private Context mContext;

    private AdapterView.OnItemClickListener mOnItemClickListener;

    public MainViewHolder(View itemView)
    {
        super(itemView);
    }

//    public MainViewHolder(Context context, ViewGroup parent, AdapterView.OnItemClickListener onItemClickListener)
//    {
//        super(LayoutInflater.from(context).inflate(R.layout.ImageYouWant, parent, flase));  //뷰 반환
//
//        mContext = context;
//        mOnItemClickListener = onItemClickListener;
//
//
//    }



}
