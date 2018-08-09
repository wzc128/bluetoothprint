package com.sf.sf_hwd;


import android.os.Parcel;
import android.os.Parcelable;

public class Data implements Parcelable {

   String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public int describeContents() {
      return 0;
   }

   @Override
   public void writeToParcel(Parcel dest, int flags) {
      dest.writeString(this.name);
   }

   public Data() {
   }

   protected Data(Parcel in) {
      this.name = in.readString();
   }

   public static final Parcelable.Creator<Data> CREATOR = new Parcelable.Creator<Data>() {
      @Override
      public Data createFromParcel(Parcel source) {
         return new Data(source);
      }

      @Override
      public Data[] newArray(int size) {
         return new Data[size];
      }
   };
}
