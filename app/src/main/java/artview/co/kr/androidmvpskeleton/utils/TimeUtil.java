package artview.co.kr.androidmvpskeleton.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by whkong on 2017-11-22.
 */

public class TimeUtil
{
    private static final DateFormat DEFAULT_FORMAT= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());

    private TimeUtil()
    {
        throw new UnsupportedOperationException("You cannot instantiate me!!!");
    }

    public static String millis2String(final long parMillis)
    {
        return millis2String(parMillis, DEFAULT_FORMAT);
    }

    public static String millis2String(final long parMillis, final DateFormat parFormat)
    {
        return parFormat.format(new Date(parMillis));
    }

    public static long string2Millis(final String parTime)
    {
        return string2Millis(parTime, DEFAULT_FORMAT);
    }

    public static long string2Millis(final String parTime, final DateFormat parFormat)
    {
        try
        {
            return parFormat.parse(parTime).getTime();
        }
        catch(ParseException e)
        {
            e.printStackTrace();
        }

        return -1;
    }

    public static Date string2Date(final String parTime)
    {
        return string2Date(parTime, DEFAULT_FORMAT);
    }

    public static Date string2Date(final String parTime, final DateFormat parFormat)
    {
        try
        {
            return parFormat.parse(parTime);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static String date2String(final Date parDate)
    {
        return date2String(parDate, DEFAULT_FORMAT);
    }

    public static String date2String(final Date parDate, final DateFormat parFormat)
    {
        return parFormat.format(parDate);
    }

    public static long date2Millis(final Date parDate)
    {
        return parDate.getTime();
    }

    public static Date millis2Date(final long parMillis)
    {
        return new Date(parMillis);
    }

    public static long getNowMillis()
    {
        return System.currentTimeMillis();
    }

    public static String getNowString()
    {
        return millis2String(System.currentTimeMillis(), DEFAULT_FORMAT);
    }

    public static String getNowStrint(final DateFormat parFormat)
    {
        return millis2String(System.currentTimeMillis(), parFormat);
    }

    public static Date getNowDate()
    {
        return new Date();
    }

    public static String getKoreanWeek(final String parTime)
    {
        return getKoreanWeek(string2Date(parTime, DEFAULT_FORMAT));
    }

    public static String getKoreanWeek(final String parTime, final DateFormat parFormat)
    {
        return getKoreanWeek(string2Date(parTime, parFormat));
    }

    public static String getKoreanWeek(final Date parDate)
    {
        return new SimpleDateFormat("E", Locale.KOREA).format(parDate);
    }

    public static String getKoreanWeek(final long parMills)
    {
        return getKoreanWeek(new Date(parMills));
    }

    public static String getUSWeek(final String parTime)
    {
        return getUSWeek(string2Date(parTime, DEFAULT_FORMAT));
    }

    public static String getUSWeek(final String parTime, final DateFormat parFormat)
    {
        return getUSWeek(string2Date(parTime, parFormat));
    }

    public static String getUSWeek(final Date parDate)
    {
        return new SimpleDateFormat("EEEE", Locale.US).format(parDate);
    }

    public static String getUSWeek(final long parMills)
    {
        return getUSWeek(new Date(parMills));
    }

    public static int getWeekOfMonth(final String parTime)
    {
        return getWeekOfMonth(string2Date(parTime, DEFAULT_FORMAT));
    }

    public static int getWeekOfMonth(final String parTime, final DateFormat parFormat)
    {
        return getWeekOfMonth(string2Date(parTime, parFormat));
    }

    public static int getWeekOfMonth(final Date parDate)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parDate);
        return calendar.get(Calendar.WEEK_OF_MONTH);
    }

    public static int getWeekOfMonth(final long parMillis)
    {
        return getWeekOfMonth(millis2Date(parMillis));
    }

    public static int getWeekOfYear(final String parTime)
    {
        return getWeekOfMonth(string2Date(parTime, DEFAULT_FORMAT));
    }

    public static int getWeekOfYear(final String parTime, final DateFormat parFormat)
    {
        return getWeekOfMonth(string2Date(parTime, parFormat));
    }

    public static int getWeekOfYear(final Date parDate)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parDate);
        return calendar.get(Calendar.WEEK_OF_YEAR);
    }

    public static int getWeekOfYear(final long parMillis)
    {
        return getWeekOfYear(millis2Date(parMillis));
    }







}
