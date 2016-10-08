package com.bairuitech.anychat;

public abstract interface AnyChatDataEncDecEvent
{
  public static final int BRAC_DATAENCDEC_FLAGS_AUDIO = 16;
  public static final int BRAC_DATAENCDEC_FLAGS_BUFFER = 64;
  public static final int BRAC_DATAENCDEC_FLAGS_DECMODE = 2;
  public static final int BRAC_DATAENCDEC_FLAGS_ENCMODE = 1;
  public static final int BRAC_DATAENCDEC_FLAGS_TXTMSG = 128;
  public static final int BRAC_DATAENCDEC_FLAGS_VIDEO = 32;
  
  public abstract int OnAnyChatDataEncDec(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, AnyChatOutParam paramAnyChatOutParam);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\anychat\AnyChatDataEncDecEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */