package com.zhuolong.bitmaphelper.shape.square;

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
 *     time   : 2018/8/19
 *     desc   : 方形图片裁剪实现类
 *              实现BitmapSquareable
 *     version: 1.0
 * </pre>
 */
public class BitmapSquareShape implements BitmapSquareShapeable {

    @Override
    public Bitmap clipSquareShapeInCenter(Bitmap srcBp, BitmapShapeOption option) {
        return clipSquareShapeInCenter(srcBp, 1.0f, option);
    }

    @Override
    public Bitmap clipSquareShapeInCenter(Bitmap srcBp, float scale, BitmapShapeOption option) {
        return clipSquareShape(srcBp, scale, null, option);
    }

    @Override
    public Bitmap clipSquareShape(Bitmap srcBp, Rect rect, BitmapShapeOption option) {
        return clipSquareShape(srcBp, 1, rect, option);
    }

    /**
     * 裁剪方形图片
     *
     * @param srcBp 源图片
     * @param scale 裁剪比例
     * @param rect  裁剪图形所在矩形
     * @return 返回裁剪好的图片
     */
    private Bitmap clipSquareShape(Bitmap srcBp, float scale, Rect rect, BitmapShapeOption option) {
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
        int border = (wideLength < highLength ? wideLength : highLength) / 2;
        Bitmap destBp = Bitmap.createBitmap(border * 2, border * 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(destBp);
        Rect srcRect = rect;
        if (rect == null) {
            srcRect = new Rect();
            int left = (width - border * 2) / 2;
            int top = (height - border * 2) / 2;
            srcRect.set(left, top, left + border * 2, top + border * 2);
        }
        Rect destRect = new Rect();
        destRect.set(0, 0, border * 2, border * 2);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        canvas.drawBitmap(srcBp, srcRect, destRect, paint);
        Path path = new Path();
        path.addRect(new RectF(destRect), Path.Direction.CW);
        BitmapUtils.drawShapeOption(canvas, paint, path, option);
        return destBp;
    }
}
