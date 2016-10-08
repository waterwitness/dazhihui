package com.baidu.location.c;

import android.database.Cursor;
import android.database.MatrixCursor;
import com.baidu.location.BDLocation;
import com.baidu.location.Poi;
import com.baidu.location.a;
import com.baidu.location.b.b;
import com.baidu.location.c;
import com.baidu.location.h.e;
import com.baidu.location.h.n;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

final class p
{
  private static final String[] a = { "CoorType", "Time", "LocType", "Longitude", "Latitude", "Radius", "NetworkLocationType", "Country", "CountryCode", "Province", "City", "CityCode", "District", "Street", "StreetNumber", "PoiList", "LocationDescription" };
  private static final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
  
  static Cursor a(BDLocation paramBDLocation)
  {
    Object localObject1 = b.format(new Date(System.currentTimeMillis()));
    MatrixCursor localMatrixCursor = new MatrixCursor(a);
    Object[] arrayOfObject = new Object[a.length];
    arrayOfObject[localMatrixCursor.getColumnIndex("CoorType")] = "gcj02";
    arrayOfObject[localMatrixCursor.getColumnIndex("Time")] = localObject1;
    arrayOfObject[localMatrixCursor.getColumnIndex("LocType")] = Integer.valueOf(paramBDLocation.h());
    arrayOfObject[localMatrixCursor.getColumnIndex("Longitude")] = Double.valueOf(paramBDLocation.d());
    arrayOfObject[localMatrixCursor.getColumnIndex("Latitude")] = Double.valueOf(paramBDLocation.c());
    arrayOfObject[localMatrixCursor.getColumnIndex("Radius")] = Float.valueOf(paramBDLocation.f());
    arrayOfObject[localMatrixCursor.getColumnIndex("NetworkLocationType")] = paramBDLocation.r();
    localObject1 = paramBDLocation.l();
    String str5;
    String str4;
    String str3;
    String str2;
    String str1;
    Object localObject3;
    Object localObject2;
    if (localObject1 != null)
    {
      str5 = ((a)localObject1).a;
      str4 = ((a)localObject1).b;
      str3 = ((a)localObject1).c;
      str2 = ((a)localObject1).d;
      str1 = ((a)localObject1).e;
      localObject3 = ((a)localObject1).f;
      localObject2 = ((a)localObject1).g;
      localObject1 = ((a)localObject1).h;
    }
    for (;;)
    {
      arrayOfObject[localMatrixCursor.getColumnIndex("Country")] = str5;
      arrayOfObject[localMatrixCursor.getColumnIndex("CountryCode")] = str4;
      arrayOfObject[localMatrixCursor.getColumnIndex("Province")] = str3;
      arrayOfObject[localMatrixCursor.getColumnIndex("City")] = str2;
      arrayOfObject[localMatrixCursor.getColumnIndex("CityCode")] = str1;
      arrayOfObject[localMatrixCursor.getColumnIndex("District")] = localObject3;
      arrayOfObject[localMatrixCursor.getColumnIndex("Street")] = localObject2;
      arrayOfObject[localMatrixCursor.getColumnIndex("StreetNumber")] = localObject1;
      localObject1 = paramBDLocation.a();
      if (localObject1 == null) {
        arrayOfObject[localMatrixCursor.getColumnIndex("PoiList")] = null;
      }
      for (;;)
      {
        paramBDLocation = paramBDLocation.p();
        arrayOfObject[localMatrixCursor.getColumnIndex("LocationDescription")] = paramBDLocation;
        localMatrixCursor.addRow(arrayOfObject);
        return localMatrixCursor;
        localObject2 = new StringBuffer();
        int i = 0;
        while (i < ((List)localObject1).size())
        {
          localObject3 = (Poi)((List)localObject1).get(i);
          ((StringBuffer)localObject2).append(((Poi)localObject3).a()).append(";").append(((Poi)localObject3).c()).append(";").append(((Poi)localObject3).b()).append(";|");
          i += 1;
        }
        arrayOfObject[localMatrixCursor.getColumnIndex("PoiList")] = ((StringBuffer)localObject2).toString();
      }
      localObject1 = null;
      localObject2 = null;
      localObject3 = null;
      str1 = null;
      str2 = null;
      str3 = null;
      str4 = null;
      str5 = null;
    }
  }
  
  static BDLocation a(Cursor paramCursor)
  {
    BDLocation localBDLocation = new BDLocation();
    Object localObject3;
    if ((paramCursor != null) && (paramCursor.getCount() > 0) && (paramCursor.moveToFirst()))
    {
      Integer localInteger = null;
      Double localDouble1 = null;
      Double localDouble2 = null;
      String str1 = null;
      String str2 = null;
      Float localFloat = null;
      String str3 = null;
      if (paramCursor.getColumnIndex("LocType") != -1) {
        localInteger = Integer.valueOf(paramCursor.getInt(paramCursor.getColumnIndex("LocType")));
      }
      if (paramCursor.getColumnIndex("Latitude") != -1) {
        localDouble1 = Double.valueOf(paramCursor.getDouble(paramCursor.getColumnIndex("Latitude")));
      }
      if (paramCursor.getColumnIndex("Longitude") != -1) {
        localDouble2 = Double.valueOf(paramCursor.getDouble(paramCursor.getColumnIndex("Longitude")));
      }
      if (paramCursor.getColumnIndex("CoorType") != -1) {
        str1 = paramCursor.getString(paramCursor.getColumnIndex("CoorType"));
      }
      if (paramCursor.getColumnIndex("NetworkLocationType") != -1) {
        str2 = paramCursor.getString(paramCursor.getColumnIndex("NetworkLocationType"));
      }
      if (paramCursor.getColumnIndex("Radius") != -1) {
        localFloat = Float.valueOf(paramCursor.getFloat(paramCursor.getColumnIndex("Radius")));
      }
      if (paramCursor.getColumnIndex("Time") != -1) {
        str3 = paramCursor.getString(paramCursor.getColumnIndex("Time"));
      }
      Object localObject1 = null;
      localObject3 = null;
      Object localObject4 = null;
      Object localObject5 = null;
      String str4 = null;
      String str5 = null;
      String str6 = null;
      String str7 = null;
      if (paramCursor.getColumnIndex("Country") != -1) {
        localObject1 = paramCursor.getString(paramCursor.getColumnIndex("Country"));
      }
      if (paramCursor.getColumnIndex("CountryCode") != -1) {
        localObject3 = paramCursor.getString(paramCursor.getColumnIndex("CountryCode"));
      }
      if (paramCursor.getColumnIndex("Province") != -1) {
        localObject4 = paramCursor.getString(paramCursor.getColumnIndex("Province"));
      }
      if (paramCursor.getColumnIndex("City") != -1) {
        localObject5 = paramCursor.getString(paramCursor.getColumnIndex("City"));
      }
      if (paramCursor.getColumnIndex("CityCode") != -1) {
        str4 = paramCursor.getString(paramCursor.getColumnIndex("CityCode"));
      }
      if (paramCursor.getColumnIndex("District") != -1) {
        str5 = paramCursor.getString(paramCursor.getColumnIndex("District"));
      }
      if (paramCursor.getColumnIndex("Street") != -1) {
        str6 = paramCursor.getString(paramCursor.getColumnIndex("Street"));
      }
      if (paramCursor.getColumnIndex("StreetNumber") != -1) {
        str7 = paramCursor.getString(paramCursor.getColumnIndex("StreetNumber"));
      }
      localObject4 = new c().a((String)localObject1).b((String)localObject3).c((String)localObject4).d((String)localObject5).e(str4).f(str5).g(str6).h(str7).a();
      localObject1 = null;
      if (paramCursor.getColumnIndex("PoiList") != -1)
      {
        localObject3 = new ArrayList();
        localObject1 = paramCursor.getString(paramCursor.getColumnIndex("PoiList"));
        if (localObject1 == null) {}
      }
      try
      {
        localObject1 = ((String)localObject1).split("\\|");
        int i = 0;
        while (i < localObject1.length)
        {
          localObject5 = localObject1[i].split(";");
          if (localObject5.length >= 3) {
            ((List)localObject3).add(new Poi(localObject5[0], localObject5[1], Double.valueOf(localObject5[2]).doubleValue()));
          }
          i += 1;
        }
        localObject1 = localObject3;
        if (((List)localObject3).size() == 0) {
          localObject1 = null;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject2 = localObject3;
          if (((List)localObject3).size() == 0) {
            localObject2 = null;
          }
        }
      }
      finally
      {
        if (((List)localObject3).size() != 0) {
          break label831;
        }
      }
      localObject3 = null;
      if (paramCursor.getColumnIndex("LocationDescription") != -1) {
        localObject3 = paramCursor.getString(paramCursor.getColumnIndex("LocationDescription"));
      }
      localBDLocation.a(str3);
      localBDLocation.b(localFloat.floatValue());
      localBDLocation.a(localInteger.intValue());
      localBDLocation.b(str1);
      localBDLocation.a(localDouble1.doubleValue());
      localBDLocation.b(localDouble2.doubleValue());
      localBDLocation.e(str2);
      localBDLocation.a((a)localObject4);
      localBDLocation.a((List)localObject1);
      localBDLocation.d((String)localObject3);
      return localBDLocation;
    }
    label831:
    localBDLocation.a(67);
    return localBDLocation;
  }
  
  static String a(BDLocation paramBDLocation, int paramInt)
  {
    if ((paramBDLocation == null) || (paramBDLocation.h() == 67))
    {
      paramBDLocation = String.format(Locale.CHINA, "&ofl=%s|%d", new Object[] { "1", Integer.valueOf(paramInt) });
      return paramBDLocation;
    }
    String str1 = String.format(Locale.CHINA, "&ofl=%s|%d|%f|%f|%d", new Object[] { "1", Integer.valueOf(paramInt), Double.valueOf(paramBDLocation.d()), Double.valueOf(paramBDLocation.c()), Integer.valueOf((int)paramBDLocation.f()) });
    if (paramBDLocation.l() != null) {
      str1 = str1 + "&ofaddr=" + paramBDLocation.l().i;
    }
    for (;;)
    {
      String str2 = str1;
      if (paramBDLocation.a() != null)
      {
        str2 = str1;
        if (paramBDLocation.a().size() > 0)
        {
          paramBDLocation = (Poi)paramBDLocation.a().get(0);
          str2 = str1 + String.format(Locale.US, "&ofpoi=%s|%s", new Object[] { paramBDLocation.a(), paramBDLocation.c() });
        }
      }
      paramBDLocation = str2;
      if (b.c == null) {
        break;
      }
      return str2 + String.format(Locale.US, "&pack=%s&sdk=%.3f", new Object[] { b.c, Float.valueOf(6.12F) });
    }
  }
  
  static String a(BDLocation paramBDLocation1, BDLocation paramBDLocation2, q paramq)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramBDLocation2 == null)
    {
      localStringBuffer.append("&ofcl=0");
      if (paramBDLocation1 != null) {
        break label178;
      }
      localStringBuffer.append("&ofwf=0");
      label32:
      if ((paramq == null) || (!paramq.e)) {
        break label230;
      }
      localStringBuffer.append("&rgcn=1");
      label51:
      if ((paramq == null) || (!paramq.d)) {
        break label241;
      }
      localStringBuffer.append("&poin=1");
      label70:
      if ((paramq == null) || (!paramq.h)) {
        break label252;
      }
      localStringBuffer.append("&desc=1");
    }
    for (;;)
    {
      if (paramq != null) {
        localStringBuffer.append(String.format(Locale.US, "&aps=%d", new Object[] { Integer.valueOf(paramq.f) }));
      }
      return localStringBuffer.toString();
      localStringBuffer.append(String.format(Locale.US, "&ofcl=1|%f|%f|%d", new Object[] { Double.valueOf(paramBDLocation2.d()), Double.valueOf(paramBDLocation2.c()), Integer.valueOf((int)paramBDLocation2.f()) }));
      break;
      label178:
      localStringBuffer.append(String.format(Locale.US, "&ofwf=1|%f|%f|%d", new Object[] { Double.valueOf(paramBDLocation1.d()), Double.valueOf(paramBDLocation1.c()), Integer.valueOf((int)paramBDLocation1.f()) }));
      break label32;
      label230:
      localStringBuffer.append("&rgcn=0");
      break label51;
      label241:
      localStringBuffer.append("&poin=0");
      break label70;
      label252:
      localStringBuffer.append("&desc=0");
    }
  }
  
  static String[] a(n paramn, com.baidu.location.h.l paraml, BDLocation paramBDLocation, String paramString, boolean paramBoolean, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramn != null) {
      localStringBuffer.append(e.a().b(paramn));
    }
    if (paraml != null) {
      localStringBuffer.append(paraml.a(30));
    }
    if (localStringBuffer.length() > 0)
    {
      if (paramString != null) {
        localStringBuffer.append(paramString);
      }
      localArrayList.add("-loc");
      localArrayList.add(localStringBuffer.toString());
    }
    if (paramBDLocation != null)
    {
      paramn = String.format(Locale.US, "%f;%f;%d;%s", new Object[] { Double.valueOf(paramBDLocation.c()), Double.valueOf(paramBDLocation.d()), Integer.valueOf(paramBDLocation.h()), paramBDLocation.r() });
      localArrayList.add("-com");
      localArrayList.add(paramn);
    }
    if (paramBoolean)
    {
      localArrayList.add("-log");
      localArrayList.add("true");
    }
    if (com.baidu.location.b.l.f.equals("all"))
    {
      localArrayList.add("-rgc");
      localArrayList.add("true");
    }
    if (com.baidu.location.b.l.h)
    {
      localArrayList.add("-poi");
      localArrayList.add("true");
    }
    if (com.baidu.location.b.l.g)
    {
      localArrayList.add("-des");
      localArrayList.add("true");
    }
    localArrayList.add("-minap");
    localArrayList.add(Integer.toString(paramInt));
    paramn = new String[localArrayList.size()];
    localArrayList.toArray(paramn);
    return paramn;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\c\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */