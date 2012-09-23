package com.example.android.fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class DoublePaneNewsView implements AbstractNewsView {

   private final FragmentActivity fragmentActivity;

   public DoublePaneNewsView(FragmentActivity fragmentActivity) {
      this.fragmentActivity = fragmentActivity;
   }

   @Override public void onCreate(Bundle savedInstanceState) {
   }

   @Override public void onArticleSelected(int position) {
      ((ArticleFragment) fragmentActivity.getSupportFragmentManager().findFragmentById(
         R.id.article_fragment)).updateArticleView(position);
   }

}
