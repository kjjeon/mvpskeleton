package artview.co.kr.androidmvpskeleton;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import artview.co.kr.androidmvpskeleton.data.RepositoryManager;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest
{


    @Test
    public void useAppContext() throws Exception
    {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("artview.co.kr.androidmvpskeleton", appContext.getPackageName());
    }

    @Test
    public void Repository() throws Exception
    {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("artview.co.kr.androidmvpskeleton", appContext.getPackageName());

        RepositoryManager repositoryManager;
        repositoryManager = RepositoryManager.getInstance();
        repositoryManager.getAppRepository().setBriefMsg("aaaa");
        String msg = repositoryManager.getAppRepository().getBriefMsg();
        assertThat(msg,equalTo("aaaa"));
    }
}
