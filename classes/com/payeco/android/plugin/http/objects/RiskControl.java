package com.payeco.android.plugin.http.objects;

public class RiskControl
{
  private String dataType;
  private String itemId;
  private String itemType;
  private String label;
  private String length;
  private String required;
  private String tips;
  private String title;
  private String value;
  
  public RiskControl() {}
  
  public RiskControl(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
  {
    this.itemId = paramString1;
    this.required = paramString2;
    this.title = paramString3;
    this.itemType = paramString4;
    this.tips = paramString5;
    this.label = paramString6;
    this.dataType = paramString7;
    this.length = paramString8;
    this.value = paramString9;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (RiskControl)paramObject;
        if (this.dataType == null)
        {
          if (((RiskControl)paramObject).dataType != null) {
            return false;
          }
        }
        else if (!this.dataType.equals(((RiskControl)paramObject).dataType)) {
          return false;
        }
        if (this.itemId == null)
        {
          if (((RiskControl)paramObject).itemId != null) {
            return false;
          }
        }
        else if (!this.itemId.equals(((RiskControl)paramObject).itemId)) {
          return false;
        }
        if (this.itemType == null)
        {
          if (((RiskControl)paramObject).itemType != null) {
            return false;
          }
        }
        else if (!this.itemType.equals(((RiskControl)paramObject).itemType)) {
          return false;
        }
        if (this.label == null)
        {
          if (((RiskControl)paramObject).label != null) {
            return false;
          }
        }
        else if (!this.label.equals(((RiskControl)paramObject).label)) {
          return false;
        }
        if (this.length == null)
        {
          if (((RiskControl)paramObject).length != null) {
            return false;
          }
        }
        else if (!this.length.equals(((RiskControl)paramObject).length)) {
          return false;
        }
        if (this.required == null)
        {
          if (((RiskControl)paramObject).required != null) {
            return false;
          }
        }
        else if (!this.required.equals(((RiskControl)paramObject).required)) {
          return false;
        }
        if (this.tips == null)
        {
          if (((RiskControl)paramObject).tips != null) {
            return false;
          }
        }
        else if (!this.tips.equals(((RiskControl)paramObject).tips)) {
          return false;
        }
        if (this.title == null)
        {
          if (((RiskControl)paramObject).title != null) {
            return false;
          }
        }
        else if (!this.title.equals(((RiskControl)paramObject).title)) {
          return false;
        }
        if (this.value != null) {
          break;
        }
      } while (((RiskControl)paramObject).value == null);
      return false;
    } while (this.value.equals(((RiskControl)paramObject).value));
    return false;
  }
  
  public String getDataType()
  {
    return this.dataType;
  }
  
  public String getItemId()
  {
    return this.itemId;
  }
  
  public String getItemType()
  {
    return this.itemType;
  }
  
  public String getLabel()
  {
    return this.label;
  }
  
  public String getLength()
  {
    return this.length;
  }
  
  public String getRequired()
  {
    return this.required;
  }
  
  public String getTips()
  {
    return this.tips;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public String getValue()
  {
    return this.value;
  }
  
  public int hashCode()
  {
    int i4 = 0;
    int i;
    int j;
    label21:
    int k;
    label30:
    int m;
    label40:
    int n;
    label50:
    int i1;
    label60:
    int i2;
    label70:
    int i3;
    if (this.dataType == null)
    {
      i = 0;
      if (this.itemId != null) {
        break label149;
      }
      j = 0;
      if (this.itemType != null) {
        break label160;
      }
      k = 0;
      if (this.label != null) {
        break label171;
      }
      m = 0;
      if (this.length != null) {
        break label183;
      }
      n = 0;
      if (this.required != null) {
        break label195;
      }
      i1 = 0;
      if (this.tips != null) {
        break label207;
      }
      i2 = 0;
      if (this.title != null) {
        break label219;
      }
      i3 = 0;
      label80:
      if (this.value != null) {
        break label231;
      }
    }
    for (;;)
    {
      return (i3 + (i2 + (i1 + (n + (m + (k + (j + (i + 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i4;
      i = this.dataType.hashCode();
      break;
      label149:
      j = this.itemId.hashCode();
      break label21;
      label160:
      k = this.itemType.hashCode();
      break label30;
      label171:
      m = this.label.hashCode();
      break label40;
      label183:
      n = this.length.hashCode();
      break label50;
      label195:
      i1 = this.required.hashCode();
      break label60;
      label207:
      i2 = this.tips.hashCode();
      break label70;
      label219:
      i3 = this.title.hashCode();
      break label80;
      label231:
      i4 = this.value.hashCode();
    }
  }
  
  public void setDataType(String paramString)
  {
    this.dataType = paramString;
  }
  
  public void setItemId(String paramString)
  {
    this.itemId = paramString;
  }
  
  public void setItemType(String paramString)
  {
    this.itemType = paramString;
  }
  
  public void setLabel(String paramString)
  {
    this.label = paramString;
  }
  
  public void setLength(String paramString)
  {
    this.length = paramString;
  }
  
  public void setRequired(String paramString)
  {
    this.required = paramString;
  }
  
  public void setTips(String paramString)
  {
    this.tips = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.title = paramString;
  }
  
  public void setValue(String paramString)
  {
    this.value = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\objects\RiskControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */