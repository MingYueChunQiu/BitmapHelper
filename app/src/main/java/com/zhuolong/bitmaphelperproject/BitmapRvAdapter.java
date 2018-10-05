package com.zhuolong.bitmaphelperproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/10/5
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class BitmapRvAdapter extends RecyclerView.Adapter<BitmapRvAdapter.MyViewHolder> {

    private Context mContext;
    private List<Bitmap> mList;

    public BitmapRvAdapter(Context context, List<Bitmap> list) {
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.rv_bitmap_item, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        AppCompatImageView acivBitmap = myViewHolder.itemView.findViewById(R.id.iv_bitmap);
        acivBitmap.setImageBitmap(mList.get(i));
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
