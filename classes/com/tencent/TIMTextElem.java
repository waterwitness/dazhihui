package com.tencent;

public class TIMTextElem
  extends TIMElem
{
  private String text;
  
  public TIMTextElem()
  {
    this.type = TIMElemType.Text;
  }
  
  public String getText()
  {
    return this.text;
  }
  
  public void setText(String paramString)
  {
    this.text = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMTextElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */