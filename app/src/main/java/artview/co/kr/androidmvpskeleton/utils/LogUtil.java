package artview.co.kr.androidmvpskeleton.utils;

import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by whkong on 2017-11-21.
 */

public class LogUtil
{
    public static LogUtil INSTANCE;
    public static final String TAG = "PutTagNameYouWant";
    public static final String LINE = "=*=*=*==[ ";

    private static final String APP_NAME = "APPNAME";

    LOGLEVEL mnLogLevel;

    public enum LOGLEVEL
    {
        LOGLEVEL_NOTHING(0),
        LOGLEVEL_V(1),
        LOGLEVEL_D(2),
        LOGLEVEL_I(3),
        LOGLEVEL_W(4),
        LOGLEVEL_E(5);
//        LOGLEVEL_A(6);

        private int value;

        private LOGLEVEL(int parValue)
        {
            value = parValue;
        }

        private int getValue()
        {
            return value;
        }

    }


    private LogUtil()
    {
        setLogLevel(LOGLEVEL.LOGLEVEL_D);
    }

    public static LogUtil getInstance()
    {
        if(INSTANCE == null)
        {
            INSTANCE = new LogUtil();
        }
        return INSTANCE;
    }

    public void V(String parMessage)
    {
        if(mnLogLevel.getValue() < LOGLEVEL.LOGLEVEL_V.getValue())
            return;
        Log.v(TAG,LINE + parMessage +getCurrentLineInfo());
    }

    public void V(String parMessage, String parTag)
    {
        if(mnLogLevel.getValue() < LOGLEVEL.LOGLEVEL_V.getValue())
            return;
        if(TextUtils.isEmpty(parTag))
        {
            parTag = TAG;
        }
        Log.v(parTag,LINE+ parMessage +getCurrentLineInfo());
    }


    public void D(String parMessage)
    {
        if(mnLogLevel.getValue() < LOGLEVEL.LOGLEVEL_D.getValue())
            return;
        Log.d(TAG,LINE + parMessage +getCurrentLineInfo());
    }

    public void D(String parMessage, String parTag)
    {
        if(mnLogLevel.getValue() < LOGLEVEL.LOGLEVEL_D.getValue())
            return;
        if(TextUtils.isEmpty(parTag))
        {
            parTag = TAG;
        }
        Log.d(parTag,LINE+ parMessage +getCurrentLineInfo());
    }

    public void I(String parMessage)
    {
        if(mnLogLevel.getValue() < LOGLEVEL.LOGLEVEL_I.getValue())
            return;
        Log.i(TAG,LINE + parMessage +getCurrentLineInfo());
    }

    public void I(String parMessage, String parTag)
    {
        if(mnLogLevel.getValue() < LOGLEVEL.LOGLEVEL_I.getValue())
            return;
        if(TextUtils.isEmpty(parTag))
        {
            parTag = TAG;
        }
        Log.i(parTag,LINE+ parMessage +getCurrentLineInfo());
    }

    public void W(String parMessage)
    {
        if(mnLogLevel.getValue() < LOGLEVEL.LOGLEVEL_W.getValue())
            return;
        Log.w(TAG,LINE + parMessage +getCurrentLineInfo());
    }

    public void W(String parMessage, String parTag)
    {
        if(mnLogLevel.getValue() < LOGLEVEL.LOGLEVEL_W.getValue())
            return;
        if(TextUtils.isEmpty(parTag))
        {
            parTag = TAG;
        }
        Log.w(parTag,LINE+ parMessage +getCurrentLineInfo());
    }

    public void E(String parMessage)
    {
        if(mnLogLevel.getValue() < LOGLEVEL.LOGLEVEL_E.getValue())
            return;
        Log.e(TAG,LINE + parMessage +getCurrentLineInfo());
    }

    public void E(String parMessage, String parTag)
    {
        if(mnLogLevel.getValue() < LOGLEVEL.LOGLEVEL_E.getValue())
            return;
        if(TextUtils.isEmpty(parTag))
        {
            parTag = TAG;
        }
        Log.e(parTag,LINE+ parMessage +getCurrentLineInfo());
    }

//    public void A(String parMessage)
//    {
//        if(mnLogLevel.getValue() < LOGLEVEL.LOGLEVEL_A.getValue())
//            return;
//        Log.wtf(TAG,LINE +getCurrentLineInfo());
//    }
//
//    public void A(String parMessage, String parTag)
//    {
//        if(mnLogLevel.getValue() < LOGLEVEL.LOGLEVEL_A.getValue())
//            return;
//        if(TextUtils.isEmpty(parTag))
//        {
//            parTag = TAG;
//        }
//        Log.wtf(parTag,LINE+ parMessage +getCurrentLineInfo());
//    }



    public void setLogLevel(LOGLEVEL parNLogLevel)
    {
        mnLogLevel = checkNotNull(parNLogLevel);



        //범위 조건문 필요;
//        if(parNLogLevel <= LOGLEVEL_A && parNLogLevel >= LOGLEVEL_V)
//        {
//            mnLogLevel = parNLogLevel;
//        }
//        else
//        {
//            E(null, "LogLevel Range is wrong", new Throwable());
//            mnLogLevel = LOGLEVEL_V;
//        }

    }

    private String getCurrentLineInfo()
    {
        StackTraceElement trace = Thread.currentThread().getStackTrace()[4];

        String strFileName = trace.getFileName();
        String strClassName = trace.getClassName();
        String strMethodName = trace.getMethodName();
        int nLineNumber = trace.getLineNumber();

        return " ]-->>> at " + "( LineNumber : " + nLineNumber + " )" + strClassName+ "." + strMethodName + " of " + strFileName;
    }

    private String getFileNameAndLineNumber(Throwable parThrowable)
    {
        checkNotNull(parThrowable);

        String strFileName = parThrowable.getStackTrace()[0].getFileName();
        String strClassName = parThrowable.getStackTrace()[0].getClassName();
        String strMethodName = parThrowable.getStackTrace()[0].getMethodName();
        int nLineNumber = parThrowable.getStackTrace()[0].getLineNumber();

        parThrowable = null;    // Why?

        return " ]-->>> at " + "( LineNumber : " + nLineNumber + " )" + strClassName+ "." + strMethodName + " of " + strFileName;
    }



    private void writeLogFile(String parMessage, String parFileName)
    {
        checkNotNull(parMessage);

        String strLogFilePath;

        if(parFileName != null)
        {
            strLogFilePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + APP_NAME + "/Log/"+ parFileName +".txt";
        }
        else
        {
            strLogFilePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + APP_NAME + "/Log/log.txt";
        }


        File file = new File(strLogFilePath);
        if(file.exists() == false)
        {
            try
            {
                file.createNewFile();
            }catch (IOException e)
            {
                LogUtil.getInstance().E("exception : " + e.toString());
            }
        }
        else
        {
            try
            {
                BufferedWriter bfw = new BufferedWriter(new FileWriter(strLogFilePath, true));
                bfw.write(parMessage);
                bfw.write("\n");
                bfw.flush();
                bfw.close();
            }
            catch (FileNotFoundException e)
            {
            }
            catch(IOException e)
            {
            }
        }
    }


}
