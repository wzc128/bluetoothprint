package com.sf.sf_hwd;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class LoginActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }


 private void test() {
     HttpUtils.doGetAsyn("https://apiv3.test.soolife.net/v3/app/fmenu", new HttpUtils.CallBack()  {
     @Override
     public void onRequestComplete(String result) {
         System.out.println(result);
     }
 });
 }
}
