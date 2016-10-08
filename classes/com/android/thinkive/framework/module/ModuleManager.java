package com.android.thinkive.framework.module;

import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.config.ModuleConfigBean;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class ModuleManager
{
  private static ModuleManager sInstance;
  private ModuleConfigBean mCommonConfigBean;
  private CommonModule mCommonModule;
  private ArrayList<ModuleConfigBean> mModuleConfigInfo = new ArrayList();
  private LinkedHashMap<String, IModule> mModuleHashMap = new LinkedHashMap();
  private HashMap<String, IWebModule> mWebModuleHashMap = new HashMap();
  
  private ModuleManager()
  {
    initCommonModule();
    registerModule(this.mCommonModule);
  }
  
  private void addModule(String paramString, IModule paramIModule)
  {
    this.mModuleHashMap.put(paramString, paramIModule);
  }
  
  private void addWebModule(String paramString, IWebModule paramIWebModule)
  {
    this.mWebModuleHashMap.put(paramString, paramIWebModule);
  }
  
  public static ModuleManager getInstance()
  {
    try
    {
      if (sInstance == null) {
        sInstance = new ModuleManager();
      }
      ModuleManager localModuleManager = sInstance;
      return localModuleManager;
    }
    finally {}
  }
  
  private void initCommonModule()
  {
    this.mCommonConfigBean = new ModuleConfigBean();
    this.mCommonConfigBean.setModuleName("common");
    this.mCommonConfigBean.setModuleClassName(CommonModule.class.getName());
    this.mCommonModule = new CommonModule(ThinkiveInitializer.getInstance().getContext());
    this.mModuleConfigInfo.add(this.mCommonConfigBean);
  }
  
  public void clear()
  {
    this.mModuleHashMap.clear();
    this.mModuleConfigInfo.clear();
  }
  
  public ArrayList<IModule> getAllModule()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = this.mModuleHashMap.keySet();
    Log.d("all module size = " + this.mModuleHashMap.size());
    localObject1 = ((Set)localObject1).iterator();
    for (;;)
    {
      if (!((Iterator)localObject1).hasNext()) {
        return localArrayList;
      }
      Object localObject2 = (String)((Iterator)localObject1).next();
      localObject2 = (IModule)this.mModuleHashMap.get(localObject2);
      if (!localArrayList.contains(localObject2)) {
        localArrayList.add(localObject2);
      }
    }
  }
  
  public IModule getModule(String paramString)
  {
    return (IModule)this.mModuleHashMap.get(paramString);
  }
  
  @Deprecated
  public void registerModule(IModule paramIModule)
  {
    if (paramIModule == null) {
      Log.d("addModule error, module = null!!!");
    }
    for (;;)
    {
      return;
      Iterator localIterator = this.mModuleConfigInfo.iterator();
      while (localIterator.hasNext())
      {
        ModuleConfigBean localModuleConfigBean = (ModuleConfigBean)localIterator.next();
        if (localModuleConfigBean.getModuleClassName().equals(paramIModule.getClass().getName()))
        {
          addModule(localModuleConfigBean.getModuleName(), paramIModule);
          if ((paramIModule instanceof IWebModule)) {
            addWebModule(localModuleConfigBean.getModuleName(), (IWebModule)paramIModule);
          }
        }
      }
    }
  }
  
  public void registerModule(IModule paramIModule, String paramString)
  {
    if (paramIModule == null) {
      Log.d("addModule error, module = null!!!");
    }
    do
    {
      return;
      addModule(paramString, paramIModule);
    } while (!(paramIModule instanceof IWebModule));
    addWebModule(paramString, (IWebModule)paramIModule);
  }
  
  public void removeAllModule()
  {
    this.mModuleHashMap.clear();
  }
  
  public void removeModule(String paramString)
  {
    this.mModuleHashMap.remove(paramString);
  }
  
  public void sendMessageByWebModule(AppMessage paramAppMessage)
  {
    Iterator localIterator = this.mWebModuleHashMap.keySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      String str = (String)localIterator.next();
      ((IWebModule)this.mWebModuleHashMap.get(str)).sendMessageByWebModule(paramAppMessage);
    }
  }
  
  public void sendMessageByWebModule(String paramString, AppMessage paramAppMessage)
  {
    paramString = (IWebModule)this.mWebModuleHashMap.get(paramString);
    if (paramString != null) {
      paramString.sendMessageByWebModule(paramAppMessage);
    }
  }
  
  public void setModuleConfigInfo(ArrayList<ModuleConfigBean> paramArrayList)
  {
    this.mModuleConfigInfo.clear();
    if (paramArrayList != null) {
      paramArrayList = paramArrayList.iterator();
    }
    for (;;)
    {
      if (!paramArrayList.hasNext()) {
        return;
      }
      ModuleConfigBean localModuleConfigBean = (ModuleConfigBean)paramArrayList.next();
      this.mModuleConfigInfo.add(localModuleConfigBean);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\module\ModuleManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */