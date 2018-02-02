package artview.co.kr.androidmvpskeleton.adapter.main;

/**
 * Created by whkong on 2017-11-20.
 */

public interface MainAdapterContract
{
    interface View
    {
        void notifyAdapter();
    }


    interface Model
    {
//        void addItems(ArrayList<DataYouWant> items);

        void clearItem();

    }

}
