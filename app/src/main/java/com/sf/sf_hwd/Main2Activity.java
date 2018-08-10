package com.sf.sf_hwd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main2);
        webView = findViewById(R.id.webView);
        WebSettings settings = webView.getSettings();
        settings.setCacheMode(WebSettings.LOAD_NO_CACHE);//不使用缓存，只从网络获取数据.
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        webView.loadUrl("https://hda-miniarch.sf-express.com/hyd/");
        webView.setWebViewClient (new WebViewClient() {
            /* 这个事件，将在用户点击链接时触发。
             * 通过判断url，可确定如何操作，
             * 如果返回true，表示我们已经处理了这个request，
             * 如果返回false，表 示没有处理，
             * 那么浏览器将会根据url获取网页*/
            @Override
            public boolean shouldOverrideUrlLoading (WebView view, String url) {
                int i = url.indexOf("/appinteractive/print?authorization");
                if (i != -1) {
                    //跳转到某activity 跟据url内容匹配出信息，添加Bundle
                    showDetail(url.substring(url.indexOf("=") + 1));
                    return true; //表 示已经处理了这次URL的请求
                }
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                return super.onJsAlert(view, url, message, result);
            }
        });
    }
    private void showDetail(String authorization){
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("authorization",authorization);
        startActivity(intent);
    }
}
