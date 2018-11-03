package com.zhuolong.bitmaphelper.shape.arc;

import android.graphics.Bitmap;
import android.graphics.Rect;

import com.zhuolong.bitmaphelper.shape.BitmapShapeOption;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/11/3
 *     desc   : 供外界调用的抽象类
 *              实现BitmapArcShapeable
 *     version: 1.0
 * </pre>
 */
public class BitmapArcShapeHelper implements BitmapArcShapeable {

    private BitmapArcShapeable mShapeable;

    public BitmapArcShapeHelper() {
        this(new BitmapArcShape());
    }

    public BitmapArcShapeHelper(BitmapArcShapeable shapeable) {
        if (shapeable == null) {
            throw new IllegalArgumentException("shapeable can not be null!");
        }
        mShapeable = shapeable;
    }

    @Override
    public Bitmap clipArcShapeInCenter(Bitmap srcBp, float startAngle, float sweepAngle, BitmapShapeOption option) {
        return mShapeable.clipArcShapeInCenter(srcBp, startAngle, sweepAngle, option);
    }

    @Override
    public Bitmap clipArcShapeInCenter(Bitmap srcBp, float startAngle, float sweepAngle, float scale, BitmapShapeOption option) {
        return mShapeable.clipArcShapeInCenter(srcBp, startAngle, sweepAngle, scale, option);
    }

    @Override
    public Bitmap clipArcShape(Bitmap srcBp, float startAngle, float sweepAngle, Rect rect, BitmapShapeOption option) {
        return mShapeable.clipArcShape(srcBp, startAngle, sweepAngle, rect, option);
    }

    public BitmapArcShapeable getShapeable() {
        return mShapeable;
    }

    public void setShapeable(BitmapArcShapeable shapeable) {
        mShapeable = shapeable;
    }
}
