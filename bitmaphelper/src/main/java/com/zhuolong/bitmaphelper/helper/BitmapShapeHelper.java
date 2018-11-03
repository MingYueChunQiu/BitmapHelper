package com.zhuolong.bitmaphelper.helper;

import android.support.annotation.NonNull;

import com.zhuolong.bitmaphelper.shape.arc.BitmapArcShapeHelper;
import com.zhuolong.bitmaphelper.shape.arc.BitmapArcShapeable;
import com.zhuolong.bitmaphelper.shape.circle.BitmapCircleShapeHelper;
import com.zhuolong.bitmaphelper.shape.circle.BitmapCircleShapeable;
import com.zhuolong.bitmaphelper.shape.oval.BitmapOvalShapeHelper;
import com.zhuolong.bitmaphelper.shape.oval.BitmapOvalShapeable;
import com.zhuolong.bitmaphelper.shape.path.BitmapPathShapeHelper;
import com.zhuolong.bitmaphelper.shape.path.BitmapPathShapeable;
import com.zhuolong.bitmaphelper.shape.rect.BitmapRectShapeHelper;
import com.zhuolong.bitmaphelper.shape.rect.BitmapRectShapeable;
import com.zhuolong.bitmaphelper.shape.roundRect.BitmapRoundRectShapeHelper;
import com.zhuolong.bitmaphelper.shape.roundRect.BitmapRoundRectShapeable;
import com.zhuolong.bitmaphelper.shape.square.BitmapSquareShapeHelper;
import com.zhuolong.bitmaphelper.shape.square.BitmapSquareShapeable;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/8/19
 *     desc   : 图片形状处理帮助类
 *     version: 1.0
 * </pre>
 */
public class BitmapShapeHelper {

    @NonNull
    public BitmapCircleShapeHelper getBitmapCircleShapeHelper() {
        return new BitmapCircleShapeHelper();
    }

    @NonNull
    public BitmapCircleShapeHelper getBitmapCircleShapeHelper(BitmapCircleShapeable shapeable) {
        return new BitmapCircleShapeHelper(shapeable);
    }

    @NonNull
    public BitmapSquareShapeHelper getBitmapSquareShapeHelper() {
        return new BitmapSquareShapeHelper();
    }

    @NonNull
    public BitmapSquareShapeHelper getBitmapSquareShapeHelper(BitmapSquareShapeable shapeable) {
        return new BitmapSquareShapeHelper(shapeable);
    }

    @NonNull
    public BitmapRoundRectShapeHelper getBitmapRoundRectShapeHelper() {
        return new BitmapRoundRectShapeHelper();
    }

    @NonNull
    public BitmapRoundRectShapeHelper getBitmapRoundRectShapeHelper(BitmapRoundRectShapeable shapeable) {
        return new BitmapRoundRectShapeHelper(shapeable);
    }

    @NonNull
    public BitmapPathShapeHelper getBitmapPathShapeHelper() {
        return new BitmapPathShapeHelper();
    }

    @NonNull
    public BitmapPathShapeHelper getBitmapPathShapeHelper(BitmapPathShapeable shapeable) {
        return new BitmapPathShapeHelper(shapeable);
    }

    @NonNull
    public BitmapArcShapeHelper getBitmapArcShapeHelper() {
        return new BitmapArcShapeHelper();
    }

    @NonNull
    public BitmapArcShapeHelper getBitmapArcShapeHelper(BitmapArcShapeable shapeable) {
        return new BitmapArcShapeHelper(shapeable);
    }

    @NonNull
    public BitmapRectShapeHelper getBitmapRectShapeHelper() {
        return new BitmapRectShapeHelper();
    }

    @NonNull
    public BitmapRectShapeHelper getBitmapRectShapeHelper(BitmapRectShapeable shapeable) {
        return new BitmapRectShapeHelper(shapeable);
    }

    @NonNull
    public BitmapOvalShapeHelper getBitmapOvalShapeHelper() {
        return new BitmapOvalShapeHelper();
    }

    @NonNull
    public BitmapOvalShapeHelper getBitmapOvalShapeHelper(BitmapOvalShapeable shapeable) {
        return new BitmapOvalShapeHelper(shapeable);
    }
}
