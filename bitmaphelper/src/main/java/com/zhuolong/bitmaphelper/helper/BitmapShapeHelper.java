package com.zhuolong.bitmaphelper.helper;

import android.support.annotation.NonNull;

import com.zhuolong.bitmaphelper.shape.arc.BitmapArcShape;
import com.zhuolong.bitmaphelper.shape.arc.BitmapArcShapeable;
import com.zhuolong.bitmaphelper.shape.circle.BitmapCircleShape;
import com.zhuolong.bitmaphelper.shape.circle.BitmapCircleShapeable;
import com.zhuolong.bitmaphelper.shape.oval.BitmapOvalShape;
import com.zhuolong.bitmaphelper.shape.oval.BitmapOvalShapeable;
import com.zhuolong.bitmaphelper.shape.path.BitmapPathShape;
import com.zhuolong.bitmaphelper.shape.path.BitmapPathShapeable;
import com.zhuolong.bitmaphelper.shape.rect.BitmapRectShape;
import com.zhuolong.bitmaphelper.shape.rect.BitmapRectShapeable;
import com.zhuolong.bitmaphelper.shape.roundRect.BitmapRoundRectShape;
import com.zhuolong.bitmaphelper.shape.roundRect.BitmapRoundRectShapeable;
import com.zhuolong.bitmaphelper.shape.square.BitmapSquareShape;
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
    public BitmapCircleShapeable getBitmapCircleShapeImpl() {
        return new BitmapCircleShape();
    }

    @NonNull
    public BitmapSquareShapeable getBitmapSquareShapeImpl() {
        return new BitmapSquareShape();
    }

    @NonNull
    public BitmapRoundRectShapeable getBitmapRoundRectShapeImpl() {
        return new BitmapRoundRectShape();
    }

    @NonNull
    public BitmapPathShapeable getBitmapPathShapeImpl() {
        return new BitmapPathShape();
    }

    @NonNull
    public BitmapArcShapeable getBitmapArcShapeImpl() {
        return new BitmapArcShape();
    }

    @NonNull
    public BitmapRectShapeable getBitmapRectShapeImpl() {
        return new BitmapRectShape();
    }

    @NonNull
    public BitmapOvalShapeable getBitmapOvalShapeImpl() {
        return new BitmapOvalShape();
    }
}
