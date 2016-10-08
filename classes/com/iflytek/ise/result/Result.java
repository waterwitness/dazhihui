package com.iflytek.ise.result;

import com.iflytek.ise.result.entity.Sentence;
import java.util.ArrayList;

public class Result
{
  public int beg_pos;
  public String category;
  public String content;
  public int end_pos;
  public String except_info;
  public boolean is_rejected;
  public String language;
  public ArrayList<Sentence> sentences;
  public int time_len;
  public float total_score;
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\ise\result\Result.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */