package com.thinkive.mobile.account.activitys;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import bq;
import com.android.thinkive.framework.compatible.Parameter;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.network.http.HttpService;
import com.android.thinkive.framework.util.ResourceUtil;
import com.thinkive.android.ui.OpenAcBaseActivity;
import com.thinkive.mobile.account.tools.FaceEditPhotoView;
import java.util.HashMap;
import java.util.List;
import org.apache.http.entity.mime.content.FileBody;

public class FacePhotographActivity
  extends OpenAcBaseActivity
{
  public static byte[] b;
  public static String c;
  public static String d;
  public static boolean e;
  private static FacePhotographActivity u;
  Handler f = new FacePhotographActivity.3(this);
  private FaceEditPhotoView g;
  private TextView h;
  private TextView i;
  private LinearLayout j;
  private Button k;
  private String l;
  private FileBody m;
  private Parameter n;
  private Dialog o;
  private String p;
  private Dialog q;
  private String r;
  private String s;
  private int t;
  private String v;
  private Handler w = new FacePhotographActivity.1(this);
  
  public static FacePhotographActivity d()
  {
    if (u != null) {
      return u;
    }
    return null;
  }
  
  protected final String a()
  {
    return getIntent().getStringExtra("url");
  }
  
  public final void a(String paramString)
  {
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = "亲，您拍摄的大头照没有有效的人脸哦！";
    }
    this.r = "0";
    paramString = new AlertDialog.Builder(this);
    paramString.setTitle("提示");
    paramString.setMessage(str);
    paramString.setPositiveButton("确定", new FacePhotographActivity.2(this));
    this.q = paramString.create();
    this.q.setCanceledOnTouchOutside(false);
    this.q.setCancelable(false);
    this.q.show();
  }
  
  public final void e()
  {
    this.n.addParameter("img_data", this.m);
    this.n.addParameter("fromMobile", "1");
    Object localObject = this.n;
    String str = ((Parameter)localObject).getString("url") + ";jsessionid=" + ((Parameter)localObject).getString("jsessionid") + "?";
    HashMap localHashMap = new HashMap();
    localHashMap.put("uuid", ((Parameter)localObject).getString("uuid"));
    localHashMap.put("user_id", ((Parameter)localObject).getString("user_id"));
    localHashMap.put("r", ((Parameter)localObject).getString("r"));
    localHashMap.put("signMsg", ((Parameter)localObject).getString("signMsg"));
    localHashMap.put("img_type", ((Parameter)localObject).getString("img_type"));
    localHashMap.put("clientinfo", ((Parameter)localObject).getString("clientinfo"));
    localHashMap.put("jsessionid", ((Parameter)localObject).getString("jsessionid"));
    localHashMap.put("funcNo", ((Parameter)localObject).getString("funcNo"));
    if (((Parameter)localObject).getString("mobile_no") != null) {
      localHashMap.put("mobile_no", ((Parameter)localObject).getString("mobile_no"));
    }
    localObject = new HashMap();
    ((HashMap)localObject).put("img_data", this.m);
    HttpService.getInstance().multiPartRequest(str, (HashMap)localObject, localHashMap, 15000, 1, new FacePhotographActivity.9(this));
  }
  
  public final void f()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("提示");
    localBuilder.setMessage("因为客户端长时间没有操作，您需要重新登陆！");
    localBuilder.setPositiveButton("确定", new FacePhotographActivity.10(this));
    this.o = localBuilder.create();
    this.o.show();
  }
  
  protected void findViews()
  {
    this.g = ((FaceEditPhotoView)findViewById(ResourceUtil.getResourceID(this, "id", "pv_view")));
    this.h = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "btn_photo_ok")));
    this.i = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "btn_photo_cancel")));
    this.k = ((Button)findViewById(ResourceUtil.getResourceID(this, "id", "btn_get_photo")));
    this.j = ((LinearLayout)findViewById(ResourceUtil.getResourceID(this, "id", "linear")));
  }
  
  public final void g()
  {
    this.r = "0";
    Toast.makeText(this, this.v, 1).show();
    finish();
  }
  
  protected void initData()
  {
    this.t = Integer.parseInt(ConfigManager.getInstance(this).getSystemConfigValue("IMG_SIZE"));
    this.s = ((String)bq.c().get(0) + ConfigManager.getInstance(this).getSystemConfigValue("VIDEO_SAVE_PATH"));
    this.n = new Parameter();
    this.p = getIntent().getStringExtra("jsessionid");
    this.n.addParameter("uuid", getIntent().getStringExtra("uuid"));
    this.n.addParameter("user_id", getIntent().getStringExtra("user_id"));
    this.n.addParameter("r", getIntent().getStringExtra("r"));
    this.n.addParameter("signMsg", getIntent().getStringExtra("signMsg"));
    this.n.addParameter("img_type", getIntent().getStringExtra("img_type"));
    this.n.addParameter("url", getIntent().getStringExtra("url"));
    this.n.addParameter("clientinfo", getIntent().getStringExtra("clientinfo"));
    this.n.addParameter("jsessionid", this.p);
    this.n.addParameter("funcNo", getIntent().getStringExtra("funcNo"));
    this.n.addParameter("id_no", getIntent().getStringExtra("id_no"));
    if (getIntent().getStringExtra("mobile_no") != null) {
      this.n.addParameter("mobile_no", getIntent().getStringExtra("mobile_no"));
    }
    c = getIntent().getStringExtra("img_type");
    this.l = (this.n.getString("user_id") + "_" + this.n.getString("img_type") + ".jpg");
  }
  
  protected void initViews()
  {
    this.j.getBackground().setAlpha(100);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    u = this;
    setContentView(ResourceUtil.getResourceID(this, "layout", "fxc_kh_face_photograph"));
    findViews();
    initData();
    initViews();
    setListeners();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    u = null;
    e = false;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      this.g.a();
      finish();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onRestart()
  {
    this.w.post(new FacePhotographActivity.7(this));
    super.onRestart();
  }
  
  protected void onResume()
  {
    super.onResume();
    if (e)
    {
      if ("1".equals(this.r))
      {
        this.k.setVisibility(8);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        return;
      }
      this.k.setVisibility(8);
      this.h.setVisibility(0);
      this.i.setVisibility(0);
      this.i.setText("重拍");
      return;
    }
    this.k.setVisibility(0);
    this.h.setVisibility(8);
    this.i.setVisibility(0);
    this.i.setText("取消");
  }
  
  protected void onStop()
  {
    this.g.a();
    super.onStop();
  }
  
  protected void setListeners()
  {
    this.k.setOnClickListener(new FacePhotographActivity.4(this));
    this.i.setOnClickListener(new FacePhotographActivity.5(this));
    this.h.setOnClickListener(new FacePhotographActivity.6(this));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\account\activitys\FacePhotographActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */