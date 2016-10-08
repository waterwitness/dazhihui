package tencent.tls.request;

import android.content.Context;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import tencent.tls.platform.TLSUserInfo;
import tencent.tls.report.QLog;
import tencent.tls.tools.cryptor;

public class account_sig_info_map
{
  public static final String TLS_ACCOUNT_TABLE = "name_tree";
  public static final String TLS_TICKET_TABLE = "tk_tree";
  private static final Object db_lock = new Object();
  private static TkDBHelper tlsDBHelper = null;
  public static final String tls_sdk_DBNAME = "tls_sdk.db";
  Context _context;
  TreeMap<String, TinyInfo> _name_map = new TreeMap();
  TreeMap<Long, AllSigInfo> _uin_map = new TreeMap();
  
  public account_sig_info_map(Context paramContext)
  {
    this._context = paramContext;
  }
  
  private TinyInfo getTinyInfo(long paramLong)
  {
    for (;;)
    {
      try
      {
        Iterator localIterator = this._name_map.values().iterator();
        Object localObject1;
        if (localIterator.hasNext())
        {
          localObject1 = (TinyInfo)localIterator.next();
          long l = ((TinyInfo)localObject1)._tinyid;
          if (l == paramLong) {
            return (TinyInfo)localObject1;
          }
        }
        else if (this._context == null)
        {
          localObject1 = null;
        }
        else
        {
          localObject1 = loadTKTreeMap(this._context, "name_tree");
          if (localObject1 == null)
          {
            localObject1 = null;
          }
          else
          {
            localIterator = ((TreeMap)localObject1).values().iterator();
            if (localIterator.hasNext())
            {
              localObject1 = (TinyInfo)localIterator.next();
              if (((TinyInfo)localObject1)._tinyid == paramLong) {
                this._name_map.put(((TinyInfo)localObject1)._userid, localObject1);
              }
            }
            else
            {
              Object localObject3 = null;
            }
          }
        }
      }
      finally {}
    }
  }
  
  /* Error */
  public static byte[] get_from_db(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: invokestatic 96	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   4: astore_3
    //   5: getstatic 34	tencent/tls/request/account_sig_info_map:tlsDBHelper	Ltencent/tls/request/TkDBHelper;
    //   8: ifnonnull +18 -> 26
    //   11: new 98	tencent/tls/request/TkDBHelper
    //   14: dup
    //   15: aload_0
    //   16: ldc 18
    //   18: aconst_null
    //   19: iconst_1
    //   20: invokespecial 101	tencent/tls/request/TkDBHelper:<init>	(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
    //   23: putstatic 34	tencent/tls/request/account_sig_info_map:tlsDBHelper	Ltencent/tls/request/TkDBHelper;
    //   26: getstatic 34	tencent/tls/request/account_sig_info_map:tlsDBHelper	Ltencent/tls/request/TkDBHelper;
    //   29: invokevirtual 105	tencent/tls/request/TkDBHelper:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   32: astore 4
    //   34: aload 4
    //   36: new 107	java/lang/StringBuilder
    //   39: dup
    //   40: invokespecial 108	java/lang/StringBuilder:<init>	()V
    //   43: ldc 110
    //   45: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: aload_1
    //   49: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: ldc 116
    //   54: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   60: aconst_null
    //   61: invokevirtual 126	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   64: astore_2
    //   65: aload_3
    //   66: astore_0
    //   67: aload_2
    //   68: invokeinterface 131 1 0
    //   73: ifeq +20 -> 93
    //   76: aload_3
    //   77: astore_0
    //   78: aload_2
    //   79: iconst_0
    //   80: invokeinterface 135 2 0
    //   85: ifle +8 -> 93
    //   88: iconst_1
    //   89: invokestatic 96	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   92: astore_0
    //   93: aload_2
    //   94: ifnull +18 -> 112
    //   97: aload_2
    //   98: invokeinterface 138 1 0
    //   103: ifne +9 -> 112
    //   106: aload_2
    //   107: invokeinterface 141 1 0
    //   112: aload_0
    //   113: invokevirtual 144	java/lang/Boolean:booleanValue	()Z
    //   116: istore 5
    //   118: iload 5
    //   120: ifne +16 -> 136
    //   123: aconst_null
    //   124: areturn
    //   125: astore_0
    //   126: aconst_null
    //   127: putstatic 34	tencent/tls/request/account_sig_info_map:tlsDBHelper	Ltencent/tls/request/TkDBHelper;
    //   130: aload_0
    //   131: invokestatic 150	tencent/tls/report/QLog:e	(Ljava/lang/Throwable;)V
    //   134: aconst_null
    //   135: areturn
    //   136: aload 4
    //   138: aload_1
    //   139: iconst_1
    //   140: anewarray 152	java/lang/String
    //   143: dup
    //   144: iconst_0
    //   145: aload_1
    //   146: aastore
    //   147: ldc -102
    //   149: aconst_null
    //   150: aconst_null
    //   151: aconst_null
    //   152: aconst_null
    //   153: invokevirtual 158	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   156: astore_0
    //   157: aload_0
    //   158: ifnull +60 -> 218
    //   161: aload_0
    //   162: invokeinterface 161 1 0
    //   167: ifeq +51 -> 218
    //   170: aload_0
    //   171: iconst_0
    //   172: invokeinterface 165 2 0
    //   177: astore_1
    //   178: aload_0
    //   179: invokeinterface 141 1 0
    //   184: aload_1
    //   185: areturn
    //   186: astore_0
    //   187: aconst_null
    //   188: astore_1
    //   189: aconst_null
    //   190: putstatic 34	tencent/tls/request/account_sig_info_map:tlsDBHelper	Ltencent/tls/request/TkDBHelper;
    //   193: aload_0
    //   194: invokestatic 150	tencent/tls/report/QLog:e	(Ljava/lang/Throwable;)V
    //   197: aload_1
    //   198: ifnull +18 -> 216
    //   201: aload_1
    //   202: invokeinterface 138 1 0
    //   207: ifne +9 -> 216
    //   210: aload_1
    //   211: invokeinterface 141 1 0
    //   216: aconst_null
    //   217: areturn
    //   218: aconst_null
    //   219: areturn
    //   220: astore_0
    //   221: aload_2
    //   222: astore_1
    //   223: goto -34 -> 189
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	226	0	paramContext	Context
    //   0	226	1	paramString	String
    //   64	158	2	localCursor	android.database.Cursor
    //   4	73	3	localBoolean	Boolean
    //   32	105	4	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
    //   116	3	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   5	26	125	java/lang/Exception
    //   26	34	125	java/lang/Exception
    //   34	65	186	android/database/SQLException
    //   67	76	220	android/database/SQLException
    //   78	93	220	android/database/SQLException
    //   97	112	220	android/database/SQLException
    //   112	118	220	android/database/SQLException
    //   136	157	220	android/database/SQLException
  }
  
  public static TreeMap<?, ?> loadTKTreeMap(Context paramContext, String paramString)
  {
    paramContext = get_from_db(paramContext, paramString);
    if (paramContext != null)
    {
      QLog.i("get_from_db len:" + paramContext.length);
      try
      {
        paramContext = cryptor.decrypt(paramContext, 0, paramContext.length, req_global._IMEI_KEY);
        if (paramContext != null)
        {
          paramString = new ObjectInputStream(new ByteArrayInputStream(paramContext));
          paramContext = (TreeMap)paramString.readObject();
          if (paramContext == null) {}
        }
      }
      catch (Throwable paramString)
      {
        paramContext = null;
      }
      try
      {
        paramString.close();
        return paramContext;
      }
      catch (Throwable paramString)
      {
        for (;;) {}
      }
      return null;
      return null;
      QLog.e(paramString);
      return paramContext;
    }
    return null;
  }
  
  /* Error */
  public static int write_to_db(Context paramContext, String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: getstatic 34	tencent/tls/request/account_sig_info_map:tlsDBHelper	Ltencent/tls/request/TkDBHelper;
    //   3: ifnonnull +18 -> 21
    //   6: new 98	tencent/tls/request/TkDBHelper
    //   9: dup
    //   10: aload_0
    //   11: ldc 18
    //   13: aconst_null
    //   14: iconst_1
    //   15: invokespecial 101	tencent/tls/request/TkDBHelper:<init>	(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
    //   18: putstatic 34	tencent/tls/request/account_sig_info_map:tlsDBHelper	Ltencent/tls/request/TkDBHelper;
    //   21: getstatic 34	tencent/tls/request/account_sig_info_map:tlsDBHelper	Ltencent/tls/request/TkDBHelper;
    //   24: invokevirtual 105	tencent/tls/request/TkDBHelper:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   27: astore_3
    //   28: aload_3
    //   29: new 107	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 108	java/lang/StringBuilder:<init>	()V
    //   36: ldc -46
    //   38: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: aload_1
    //   42: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: ldc -44
    //   47: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: aload_1
    //   51: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: ldc -42
    //   56: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   62: invokevirtual 217	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   65: aload_3
    //   66: aload_1
    //   67: iconst_1
    //   68: anewarray 152	java/lang/String
    //   71: dup
    //   72: iconst_0
    //   73: ldc -37
    //   75: aastore
    //   76: ldc -102
    //   78: aconst_null
    //   79: aconst_null
    //   80: aconst_null
    //   81: aconst_null
    //   82: invokevirtual 158	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   85: astore_0
    //   86: aload_0
    //   87: ifnull +12 -> 99
    //   90: aload_0
    //   91: invokeinterface 161 1 0
    //   96: ifne +57 -> 153
    //   99: aload_3
    //   100: new 107	java/lang/StringBuilder
    //   103: dup
    //   104: invokespecial 108	java/lang/StringBuilder:<init>	()V
    //   107: ldc -35
    //   109: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: aload_1
    //   113: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: ldc -33
    //   118: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: aload_1
    //   122: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: ldc -31
    //   127: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   133: iconst_2
    //   134: anewarray 4	java/lang/Object
    //   137: dup
    //   138: iconst_0
    //   139: iconst_0
    //   140: invokestatic 230	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   143: aastore
    //   144: dup
    //   145: iconst_1
    //   146: iconst_1
    //   147: newarray <illegal type>
    //   149: aastore
    //   150: invokevirtual 233	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   153: aload_3
    //   154: new 107	java/lang/StringBuilder
    //   157: dup
    //   158: invokespecial 108	java/lang/StringBuilder:<init>	()V
    //   161: ldc -21
    //   163: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: aload_1
    //   167: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: ldc -19
    //   172: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: aload_1
    //   176: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: ldc -17
    //   181: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   187: iconst_1
    //   188: anewarray 4	java/lang/Object
    //   191: dup
    //   192: iconst_0
    //   193: aload_2
    //   194: aastore
    //   195: invokevirtual 233	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   198: aload_0
    //   199: ifnull +18 -> 217
    //   202: aload_0
    //   203: invokeinterface 138 1 0
    //   208: ifne +9 -> 217
    //   211: aload_0
    //   212: invokeinterface 141 1 0
    //   217: iconst_0
    //   218: ireturn
    //   219: astore_0
    //   220: aconst_null
    //   221: putstatic 34	tencent/tls/request/account_sig_info_map:tlsDBHelper	Ltencent/tls/request/TkDBHelper;
    //   224: aload_0
    //   225: invokestatic 150	tencent/tls/report/QLog:e	(Ljava/lang/Throwable;)V
    //   228: sipush 64514
    //   231: ireturn
    //   232: astore_0
    //   233: aconst_null
    //   234: putstatic 34	tencent/tls/request/account_sig_info_map:tlsDBHelper	Ltencent/tls/request/TkDBHelper;
    //   237: aload_0
    //   238: invokestatic 150	tencent/tls/report/QLog:e	(Ljava/lang/Throwable;)V
    //   241: sipush 64514
    //   244: ireturn
    //   245: astore_0
    //   246: aload_0
    //   247: invokestatic 150	tencent/tls/report/QLog:e	(Ljava/lang/Throwable;)V
    //   250: iconst_0
    //   251: ifeq +11 -> 262
    //   254: new 241	java/lang/NullPointerException
    //   257: dup
    //   258: invokespecial 242	java/lang/NullPointerException:<init>	()V
    //   261: athrow
    //   262: sipush 64514
    //   265: ireturn
    //   266: astore_1
    //   267: aload_1
    //   268: invokestatic 150	tencent/tls/report/QLog:e	(Ljava/lang/Throwable;)V
    //   271: aload_0
    //   272: ifnull +18 -> 290
    //   275: aload_0
    //   276: invokeinterface 138 1 0
    //   281: ifne +9 -> 290
    //   284: aload_0
    //   285: invokeinterface 141 1 0
    //   290: sipush 64514
    //   293: ireturn
    //   294: astore_1
    //   295: aconst_null
    //   296: putstatic 34	tencent/tls/request/account_sig_info_map:tlsDBHelper	Ltencent/tls/request/TkDBHelper;
    //   299: aload_1
    //   300: invokestatic 150	tencent/tls/report/QLog:e	(Ljava/lang/Throwable;)V
    //   303: aload_0
    //   304: ifnull +18 -> 322
    //   307: aload_0
    //   308: invokeinterface 138 1 0
    //   313: ifne +9 -> 322
    //   316: aload_0
    //   317: invokeinterface 141 1 0
    //   322: sipush 64514
    //   325: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	326	0	paramContext	Context
    //   0	326	1	paramString	String
    //   0	326	2	paramArrayOfByte	byte[]
    //   27	127	3	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
    // Exception table:
    //   from	to	target	type
    //   0	21	219	java/lang/Exception
    //   21	28	219	java/lang/Exception
    //   28	65	232	java/lang/Exception
    //   65	86	245	android/database/SQLException
    //   99	153	266	android/database/SQLException
    //   153	198	294	android/database/SQLException
  }
  
  /* Error */
  public void clear_sig(long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 107	java/lang/StringBuilder
    //   5: dup
    //   6: invokespecial 108	java/lang/StringBuilder:<init>	()V
    //   9: ldc -10
    //   11: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   14: lload_3
    //   15: invokevirtual 249	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   18: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   21: lload_1
    //   22: invokestatic 252	tencent/tls/report/QLog:i	(Ljava/lang/String;J)V
    //   25: aload_0
    //   26: getfield 41	tencent/tls/request/account_sig_info_map:_uin_map	Ljava/util/TreeMap;
    //   29: lload_1
    //   30: invokestatic 257	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   33: invokevirtual 261	java/util/TreeMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   36: pop
    //   37: aload_0
    //   38: getfield 45	tencent/tls/request/account_sig_info_map:_context	Landroid/content/Context;
    //   41: ifnull +30 -> 71
    //   44: getstatic 32	tencent/tls/request/account_sig_info_map:db_lock	Ljava/lang/Object;
    //   47: astore 5
    //   49: aload 5
    //   51: monitorenter
    //   52: aload_0
    //   53: getfield 45	tencent/tls/request/account_sig_info_map:_context	Landroid/content/Context;
    //   56: ldc 11
    //   58: invokestatic 77	tencent/tls/request/account_sig_info_map:loadTKTreeMap	(Landroid/content/Context;Ljava/lang/String;)Ljava/util/TreeMap;
    //   61: astore 6
    //   63: aload 6
    //   65: ifnonnull +9 -> 74
    //   68: aload 5
    //   70: monitorexit
    //   71: aload_0
    //   72: monitorexit
    //   73: return
    //   74: aload 6
    //   76: lload_1
    //   77: invokestatic 257	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   80: invokevirtual 261	java/util/TreeMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   83: pop
    //   84: aload_0
    //   85: aload 6
    //   87: ldc 11
    //   89: invokevirtual 265	tencent/tls/request/account_sig_info_map:refreshTKTreeMap	(Ljava/util/TreeMap;Ljava/lang/String;)I
    //   92: pop
    //   93: aload 5
    //   95: monitorexit
    //   96: goto -25 -> 71
    //   99: astore 6
    //   101: aload 5
    //   103: monitorexit
    //   104: aload 6
    //   106: athrow
    //   107: astore 5
    //   109: aload_0
    //   110: monitorexit
    //   111: aload 5
    //   113: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	this	account_sig_info_map
    //   0	114	1	paramLong1	long
    //   0	114	3	paramLong2	long
    //   107	5	5	localObject2	Object
    //   61	25	6	localTreeMap	TreeMap
    //   99	6	6	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   52	63	99	finally
    //   68	71	99	finally
    //   74	96	99	finally
    //   101	104	99	finally
    //   2	52	107	finally
    //   104	107	107	finally
  }
  
  /* Error */
  public TinyInfo getTinyInfo(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 107	java/lang/StringBuilder
    //   5: dup
    //   6: invokespecial 108	java/lang/StringBuilder:<init>	()V
    //   9: ldc_w 268
    //   12: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   15: iconst_3
    //   16: invokestatic 274	tencent/tls/tools/util:getLineInfo	(I)Ljava/lang/String;
    //   19: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: iconst_4
    //   23: invokestatic 274	tencent/tls/tools/util:getLineInfo	(I)Ljava/lang/String;
    //   26: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   32: invokestatic 178	tencent/tls/report/QLog:i	(Ljava/lang/String;)V
    //   35: aload_0
    //   36: getfield 43	tencent/tls/request/account_sig_info_map:_name_map	Ljava/util/TreeMap;
    //   39: aload_1
    //   40: invokevirtual 277	java/util/TreeMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   43: checkcast 69	tencent/tls/request/TinyInfo
    //   46: astore_2
    //   47: aload_2
    //   48: ifnull +9 -> 57
    //   51: aload_2
    //   52: astore_1
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_1
    //   56: areturn
    //   57: aload_0
    //   58: getfield 45	tencent/tls/request/account_sig_info_map:_context	Landroid/content/Context;
    //   61: ifnonnull +8 -> 69
    //   64: aconst_null
    //   65: astore_1
    //   66: goto -13 -> 53
    //   69: aload_0
    //   70: getfield 45	tencent/tls/request/account_sig_info_map:_context	Landroid/content/Context;
    //   73: ldc 8
    //   75: invokestatic 77	tencent/tls/request/account_sig_info_map:loadTKTreeMap	(Landroid/content/Context;Ljava/lang/String;)Ljava/util/TreeMap;
    //   78: astore_2
    //   79: aload_2
    //   80: ifnonnull +8 -> 88
    //   83: aconst_null
    //   84: astore_1
    //   85: goto -32 -> 53
    //   88: aload_2
    //   89: aload_1
    //   90: invokevirtual 277	java/util/TreeMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   93: checkcast 69	tencent/tls/request/TinyInfo
    //   96: astore_2
    //   97: aload_2
    //   98: ifnonnull +8 -> 106
    //   101: aconst_null
    //   102: astore_1
    //   103: goto -50 -> 53
    //   106: aload_0
    //   107: getfield 43	tencent/tls/request/account_sig_info_map:_name_map	Ljava/util/TreeMap;
    //   110: aload_1
    //   111: aload_2
    //   112: invokevirtual 84	java/util/TreeMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   115: pop
    //   116: aload_2
    //   117: astore_1
    //   118: goto -65 -> 53
    //   121: astore_1
    //   122: aload_0
    //   123: monitorexit
    //   124: aload_1
    //   125: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	this	account_sig_info_map
    //   0	126	1	paramString	String
    //   46	71	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	47	121	finally
    //   57	64	121	finally
    //   69	79	121	finally
    //   88	97	121	finally
    //   106	116	121	finally
  }
  
  public List<TLSUserInfo> get_all_logined_account()
  {
    label296:
    for (;;)
    {
      ArrayList localArrayList;
      long l3;
      Object localObject3;
      TinyInfo localTinyInfo;
      SigInfo localSigInfo;
      try
      {
        localArrayList = new ArrayList();
        if (this._context == null) {
          break label296;
        }
        TreeMap localTreeMap = loadTKTreeMap(this._context, "tk_tree");
        if (localTreeMap == null) {
          return localArrayList;
        }
        Iterator localIterator1 = localTreeMap.keySet().iterator();
        if (!localIterator1.hasNext()) {
          break label296;
        }
        l3 = ((Long)localIterator1.next()).longValue();
        localObject3 = (AllSigInfo)this._uin_map.get(Long.valueOf(l3));
        Object localObject1 = localObject3;
        if (localObject3 == null)
        {
          localObject1 = (AllSigInfo)localTreeMap.get(Long.valueOf(l3));
          if (localObject1 == null) {
            continue;
          }
          this._uin_map.put(Long.valueOf(l3), localObject1);
        }
        localTinyInfo = getTinyInfo(l3);
        localObject3 = null;
        if (localTinyInfo != null) {
          localObject3 = localTinyInfo._userid;
        }
        Iterator localIterator2 = ((AllSigInfo)localObject1)._tk_map.keySet().iterator();
        if (localIterator2.hasNext())
        {
          l1 = ((Long)localIterator2.next()).longValue();
          if (l1 != req_global.sdkappid) {
            continue;
          }
          localSigInfo = (SigInfo)((AllSigInfo)localObject1)._tk_map.get(Long.valueOf(l1));
          if (localSigInfo == null) {
            continue;
          }
          if (localObject3 == null) {
            clear_sig(l3, l1);
          }
        }
        else
        {
          continue;
        }
        l2 = localSigInfo._A1_create_time;
      }
      finally {}
      long l2;
      long l1 = l2;
      if (l2 <= 0L) {
        l1 = localSigInfo._TLS_create_time;
      }
      localArrayList.add(new TLSUserInfo(localTinyInfo._acc_type, (String)localObject3, l3, l1, localTinyInfo.userType));
    }
  }
  
  /* Error */
  public AllSigInfo get_all_siginfo(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 336
    //   5: lload_1
    //   6: invokestatic 252	tencent/tls/report/QLog:i	(Ljava/lang/String;J)V
    //   9: aload_0
    //   10: getfield 41	tencent/tls/request/account_sig_info_map:_uin_map	Ljava/util/TreeMap;
    //   13: lload_1
    //   14: invokestatic 257	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   17: invokevirtual 277	java/util/TreeMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   20: checkcast 295	tencent/tls/request/AllSigInfo
    //   23: astore_3
    //   24: aload_3
    //   25: ifnull +7 -> 32
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_3
    //   31: areturn
    //   32: aload_0
    //   33: getfield 45	tencent/tls/request/account_sig_info_map:_context	Landroid/content/Context;
    //   36: ldc 11
    //   38: invokestatic 77	tencent/tls/request/account_sig_info_map:loadTKTreeMap	(Landroid/content/Context;Ljava/lang/String;)Ljava/util/TreeMap;
    //   41: astore_3
    //   42: aload_3
    //   43: ifnonnull +8 -> 51
    //   46: aconst_null
    //   47: astore_3
    //   48: goto -20 -> 28
    //   51: aload_3
    //   52: lload_1
    //   53: invokestatic 257	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   56: invokevirtual 277	java/util/TreeMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   59: checkcast 295	tencent/tls/request/AllSigInfo
    //   62: astore_3
    //   63: aload_3
    //   64: ifnonnull +8 -> 72
    //   67: aconst_null
    //   68: astore_3
    //   69: goto -41 -> 28
    //   72: aload_0
    //   73: getfield 41	tencent/tls/request/account_sig_info_map:_uin_map	Ljava/util/TreeMap;
    //   76: lload_1
    //   77: invokestatic 257	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   80: aload_3
    //   81: invokevirtual 84	java/util/TreeMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   84: pop
    //   85: aload_3
    //   86: invokevirtual 340	tencent/tls/request/AllSigInfo:clone	()Ltencent/tls/request/AllSigInfo;
    //   89: astore_3
    //   90: goto -62 -> 28
    //   93: astore_3
    //   94: aload_0
    //   95: monitorexit
    //   96: aload_3
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	account_sig_info_map
    //   0	98	1	paramLong	long
    //   23	67	3	localObject1	Object
    //   93	4	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	24	93	finally
    //   32	42	93	finally
    //   51	63	93	finally
    //   72	90	93	finally
  }
  
  /* Error */
  public SigInfo get_siginfo(long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 343
    //   5: lload_1
    //   6: invokestatic 252	tencent/tls/report/QLog:i	(Ljava/lang/String;J)V
    //   9: aload_0
    //   10: lload_1
    //   11: invokevirtual 345	tencent/tls/request/account_sig_info_map:get_all_siginfo	(J)Ltencent/tls/request/AllSigInfo;
    //   14: astore 5
    //   16: aload 5
    //   18: ifnonnull +11 -> 29
    //   21: aconst_null
    //   22: astore 5
    //   24: aload_0
    //   25: monitorexit
    //   26: aload 5
    //   28: areturn
    //   29: aload 5
    //   31: getfield 300	tencent/tls/request/AllSigInfo:_tk_map	Ljava/util/TreeMap;
    //   34: lload_3
    //   35: invokestatic 257	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   38: invokevirtual 277	java/util/TreeMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   41: checkcast 305	tencent/tls/request/SigInfo
    //   44: astore 6
    //   46: aload 6
    //   48: astore 5
    //   50: aload 6
    //   52: ifnonnull -28 -> 24
    //   55: aconst_null
    //   56: astore 5
    //   58: goto -34 -> 24
    //   61: astore 5
    //   63: aload_0
    //   64: monitorexit
    //   65: aload 5
    //   67: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	this	account_sig_info_map
    //   0	68	1	paramLong1	long
    //   0	68	3	paramLong2	long
    //   14	43	5	localObject1	Object
    //   61	5	5	localObject2	Object
    //   44	7	6	localSigInfo	SigInfo
    // Exception table:
    //   from	to	target	type
    //   2	16	61	finally
    //   29	46	61	finally
  }
  
  /* Error */
  public void putTinyInfo(String paramString1, String paramString2, long paramLong, TinyInfo.UserType paramUserType)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 107	java/lang/StringBuilder
    //   5: dup
    //   6: invokespecial 108	java/lang/StringBuilder:<init>	()V
    //   9: ldc_w 349
    //   12: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   15: aload_1
    //   16: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: ldc_w 351
    //   22: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: aload 5
    //   27: invokevirtual 354	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   30: ldc_w 356
    //   33: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: lload_3
    //   37: invokevirtual 249	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   40: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   43: invokestatic 178	tencent/tls/report/QLog:i	(Ljava/lang/String;)V
    //   46: aload_0
    //   47: aload_1
    //   48: invokevirtual 358	tencent/tls/request/account_sig_info_map:getTinyInfo	(Ljava/lang/String;)Ltencent/tls/request/TinyInfo;
    //   51: astore 6
    //   53: aload 6
    //   55: ifnull +124 -> 179
    //   58: aload 6
    //   60: lload_3
    //   61: putfield 73	tencent/tls/request/TinyInfo:_tinyid	J
    //   64: aload 6
    //   66: aload 5
    //   68: putfield 323	tencent/tls/request/TinyInfo:userType	Ltencent/tls/request/TinyInfo$UserType;
    //   71: aload 5
    //   73: getstatic 363	tencent/tls/request/TinyInfo$UserType:USER_TYPE_GUEST	Ltencent/tls/request/TinyInfo$UserType;
    //   76: if_acmpne +3 -> 79
    //   79: aload 6
    //   81: aload_2
    //   82: putfield 80	tencent/tls/request/TinyInfo:_userid	Ljava/lang/String;
    //   85: aload_0
    //   86: getfield 43	tencent/tls/request/account_sig_info_map:_name_map	Ljava/util/TreeMap;
    //   89: aload_1
    //   90: aload 6
    //   92: invokevirtual 84	java/util/TreeMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   95: pop
    //   96: aload_1
    //   97: aload_2
    //   98: invokevirtual 366	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   101: ifne +14 -> 115
    //   104: aload_0
    //   105: getfield 43	tencent/tls/request/account_sig_info_map:_name_map	Ljava/util/TreeMap;
    //   108: aload_2
    //   109: aload 6
    //   111: invokevirtual 84	java/util/TreeMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   114: pop
    //   115: aload_0
    //   116: getfield 45	tencent/tls/request/account_sig_info_map:_context	Landroid/content/Context;
    //   119: ifnull +57 -> 176
    //   122: getstatic 32	tencent/tls/request/account_sig_info_map:db_lock	Ljava/lang/Object;
    //   125: astore 7
    //   127: aload 7
    //   129: monitorenter
    //   130: aload_0
    //   131: getfield 45	tencent/tls/request/account_sig_info_map:_context	Landroid/content/Context;
    //   134: ldc 8
    //   136: invokestatic 77	tencent/tls/request/account_sig_info_map:loadTKTreeMap	(Landroid/content/Context;Ljava/lang/String;)Ljava/util/TreeMap;
    //   139: astore 5
    //   141: aload 5
    //   143: astore_2
    //   144: aload 5
    //   146: ifnonnull +11 -> 157
    //   149: new 38	java/util/TreeMap
    //   152: dup
    //   153: invokespecial 39	java/util/TreeMap:<init>	()V
    //   156: astore_2
    //   157: aload_2
    //   158: aload_1
    //   159: aload 6
    //   161: invokevirtual 84	java/util/TreeMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   164: pop
    //   165: aload_0
    //   166: aload_2
    //   167: ldc 8
    //   169: invokevirtual 265	tencent/tls/request/account_sig_info_map:refreshTKTreeMap	(Ljava/util/TreeMap;Ljava/lang/String;)I
    //   172: pop
    //   173: aload 7
    //   175: monitorexit
    //   176: aload_0
    //   177: monitorexit
    //   178: return
    //   179: ldc_w 368
    //   182: invokestatic 178	tencent/tls/report/QLog:i	(Ljava/lang/String;)V
    //   185: new 69	tencent/tls/request/TinyInfo
    //   188: dup
    //   189: getstatic 369	tencent/tls/request/req_global:_acc_type	I
    //   192: aload_2
    //   193: lload_3
    //   194: aload 5
    //   196: invokespecial 372	tencent/tls/request/TinyInfo:<init>	(ILjava/lang/String;JLtencent/tls/request/TinyInfo$UserType;)V
    //   199: astore 6
    //   201: goto -137 -> 64
    //   204: astore_1
    //   205: aload_0
    //   206: monitorexit
    //   207: aload_1
    //   208: athrow
    //   209: astore_1
    //   210: aload 7
    //   212: monitorexit
    //   213: aload_1
    //   214: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	215	0	this	account_sig_info_map
    //   0	215	1	paramString1	String
    //   0	215	2	paramString2	String
    //   0	215	3	paramLong	long
    //   0	215	5	paramUserType	TinyInfo.UserType
    //   51	149	6	localTinyInfo	TinyInfo
    // Exception table:
    //   from	to	target	type
    //   2	53	204	finally
    //   58	64	204	finally
    //   64	79	204	finally
    //   79	115	204	finally
    //   115	130	204	finally
    //   179	201	204	finally
    //   213	215	204	finally
    //   130	141	209	finally
    //   149	157	209	finally
    //   157	176	209	finally
    //   210	213	209	finally
  }
  
  public int put_siginfo(long paramLong1, long paramLong2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong3, long paramLong4, long paramLong5, ArrayList<Ticket> paramArrayList, int paramInt)
  {
    int i = 0;
    label353:
    label360:
    for (;;)
    {
      Object localObject4;
      try
      {
        if (this._context != null) {}
        synchronized (db_lock)
        {
          QLog.i("before put_siginfo", paramLong1);
          TreeMap localTreeMap = loadTKTreeMap(this._context, "tk_tree");
          if (localTreeMap != null) {
            break label360;
          }
          localTreeMap = new TreeMap();
          localObject2 = (AllSigInfo)this._uin_map.get(Long.valueOf(paramLong1));
          localObject1 = localObject2;
          if (localObject2 != null) {
            break label353;
          }
          localObject2 = (AllSigInfo)localTreeMap.get(Long.valueOf(paramLong1));
          localObject1 = localObject2;
          if (localObject2 != null) {
            break label353;
          }
          localObject2 = new AllSigInfo();
          localObject3 = new byte[0];
          localObject4 = (SigInfo)((AllSigInfo)localObject2)._tk_map.get(Long.valueOf(paramLong2));
          localObject1 = localObject3;
          if (localObject4 != null)
          {
            localObject1 = localObject3;
            if (((SigInfo)localObject4)._en_A1 != null)
            {
              localObject3 = (byte[])((SigInfo)localObject4)._en_A1.clone();
              localObject1 = localObject3;
              if (((SigInfo)localObject4)._noPicSig != null)
              {
                localObject1 = (byte[])((SigInfo)localObject4)._noPicSig.clone();
                ((AllSigInfo)localObject2).put_siginfo(paramLong3, paramLong4, paramLong5, paramArrayList, paramInt);
                if ((paramArrayOfByte1 != null) && (paramArrayOfByte1.length > 0)) {
                  ((AllSigInfo)localObject2).put_siginfo(paramLong2, paramArrayOfByte1, paramArrayOfByte2, paramLong5);
                }
                localTreeMap.put(Long.valueOf(paramLong1), localObject2);
                i = refreshTKTreeMap(localTreeMap, "tk_tree");
                if (i != 0)
                {
                  paramArrayOfByte1 = (SigInfo)((AllSigInfo)localObject2)._tk_map.get(Long.valueOf(paramLong2));
                  if (paramArrayOfByte1 != null)
                  {
                    paramArrayOfByte1._en_A1 = ((byte[])localObject3);
                    paramArrayOfByte1._noPicSig = ((byte[])localObject1);
                  }
                }
                this._uin_map.put(Long.valueOf(paramLong1), localObject2);
                QLog.i("after put_siginfo", paramLong1);
                return i;
              }
            }
          }
        }
        localObject4 = new byte[0];
      }
      finally {}
      Object localObject3 = localObject1;
      Object localObject1 = localObject4;
      continue;
      Object localObject2 = localObject1;
    }
  }
  
  public int refreshTKTreeMap(TreeMap<?, ?> paramTreeMap, String paramString)
  {
    int i = 0;
    try
    {
      if (("tk_tree".equals(paramString)) || ("name_tree".equals(paramString))) {
        i = saveTKTreeMap(paramTreeMap, paramString);
      }
      return i;
    }
    finally {}
  }
  
  public void refresh_all_siginfo()
  {
    try
    {
      QLog.i("refresh_all_siginfo...");
      this._uin_map = loadTKTreeMap(this._context, "name_tree");
      if (this._uin_map == null) {
        this._uin_map = new TreeMap();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void remove_account(String paramString)
  {
    Object localObject1;
    ArrayList localArrayList;
    Object localObject3;
    do
    {
      try
      {
        QLog.i("remove_account " + paramString);
        localObject1 = getTinyInfo(paramString);
        if (localObject1 == null) {
          return;
        }
        paramString = this._name_map.keySet();
        localArrayList = new ArrayList();
        paramString = paramString.iterator();
        while (paramString.hasNext())
        {
          ??? = (String)paramString.next();
          localObject3 = (TinyInfo)this._name_map.get(???);
          if ((localObject3 != null) && (((TinyInfo)localObject3)._tinyid == ((TinyInfo)localObject1)._tinyid)) {
            localArrayList.add(???);
          }
        }
        paramString = localArrayList.iterator();
      }
      finally {}
      while (paramString.hasNext())
      {
        ??? = (String)paramString.next();
        this._name_map.remove(???);
      }
      localArrayList.clear();
    } while (this._context == null);
    label340:
    for (;;)
    {
      synchronized (db_lock)
      {
        paramString = loadTKTreeMap(this._context, "name_tree");
        if (paramString != null) {
          break label340;
        }
        paramString = new TreeMap();
        localObject3 = paramString.keySet().iterator();
        if (((Iterator)localObject3).hasNext())
        {
          String str = (String)((Iterator)localObject3).next();
          TinyInfo localTinyInfo = (TinyInfo)paramString.get(str);
          if ((localTinyInfo == null) || (localTinyInfo._tinyid != ((TinyInfo)localObject1)._tinyid)) {
            continue;
          }
          localArrayList.add(str);
        }
      }
      localObject1 = localArrayList.iterator();
      while (((Iterator)localObject1).hasNext()) {
        paramString.remove((String)((Iterator)localObject1).next());
      }
      refreshTKTreeMap(paramString, "name_tree");
      break;
    }
  }
  
  public int saveTKTreeMap(TreeMap<?, ?> paramTreeMap, String paramString)
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(localByteArrayOutputStream);
      localObjectOutputStream.writeObject(paramTreeMap);
      localObjectOutputStream.flush();
      paramTreeMap = localByteArrayOutputStream.toByteArray();
      paramTreeMap = cryptor.encrypt(paramTreeMap, 0, paramTreeMap.length, req_global._IMEI_KEY);
      i = write_to_db(this._context, paramString, paramTreeMap);
      localObjectOutputStream.close();
      localByteArrayOutputStream.close();
      return i;
    }
    catch (Throwable paramTreeMap)
    {
      for (;;)
      {
        QLog.e(paramTreeMap);
        int i = 64514;
      }
    }
    finally {}
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\account_sig_info_map.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */