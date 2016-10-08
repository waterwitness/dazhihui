package com.tencent.imcore;

public class Msg
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public Msg()
  {
    this(internalJNI.new_Msg__SWIG_0(), true);
  }
  
  protected Msg(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  public Msg(SWIGTYPE_p_std__shared_ptrT_imcore__MsgNode_t paramSWIGTYPE_p_std__shared_ptrT_imcore__MsgNode_t)
  {
    this(internalJNI.new_Msg__SWIG_1(SWIGTYPE_p_std__shared_ptrT_imcore__MsgNode_t.getCPtr(paramSWIGTYPE_p_std__shared_ptrT_imcore__MsgNode_t)), true);
  }
  
  protected static long getCPtr(Msg paramMsg)
  {
    if (paramMsg == null) {
      return 0L;
    }
    return paramMsg.swigCPtr;
  }
  
  public static Msg newMsg()
  {
    return new Msg(internalJNI.Msg_newMsg__SWIG_0(), true);
  }
  
  public static Msg newMsg(Msg paramMsg)
  {
    return new Msg(internalJNI.Msg_newMsg__SWIG_1(getCPtr(paramMsg), paramMsg), true);
  }
  
  public void addElem(Elem paramElem)
  {
    internalJNI.Msg_addElem(this.swigCPtr, this, Elem.getCPtr(paramElem), paramElem);
  }
  
  public SWIGTYPE_p_std__shared_ptrT_imcore__MsgNode_t cloneShared()
  {
    return new SWIGTYPE_p_std__shared_ptrT_imcore__MsgNode_t(internalJNI.Msg_cloneShared(this.swigCPtr, this), true);
  }
  
  public int customInt()
  {
    return internalJNI.Msg_customInt(this.swigCPtr, this);
  }
  
  public String customStr()
  {
    return internalJNI.Msg_customStr(this.swigCPtr, this);
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
          internalJNI.delete_Msg(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean deleteFromStorage()
  {
    return internalJNI.Msg_deleteFromStorage(this.swigCPtr, this);
  }
  
  public long elemSize()
  {
    return internalJNI.Msg_elemSize(this.swigCPtr, this);
  }
  
  public MsgElemType elemType(long paramLong)
  {
    return MsgElemType.swigToEnum(internalJNI.Msg_elemType(this.swigCPtr, this, paramLong));
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public long flag()
  {
    return internalJNI.Msg_flag(this.swigCPtr, this);
  }
  
  public Elem getElem(long paramLong)
  {
    return new Elem(internalJNI.Msg_getElem(this.swigCPtr, this, paramLong), true);
  }
  
  public byte[] getGroupName()
  {
    return internalJNI.Msg_getGroupName(this.swigCPtr, this);
  }
  
  public String getSender()
  {
    return internalJNI.Msg_getSender(this.swigCPtr, this);
  }
  
  public NewGroupMemberInfo getSenderGroupMemberProfile()
  {
    return new NewGroupMemberInfo(internalJNI.Msg_getSenderGroupMemberProfile(this.swigCPtr, this), true);
  }
  
  public FriendProfile getSenderProfile()
  {
    return new FriendProfile(internalJNI.Msg_getSenderProfile(this.swigCPtr, this), true);
  }
  
  public boolean hasGap()
  {
    return internalJNI.Msg_hasGap(this.swigCPtr, this);
  }
  
  public boolean isRead()
  {
    return internalJNI.Msg_isRead(this.swigCPtr, this);
  }
  
  public boolean isSelf()
  {
    return internalJNI.Msg_isSelf(this.swigCPtr, this);
  }
  
  public boolean isValid()
  {
    return internalJNI.Msg_isValid(this.swigCPtr, this);
  }
  
  public byte[] msgid()
  {
    return internalJNI.Msg_msgid(this.swigCPtr, this);
  }
  
  public boolean parse(byte[] paramArrayOfByte)
  {
    return internalJNI.Msg_parse(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public long rand()
  {
    return internalJNI.Msg_rand(this.swigCPtr, this);
  }
  
  public boolean remove()
  {
    return internalJNI.Msg_remove(this.swigCPtr, this);
  }
  
  public long seq()
  {
    return internalJNI.Msg_seq(this.swigCPtr, this);
  }
  
  public byte[] serialize()
  {
    return internalJNI.Msg_serialize(this.swigCPtr, this);
  }
  
  public Session session()
  {
    return new Session(internalJNI.Msg_session(this.swigCPtr, this), true);
  }
  
  public boolean setCustomInt(int paramInt)
  {
    return internalJNI.Msg_setCustomInt(this.swigCPtr, this, paramInt);
  }
  
  public boolean setCustomStr(String paramString)
  {
    return internalJNI.Msg_setCustomStr(this.swigCPtr, this, paramString);
  }
  
  public int status()
  {
    return internalJNI.Msg_status(this.swigCPtr, this);
  }
  
  public long time()
  {
    return internalJNI.Msg_time(this.swigCPtr, this);
  }
  
  public long uniqueid()
  {
    return internalJNI.Msg_uniqueid(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\Msg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */