package com.zhuolong.bitmaphelper.shape.circle;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;

import com.zhuolong.bitmaphelper.shape.BitmapShapeOption;
import com.zhuolong.bitmaphelper.util.BitmapUtils;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/8/19
 *     desc   : 圆形图片裁剪实现类
 *              实现BitmapRoundable
 *     version: 1.0
 * </pre>
 */
class BitmapCircleShape implements BitmapCircleShapeable {

    @Override
    public Bitmap clipCircleShapeInCenter(Bitmap srcBp, BitmapShapeOption option) {
        return clipCircleShapeInCenter(srcBp, 1.0f, option);
    }

    @Override
    public Bitmap clipCircleShapeInCenter(Bitmap srcBp, float scale, BitmapShapeOption option) {
        return clipCircleShape(srcBp, scale, null, option);
    }

    @Override
    public Bitmap clipCircleShape(Bitmap srcBp, Rect rect, BitmapShapeOption option) {
        return clipCircleShape(srcBp, 1, rect, option);
    }

    /**
     * 裁剪圆形图片
     *
     * @param srcBp 源图片
     * @param scale 裁剪比例
     * @param rect  裁剪图形所在矩形
     * @return 返回裁剪好的图片
     */
    private Bitmap clipCircleShape(Bitmap srcBp, float scale, Rect rect, BitmapShapeOption option) {
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
        int radius = (wideLength < highLength ? wideLength : highLength) / 2;
        Bitmap destBp = Bitmap.createBitmap(radius * 2, radius * 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(destBp);
        Rect srcRect = rect;
        if (rect == null) {
            srcRect = new Rect();
            int left = (width - radius * 2) / 2;
            int top = (height - radius * 2) / 2;
            srcRect.set(left, top, left + radius * 2, top + radius * 2);
        }
        Rect destRect = new Rect();
        destRect.set(0, 0, radius * 2, radius * 2);
        Path path = new Path();
        path.addCircle(radius, radius, radius, Path.Direction.CW);
        BitmapUtils.clipPath(canvas, path, option);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        canvas.drawBitmap(srcBp, srcRect, destRect, paint);
        BitmapUtils.drawShapeOption(canvas, paint, path, option);
        return destBp;
    }
}
