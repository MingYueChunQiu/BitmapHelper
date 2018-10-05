package com.zhuolong.bitmaphelperproject;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zhuolong.bitmaphelper.BitmapHelperFactory;
import com.zhuolong.bitmaphelper.helper.BitmapShapeHelper;
import com.zhuolong.bitmaphelper.shape.BitmapShapeOption;
import com.zhuolong.bitmaphelper.util.ScreenUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvBitmaps = findViewById(R.id.rv_bitmaps);
        rvBitmaps.setLayoutManager(new GridLayoutManager(this, 2));
        BitmapShapeHelper helper = BitmapHelperFactory.newBitmapShapeHelper();
        List<Bitmap> list = new ArrayList<>();
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.demo);
        list.add(bitmap);
        BitmapShapeOption option = new BitmapShapeOption.Builder()
                .setStrokeWidth((int) ScreenUtils.getPxFromDp(getResources(), 2))
                .setStrokeColor(Color.BLUE).build();
        list.add(helper.getBitmapCircleShapeImpl().clipCircleShapeInCenter(bitmap, 0.5f, option));
        list.add(helper.getBitmapSquareShapeImpl().clipSquareShapeInCenter(bitmap, 0.5f, null));
        option.setStrokeWidth((int) ScreenUtils.getPxFromDp(getResources(), 4));
        option.setStrokeColor(Color.RED);
        list.add(helper.getBitmapOvalShapeImpl().clipOvalShapeInCenter(bitmap, 0.4f, option));
        Rect rect = new Rect(200, 200, 800, 600);
        list.add(helper.getBitmapArcShapeImpl().clipArcShape(bitmap, 30, 180, rect, null));
        option.setStrokeColor(Color.GREEN);
        list.add(helper.getBitmapRectShapeImpl().clipRectShapeInCenter(bitmap, rect, option));
        option.setStrokeColor(Color.GRAY);
        list.add(helper.getBitmapRoundRectShapeImpl().clipRoundRectShapeInCenter(bitmap,
                new float[]{100, 100, 0, 0, 100, 100, 0, 0}, 0.7f, option));
        Path path = new Path();
        path.moveTo(150, 0);
        path.lineTo(400, 300);
        path.lineTo(150, 400);
        path.lineTo(100, 100);
        path.close();
        option.setStrokeColor(Color.YELLOW);
        list.add(helper.getBitmapPathShapeImpl().clipPathShapeInCenter(bitmap, path, rect, option));
        rvBitmaps.setAdapter(new BitmapRvAdapter(this, list));
    }
}
