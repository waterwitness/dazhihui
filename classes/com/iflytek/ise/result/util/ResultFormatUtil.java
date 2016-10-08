package com.iflytek.ise.result.util;

import com.iflytek.ise.result.entity.Phone;
import com.iflytek.ise.result.entity.Sentence;
import com.iflytek.ise.result.entity.Syll;
import com.iflytek.ise.result.entity.Word;
import java.util.ArrayList;
import java.util.Iterator;

public class ResultFormatUtil
{
  public static String formatDetails_CN(ArrayList<Sentence> paramArrayList)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramArrayList == null) {
      return localStringBuffer.toString();
    }
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      Object localObject1 = (Sentence)paramArrayList.next();
      if (((Sentence)localObject1).words != null)
      {
        localObject1 = ((Sentence)localObject1).words.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject2 = (Word)((Iterator)localObject1).next();
          localStringBuffer.append("\n词语[" + ResultTranslateUtil.getContent(((Word)localObject2).content) + "] " + ((Word)localObject2).symbol + " 时长：" + ((Word)localObject2).time_len);
          if (((Word)localObject2).sylls != null)
          {
            localObject2 = ((Word)localObject2).sylls.iterator();
            while (((Iterator)localObject2).hasNext())
            {
              Object localObject3 = (Syll)((Iterator)localObject2).next();
              if ((!"噪音".equals(ResultTranslateUtil.getContent(((Syll)localObject3).content))) && (!"静音".equals(ResultTranslateUtil.getContent(((Syll)localObject3).content))))
              {
                localStringBuffer.append("\n└音节[" + ResultTranslateUtil.getContent(((Syll)localObject3).content) + "] " + ((Syll)localObject3).symbol + " 时长：" + ((Syll)localObject3).time_len);
                if (((Syll)localObject3).phones != null)
                {
                  localObject3 = ((Syll)localObject3).phones.iterator();
                  while (((Iterator)localObject3).hasNext())
                  {
                    Phone localPhone = (Phone)((Iterator)localObject3).next();
                    localStringBuffer.append("\n\t└音素[" + ResultTranslateUtil.getContent(localPhone.content) + "] " + "时长：" + localPhone.time_len).append(" 朗读：" + ResultTranslateUtil.getDpMessageInfo(localPhone.dp_message));
                  }
                }
              }
            }
            localStringBuffer.append("\n");
          }
        }
      }
    }
    return localStringBuffer.toString();
  }
  
  public static String formatDetails_EN(ArrayList<Sentence> paramArrayList)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramArrayList == null) {
      return localStringBuffer.toString();
    }
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      Object localObject1 = (Sentence)paramArrayList.next();
      if ((!"噪音".equals(ResultTranslateUtil.getContent(((Sentence)localObject1).content))) && (!"静音".equals(ResultTranslateUtil.getContent(((Sentence)localObject1).content))) && (((Sentence)localObject1).words != null))
      {
        localObject1 = ((Sentence)localObject1).words.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject2 = (Word)((Iterator)localObject1).next();
          if ((!"噪音".equals(ResultTranslateUtil.getContent(((Word)localObject2).content))) && (!"静音".equals(ResultTranslateUtil.getContent(((Word)localObject2).content))))
          {
            localStringBuffer.append("\n单词[" + ResultTranslateUtil.getContent(((Word)localObject2).content) + "] ").append("朗读：" + ResultTranslateUtil.getDpMessageInfo(((Word)localObject2).dp_message)).append(" 得分：" + ((Word)localObject2).total_score);
            if (((Word)localObject2).sylls == null)
            {
              localStringBuffer.append("\n");
            }
            else
            {
              localObject2 = ((Word)localObject2).sylls.iterator();
              while (((Iterator)localObject2).hasNext())
              {
                Object localObject3 = (Syll)((Iterator)localObject2).next();
                localStringBuffer.append("\n└音节[" + ResultTranslateUtil.getContent(((Syll)localObject3).getStdSymbol()) + "] ");
                if (((Syll)localObject3).phones != null)
                {
                  localObject3 = ((Syll)localObject3).phones.iterator();
                  while (((Iterator)localObject3).hasNext())
                  {
                    Phone localPhone = (Phone)((Iterator)localObject3).next();
                    localStringBuffer.append("\n\t└音素[" + ResultTranslateUtil.getContent(localPhone.getStdSymbol()) + "] ").append(" 朗读：" + ResultTranslateUtil.getDpMessageInfo(localPhone.dp_message));
                  }
                }
              }
              localStringBuffer.append("\n");
            }
          }
        }
      }
    }
    return localStringBuffer.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\ise\result\util\ResultFormatUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */