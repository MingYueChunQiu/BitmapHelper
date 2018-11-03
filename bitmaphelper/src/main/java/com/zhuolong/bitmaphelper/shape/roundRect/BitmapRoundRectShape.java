package com.zhuolong.bitmaphelper.shape.roundRect;

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
 *     desc   : 圆角矩形图片裁剪实现类
 *              实现BitmapRoundRectShapeable
 *     version: 1.0
 * </pre>
 */
class BitmapRoundRectShape implements BitmapRoundRectShapeable {

    @Override
    public Bitmap clipRoundRectShapeInCenter(Bitmap srcBp, float radius, BitmapShapeOption option) {
        return clipRoundRectShapeInCenter(srcBp, radius, 1.0f, option);
    }

    @Override
    public Bitmap clipRoundRectShapeInCenter(Bitmap srcBp, float[] radius, BitmapShapeOption option) {
        return clipRoundRectShapeInCenter(srcBp, radius, 1.0f, option);
    }

    @Override
    public Bitmap clipRoundRectShapeInCenter(Bitmap srcBp, float radius, float scale, BitmapShapeOption option) {
        if (radius < 0) {
            radius = 0;
        }
        return clipRoundRectShapeInCenter(srcBp,
                new float[]{radius, radius, radius, radius, radius, radius, radius, radius},
                scale, option);
    }

    @Override
    public Bitmap clipRoundRectShapeInCenter(Bitmap srcBp, float[] radius, float scale, BitmapShapeOption option) {
        return clipRoundRectShape(srcBp, radius, scale, null, option);
    }

    @Override
    public Bitmap clipRoundRectShape(Bitmap srcBp, float radius, Rect rect, BitmapShapeOption option) {
        if (radius < 0) {
            radius = 0;
        }
        return clipRoundRectShape(srcBp,
                new float[]{radius, radius, radius, radius, radius, radius, radius, radius},
                1, rect, option);
    }

    @Override
    public Bitmap clipRoundRectShape(Bitmap srcBp, float[] radius, Rect rect, BitmapShapeOption option) {
        return clipRoundRectShape(srcBp, radius, 1, rect, option);
    }

    /**
     * 裁剪圆角矩形图片
     *
     * @param srcBp  源图片
     * @param radius 裁剪的圆角半径数组（上左；上右；下右；下左）
     * @param scale  裁剪比例
     * @param rect   裁剪图形所在矩形
     * @return 返回裁剪好的图片
     */
    private Bitmap clipRoundRectShape(Bitmap srcBp, float[] radius, float scale, Rect rect, BitmapShapeOption option) {
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
        Path path = null;
        if (radius != null) {
            path = new Path();
            path.addRoundRect(new RectF(destRect), radius, Path.Direction.CW);
            BitmapUtils.clipPath(canvas, path, option);
        }
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        canvas.drawBitmap(srcBp, srcRect, destRect, paint);
        BitmapUtils.drawShapeOption(canvas, paint, path, option);
        return destBp;
    }
}
