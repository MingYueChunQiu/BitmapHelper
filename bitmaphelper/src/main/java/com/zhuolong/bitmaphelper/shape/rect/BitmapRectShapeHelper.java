package com.zhuolong.bitmaphelper.shape.rect;

import android.graphics.Bitmap;
import android.graphics.Rect;

import com.zhuolong.bitmaphelper.shape.BitmapShapeOption;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/11/3
 *     desc   : 供外界调用的抽象类
 *              实现BitmapRectShapeable
 *     version: 1.0
 * </pre>
 */
public class BitmapRectShapeHelper implements BitmapRectShapeable {

    private BitmapRectShapeable mShapeable;

    public BitmapRectShapeHelper() {
        this(new BitmapRectShape());
    }

    public BitmapRectShapeHelper(BitmapRectShapeable shapeable) {
        if (shapeable == null) {
            throw new IllegalArgumentException("shapeable can not be null!");
        }
        mShapeable = shapeable;
    }

    @Override
    public Bitmap clipRectShapeInCenter(Bitmap srcBp, Rect rect, BitmapShapeOption option) {
        return mShapeable.clipRectShapeInCenter(srcBp, rect, option);
    }

    @Override
    public Bitmap clipRectShapeInCenter(Bitmap srcBp, float left, float top, float right, float bottom, BitmapShapeOption option) {
        return mShapeable.clipRectShapeInCenter(srcBp, left, top, right, bottom, option);
    }

    @Override
    public Bitmap clipRectShape(Bitmap srcBp, Rect rect, BitmapShapeOption option) {
        return mShapeable.clipRectShape(srcBp, rect, option);
    }

    @Override
    public Bitmap clipRectShape(Bitmap srcBp, float left, float top, float right, float bottom, BitmapShapeOption option) {
        return mShapeable.clipRectShape(srcBp, left, top, right, bottom, option);
    }

    public BitmapRectShapeable getShapeable() {
        return mShapeable;
    }

    public void setShapeable(BitmapRectShapeable shapeable) {
        if (shapeable == null) {
            return;
        }
        mShapeable = shapeable;
    }
}
