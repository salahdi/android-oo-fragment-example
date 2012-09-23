package com.example.android.fragments;

import android.os.Bundle;

import com.example.android.fragments.HeadlinesFragment.OnHeadlineSelectedListener;

interface AbstractNewsView extends OnHeadlineSelectedListener {
   public void onCreate(Bundle savedInstanceState);
   @Override public void onArticleSelected(int position);
}
