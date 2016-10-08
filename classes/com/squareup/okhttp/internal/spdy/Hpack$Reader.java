package com.squareup.okhttp.internal.spdy;

import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

class Hpack$Reader
{
  private long bufferSize = 0L;
  private long bytesLeft = 0L;
  private final List<String> emittedHeaders = new ArrayList();
  private final List<Hpack.HeaderEntry> headerTable;
  private final DataInputStream in;
  private final long maxBufferSize = 4096L;
  private final BitSet referenceSet = new BitSet();
  
  Hpack$Reader(DataInputStream paramDataInputStream, boolean paramBoolean)
  {
    this.in = paramDataInputStream;
    if (paramBoolean)
    {
      this.headerTable = new ArrayList(Hpack.INITIAL_SERVER_TO_CLIENT_HEADER_TABLE);
      this.bufferSize = 1304L;
      return;
    }
    this.headerTable = new ArrayList(Hpack.INITIAL_CLIENT_TO_SERVER_HEADER_TABLE);
    this.bufferSize = 1262L;
  }
  
  private String getName(int paramInt)
  {
    return Hpack.HeaderEntry.access$0((Hpack.HeaderEntry)this.headerTable.get(paramInt));
  }
  
  private String getValue(int paramInt)
  {
    return Hpack.HeaderEntry.access$1((Hpack.HeaderEntry)this.headerTable.get(paramInt));
  }
  
  private void insertIntoHeaderTable(int paramInt, Hpack.HeaderEntry paramHeaderEntry)
  {
    int i = paramHeaderEntry.length();
    if (paramInt != this.headerTable.size()) {
      i -= ((Hpack.HeaderEntry)this.headerTable.get(paramInt)).length();
    }
    for (;;)
    {
      if (i > 4096L)
      {
        this.headerTable.clear();
        this.bufferSize = 0L;
        this.emittedHeaders.add(Hpack.HeaderEntry.access$0(paramHeaderEntry));
        this.emittedHeaders.add(Hpack.HeaderEntry.access$1(paramHeaderEntry));
        return;
      }
      while (this.bufferSize + i > 4096L)
      {
        remove(0);
        paramInt -= 1;
      }
      if (paramInt < 0)
      {
        this.headerTable.add(0, paramHeaderEntry);
        paramInt = 0;
      }
      for (;;)
      {
        long l = this.bufferSize;
        this.bufferSize = (i + l);
        this.referenceSet.set(paramInt);
        return;
        if (paramInt == this.headerTable.size()) {
          this.headerTable.add(paramInt, paramHeaderEntry);
        } else {
          this.headerTable.set(paramInt, paramHeaderEntry);
        }
      }
    }
  }
  
  private int readByte()
  {
    this.bytesLeft -= 1L;
    return this.in.readByte() & 0xFF;
  }
  
  private void readIndexedHeader(int paramInt)
  {
    if (this.referenceSet.get(paramInt))
    {
      this.referenceSet.clear(paramInt);
      return;
    }
    this.referenceSet.set(paramInt);
  }
  
  private void readLiteralHeaderWithIncrementalIndexingIndexedName(int paramInt)
  {
    String str1 = getName(paramInt);
    String str2 = readString();
    insertIntoHeaderTable(this.headerTable.size(), new Hpack.HeaderEntry(str1, str2));
  }
  
  private void readLiteralHeaderWithIncrementalIndexingNewName()
  {
    String str1 = readString();
    String str2 = readString();
    insertIntoHeaderTable(this.headerTable.size(), new Hpack.HeaderEntry(str1, str2));
  }
  
  private void readLiteralHeaderWithSubstitutionIndexingIndexedName(int paramInt)
  {
    insertIntoHeaderTable(readInt(readByte(), 255), new Hpack.HeaderEntry(getName(paramInt), readString()));
  }
  
  private void readLiteralHeaderWithSubstitutionIndexingNewName()
  {
    String str = readString();
    insertIntoHeaderTable(readInt(readByte(), 255), new Hpack.HeaderEntry(str, readString()));
  }
  
  private void readLiteralHeaderWithoutIndexingIndexedName(int paramInt)
  {
    String str1 = getName(paramInt);
    String str2 = readString();
    this.emittedHeaders.add(str1);
    this.emittedHeaders.add(str2);
  }
  
  private void readLiteralHeaderWithoutIndexingNewName()
  {
    String str1 = readString();
    String str2 = readString();
    this.emittedHeaders.add(str1);
    this.emittedHeaders.add(str2);
  }
  
  private void remove(int paramInt)
  {
    this.bufferSize -= ((Hpack.HeaderEntry)this.headerTable.remove(paramInt)).length();
  }
  
  public void emitReferenceSet()
  {
    for (int i = this.referenceSet.nextSetBit(0);; i = this.referenceSet.nextSetBit(i + 1))
    {
      if (i == -1) {
        return;
      }
      this.emittedHeaders.add(getName(i));
      this.emittedHeaders.add(getValue(i));
    }
  }
  
  public List<String> getAndReset()
  {
    ArrayList localArrayList = new ArrayList(this.emittedHeaders);
    this.emittedHeaders.clear();
    return localArrayList;
  }
  
  public void readHeaders(int paramInt)
  {
    this.bytesLeft += paramInt;
    for (;;)
    {
      if (this.bytesLeft <= 0L) {
        return;
      }
      paramInt = readByte();
      if ((paramInt & 0x80) != 0)
      {
        readIndexedHeader(readInt(paramInt, 127));
      }
      else if (paramInt == 96)
      {
        readLiteralHeaderWithoutIndexingNewName();
      }
      else if ((paramInt & 0xE0) == 96)
      {
        readLiteralHeaderWithoutIndexingIndexedName(readInt(paramInt, 31) - 1);
      }
      else if (paramInt == 64)
      {
        readLiteralHeaderWithIncrementalIndexingNewName();
      }
      else if ((paramInt & 0xE0) == 64)
      {
        readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(paramInt, 31) - 1);
      }
      else if (paramInt == 0)
      {
        readLiteralHeaderWithSubstitutionIndexingNewName();
      }
      else
      {
        if ((paramInt & 0xC0) != 0) {
          break;
        }
        readLiteralHeaderWithSubstitutionIndexingIndexedName(readInt(paramInt, 63) - 1);
      }
    }
    throw new AssertionError();
  }
  
  int readInt(int paramInt1, int paramInt2)
  {
    paramInt1 &= paramInt2;
    if (paramInt1 < paramInt2) {
      return paramInt1;
    }
    paramInt1 = 0;
    int i;
    for (;;)
    {
      i = readByte();
      if ((i & 0x80) == 0) {
        break;
      }
      paramInt2 += ((i & 0x7F) << paramInt1);
      paramInt1 += 7;
    }
    return (i << paramInt1) + paramInt2;
  }
  
  public String readString()
  {
    int i = readInt(readByte(), 255);
    byte[] arrayOfByte = new byte[i];
    this.bytesLeft -= i;
    this.in.readFully(arrayOfByte);
    return new String(arrayOfByte, "UTF-8");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\Hpack$Reader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */