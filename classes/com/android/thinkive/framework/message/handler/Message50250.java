package com.android.thinkive.framework.message.handler;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Window;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.util.CommonUtil;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.view.MyWebView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public class Message50250
  implements IMessageHandler
{
  private Context mContext;
  private Date mDate = null;
  private DatePickerDialog mDatePickerDialog;
  private DatePickerDialog.OnDateSetListener mDateSetListener = new Message50250.1(this);
  private int mDay;
  private int mMonth;
  private String mSelector;
  private String mSourceModule;
  private MyWebView mWebView;
  private int mYear;
  
  private String formatMonthAndDay(int paramInt)
  {
    if ((paramInt > 0) && (paramInt < 10)) {
      return "0" + paramInt;
    }
    return String.valueOf(paramInt);
  }
  
  private void showDatePickerDialog(Context paramContext)
  {
    Object localObject = Calendar.getInstance();
    if (this.mDate != null) {
      ((Calendar)localObject).setTime(this.mDate);
    }
    this.mYear = ((Calendar)localObject).get(1);
    this.mMonth = ((Calendar)localObject).get(2);
    this.mDay = ((Calendar)localObject).get(5);
    localObject = CommonUtil.getTopActivity(this.mContext);
    Activity localActivity = ThinkiveInitializer.getInstance().getActivity((String)localObject);
    Log.d("50250 currentActivityName = " + (String)localObject + " currentActivity = " + localActivity);
    if (localActivity != null) {
      this.mDatePickerDialog = new DatePickerDialog(localActivity, this.mDateSetListener, this.mYear, this.mMonth, this.mDay);
    }
    for (;;)
    {
      this.mDatePickerDialog.show();
      return;
      this.mDatePickerDialog = new DatePickerDialog(paramContext, this.mDateSetListener, this.mYear, this.mMonth, this.mDay);
      this.mDatePickerDialog.getWindow().setType(2003);
    }
  }
  
  private void updateDate()
  {
    Object localObject = new StringBuilder().append(this.mYear).append("-").append(formatMonthAndDay(this.mMonth + 1)).append("-").append(formatMonthAndDay(this.mDay));
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("date", ((StringBuilder)localObject).toString());
      localJSONObject.put("selector", this.mSelector);
      localObject = new AppMessage(50251, localJSONObject);
      ((AppMessage)localObject).setSourceModule(this.mSourceModule);
      ((AppMessage)localObject).setWebView(this.mWebView);
      MessageManager.getInstance(this.mContext).sendMessage((AppMessage)localObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
    }
  }
  
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    this.mContext = paramContext;
    this.mWebView = paramAppMessage.getWebView();
    Object localObject = paramAppMessage.getContent();
    this.mSourceModule = paramAppMessage.getContent().optString("moduleName");
    paramAppMessage = ((JSONObject)localObject).optString("year");
    String str1 = ((JSONObject)localObject).optString("month");
    String str2 = ((JSONObject)localObject).optString("day");
    this.mSelector = ((JSONObject)localObject).optString("selector");
    if (TextUtils.isEmpty(paramAppMessage)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-5025001, "年份不能为空", null);
    }
    if (TextUtils.isEmpty(str1)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-5025002, " 月份不能为空", null);
    }
    if (TextUtils.isEmpty(str2)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-5025003, "日期不能为空", null);
    }
    localObject = new SimpleDateFormat("yyyy-MM-dd");
    try
    {
      this.mDate = ((SimpleDateFormat)localObject).parse(paramAppMessage + "-" + str1 + "-" + str2);
      ThinkiveInitializer.getInstance().getHandler().post(new Message50250.2(this));
      return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
    }
    catch (ParseException paramAppMessage)
    {
      for (;;)
      {
        paramAppMessage.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50250.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */