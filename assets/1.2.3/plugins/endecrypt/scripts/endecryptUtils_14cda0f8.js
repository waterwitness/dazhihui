/*创建时间hSea 2016-01-20 15:56:34 PM */
define(function(require,exports,module){function a(a,b){var c=f.enc.Utf8.parse(a),d=f.enc.Utf8.parse(b),e=f.enc.Utf8.parse(a),g=f.AES.encrypt(d,c,{iv:e,mode:f.mode.CBC});return g.toString()}function b(a,b){var c=f.enc.Utf8.parse(a),d=f.enc.Utf8.parse(a),e=f.enc.Base64.parse(b),g=f.AES.decrypt({ciphertext:e},c,{iv:d,mode:f.mode.CBC});return g.toString(f.enc.Utf8)}function c(a,b){var c=g.enc.Utf8.parse(a),d=g.enc.Utf8.parse(b),e=g.DES.encrypt(d,c,{mode:g.mode.ECB,padding:g.pad.Pkcs7});return e.toString()}function d(a,b){var c=g.enc.Utf8.parse(a),d=g.enc.Base64.parse(b),e=g.DES.decrypt({ciphertext:d},c,{mode:g.mode.ECB,padding:g.pad.Pkcs7});return e.toString(g.enc.Utf8)}function e(a,b,c){return h.setPublic(a,b),"encrypt_rsa:"+h.encrypt(c)}var f=require("aes"),g=require("des"),h=require("rsa"),i={aesEncrypt:a,aesDecrypt:b,desEncrypt:c,desDecrypt:d,rsaEncrypt:e};module.exports=i});
/*创建时间 2016-01-20 15:56:34 PM */