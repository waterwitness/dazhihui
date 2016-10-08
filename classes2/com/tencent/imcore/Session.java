package com.tencent.imcore;

public class Session
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public Session()
  {
    this(internalJNI.new_Session(), true);
  }
  
  protected Session(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(Session paramSession)
  {
    if (paramSession == null) {
      return 0L;
    }
    return paramSession.swigCPtr;
  }
  
  public long activeTime()
  {
    return internalJNI.Session_activeTime(this.swigCPtr, this);
  }
  
  public void delete()
  {
    try
    {
      if (this.swigCPtr != 0L)
      {
        if (this.swigCMemOwn)
        {
          this.swigCMemOwn = false;
          internalJNI.delete_Session(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public int deleteLocalMsg(IDeleteLocalMsg paramIDeleteLocalMsg)
  {
    return internalJNI.Session_deleteLocalMsg__SWIG_1(this.swigCPtr, this, IDeleteLocalMsg.getCPtr(paramIDeleteLocalMsg), paramIDeleteLocalMsg);
  }
  
  public int deleteLocalMsg(Msg paramMsg, IDeleteLocalMsg paramIDeleteLocalMsg)
  {
    return internalJNI.Session_deleteLocalMsg__SWIG_0(this.swigCPtr, this, Msg.getCPtr(paramMsg), paramMsg, IDeleteLocalMsg.getCPtr(paramIDeleteLocalMsg), paramIDeleteLocalMsg);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public void getLocalMsgs(long paramLong, Msg paramMsg, IGetMsgs paramIGetMsgs)
  {
    internalJNI.Session_getLocalMsgs(this.swigCPtr, this, paramLong, Msg.getCPtr(paramMsg), paramMsg, IGetMsgs.getCPtr(paramIGetMsgs), paramIGetMsgs);
  }
  
  public void getMsgs(long paramLong, Msg paramMsg, IGetMsgs paramIGetMsgs)
  {
    internalJNI.Session_getMsgs(this.swigCPtr, this, paramLong, Msg.getCPtr(paramMsg), paramMsg, IGetMsgs.getCPtr(paramIGetMsgs), paramIGetMsgs);
  }
  
  public void getMsgsForward(long paramLong, Msg paramMsg, IGetMsgs paramIGetMsgs)
  {
    internalJNI.Session_getMsgsForward(this.swigCPtr, this, paramLong, Msg.getCPtr(paramMsg), paramMsg, IGetMsgs.getCPtr(paramIGetMsgs), paramIGetMsgs);
  }
  
  public MsgVec getMsgsFromCache(long paramLong)
  {
    return new MsgVec(internalJNI.Session_getMsgsFromCache__SWIG_1(this.swigCPtr, this, paramLong), true);
  }
  
  public MsgVec getMsgsFromCache(long paramLong, Msg paramMsg)
  {
    return new MsgVec(internalJNI.Session_getMsgsFromCache__SWIG_0(this.swigCPtr, this, paramLong, Msg.getCPtr(paramMsg), paramMsg), true);
  }
  
  public String iconUrl()
  {
    return internalJNI.Session_iconUrl(this.swigCPtr, this);
  }
  
  public String identifier()
  {
    return internalJNI.Session_identifier(this.swigCPtr, this);
  }
  
  public boolean isValid()
  {
    return internalJNI.Session_isValid(this.swigCPtr, this);
  }
  
  public long msgUnread()
  {
    return internalJNI.Session_msgUnread(this.swigCPtr, this);
  }
  
  public String name()
  {
    return internalJNI.Session_name(this.swigCPtr, this);
  }
  
  public void reportReaded()
  {
    internalJNI.Session_reportReaded__SWIG_2(this.swigCPtr, this);
  }
  
  public void reportReaded(Msg paramMsg)
  {
    internalJNI.Session_reportReaded__SWIG_1(this.swigCPtr, this, Msg.getCPtr(paramMsg), paramMsg);
  }
  
  public void reportReaded(Msg paramMsg, ISetReadMsg paramISetReadMsg)
  {
    internalJNI.Session_reportReaded__SWIG_0(this.swigCPtr, this, Msg.getCPtr(paramMsg), paramMsg, ISetReadMsg.getCPtr(paramISetReadMsg), paramISetReadMsg);
  }
  
  public int saveMsg(Msg paramMsg, String paramString, boolean paramBoolean)
  {
    return internalJNI.Session_saveMsg(this.swigCPtr, this, Msg.getCPtr(paramMsg), paramMsg, paramString, paramBoolean);
  }
  
  public void sendCustomMsg(Msg paramMsg, ISendMsg paramISendMsg, long paramLong)
  {
    internalJNI.Session_sendCustomMsg(this.swigCPtr, this, Msg.getCPtr(paramMsg), paramMsg, ISendMsg.getCPtr(paramISendMsg), paramISendMsg, paramLong);
  }
  
  public void sendLikeMsg(Msg paramMsg, ISendMsg paramISendMsg)
  {
    internalJNI.Session_sendLikeMsg(this.swigCPtr, this, Msg.getCPtr(paramMsg), paramMsg, ISendMsg.getCPtr(paramISendMsg), paramISendMsg);
  }
  
  public void sendMsg(Msg paramMsg, ISendMsg paramISendMsg)
  {
    internalJNI.Session_sendMsg(this.swigCPtr, this, Msg.getCPtr(paramMsg), paramMsg, ISendMsg.getCPtr(paramISendMsg), paramISendMsg);
  }
  
  public void sendRedPacketMsg(Msg paramMsg, ISendMsg paramISendMsg)
  {
    internalJNI.Session_sendRedPacketMsg(this.swigCPtr, this, Msg.getCPtr(paramMsg), paramMsg, ISendMsg.getCPtr(paramISendMsg), paramISendMsg);
  }
  
  public String sid()
  {
    return internalJNI.Session_sid(this.swigCPtr, this);
  }
  
  public SessionType type()
  {
    return SessionType.swigToEnum(internalJNI.Session_type(this.swigCPtr, this));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\Session.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */