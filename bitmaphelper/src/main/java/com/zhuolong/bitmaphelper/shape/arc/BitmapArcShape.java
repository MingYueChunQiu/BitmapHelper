package com.zhuolong.bitmaphelper.shape.arc;

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
 *     desc   : 弧形图片裁剪实现类
 *              实现BitmapArcShapeable
 *     version: 1.0
 * </pre>
 */
public class BitmapArcShape implements BitmapArcShapeable {

    @Override
    public Bitmap clipArcShapeInCenter(Bitmap srcBp, float startAngle, float sweepAngle, BitmapShapeOption option) {
        return clipArcShapeInCenter(srcBp, startAngle, sweepAngle, 1.0f, option);
    }

    @Override
    public Bitmap clipArcShapeInCenter(Bitmap srcBp, float startAngle, float sweepAngle, float scale,
                                       BitmapShapeOption option) {
        return clipArcShape(srcBp, startAngle, sweepAngle, scale, null, option);
    }

    @Override
    public Bitmap clipArcShape(Bitmap srcBp, float startAngle, float sweepAngle, Rect rect,
                               BitmapShapeOption option) {
        return clipArcShape(srcBp, startAngle, sweepAngle, 1, rect, option);
    }

    /**
     * 裁剪弧形图片
     *
     * @param srcBp      源图片
     * @param startAngle 起始角度
     * @param sweepAngle 跨越角度
     * @param scale      裁剪比例
     * @param rect       裁剪图形所在矩形
     * @return 返回裁剪好的图片
     */
    private Bitmap clipArcShape(Bitmap srcBp, float startAngle, float sweepAngle, float scale,
                                Rect rect, BitmapShapeOption option) {
        if (srcBp == null) {
            return null;
        }
        int width = srcBp.getWidth();
        int height = srcBp.getHeight();
        if (scale <= 0 || scale > 1) {
            scale = 1;
        }
        int wideLength = (int) (width * scale);
        int highLength = (int) (height * scale);
        if (rect != null) {
            wideLength = rect.width();
            highLength = rect.height();
        }
        Bitmap destBp = Bitmap.createBitmap(wideLength, highLength, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(destBp);
        Rect srcRect = rect;
        if (rect == null) {
            srcRect = new Rect();
            int left = (width - wideLength) / 2;
            int top = (height - highLength) / 2;
            srcRect.set(left, top, left + wideLength, top + highLength);
        }
        Rect destRect = new Rect();
        destRect.set(0, 0, wideLength, highLength);
        if (startAngle < 0) {
            startAngle = 0;
        }
        if (sweepAngle < 0) {
            sweepAngle = 0;
        }
        Path path = new Path();
        path.addArc(new RectF(destRect), startAngle, sweepAngle);
        canvas.clipPath(path);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        canvas.drawBitmap(srcBp, srcRect, destRect, paint);
        BitmapUtils.drawShapeOption(canvas, paint, path, option);
        return destBp;
    }
}
