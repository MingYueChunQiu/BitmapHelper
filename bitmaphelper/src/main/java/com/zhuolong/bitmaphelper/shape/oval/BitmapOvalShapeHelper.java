package com.zhuolong.bitmaphelper.shape.oval;

import android.graphics.Bitmap;
import android.graphics.Rect;

import com.zhuolong.bitmaphelper.shape.BitmapShapeOption;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/11/3
 *     desc   : 供外界调用的抽象类
 *              实现BitmapOvalShapeable
 *     version: 1.0
 * </pre>
 */
public class BitmapOvalShapeHelper implements BitmapOvalShapeable {

    private BitmapOvalShapeable mShapeable;

    public BitmapOvalShapeHelper() {
        this(new BitmapOvalShape());
    }

    public BitmapOvalShapeHelper(BitmapOvalShapeable shapeable) {
        if (shapeable == null) {
            throw new IllegalArgumentException("shapeable can not be null!");
        }
        mShapeable = shapeable;
    }

    @Override
    public Bitmap clipOvalShapeInCenter(Bitmap srcBp, BitmapShapeOption option) {
        return mShapeable.clipOvalShapeInCenter(srcBp, option);
    }

    @Override
    public Bitmap clipOvalShapeInCenter(Bitmap srcBp, float scale, BitmapShapeOption option) {
        return mShapeable.clipOvalShapeInCenter(srcBp, scale, option);
    }

    @Override
    public Bitmap clipOvalShape(Bitmap srcBp, Rect rect, BitmapShapeOption option) {
        return mShapeable.clipOvalShape(srcBp, rect, option);
    }

    @Override
    public Bitmap clipOvalShape(Bitmap srcBp, float left, float top, float right, float bottom, BitmapShapeOption option) {
        return mShapeable.clipOvalShape(srcBp, left, top, right, bottom, option);
    }

    public BitmapOvalShapeable getShapeable() {
        return mShapeable;
    }

    public void setShapeable(BitmapOvalShapeable shapeable) {
        if (shapeable == null) {
            return;
        }
        mShapeable = shapeable;
    }
}
