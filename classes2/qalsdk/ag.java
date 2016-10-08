package qalsdk;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.qalsdk.QALSDKManager;
import com.tencent.qalsdk.util.QLog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.zip.CRC32;

public class ag
  implements a
{
  private static ag h = null;
  SQLiteDatabase a;
  private Context b;
  private z c;
  private long d = 0L;
  private File e;
  private boolean f = false;
  private boolean g = false;
  
  private String a(byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = MessageDigest.getInstance("MD5").digest(paramArrayOfByte);
      StringBuffer localStringBuffer = new StringBuffer();
      int i = 0;
      while (i < paramArrayOfByte.length)
      {
        localStringBuffer.append(Integer.toHexString(paramArrayOfByte[i] & 0xFF | 0x100).substring(1, 3));
        i += 1;
      }
      paramArrayOfByte = localStringBuffer.toString();
      return paramArrayOfByte;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return "";
  }
  
  public static ag a()
  {
    try
    {
      if (h == null) {
        h = new ag();
      }
      ag localag = h;
      return localag;
    }
    finally {}
  }
  
  private long b()
  {
    Cursor localCursor = this.a.query("t_cache_summary", new String[] { "currentSize" }, "id=?", new String[] { "1" }, null, null, null, null);
    if (localCursor.moveToFirst()) {}
    for (long l = localCursor.getLong(0);; l = 0L)
    {
      localCursor.close();
      return l;
    }
  }
  
  private long b(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return 0L;
    }
    CRC32 localCRC32 = new CRC32();
    localCRC32.update(paramArrayOfByte);
    return localCRC32.getValue();
  }
  
  private void b(long paramLong)
  {
    long l1 = b();
    Cursor localCursor = this.a.query("t_cache_meta", new String[] { "key", "entrySize" }, null, null, null, null, "accessTime ASC", "10");
    long l2;
    if (localCursor.moveToFirst())
    {
      do
      {
        l2 = l1;
        if (l1 + paramLong < this.d) {
          break;
        }
        String str = localCursor.getString(0);
        long l3 = localCursor.getLong(1);
        File localFile = d(str);
        this.a.delete("t_cache_meta", "key=?", new String[] { str });
        l2 = l1;
        if (localFile.exists())
        {
          QLog.d("SqliteBasedCache", "delete key: " + str);
          localFile.delete();
          l2 = l1 - l3;
        }
        l1 = l2;
      } while (localCursor.moveToNext());
      QLog.d("SqliteBasedCache", "reach the end of the cursor");
    }
    for (;;)
    {
      localCursor.close();
      c(l2);
      return;
      l2 = l1;
    }
  }
  
  private void c(long paramLong)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("id", Integer.valueOf(1));
    localContentValues.put("currentSize", Long.valueOf(paramLong));
    if (this.a.replace("t_cache_summary", null, localContentValues) < 0L) {
      QLog.e("SqliteBasedCache", "failed to replace");
    }
  }
  
  private File d(String paramString)
  {
    return new File(this.e, paramString);
  }
  
  public b a(String paramString)
  {
    if ((this.d == 0L) || (paramString == null) || (paramString.length() == 0)) {
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      if (!this.g) {
        a(QALSDKManager.getInstance().getContext());
      }
      if (!this.f) {
        return null;
      }
      Object localObject1 = a(paramString.getBytes());
      try
      {
        Object localObject2 = this.a.query("t_cache_meta", new String[] { "ttl", "softTtl", "checksum", "etag", "lastModified" }, "key=?", new String[] { localObject1 }, null, null, null);
        if (!((Cursor)localObject2).moveToFirst())
        {
          QLog.d("SqliteBasedCache", "Key: " + (String)localObject1 + " is not found in the database");
          ((Cursor)localObject2).close();
          return null;
        }
        long l2 = ((Cursor)localObject2).getLong(2);
        paramString = ((Cursor)localObject2).getString(3);
        String str = ((Cursor)localObject2).getString(4);
        ((Cursor)localObject2).close();
        try
        {
          long l1 = System.currentTimeMillis();
          localObject2 = d((String)localObject1);
          if (((File)localObject2).length() == 0L)
          {
            QLog.d("SqliteBasedCache", "file does not exist!");
            return null;
          }
          localObject1 = new FileInputStream((File)localObject2);
          localObject2 = new byte[(int)((File)localObject2).length()];
          ((FileInputStream)localObject1).read((byte[])localObject2);
          ((FileInputStream)localObject1).close();
          if (l2 != b((byte[])localObject2))
          {
            QLog.d("SqliteBasedCache", "chksum not match!");
            return null;
          }
          localObject2 = new ObjectInputStream(new ByteArrayInputStream((byte[])localObject2));
          localObject1 = (b)((ObjectInputStream)localObject2).readObject();
          ((ObjectInputStream)localObject2).close();
          l2 = System.currentTimeMillis();
          QLog.d("SqliteBasedCache", "reading cost: " + (l2 - l1));
          if ((paramString == null) || (paramString.equals("")) || (paramString.equals(((b)localObject1).k)))
          {
            paramString = (String)localObject1;
            if (str == null) {
              continue;
            }
            paramString = (String)localObject1;
            if (str.equals("")) {
              continue;
            }
            paramString = (String)localObject1;
            if (str.equals(((b)localObject1).j)) {
              continue;
            }
          }
          QLog.d("SqliteBasedCache", "etag or last modified not match");
          return null;
        }
        catch (IOException paramString)
        {
          QLog.d("SqliteBasedCache", "stream is broken" + paramString.getMessage());
        }
        catch (ClassNotFoundException paramString)
        {
          QLog.d("SqliteBasedCache", "class not found exception");
        }
        return null;
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
      }
    }
  }
  
  public void a(long paramLong)
  {
    this.d = paramLong;
  }
  
  public void a(Context paramContext)
  {
    boolean bool = true;
    try
    {
      if (this.g) {
        return;
      }
      this.g = true;
      this.b = paramContext;
      if (paramContext == null) {
        QLog.e("SqliteBasedCache", "context is null!");
      }
      this.e = new File(this.b.getCacheDir(), "QalHttpCacheV2");
      if ((!this.e.exists()) && (!this.e.mkdirs()))
      {
        QLog.e("SqliteBasedCache", "failed to create dir: " + this.e.getAbsolutePath());
        return;
      }
    }
    finally {}
    this.c = new z(this.b);
    this.a = this.c.getWritableDatabase();
    if (this.a != null) {}
    for (;;)
    {
      this.f = bool;
      return;
      bool = false;
    }
  }
  
  public void a(String paramString, b paramb)
  {
    if ((this.d == 0L) || (paramString == null) || (paramString.length() == 0) || (paramb == null)) {
      return;
    }
    if (!this.g) {
      a(QALSDKManager.getInstance().getContext());
    }
    if (!this.f)
    {
      QLog.e("SqliteBasedCache", "failed to init cache!!");
      return;
    }
    if ((paramb.s != null) && (paramb.s.length >= this.d * 0.8D))
    {
      QLog.i("SqliteBasedCache", "entry is too large to put in the cache!");
      return;
    }
    paramString = a(paramString.getBytes());
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int i;
    if ((paramb.a == 304) && ((paramb.p > 0L) || (paramb.q > 0L)))
    {
      localObject1 = this.a.query("t_cache_meta", new String[] { "etag", "lastModified" }, "key=?", new String[] { paramString }, null, null, null);
      if (((Cursor)localObject1).moveToFirst())
      {
        localObject2 = ((Cursor)localObject1).getString(0);
        localObject3 = ((Cursor)localObject1).getString(1);
        if (((localObject2 != null) && (!((String)localObject2).equals("")) && (!((String)localObject2).equals(paramb.k))) || ((localObject3 != null) && (!((String)localObject3).equals("")) && (!((String)localObject3).equals(paramb.j))))
        {
          QLog.d("SqliteBasedCache", "etag or last_modified not match");
          ((Cursor)localObject1).close();
        }
      }
      else
      {
        QLog.d("SqliteBasedCache", "cache entry not found for updating expired time");
        ((Cursor)localObject1).close();
        return;
      }
      paramb.t = (System.currentTimeMillis() / 1000L + paramb.p);
      paramb.u = (System.currentTimeMillis() / 1000L + paramb.q);
      localObject1 = new ContentValues();
      ((ContentValues)localObject1).put("ttl", Long.valueOf(paramb.t));
      ((ContentValues)localObject1).put("softTtl", Long.valueOf(paramb.u));
      ((ContentValues)localObject1).put("accessTime", Long.valueOf(System.currentTimeMillis() / 1000L));
      i = this.a.update("t_cache_meta", (ContentValues)localObject1, "key=?", new String[] { paramString });
      QLog.d("SqliteBasedCache", "Rows updated: " + i);
      return;
    }
    for (;;)
    {
      try
      {
        b(paramb.s.length);
        long l2 = b();
        long l3 = System.currentTimeMillis() / 1000L;
        if (paramb.p < 0L)
        {
          l1 = 0L;
          paramb.t = (l1 + l3);
          l3 = System.currentTimeMillis() / 1000L;
          if (paramb.q >= 0L) {
            break label921;
          }
          l1 = 0L;
          paramb.u = (l1 + l3);
          localObject1 = new String[1];
          localObject1[0] = paramString;
          localObject2 = this.a.query("t_cache_meta", new String[] { "entrySize" }, "key=?", (String[])localObject1, null, null, null);
          l1 = 0L;
          i = 0;
          if (((Cursor)localObject2).moveToFirst())
          {
            l1 = ((Cursor)localObject2).getLong(((Cursor)localObject2).getColumnIndex("entrySize"));
            i = 1;
          }
          ((Cursor)localObject2).close();
          if ((paramb.d != null) && (!paramb.d.isEmpty())) {
            paramb.d.clear();
          }
          localObject2 = new ByteArrayOutputStream();
          localObject3 = new ObjectOutputStream((OutputStream)localObject2);
          ((ObjectOutputStream)localObject3).writeObject(paramb);
          ((ObjectOutputStream)localObject3).close();
          localObject2 = ((ByteArrayOutputStream)localObject2).toByteArray();
          l3 = b((byte[])localObject2);
          localObject3 = new ContentValues();
          ((ContentValues)localObject3).put("key", paramString);
          ((ContentValues)localObject3).put("accessTime", Long.valueOf(System.currentTimeMillis() / 1000L));
          ((ContentValues)localObject3).put("ttl", Long.valueOf(paramb.t));
          ((ContentValues)localObject3).put("softTtl", Long.valueOf(paramb.u));
          ((ContentValues)localObject3).put("entrySize", Integer.valueOf(paramb.s.length));
          ((ContentValues)localObject3).put("checksum", Long.valueOf(l3));
          if ((paramb.k != null) && (!paramb.k.equals(""))) {
            ((ContentValues)localObject3).put("etag", paramb.k);
          }
          if ((paramb.j != null) && (!paramb.j.equals(""))) {
            ((ContentValues)localObject3).put("lastModified", paramb.j);
          }
          if (i != 0) {
            break label930;
          }
          if (this.a.insert("t_cache_meta", null, (ContentValues)localObject3) < 0L) {
            QLog.e("SqliteBasedCache", "failed to insert database for key: " + paramString);
          }
          l1 = paramb.s.length - l1 + l2;
          c(l1);
          paramString = new FileOutputStream(d(paramString));
          paramString.write((byte[])localObject2);
          paramString.close();
          QLog.d("SqliteBasedCache", "CurrentSize: " + l1);
          return;
        }
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
        return;
      }
      long l1 = paramb.p;
      continue;
      label921:
      l1 = paramb.q;
      continue;
      label930:
      if (this.a.update("t_cache_meta", (ContentValues)localObject3, "key=?", (String[])localObject1) <= 0) {
        QLog.e("SqliteBasedCache", "failed to update database for key: " + paramString);
      }
    }
  }
  
  public void b(String paramString)
  {
    if ((this.d == 0L) || (paramString == null) || (paramString.length() == 0)) {}
    ContentValues localContentValues;
    do
    {
      return;
      if (!this.g) {
        a(QALSDKManager.getInstance().getContext());
      }
      if (!this.f)
      {
        QLog.e("SqliteBasedCache", "cache not initialized!");
        return;
      }
      paramString = a(paramString.getBytes());
      QLog.d("SqliteBasedCache", "update access: " + paramString);
      localContentValues = new ContentValues();
      localContentValues.put("accessTime", Long.valueOf(System.currentTimeMillis() / 1000L));
    } while (this.a.update("t_cache_meta", localContentValues, "key=?", new String[] { paramString }) == 1);
    QLog.e("SqliteBasedCache", "cannot update key: " + paramString);
  }
  
  public void c(String paramString)
  {
    if ((this.d == 0L) || (paramString == null) || (paramString.length() == 0)) {
      return;
    }
    if (!this.g) {
      a(QALSDKManager.getInstance().getContext());
    }
    if (!this.f)
    {
      QLog.e("SqliteBasedCache", "cache not initialized!");
      return;
    }
    paramString = a(paramString.getBytes());
    File localFile = d(paramString);
    if (localFile.exists()) {
      localFile.delete();
    }
    this.a.delete("t_cache_meta", "key=?", new String[] { paramString });
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */