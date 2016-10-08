package com.iflytek.ise.result;

public class FinalResult
  extends Result
{
  public int ret;
  public float total_score;
  
  public String toString()
  {
    return "返回值：" + this.ret + "，总分：" + this.total_score;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\ise\result\FinalResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */