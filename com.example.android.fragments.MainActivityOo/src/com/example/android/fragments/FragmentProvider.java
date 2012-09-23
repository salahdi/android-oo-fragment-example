package com.example.android.fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

abstract public class FragmentProvider {
   public void onCreate(FragmentActivity activity, Bundle savedInstanceState) {
      if (savedInstanceState != null && activity.findViewById(R.id.fragment_container) != null) {
         addFirstFragment();
      }
   }

   abstract public void addFirstFragment();
}
