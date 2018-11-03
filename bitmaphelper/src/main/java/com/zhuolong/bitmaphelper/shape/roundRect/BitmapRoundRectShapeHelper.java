package com.zhuolong.bitmaphelper.shape.roundRect;

import android.graphics.Bitmap;
import android.graphics.Rect;

import com.zhuolong.bitmaphelper.shape.BitmapShapeOption;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/11/3
 *     desc   : 供外界调用的抽象类
 *              实现BitmapRoundRectShapeable
 *     version: 1.0
 * </pre>
 */
public class BitmapRoundRectShapeHelper implements BitmapRoundRectShapeable {

    private BitmapRoundRectShapeable mShapeable;

    public BitmapRoundRectShapeHelper() {
        this(new BitmapRoundRectShape());
    }

    public BitmapRoundRectShapeHelper(BitmapRoundRectShapeable shapeable) {
        if (shapeable == null) {
            throw new IllegalArgumentException("shapeable can not be null!");
        }
        mShapeable = shapeable;
    }

    @Override
    public Bitmap clipRoundRectShapeInCenter(Bitmap srcBp, float radius, BitmapShapeOption option) {
        return mShapeable.clipRoundRectShapeInCenter(srcBp, radius, option);
    }

    @Override
    public Bitmap clipRoundRectShapeInCenter(Bitmap srcBp, float[] radius, BitmapShapeOption option) {
        return mShapeable.clipRoundRectShapeInCenter(srcBp, radius, option);
    }

    @Override
    public Bitmap clipRoundRectShapeInCenter(Bitmap srcBp, float radius, float scale, BitmapShapeOption option) {
        return mShapeable.clipRoundRectShapeInCenter(srcBp, radius, scale, option);
    }

    @Override
    public Bitmap clipRoundRectShapeInCenter(Bitmap srcBp, float[] radius, float scale, BitmapShapeOption option) {
        return mShapeable.clipRoundRectShapeInCenter(srcBp, radius, scale, option);
    }

    @Override
    public Bitmap clipRoundRectShape(Bitmap srcBp, float radius, Rect rect, BitmapShapeOption option) {
        return mShapeable.clipRoundRectShape(srcBp, radius, rect, option);
    }

    @Override
    public Bitmap clipRoundRectShape(Bitmap srcBp, float[] radius, Rect rect, BitmapShapeOption option) {
        return mShapeable.clipRoundRectShape(srcBp, radius, rect, option);
    }

    public BitmapRoundRectShapeable getShapeable() {
        return mShapeable;
    }

    public void setShapeable(BitmapRoundRectShapeable shapeable) {
        if (shapeable == null) {
            return;
        }
        mShapeable = shapeable;
    }
}
