package com.android.thinkive.framework.cache;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class DiskLruCache
  implements Closeable
{
  static final long ANY_SEQUENCE_NUMBER = -1L;
  private static final String CLEAN = "CLEAN";
  private static final String DIRTY = "DIRTY";
  static final String JOURNAL_FILE = "journal";
  static final String JOURNAL_FILE_BACKUP = "journal.bkp";
  static final String JOURNAL_FILE_TEMP = "journal.tmp";
  static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
  static final String MAGIC = "libcore.io.DiskLruCache";
  private static final OutputStream NULL_OUTPUT_STREAM = new DiskLruCache.2();
  private static final String READ = "READ";
  private static final String REMOVE = "REMOVE";
  static final String STRING_KEY_PATTERN = "[a-z0-9_-]{1,120}";
  static final String VERSION_1 = "1";
  private final int appVersion;
  private final Callable<Void> cleanupCallable = new DiskLruCache.1(this);
  private final File directory;
  final ThreadPoolExecutor executorService = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
  private final File journalFile;
  private final File journalFileBackup;
  private final File journalFileTmp;
  private Writer journalWriter;
  private final LinkedHashMap<String, DiskLruCache.Entry> lruEntries = new LinkedHashMap(0, 0.75F, true);
  private long maxSize;
  private long nextSequenceNumber = 0L;
  private int redundantOpCount;
  private long size = 0L;
  private final int valueCount;
  
  private DiskLruCache(File paramFile, int paramInt1, int paramInt2, long paramLong)
  {
    this.directory = paramFile;
    this.appVersion = paramInt1;
    this.journalFile = new File(paramFile, "journal");
    this.journalFileTmp = new File(paramFile, "journal.tmp");
    this.journalFileBackup = new File(paramFile, "journal.bkp");
    this.valueCount = paramInt2;
    this.maxSize = paramLong;
  }
  
  private void checkNotClosed()
  {
    if (this.journalWriter == null) {
      throw new IllegalStateException("cache is closed");
    }
  }
  
  private void completeEdit(DiskLruCache.Editor paramEditor, boolean paramBoolean)
  {
    int j = 0;
    DiskLruCache.Entry localEntry;
    try
    {
      localEntry = DiskLruCache.Editor.access$2(paramEditor);
      if (DiskLruCache.Entry.access$1(localEntry) != paramEditor) {
        throw new IllegalStateException();
      }
    }
    finally {}
    int i = j;
    if (paramBoolean)
    {
      i = j;
      if (!DiskLruCache.Entry.access$0(localEntry))
      {
        i = 0;
        if (i < this.valueCount) {
          break label207;
        }
        i = j;
      }
    }
    for (;;)
    {
      long l1;
      if (i >= this.valueCount)
      {
        this.redundantOpCount += 1;
        DiskLruCache.Entry.access$5(localEntry, null);
        if (!(DiskLruCache.Entry.access$0(localEntry) | paramBoolean)) {
          break label348;
        }
        DiskLruCache.Entry.access$4(localEntry, true);
        this.journalWriter.write("CLEAN " + DiskLruCache.Entry.access$2(localEntry) + localEntry.getLengths() + '\n');
        if (paramBoolean)
        {
          l1 = this.nextSequenceNumber;
          this.nextSequenceNumber = (1L + l1);
          DiskLruCache.Entry.access$9(localEntry, l1);
        }
      }
      for (;;)
      {
        this.journalWriter.flush();
        if ((this.size > this.maxSize) || (journalRebuildRequired())) {
          this.executorService.submit(this.cleanupCallable);
        }
        for (;;)
        {
          return;
          label207:
          if (DiskLruCache.Editor.access$3(paramEditor)[i] == 0)
          {
            paramEditor.abort();
            throw new IllegalStateException("Newly created entry didn't create value for index " + i);
          }
          if (localEntry.getDirtyFile(i).exists()) {
            break;
          }
          paramEditor.abort();
        }
        paramEditor = localEntry.getDirtyFile(i);
        if (paramBoolean)
        {
          if (!paramEditor.exists()) {
            break label404;
          }
          File localFile = localEntry.getCleanFile(i);
          paramEditor.renameTo(localFile);
          l1 = DiskLruCache.Entry.access$7(localEntry)[i];
          long l2 = localFile.length();
          DiskLruCache.Entry.access$7(localEntry)[i] = l2;
          this.size = (this.size - l1 + l2);
          break label404;
        }
        deleteIfExists(paramEditor);
        break label404;
        label348:
        this.lruEntries.remove(DiskLruCache.Entry.access$2(localEntry));
        this.journalWriter.write("REMOVE " + DiskLruCache.Entry.access$2(localEntry) + '\n');
      }
      i += 1;
      break;
      label404:
      i += 1;
    }
  }
  
  private static void deleteIfExists(File paramFile)
  {
    if ((paramFile.exists()) && (!paramFile.delete())) {
      throw new IOException();
    }
  }
  
  private DiskLruCache.Editor edit(String paramString, long paramLong)
  {
    for (;;)
    {
      DiskLruCache.Editor localEditor;
      try
      {
        checkNotClosed();
        validateKey(paramString);
        DiskLruCache.Entry localEntry = (DiskLruCache.Entry)this.lruEntries.get(paramString);
        if (paramLong != -1L) {
          if (localEntry != null)
          {
            long l = DiskLruCache.Entry.access$8(localEntry);
            if (l == paramLong) {}
          }
          else
          {
            paramString = null;
            return paramString;
          }
        }
        if (localEntry == null)
        {
          localEntry = new DiskLruCache.Entry(this, paramString, null);
          this.lruEntries.put(paramString, localEntry);
          localEditor = new DiskLruCache.Editor(this, localEntry, null);
          DiskLruCache.Entry.access$5(localEntry, localEditor);
          this.journalWriter.write("DIRTY " + paramString + '\n');
          this.journalWriter.flush();
          paramString = localEditor;
          continue;
        }
        localEditor = DiskLruCache.Entry.access$1(localEntry);
      }
      finally {}
      if (localEditor != null) {
        paramString = null;
      }
    }
  }
  
  private static String inputStreamToString(InputStream paramInputStream)
  {
    return Util.readFully(new InputStreamReader(paramInputStream, Util.UTF_8));
  }
  
  private boolean journalRebuildRequired()
  {
    return (this.redundantOpCount >= 2000) && (this.redundantOpCount >= this.lruEntries.size());
  }
  
  public static DiskLruCache open(File paramFile, int paramInt1, int paramInt2, long paramLong)
  {
    if (paramLong <= 0L) {
      throw new IllegalArgumentException("maxSize <= 0");
    }
    if (paramInt2 <= 0) {
      throw new IllegalArgumentException("valueCount <= 0");
    }
    Object localObject = new File(paramFile, "journal.bkp");
    File localFile;
    if (((File)localObject).exists())
    {
      localFile = new File(paramFile, "journal");
      if (!localFile.exists()) {
        break label115;
      }
      ((File)localObject).delete();
    }
    for (;;)
    {
      localObject = new DiskLruCache(paramFile, paramInt1, paramInt2, paramLong);
      if (!((DiskLruCache)localObject).journalFile.exists()) {
        break label176;
      }
      try
      {
        ((DiskLruCache)localObject).readJournal();
        ((DiskLruCache)localObject).processJournal();
        return (DiskLruCache)localObject;
      }
      catch (IOException localIOException)
      {
        label115:
        System.out.println("DiskLruCache " + paramFile + " is corrupt: " + localIOException.getMessage() + ", removing");
        ((DiskLruCache)localObject).delete();
      }
      renameTo((File)localObject, localFile, false);
    }
    label176:
    paramFile.mkdirs();
    paramFile = new DiskLruCache(paramFile, paramInt1, paramInt2, paramLong);
    paramFile.rebuildJournal();
    return paramFile;
  }
  
  private void processJournal()
  {
    deleteIfExists(this.journalFileTmp);
    Iterator localIterator = this.lruEntries.values().iterator();
    DiskLruCache.Entry localEntry;
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      localEntry = (DiskLruCache.Entry)localIterator.next();
      if (DiskLruCache.Entry.access$1(localEntry) != null) {
        break;
      }
      i = 0;
      while (i < this.valueCount)
      {
        this.size += DiskLruCache.Entry.access$7(localEntry)[i];
        i += 1;
      }
    }
    DiskLruCache.Entry.access$5(localEntry, null);
    int i = 0;
    for (;;)
    {
      if (i >= this.valueCount)
      {
        localIterator.remove();
        break;
      }
      deleteIfExists(localEntry.getCleanFile(i));
      deleteIfExists(localEntry.getDirtyFile(i));
      i += 1;
    }
  }
  
  private void readJournal()
  {
    StrictLineReader localStrictLineReader = new StrictLineReader(new FileInputStream(this.journalFile), Util.US_ASCII);
    label230:
    try
    {
      String str1 = localStrictLineReader.readLine();
      String str2 = localStrictLineReader.readLine();
      String str3 = localStrictLineReader.readLine();
      String str4 = localStrictLineReader.readLine();
      String str5 = localStrictLineReader.readLine();
      if ((!"libcore.io.DiskLruCache".equals(str1)) || (!"1".equals(str2)) || (!Integer.toString(this.appVersion).equals(str3)) || (!Integer.toString(this.valueCount).equals(str4)) || (!"".equals(str5))) {
        throw new IOException("unexpected journal header: [" + str1 + ", " + str2 + ", " + str4 + ", " + str5 + "]");
      }
    }
    finally
    {
      Util.closeQuietly(localStrictLineReader);
      throw ((Throwable)localObject);
      int i = 0;
      try
      {
        for (;;)
        {
          readJournalLine(localStrictLineReader.readLine());
          i += 1;
        }
        rebuildJournal();
      }
      catch (EOFException localEOFException)
      {
        this.redundantOpCount = (i - this.lruEntries.size());
        if (!localStrictLineReader.hasUnterminatedLine()) {
          break label230;
        }
      }
      Util.closeQuietly(localStrictLineReader);
      return;
    }
  }
  
  private void readJournalLine(String paramString)
  {
    int i = paramString.indexOf(' ');
    if (i == -1) {
      throw new IOException("unexpected journal line: " + paramString);
    }
    int j = i + 1;
    int k = paramString.indexOf(' ', j);
    String str;
    if (k == -1)
    {
      str = paramString.substring(j);
      if ((i == "REMOVE".length()) && (paramString.startsWith("REMOVE"))) {
        this.lruEntries.remove(str);
      }
    }
    else
    {
      str = paramString.substring(j, k);
    }
    for (;;)
    {
      DiskLruCache.Entry localEntry2 = (DiskLruCache.Entry)this.lruEntries.get(str);
      DiskLruCache.Entry localEntry1 = localEntry2;
      if (localEntry2 == null)
      {
        localEntry1 = new DiskLruCache.Entry(this, str, null);
        this.lruEntries.put(str, localEntry1);
      }
      if ((k != -1) && (i == "CLEAN".length()) && (paramString.startsWith("CLEAN")))
      {
        paramString = paramString.substring(k + 1).split(" ");
        DiskLruCache.Entry.access$4(localEntry1, true);
        DiskLruCache.Entry.access$5(localEntry1, null);
        DiskLruCache.Entry.access$6(localEntry1, paramString);
        return;
      }
      if ((k == -1) && (i == "DIRTY".length()) && (paramString.startsWith("DIRTY")))
      {
        DiskLruCache.Entry.access$5(localEntry1, new DiskLruCache.Editor(this, localEntry1, null));
        return;
      }
      if ((k == -1) && (i == "READ".length()) && (paramString.startsWith("READ"))) {
        break;
      }
      throw new IOException("unexpected journal line: " + paramString);
    }
  }
  
  private void rebuildJournal()
  {
    for (;;)
    {
      try
      {
        if (this.journalWriter != null) {
          this.journalWriter.close();
        }
        BufferedWriter localBufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFileTmp), Util.US_ASCII));
        DiskLruCache.Entry localEntry;
        try
        {
          localBufferedWriter.write("libcore.io.DiskLruCache");
          localBufferedWriter.write("\n");
          localBufferedWriter.write("1");
          localBufferedWriter.write("\n");
          localBufferedWriter.write(Integer.toString(this.appVersion));
          localBufferedWriter.write("\n");
          localBufferedWriter.write(Integer.toString(this.valueCount));
          localBufferedWriter.write("\n");
          localBufferedWriter.write("\n");
          Iterator localIterator = this.lruEntries.values().iterator();
          boolean bool = localIterator.hasNext();
          if (!bool)
          {
            localBufferedWriter.close();
            if (this.journalFile.exists()) {
              renameTo(this.journalFile, this.journalFileBackup, true);
            }
            renameTo(this.journalFileTmp, this.journalFile, false);
            this.journalFileBackup.delete();
            this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), Util.US_ASCII));
            return;
          }
          localEntry = (DiskLruCache.Entry)localIterator.next();
          if (DiskLruCache.Entry.access$1(localEntry) != null)
          {
            localBufferedWriter.write("DIRTY " + DiskLruCache.Entry.access$2(localEntry) + '\n');
            continue;
            localObject1 = finally;
          }
        }
        finally
        {
          localBufferedWriter.close();
        }
        ((Writer)localObject1).write("CLEAN " + DiskLruCache.Entry.access$2(localEntry) + localEntry.getLengths() + '\n');
      }
      finally {}
    }
  }
  
  private static void renameTo(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    if (paramBoolean) {
      deleteIfExists(paramFile2);
    }
    if (!paramFile1.renameTo(paramFile2)) {
      throw new IOException();
    }
  }
  
  private void trimToSize()
  {
    for (;;)
    {
      if (this.size <= this.maxSize) {
        return;
      }
      remove((String)((Map.Entry)this.lruEntries.entrySet().iterator().next()).getKey());
    }
  }
  
  private void validateKey(String paramString)
  {
    if (!LEGAL_KEY_PATTERN.matcher(paramString).matches()) {
      throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + paramString + "\"");
    }
  }
  
  public void close()
  {
    for (;;)
    {
      try
      {
        Object localObject1 = this.journalWriter;
        if (localObject1 == null) {
          return;
        }
        localObject1 = new ArrayList(this.lruEntries.values()).iterator();
        if (!((Iterator)localObject1).hasNext())
        {
          trimToSize();
          this.journalWriter.close();
          this.journalWriter = null;
          continue;
        }
        localEntry = (DiskLruCache.Entry)((Iterator)localObject2).next();
      }
      finally {}
      DiskLruCache.Entry localEntry;
      if (DiskLruCache.Entry.access$1(localEntry) != null) {
        DiskLruCache.Entry.access$1(localEntry).abort();
      }
    }
  }
  
  public void delete()
  {
    close();
    Util.deleteContents(this.directory);
  }
  
  public DiskLruCache.Editor edit(String paramString)
  {
    return edit(paramString, -1L);
  }
  
  public void flush()
  {
    try
    {
      checkNotClosed();
      trimToSize();
      this.journalWriter.flush();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public DiskLruCache.Snapshot get(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: invokespecial 299	com/android/thinkive/framework/cache/DiskLruCache:checkNotClosed	()V
    //   8: aload_0
    //   9: aload_1
    //   10: invokespecial 302	com/android/thinkive/framework/cache/DiskLruCache:validateKey	(Ljava/lang/String;)V
    //   13: aload_0
    //   14: getfield 93	com/android/thinkive/framework/cache/DiskLruCache:lruEntries	Ljava/util/LinkedHashMap;
    //   17: aload_1
    //   18: invokevirtual 305	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   21: checkcast 199	com/android/thinkive/framework/cache/DiskLruCache$Entry
    //   24: astore 5
    //   26: aload 5
    //   28: ifnonnull +9 -> 37
    //   31: aload_3
    //   32: astore_2
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_2
    //   36: areturn
    //   37: aload_3
    //   38: astore_2
    //   39: aload 5
    //   41: invokestatic 206	com/android/thinkive/framework/cache/DiskLruCache$Entry:access$0	(Lcom/android/thinkive/framework/cache/DiskLruCache$Entry;)Z
    //   44: ifeq -11 -> 33
    //   47: aload_0
    //   48: getfield 137	com/android/thinkive/framework/cache/DiskLruCache:valueCount	I
    //   51: anewarray 546	java/io/InputStream
    //   54: astore 4
    //   56: iconst_0
    //   57: istore 6
    //   59: aload_0
    //   60: getfield 137	com/android/thinkive/framework/cache/DiskLruCache:valueCount	I
    //   63: istore 7
    //   65: iload 6
    //   67: iload 7
    //   69: if_icmplt +93 -> 162
    //   72: aload_0
    //   73: aload_0
    //   74: getfield 167	com/android/thinkive/framework/cache/DiskLruCache:redundantOpCount	I
    //   77: iconst_1
    //   78: iadd
    //   79: putfield 167	com/android/thinkive/framework/cache/DiskLruCache:redundantOpCount	I
    //   82: aload_0
    //   83: getfield 143	com/android/thinkive/framework/cache/DiskLruCache:journalWriter	Ljava/io/Writer;
    //   86: new 214	java/lang/StringBuilder
    //   89: dup
    //   90: ldc_w 548
    //   93: invokespecial 217	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   96: aload_1
    //   97: invokevirtual 224	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: bipush 10
    //   102: invokevirtual 231	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   105: invokevirtual 234	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   108: invokevirtual 551	java/io/Writer:append	(Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   111: pop
    //   112: aload_0
    //   113: invokespecial 159	com/android/thinkive/framework/cache/DiskLruCache:journalRebuildRequired	()Z
    //   116: ifeq +15 -> 131
    //   119: aload_0
    //   120: getfield 113	com/android/thinkive/framework/cache/DiskLruCache:executorService	Ljava/util/concurrent/ThreadPoolExecutor;
    //   123: aload_0
    //   124: getfield 120	com/android/thinkive/framework/cache/DiskLruCache:cleanupCallable	Ljava/util/concurrent/Callable;
    //   127: invokevirtual 249	java/util/concurrent/ThreadPoolExecutor:submit	(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   130: pop
    //   131: new 553	com/android/thinkive/framework/cache/DiskLruCache$Snapshot
    //   134: dup
    //   135: aload_0
    //   136: aload_1
    //   137: aload 5
    //   139: invokestatic 308	com/android/thinkive/framework/cache/DiskLruCache$Entry:access$8	(Lcom/android/thinkive/framework/cache/DiskLruCache$Entry;)J
    //   142: aload 4
    //   144: aload 5
    //   146: invokestatic 277	com/android/thinkive/framework/cache/DiskLruCache$Entry:access$7	(Lcom/android/thinkive/framework/cache/DiskLruCache$Entry;)[J
    //   149: aconst_null
    //   150: invokespecial 556	com/android/thinkive/framework/cache/DiskLruCache$Snapshot:<init>	(Lcom/android/thinkive/framework/cache/DiskLruCache;Ljava/lang/String;J[Ljava/io/InputStream;[JLcom/android/thinkive/framework/cache/DiskLruCache$Snapshot;)V
    //   153: astore_2
    //   154: goto -121 -> 33
    //   157: astore_1
    //   158: aload_0
    //   159: monitorexit
    //   160: aload_1
    //   161: athrow
    //   162: aload 4
    //   164: iload 6
    //   166: new 413	java/io/FileInputStream
    //   169: dup
    //   170: aload 5
    //   172: iload 6
    //   174: invokevirtual 270	com/android/thinkive/framework/cache/DiskLruCache$Entry:getCleanFile	(I)Ljava/io/File;
    //   177: invokespecial 415	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   180: aastore
    //   181: iload 6
    //   183: iconst_1
    //   184: iadd
    //   185: istore 6
    //   187: goto -128 -> 59
    //   190: astore_1
    //   191: iconst_0
    //   192: istore 6
    //   194: aload_3
    //   195: astore_2
    //   196: iload 6
    //   198: aload_0
    //   199: getfield 137	com/android/thinkive/framework/cache/DiskLruCache:valueCount	I
    //   202: if_icmpge -169 -> 33
    //   205: aload_3
    //   206: astore_2
    //   207: aload 4
    //   209: iload 6
    //   211: aaload
    //   212: ifnull -179 -> 33
    //   215: aload 4
    //   217: iload 6
    //   219: aaload
    //   220: invokestatic 446	com/android/thinkive/framework/cache/Util:closeQuietly	(Ljava/io/Closeable;)V
    //   223: iload 6
    //   225: iconst_1
    //   226: iadd
    //   227: istore 6
    //   229: goto -35 -> 194
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	232	0	this	DiskLruCache
    //   0	232	1	paramString	String
    //   32	175	2	localObject1	Object
    //   1	205	3	localObject2	Object
    //   54	162	4	arrayOfInputStream	InputStream[]
    //   24	147	5	localEntry	DiskLruCache.Entry
    //   57	171	6	i	int
    //   63	7	7	j	int
    // Exception table:
    //   from	to	target	type
    //   4	26	157	finally
    //   39	56	157	finally
    //   59	65	157	finally
    //   72	131	157	finally
    //   131	154	157	finally
    //   162	181	157	finally
    //   196	205	157	finally
    //   215	223	157	finally
    //   59	65	190	java/io/FileNotFoundException
    //   162	181	190	java/io/FileNotFoundException
  }
  
  public File getDirectory()
  {
    return this.directory;
  }
  
  public long getMaxSize()
  {
    try
    {
      long l = this.maxSize;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public boolean isClosed()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 143	com/android/thinkive/framework/cache/DiskLruCache:journalWriter	Ljava/io/Writer;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull +9 -> 17
    //   11: iconst_1
    //   12: istore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_2
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_2
    //   19: goto -6 -> 13
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	DiskLruCache
    //   6	2	1	localWriter	Writer
    //   22	4	1	localObject	Object
    //   12	7	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public boolean remove(String paramString)
  {
    int i = 0;
    for (;;)
    {
      DiskLruCache.Entry localEntry;
      boolean bool;
      try
      {
        checkNotClosed();
        validateKey(paramString);
        localEntry = (DiskLruCache.Entry)this.lruEntries.get(paramString);
        if (localEntry != null)
        {
          localObject = DiskLruCache.Entry.access$1(localEntry);
          if (localObject == null) {
            break label128;
          }
        }
        bool = false;
        return bool;
      }
      finally {}
      Object localObject = localEntry.getCleanFile(i);
      if ((((File)localObject).exists()) && (!((File)localObject).delete())) {
        throw new IOException("failed to delete " + localObject);
      }
      this.size -= DiskLruCache.Entry.access$7(localEntry)[i];
      DiskLruCache.Entry.access$7(localEntry)[i] = 0L;
      i += 1;
      label128:
      if (i >= this.valueCount)
      {
        this.redundantOpCount += 1;
        this.journalWriter.append("REMOVE " + paramString + '\n');
        this.lruEntries.remove(paramString);
        if (journalRebuildRequired()) {
          this.executorService.submit(this.cleanupCallable);
        }
        bool = true;
      }
    }
  }
  
  public void setMaxSize(long paramLong)
  {
    try
    {
      this.maxSize = paramLong;
      this.executorService.submit(this.cleanupCallable);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public long size()
  {
    try
    {
      long l = this.size;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\cache\DiskLruCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */