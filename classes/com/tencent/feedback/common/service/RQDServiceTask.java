package com.tencent.feedback.common.service;

import android.content.Intent;

public abstract interface RQDServiceTask
{
  public abstract int getTaskId();
  
  public abstract String getTaskName();
  
  public abstract void runInService(RQDService paramRQDService, Intent paramIntent);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\common\service\RQDServiceTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */