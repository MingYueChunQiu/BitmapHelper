package com.zhuolong.bitmaphelper.shape.path;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Rect;

import com.zhuolong.bitmaphelper.shape.BitmapShapeOption;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/11/3
 *     desc   : 供外界调用的抽象类
 *              实现BitmapPathShapeable
 *     version: 1.0
 * </pre>
 */
public class BitmapPathShapeHelper implements BitmapPathShapeable {

    private BitmapPathShapeable mShapeable;

    public BitmapPathShapeHelper() {
        this(new BitmapPathShape());
    }

    public BitmapPathShapeHelper(BitmapPathShapeable shapeable) {
        if (shapeable == null) {
            throw new IllegalArgumentException("shapeable can not be null!");
        }
        mShapeable = shapeable;
    }

    @Override
    public Bitmap clipPathShapeInCenter(Bitmap srcBp, Path path, boolean isOffset, BitmapShapeOption option) {
        return mShapeable.clipPathShapeInCenter(srcBp, path, isOffset, option);
    }

    @Override
    public Bitmap clipPathShape(Bitmap srcBp, Path path, Rect rect, boolean isOffset, BitmapShapeOption option) {
        return mShapeable.clipPathShape(srcBp, path, rect, isOffset, option);
    }

    public BitmapPathShapeable getShapeable() {
        return mShapeable;
    }

    public void setShapeable(BitmapPathShapeable shapeable) {
        mShapeable = shapeable;
    }
}
