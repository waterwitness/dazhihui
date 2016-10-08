package com.iflytek.ise.result;

import com.iflytek.ise.result.util.ResultFormatUtil;

public class ReadSyllableResult
  extends Result
{
  public ReadSyllableResult()
  {
    this.language = "cn";
    this.category = "read_syllable";
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("[总体结果]\n").append("评测内容：" + this.content + "\n").append("朗读时长：" + this.time_len + "\n").append("总分：" + this.total_score + "\n\n").append("[朗读详情]").append(ResultFormatUtil.formatDetails_CN(this.sentences));
    return localStringBuffer.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\ise\result\ReadSyllableResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */