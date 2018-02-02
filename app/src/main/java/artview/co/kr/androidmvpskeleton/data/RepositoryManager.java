package artview.co.kr.androidmvpskeleton.data;

import artview.co.kr.androidmvpskeleton.data.app.AppRepository;

/**
 * Created by kjjeon on 2017-11-21.
 */

public class RepositoryManager implements RepositorySoruce{
    private static RepositoryManager INSTANCE = null;

    //직접 객체화하는것을 방지한다.
    private RepositoryManager(){}

    public static RepositoryManager getInstance()
    {
        if (INSTANCE == null)
            INSTANCE = new RepositoryManager();
        return INSTANCE;
    }

    @Override
    public AppRepository getAppRepository() {
        return AppRepository.getInstance();
    }
}
