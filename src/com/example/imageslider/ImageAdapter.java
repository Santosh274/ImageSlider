package com.example.imageslider;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdapter extends PagerAdapter {
Context context;
private int[] GalImages = new int[] {
R.drawable.ic_launcher,
R.drawable.ic_launcher,
R.drawable.ic_launcher
};
ImageAdapter(Context context){
this.context=context;
}
@Override
public int getCount() {
return GalImages.length;
}
 
@Override
public boolean isViewFromObject(View view, Object object) {
return view == ((ImageView) object);
}
 
@Override
public Object instantiateItem(ViewGroup container, int position) {
ImageView imageView = new ImageView(context);
int padding = context.getResources().getDimensionPixelSize(R.dimen.activity_horizontal_margin);
imageView.setPadding(padding, padding, padding, padding);
imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
imageView.setImageResource(GalImages[position]);
((ViewPager) container).addView(imageView, 0);
return imageView;
}
}