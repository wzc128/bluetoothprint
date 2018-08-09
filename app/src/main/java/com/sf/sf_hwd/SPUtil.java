package com.sf.sf_hwd;

import android.content.Context;
import android.content.SharedPreferences;

public class SPUtil {

        private static final String FILE_NAME = "bluetooth_history";
        public static void setParam(Context context , String key, String value){

            SharedPreferences sp = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();
            editor.putString(key, value);
            editor.commit();
        }
        public static String getParam(Context context , String key, String defaultValue){
            SharedPreferences sp = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
            return sp.getString(key, defaultValue);
        }

}
