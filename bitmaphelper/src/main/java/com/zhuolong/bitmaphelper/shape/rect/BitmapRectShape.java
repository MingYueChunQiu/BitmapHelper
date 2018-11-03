package com.zhuolong.bitmaphelper.shape.rect;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

import com.zhuolong.bitmaphelper.shape.BitmapShapeOption;
import com.zhuolong.bitmaphelper.util.BitmapUtils;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/10/4
 *     desc   : 矩形图片裁剪实现类
 *              实现BitmapRectShapeable
 *     version: 1.0
 * </pre>
 */
class BitmapRectShape implements BitmapRectShapeable {

    @Override
    public Bitmap clipRectShapeInCenter(Bitmap srcBp, Rect rect, BitmapShapeOption option) {
        return clipRectShape(srcBp, rect, true, option);
    }

    @Override
    public Bitmap clipRectShapeInCenter(Bitmap srcBp, float left, float top, float right, float bottom,
                                        BitmapShapeOption option) {
        Rect rect = new Rect();
        BitmapUtils.getRectF(left, top, right, bottom).roundOut(rect);
        return clipRectShapeInCenter(srcBp, rect, option);
    }

    @Override
    public Bitmap clipRectShape(Bitmap srcBp, Rect rect, BitmapShapeOption option) {
        return clipRectShape(srcBp, rect, false, option);
    }

    @Override
    public Bitmap clipRectShape(Bitmap srcBp, float left, float top, float right, float bottom,
                                BitmapShapeOption option) {
        Rect rect = new Rect();
        BitmapUtils.getRectF(left, top, right, bottom).roundOut(rect);
        return clipRectShape(srcBp, rect, option);
    }

    /**
     * 裁剪矩形图片
     *
     * @param srcBp      源图片
     * @param rect       裁剪图形所在矩形
     * @param isInCenter 是否是处于源图片中央
     * @return 返回裁剪好的图片
     */
    private Bitmap clipRectShape(Bitmap srcBp, Rect rect, boolean isInCenter, BitmapShapeOption option) {
        if (srcBp == null) {
            return null;
        }
        int width = srcBp.getWidth();
        int height = srcBp.getHeight();
        int wideLength = width;
        int highLength = height;
        if (rect != null) {
            wideLength = rect.width();
            highLength = rect.height();
        }
        Bitmap destBp = Bitmap.createBitmap(wideLength, highLength, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(destBp);
        Rect srcRect = rect;
        if (isInCenter) {
            srcRect = new Rect();
            int left = (width - wideLength) / 2;
            int top = (height - highLength) / 2;
            srcRect.set(left, top, left + wideLength, top + highLength);
        }
        Rect destRect = new Rect();
        destRect.set(0, 0, wideLength, highLength);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        canvas.drawBitmap(srcBp, srcRect, destRect, paint);
        Path path = new Path();
        path.addRect(new RectF(destRect), Path.Direction.CW);
        BitmapUtils.drawShapeOption(canvas, paint, path, option);
        return destBp;
    }
}
