package com.iflytek.sunflower.task;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.iflytek.sunflower.OnlineConfigListener;
import com.iflytek.sunflower.c.c;
import com.iflytek.sunflower.c.f;
import com.iflytek.sunflower.c.g;
import com.iflytek.sunflower.c.h;
import com.iflytek.sunflower.config.Version;
import com.iflytek.sunflower.config.b;
import com.iflytek.sunflower.d;
import org.json.JSONObject;

public class i
  extends e
{
  private Context b;
  private OnlineConfigListener c;
  private Handler d = new j(this, Looper.getMainLooper());
  
  public i(Context paramContext, OnlineConfigListener paramOnlineConfigListener)
  {
    super(paramContext, paramOnlineConfigListener);
    this.b = paramContext;
    this.c = paramOnlineConfigListener;
  }
  
  private JSONObject b()
  {
    f localf = new f();
    com.iflytek.sunflower.c.a.a(localf, this.b);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("type", "online_config");
      localJSONObject.put("appid", com.iflytek.sunflower.c.e.f(this.b));
      localJSONObject.put("app.ver.code", localf.a("app.ver.code"));
      localJSONObject.put("app.pkg", localf.a("app.pkg"));
      localJSONObject.put("ver", Version.getVersion());
      localJSONObject.put("deviceid", com.iflytek.sunflower.c.e.b(this.b));
      localJSONObject.put("channel", com.iflytek.sunflower.c.e.g(this.b));
      localJSONObject.put(b.n, d.a(this.b).getString(b.n, ""));
      localJSONObject.put(b.m, d.a(this.b).getString(b.m, "-1"));
      g.b("Collector", localJSONObject.toString());
      return localJSONObject;
    }
    catch (Exception localException)
    {
      g.c("Collector", "exception occur while updateOnlineConfig");
    }
    return null;
  }
  
  protected void a()
  {
    super.a();
    try
    {
      Object localObject = b();
      if (h.a(this.b))
      {
        localObject = c.a(((JSONObject)localObject).toString().getBytes("utf-8"));
        com.iflytek.sunflower.b.a locala = new com.iflytek.sunflower.b.a();
        locala.b(20000);
        locala.a(1);
        g.e("Collector", "URL_UPDATE_PARAM:" + com.iflytek.sunflower.config.a.u);
        locala.a(com.iflytek.sunflower.config.a.u, "", (byte[])localObject);
        locala.b(this.a);
        return;
      }
      g.d("Collector", "update online config error please check net state");
      return;
    }
    catch (Exception localException)
    {
      g.d("Collector", "exception occur while update online config");
    }
  }
  
  /* Error */
  protected void a(JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 196	com/iflytek/sunflower/task/e:a	(Lorg/json/JSONObject;)V
    //   5: ldc 116
    //   7: new 160	java/lang/StringBuilder
    //   10: dup
    //   11: invokespecial 161	java/lang/StringBuilder:<init>	()V
    //   14: ldc -58
    //   16: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: aload_1
    //   20: invokevirtual 119	org/json/JSONObject:toString	()Ljava/lang/String;
    //   23: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: invokevirtual 173	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   29: invokestatic 124	com/iflytek/sunflower/c/g:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   32: ldc -56
    //   34: aload_1
    //   35: ldc -54
    //   37: invokevirtual 205	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   40: invokevirtual 209	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   43: ifeq +243 -> 286
    //   46: aload_0
    //   47: getfield 29	com/iflytek/sunflower/task/i:b	Landroid/content/Context;
    //   50: invokestatic 101	com/iflytek/sunflower/d:a	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   53: invokeinterface 213 1 0
    //   58: astore_2
    //   59: aload_2
    //   60: getstatic 112	com/iflytek/sunflower/config/b:m	Ljava/lang/String;
    //   63: aload_1
    //   64: getstatic 112	com/iflytek/sunflower/config/b:m	Ljava/lang/String;
    //   67: invokevirtual 205	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   70: invokeinterface 219 3 0
    //   75: pop
    //   76: aload_2
    //   77: getstatic 96	com/iflytek/sunflower/config/b:n	Ljava/lang/String;
    //   80: aload_1
    //   81: getstatic 96	com/iflytek/sunflower/config/b:n	Ljava/lang/String;
    //   84: invokevirtual 205	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   87: invokeinterface 219 3 0
    //   92: pop
    //   93: aload_2
    //   94: getstatic 222	com/iflytek/sunflower/config/b:o	Ljava/lang/String;
    //   97: aload_1
    //   98: getstatic 222	com/iflytek/sunflower/config/b:o	Ljava/lang/String;
    //   101: invokevirtual 205	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   104: invokeinterface 219 3 0
    //   109: pop
    //   110: aload_2
    //   111: invokeinterface 226 1 0
    //   116: pop
    //   117: aload_1
    //   118: getstatic 96	com/iflytek/sunflower/config/b:n	Ljava/lang/String;
    //   121: invokevirtual 205	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   124: invokestatic 232	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   127: putstatic 236	com/iflytek/sunflower/config/a:l	I
    //   130: aload_1
    //   131: getstatic 222	com/iflytek/sunflower/config/b:o	Ljava/lang/String;
    //   134: invokevirtual 205	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   137: invokestatic 232	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   140: sipush 1000
    //   143: imul
    //   144: putstatic 238	com/iflytek/sunflower/config/a:m	I
    //   147: aload_1
    //   148: getstatic 241	com/iflytek/sunflower/config/b:p	Ljava/lang/String;
    //   151: invokevirtual 245	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   154: astore_1
    //   155: aload_1
    //   156: ifnull +64 -> 220
    //   159: aload_0
    //   160: getfield 29	com/iflytek/sunflower/task/i:b	Landroid/content/Context;
    //   163: invokestatic 247	com/iflytek/sunflower/d:b	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   166: invokeinterface 213 1 0
    //   171: astore_2
    //   172: aload_1
    //   173: invokevirtual 251	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   176: astore_3
    //   177: aload_3
    //   178: invokeinterface 256 1 0
    //   183: ifeq +38 -> 221
    //   186: aload_3
    //   187: invokeinterface 260 1 0
    //   192: checkcast 141	java/lang/String
    //   195: astore 4
    //   197: aload_2
    //   198: aload 4
    //   200: aload_1
    //   201: aload 4
    //   203: invokevirtual 262	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   206: invokeinterface 219 3 0
    //   211: pop
    //   212: goto -35 -> 177
    //   215: astore_1
    //   216: aload_1
    //   217: invokevirtual 265	org/json/JSONException:printStackTrace	()V
    //   220: return
    //   221: aload_2
    //   222: invokeinterface 226 1 0
    //   227: pop
    //   228: aload_0
    //   229: getfield 31	com/iflytek/sunflower/task/i:c	Lcom/iflytek/sunflower/OnlineConfigListener;
    //   232: ifnull +25 -> 257
    //   235: new 267	android/os/Message
    //   238: dup
    //   239: invokespecial 268	android/os/Message:<init>	()V
    //   242: astore_2
    //   243: aload_2
    //   244: aload_1
    //   245: putfield 272	android/os/Message:obj	Ljava/lang/Object;
    //   248: aload_0
    //   249: getfield 27	com/iflytek/sunflower/task/i:d	Landroid/os/Handler;
    //   252: aload_2
    //   253: invokevirtual 278	android/os/Handler:sendMessage	(Landroid/os/Message;)Z
    //   256: pop
    //   257: ldc 116
    //   259: new 160	java/lang/StringBuilder
    //   262: dup
    //   263: invokespecial 161	java/lang/StringBuilder:<init>	()V
    //   266: ldc_w 280
    //   269: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: aload_1
    //   273: invokevirtual 119	org/json/JSONObject:toString	()Ljava/lang/String;
    //   276: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: invokevirtual 173	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   282: invokestatic 124	com/iflytek/sunflower/c/g:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   285: return
    //   286: ldc 116
    //   288: ldc_w 282
    //   291: invokestatic 124	com/iflytek/sunflower/c/g:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   294: return
    //   295: astore_2
    //   296: goto -149 -> 147
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	299	0	this	i
    //   0	299	1	paramJSONObject	JSONObject
    //   58	195	2	localObject	Object
    //   295	1	2	localException	Exception
    //   176	11	3	localIterator	java.util.Iterator
    //   195	7	4	str	String
    // Exception table:
    //   from	to	target	type
    //   32	117	215	org/json/JSONException
    //   117	147	215	org/json/JSONException
    //   147	155	215	org/json/JSONException
    //   159	177	215	org/json/JSONException
    //   177	212	215	org/json/JSONException
    //   221	257	215	org/json/JSONException
    //   257	285	215	org/json/JSONException
    //   286	294	215	org/json/JSONException
    //   117	147	295	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\task\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */