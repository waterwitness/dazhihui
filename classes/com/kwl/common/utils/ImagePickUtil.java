package com.kwl.common.utils;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import android.support.v4.app.Fragment;

public class ImagePickUtil
{
  public static void cameraImage(Object paramObject, Uri paramUri, int paramInt)
  {
    Intent localIntent = new Intent("android.media.action.IMAGE_CAPTURE");
    localIntent.putExtra("output", paramUri);
    startActivityForResult(paramObject, localIntent, paramInt);
  }
  
  public static void cropImage(Object paramObject, Uri paramUri, int paramInt1, int paramInt2, int paramInt3)
  {
    Intent localIntent = new Intent("com.android.camera.action.CROP");
    localIntent.setDataAndType(paramUri, "image/*");
    localIntent.putExtra("crop", "true");
    localIntent.putExtra("circleCrop", "true");
    localIntent.putExtra("aspectX", paramInt1);
    localIntent.putExtra("aspectY", paramInt2);
    localIntent.putExtra("outputX", paramInt1);
    localIntent.putExtra("outputY", paramInt2);
    localIntent.putExtra("scale", true);
    localIntent.putExtra("return-data", true);
    localIntent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
    localIntent.putExtra("noFaceDetection", true);
    startActivityForResult(paramObject, localIntent, paramInt3);
  }
  
  public static void cropImage(Object paramObject, Uri paramUri1, Uri paramUri2, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    Intent localIntent = new Intent("com.android.camera.action.CROP");
    localIntent.setDataAndType(paramUri1, "image/*");
    localIntent.putExtra("crop", "true");
    localIntent.putExtra("aspectX", paramInt1);
    localIntent.putExtra("aspectY", paramInt2);
    localIntent.putExtra("outputX", paramInt1);
    localIntent.putExtra("outputY", paramInt2);
    localIntent.putExtra("scale", true);
    localIntent.putExtra("output", paramUri2);
    localIntent.putExtra("return-data", paramBoolean);
    localIntent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
    localIntent.putExtra("noFaceDetection", true);
    startActivityForResult(paramObject, localIntent, paramInt3);
  }
  
  public static void pickCropImage(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    Intent localIntent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    localIntent.putExtra("crop", "true");
    localIntent.putExtra("aspectX", paramInt1);
    localIntent.putExtra("aspectY", paramInt2);
    localIntent.putExtra("outputX", paramInt1);
    localIntent.putExtra("outputY", paramInt2);
    localIntent.putExtra("scale", true);
    localIntent.putExtra("return-data", true);
    localIntent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
    localIntent.putExtra("noFaceDetection", true);
    startActivityForResult(paramObject, localIntent, paramInt3);
  }
  
  public static void pickCropImage(Object paramObject, Uri paramUri, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    Intent localIntent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    localIntent.putExtra("crop", "true");
    localIntent.putExtra("aspectX", paramInt1);
    localIntent.putExtra("aspectY", paramInt2);
    localIntent.putExtra("outputX", paramInt1);
    localIntent.putExtra("outputY", paramInt2);
    localIntent.putExtra("scale", true);
    localIntent.putExtra("return-data", paramBoolean);
    localIntent.putExtra("output", paramUri);
    localIntent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
    localIntent.putExtra("noFaceDetection", true);
    startActivityForResult(paramObject, localIntent, paramInt3);
  }
  
  public static void pickImage(Object paramObject, int paramInt)
  {
    Intent localIntent = new Intent("android.intent.action.GET_CONTENT");
    localIntent.setType("image/*");
    startActivityForResult(paramObject, localIntent, paramInt);
  }
  
  public static void pickImageFromGallery(Object paramObject, int paramInt)
  {
    startActivityForResult(paramObject, new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), paramInt);
  }
  
  private static void startActivityForResult(Object paramObject, Intent paramIntent, int paramInt)
  {
    if ((paramObject instanceof Activity))
    {
      ((Activity)paramObject).startActivityForResult(paramIntent, paramInt);
      return;
    }
    if ((paramObject instanceof Fragment))
    {
      ((Fragment)paramObject).startActivityForResult(paramIntent, paramInt);
      return;
    }
    throw new ClassCastException();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwl\common\utils\ImagePickUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */