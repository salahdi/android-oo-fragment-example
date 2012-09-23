package com.example.android.fragments;

import android.support.v4.app.FragmentActivity;

public class AbstractNewsViewProvider {
   private final FragmentActivity fragmentActivity;
   public AbstractNewsViewProvider(FragmentActivity activity) {
      this.fragmentActivity = activity;
   }
   public AbstractNewsView get() {
      if (fragmentActivity.findViewById(R.id.fragment_container) != null) {
           return new SinglePaneNewsView(fragmentActivity);
        } else {
           return new DoublePaneNewsView(fragmentActivity);
        }
   }
}
