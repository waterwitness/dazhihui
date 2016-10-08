package com.cairh.app.sjkh;

import android.content.Intent;
import android.os.CountDownTimer;
import android.util.Log;

class MainActivity$9
  extends CountDownTimer
{
  MainActivity$9(MainActivity paramMainActivity, long paramLong1, long paramLong2)
  {
    super(paramLong1, paramLong2);
  }
  
  public void onFinish()
  {
    Intent localIntent = new Intent();
    try
    {
      Class localClass = Class.forName("com.hundsun.winner.application.hsactivity.trade.base.activity.LockActivity");
      localIntent.setClass(this.this$0, localClass);
      this.this$0.startActivity(localIntent);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      Log.e("CRH_MainActivity", ">>>>>>>>>>>倒计时停止异常>>>>>>>>>>>>>>");
      Log.e("CRH_MainActivity", localClassNotFoundException.getMessage());
      localClassNotFoundException.printStackTrace();
    }
  }
  
  public void onTick(long paramLong) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */