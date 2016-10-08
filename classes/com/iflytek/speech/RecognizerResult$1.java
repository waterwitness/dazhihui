package com.iflytek.speech;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class RecognizerResult$1
  implements Parcelable.Creator<RecognizerResult>
{
  public RecognizerResult createFromParcel(Parcel paramParcel)
  {
    return new RecognizerResult(paramParcel);
  }
  
  public RecognizerResult[] newArray(int paramInt)
  {
    return new RecognizerResult[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\RecognizerResult$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */