package artview.co.kr.androidmvpskeleton.data.app;

/**
 * Created by whkong on 2017-11-17.
 */


// Repository, remote, local 안에 있는 메서드를 공통으로 정의한다.
public interface AppDataSource
{
    String getBriefMsg();
    void setBriefMsg(String briefMsg);
}
