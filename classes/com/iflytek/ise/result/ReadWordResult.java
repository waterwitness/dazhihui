package com.iflytek.ise.result;

import com.iflytek.ise.result.util.ResultFormatUtil;

public class ReadWordResult
  extends Result
{
  public ReadWordResult()
  {
    this.category = "read_word";
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if ("cn".equals(this.language)) {
      localStringBuffer.append("[总体结果]\n").append("评测内容：" + this.content + "\n").append("朗读时长：" + this.time_len + "\n").append("总分：" + this.total_score + "\n\n").append("[朗读详情]").append(ResultFormatUtil.formatDetails_CN(this.sentences));
    }
    for (;;)
    {
      return localStringBuffer.toString();
      if (this.is_rejected) {
        localStringBuffer.append("检测到乱读，").append("except_info:" + this.except_info + "\n\n");
      }
      localStringBuffer.append("[总体结果]\n").append("评测内容：" + this.content + "\n").append("总分：" + this.total_score + "\n\n").append("[朗读详情]").append(ResultFormatUtil.formatDetails_EN(this.sentences));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\ise\result\ReadWordResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */