package com.zhuolong.bitmaphelper.shape.square;

import android.graphics.Bitmap;
import android.graphics.Rect;

import com.zhuolong.bitmaphelper.shape.BitmapShapeOption;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/11/3
 *     desc   : 供外界调用的抽象类
 *              实现BitmapSquareShapeable
 *     version: 1.0
 * </pre>
 */
public class BitmapSquareShapeHelper implements BitmapSquareShapeable {

    private BitmapSquareShapeable mShapeable;

    public BitmapSquareShapeHelper() {
        this(new BitmapSquareShape());
    }

    public BitmapSquareShapeHelper(BitmapSquareShapeable shapeable) {
        if (shapeable == null) {
            throw new IllegalArgumentException("shapeable can not be null!");
        }
        mShapeable = shapeable;
    }

    @Override
    public Bitmap clipSquareShapeInCenter(Bitmap srcBp, BitmapShapeOption option) {
        return mShapeable.clipSquareShapeInCenter(srcBp, option);
    }

    @Override
    public Bitmap clipSquareShapeInCenter(Bitmap srcBp, float scale, BitmapShapeOption option) {
        return mShapeable.clipSquareShapeInCenter(srcBp, scale, option);
    }

    @Override
    public Bitmap clipSquareShape(Bitmap srcBp, Rect rect, BitmapShapeOption option) {
        return mShapeable.clipSquareShape(srcBp, rect, option);
    }

    public BitmapSquareShapeable getShapeable() {
        return mShapeable;
    }

    public void setShapeable(BitmapSquareShapeable shapeable) {
        mShapeable = shapeable;
    }
}
