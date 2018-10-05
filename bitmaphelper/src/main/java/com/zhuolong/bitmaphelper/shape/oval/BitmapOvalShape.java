package com.zhuolong.bitmaphelper.shape.oval;

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
 *     desc   : 椭圆形图片裁剪实现类
 *              实现BitmapOvalShapeable
 *     version: 1.0
 * </pre>
 */
public class BitmapOvalShape implements BitmapOvalShapeable {

    @Override
    public Bitmap clipOvalShapeInCenter(Bitmap srcBp, BitmapShapeOption option) {
        return clipOvalShapeInCenter(srcBp, 1.0f, option);
    }

    @Override
    public Bitmap clipOvalShapeInCenter(Bitmap srcBp, float scale, BitmapShapeOption option) {
        return clipOvalShape(srcBp, scale, null, option);
    }

    @Override
    public Bitmap clipOvalShape(Bitmap srcBp, Rect rect, BitmapShapeOption option) {
        return clipOvalShape(srcBp, 1, rect, option);
    }

    @Override
    public Bitmap clipOvalShape(Bitmap srcBp, float left, float top, float right, float bottom, BitmapShapeOption option) {
        Rect rect = new Rect();
        BitmapUtils.getRectF(left, top, right, bottom).roundOut(rect);
        return clipOvalShape(srcBp, rect, option);
    }

    /**
     * 裁剪椭圆形图片
     *
     * @param srcBp 源图片
     * @param scale 裁剪比例
     * @param rect  裁剪图形所在矩形
     * @return 返回裁剪好的图片
     */
    private Bitmap clipOvalShape(Bitmap srcBp, float scale, Rect rect, BitmapShapeOption option) {
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
        Path path = new Path();
        path.addOval(new RectF(destRect), Path.Direction.CW);
        canvas.clipPath(path);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        canvas.drawBitmap(srcBp, srcRect, destRect, paint);
        BitmapUtils.drawShapeOption(canvas, paint, path, option);
        return destBp;
    }
}
