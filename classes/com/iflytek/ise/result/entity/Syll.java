package com.iflytek.ise.result.entity;

import java.util.ArrayList;

public class Syll
{
  public int beg_pos;
  public String content;
  public int dp_message;
  public int end_pos;
  public ArrayList<Phone> phones;
  public String symbol;
  public int time_len;
  
  public String getStdSymbol()
  {
    String str = "";
    String[] arrayOfString = this.content.split(" ");
    int i = 0;
    while (i < arrayOfString.length)
    {
      str = str + Phone.getStdSymbol(arrayOfString[i]);
      i += 1;
    }
    return str;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\ise\result\entity\Syll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */