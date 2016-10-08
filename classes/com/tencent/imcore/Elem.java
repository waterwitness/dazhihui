package com.tencent.imcore;

public class Elem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public Elem()
  {
    this(internalJNI.new_Elem(), true);
  }
  
  protected Elem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(Elem paramElem)
  {
    if (paramElem == null) {
      return 0L;
    }
    return paramElem.swigCPtr;
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
          internalJNI.delete_Elem(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public CustomElem getCustom()
  {
    long l = internalJNI.Elem_custom_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new CustomElem(l, false);
  }
  
  public FaceElem getFace()
  {
    long l = internalJNI.Elem_face_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new FaceElem(l, false);
  }
  
  public FileElem getFile()
  {
    long l = internalJNI.Elem_file_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new FileElem(l, false);
  }
  
  public FriendChangeElem getFriend_change()
  {
    long l = internalJNI.Elem_friend_change_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new FriendChangeElem(l, false);
  }
  
  public GroupReportElem getGroup_report()
  {
    long l = internalJNI.Elem_group_report_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new GroupReportElem(l, false);
  }
  
  public GroupTipsElem getGroup_tips()
  {
    long l = internalJNI.Elem_group_tips_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new GroupTipsElem(l, false);
  }
  
  public ImageElem getImage()
  {
    long l = internalJNI.Elem_image_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new ImageElem(l, false);
  }
  
  public LocationElem getLocation()
  {
    long l = internalJNI.Elem_location_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new LocationElem(l, false);
  }
  
  public ProfileChangeElem getProfile_change()
  {
    long l = internalJNI.Elem_profile_change_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new ProfileChangeElem(l, false);
  }
  
  public byte[] getResource()
  {
    return internalJNI.Elem_resource_get(this.swigCPtr, this);
  }
  
  public SoundElem getSound()
  {
    long l = internalJNI.Elem_sound_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new SoundElem(l, false);
  }
  
  public TextElem getText()
  {
    long l = internalJNI.Elem_text_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new TextElem(l, false);
  }
  
  public MsgElemType getType()
  {
    return MsgElemType.swigToEnum(internalJNI.Elem_type_get(this.swigCPtr, this));
  }
  
  public VideoElem getVideo()
  {
    long l = internalJNI.Elem_video_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new VideoElem(l, false);
  }
  
  public void setCustom(CustomElem paramCustomElem)
  {
    internalJNI.Elem_custom_set(this.swigCPtr, this, CustomElem.getCPtr(paramCustomElem), paramCustomElem);
  }
  
  public void setFace(FaceElem paramFaceElem)
  {
    internalJNI.Elem_face_set(this.swigCPtr, this, FaceElem.getCPtr(paramFaceElem), paramFaceElem);
  }
  
  public void setFile(FileElem paramFileElem)
  {
    internalJNI.Elem_file_set(this.swigCPtr, this, FileElem.getCPtr(paramFileElem), paramFileElem);
  }
  
  public void setFriend_change(FriendChangeElem paramFriendChangeElem)
  {
    internalJNI.Elem_friend_change_set(this.swigCPtr, this, FriendChangeElem.getCPtr(paramFriendChangeElem), paramFriendChangeElem);
  }
  
  public void setGroup_report(GroupReportElem paramGroupReportElem)
  {
    internalJNI.Elem_group_report_set(this.swigCPtr, this, GroupReportElem.getCPtr(paramGroupReportElem), paramGroupReportElem);
  }
  
  public void setGroup_tips(GroupTipsElem paramGroupTipsElem)
  {
    internalJNI.Elem_group_tips_set(this.swigCPtr, this, GroupTipsElem.getCPtr(paramGroupTipsElem), paramGroupTipsElem);
  }
  
  public void setImage(ImageElem paramImageElem)
  {
    internalJNI.Elem_image_set(this.swigCPtr, this, ImageElem.getCPtr(paramImageElem), paramImageElem);
  }
  
  public void setLocation(LocationElem paramLocationElem)
  {
    internalJNI.Elem_location_set(this.swigCPtr, this, LocationElem.getCPtr(paramLocationElem), paramLocationElem);
  }
  
  public void setProfile_change(ProfileChangeElem paramProfileChangeElem)
  {
    internalJNI.Elem_profile_change_set(this.swigCPtr, this, ProfileChangeElem.getCPtr(paramProfileChangeElem), paramProfileChangeElem);
  }
  
  public void setResource(byte[] paramArrayOfByte)
  {
    internalJNI.Elem_resource_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSound(SoundElem paramSoundElem)
  {
    internalJNI.Elem_sound_set(this.swigCPtr, this, SoundElem.getCPtr(paramSoundElem), paramSoundElem);
  }
  
  public void setText(TextElem paramTextElem)
  {
    internalJNI.Elem_text_set(this.swigCPtr, this, TextElem.getCPtr(paramTextElem), paramTextElem);
  }
  
  public void setType(MsgElemType paramMsgElemType)
  {
    internalJNI.Elem_type_set(this.swigCPtr, this, paramMsgElemType.swigValue());
  }
  
  public void setVideo(VideoElem paramVideoElem)
  {
    internalJNI.Elem_video_set(this.swigCPtr, this, VideoElem.getCPtr(paramVideoElem), paramVideoElem);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\Elem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */