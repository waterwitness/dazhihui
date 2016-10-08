/*创建时间hSea 2016-01-20 15:56:34 PM */
define(function(require,exports,module){function a(){this.obj={}}function b(){this.obj={}}function c(){}var d=require("appUtils"),e=require("gconfig");a.prototype.put=function(a,b){null!==a&&""!==a&&void 0!==a&&(this.obj[a]=b)},a.prototype.getString=function(a){return null===a||""===a||void 0===a?"":this.obj.hasOwnProperty(a)?String(this.obj[a]):""},a.prototype.getInt=function(a){return null===a||""===a||void 0===a?0:this.obj.hasOwnProperty(a)?parseInt(this.obj[a]):0},a.prototype.getFloat=function(a){return null===a||""===a||void 0===a?0:this.obj.hasOwnProperty(a)?parseFloat(this.obj[a]):0},a.prototype.getNumber=function(a){return null===a||""===a||void 0===a?0:this.obj.hasOwnProperty(a)?Number(this.obj[a]):0},a.prototype.getBoolean=function(a){return null===a||""===a||void 0===a?!1:this.obj.hasOwnProperty(a)?Boolean(this.obj[a]):!1},a.prototype.getObject=function(a){return null===a||""===a||void 0===a?null:this.obj.hasOwnProperty(a)?this.obj[a]:null},a.prototype.fromObject=function(a){if(null!==a)for(var b in a)this.obj[b]=a[b]},a.prototype.toObject=function(){return this.obj},a.prototype.clear=function(){for(var a in this.obj)delete this.obj[a],this.obj[a]=null;this.obj=null},a.prototype.clone=function(){var b=new a;return b.fromObject(this.toObject()),b},b.consts={PROTOCOL:"protocol",URL:"url",REQPARAM:"reqParam",ISLASTREQ:"isLastReq",ISASYNC:"isAsync",ISSHOWWAIT:"isShowWait",ISSHOWOVERLAY:"isShowOverLay",TIPSWORDS:"tipsWords",TIMEOUTFUNC:"timeOutFunc",ERRORFUNC:"errorFunc",DATATYPE:"dataType",ISGLOBAL:"isGlobal",CACHETIME:"cacheTime",CACHETYPE:"cacheType",REQTYPE:"reqType"},b.prototype=new a,b.prototype.setProtocol=function(a){a=a||e.global.protocol||"ajax",this.put(b.consts.PROTOCOL,a)},b.prototype.getProtocol=function(){return this.getString(b.consts.PROTOCOL)},b.prototype.setUrl=function(a){this.put(b.consts.URL,a)},b.prototype.getUrl=function(){return this.getString(b.consts.URL)},b.prototype.setReqParam=function(a){this.put(b.consts.REQPARAM,a)},b.prototype.getReqParam=function(){return this.getObject(b.consts.REQPARAM)},b.prototype.setIsAsync=function(a){a="undefined"==typeof a||""===a?!0:a,this.put(b.consts.ISASYNC,a)},b.prototype.getIsAsync=function(){return this.getBoolean(b.consts.ISASYNC)},b.prototype.setIsLastReq=function(a){a="undefined"==typeof a||""===a?!0:a,this.put(b.consts.ISLASTREQ,a)},b.prototype.getIsLastReq=function(){return this.getBoolean(b.consts.ISLASTREQ)},b.prototype.setIsShowWait=function(a){a="undefined"==typeof a||""===a?!0:a,this.put(b.consts.ISSHOWWAIT,a)},b.prototype.getIsShowWait=function(){return this.getBoolean(b.consts.ISSHOWWAIT)},b.prototype.setIsShowOverLay=function(a){a="undefined"==typeof a||""===a?!0:a,this.put(b.consts.ISSHOWOVERLAY,a)},b.prototype.getIsShowOverLay=function(){return this.getBoolean(b.consts.ISSHOWOVERLAY)},b.prototype.setTipsWords=function(a){a=a||"请等待...",this.put(b.consts.TIPSWORDS,a)},b.prototype.getTipsWords=function(){return this.getString(b.consts.TIPSWORDS)},b.prototype.setCacheTime=function(a){this.put(b.consts.CACHETIME,a)},b.prototype.getCacheTime=function(){return this.getObject(b.consts.CACHETIME)},b.prototype.setCacheType=function(a){this.put(b.consts.CACHETYPE,a)},b.prototype.getCacheType=function(){return this.getObject(b.consts.CACHETYPE)},b.prototype.setReqType=function(a){this.put(b.consts.REQTYPE,a)},b.prototype.getReqType=function(){return this.getObject(b.consts.REQTYPE)},b.prototype.setTimeOutFunc=function(a){this.put(b.consts.TIMEOUTFUNC,a)},b.prototype.getTimeOutFunc=function(){return this.getObject(b.consts.TIMEOUTFUNC)},b.prototype.setErrorFunc=function(a){this.put(b.consts.ERRORFUNC,a)},b.prototype.getErrorFunc=function(){return this.getObject(b.consts.ERRORFUNC)},b.prototype.setDataType=function(a){a=a||"json",this.put(b.consts.DATATYPE,a)},b.prototype.getIsGlobal=function(){return this.getBoolean(b.consts.ISGLOBAL)},b.prototype.setIsGlobal=function(a){a="undefined"==typeof a||""===a?!1:a,this.put(b.consts.ISGLOBAL,a)},b.prototype.getDataType=function(){return this.getString(b.consts.DATATYPE)},b.prototype.clone=function(){var a=new b;return a.fromObject(this.toObject()),a},c.prototype.invoke=function(a,b){var c=a.getUrl();d.getSStorageInfo("jsessionid")&&c.indexOf(";jessionid=")<0&&(c=c+";jsessionid="+d.getSStorageInfo("jsessionid"));var e=a.getReqParam(),f=a.getIsLastReq(),g=a.getIsAsync(),h=a.getIsShowWait(),i=a.getIsShowOverLay(),j=a.getTipsWords(),k=a.getTimeOutFunc(),l=a.getErrorFunc(),m=a.getDataType(),n=a.getIsGlobal(),o=a.getCacheTime(),p=a.getCacheType(),q=a.getReqType(),r=a.getProtocol();require.async(r,function(module){module.request(c,e,function(a){d.executeFilter(a)||b&&b(a)},f,g,h,i,j,k,m,n,l,o,p,q)})},c.prototype.destroy=function(){},module.exports={ReqParamVo:b,Service:c}});
/*创建时间 2016-01-20 15:56:34 PM */