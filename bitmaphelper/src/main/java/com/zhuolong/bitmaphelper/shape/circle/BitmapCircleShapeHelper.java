package com.zhuolong.bitmaphelper.shape.circle;

import android.graphics.Bitmap;
import android.graphics.Rect;

import com.zhuolong.bitmaphelper.shape.BitmapShapeOption;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/11/3
 *     desc   : 供外界调用的抽象类
 *              实现BitmapCircleShapeable
 *     version: 1.0
 * </pre>
 */
public class BitmapCircleShapeHelper implements BitmapCircleShapeable {

    private BitmapCircleShapeable mShapeable;

    public BitmapCircleShapeHelper() {
        this(new BitmapCircleShape());
    }

    public BitmapCircleShapeHelper(BitmapCircleShapeable shapeable) {
        if (shapeable == null) {
            throw new IllegalArgumentException("shapeable can not be null!");
        }
        mShapeable = shapeable;
    }

    @Override
    public Bitmap clipCircleShapeInCenter(Bitmap srcBp, BitmapShapeOption option) {
        return mShapeable.clipCircleShapeInCenter(srcBp, option);
    }

    @Override
    public Bitmap clipCircleShapeInCenter(Bitmap srcBp, float scale, BitmapShapeOption option) {
        return mShapeable.clipCircleShapeInCenter(srcBp, scale, option);
    }

    @Override
    public Bitmap clipCircleShape(Bitmap srcBp, Rect rect, BitmapShapeOption option) {
        return mShapeable.clipCircleShape(srcBp, rect, option);
    }

    public BitmapCircleShapeable getShapeable() {
        return mShapeable;
    }

    public void setShapeable(BitmapCircleShapeable shapeable) {
        mShapeable = shapeable;
    }
}
