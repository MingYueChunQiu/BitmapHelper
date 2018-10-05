package com.zhuolong.bitmaphelper.shape.path;

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
 *     time   : 2018/10/4
 *     desc   : 任意路径图片裁剪实现类
 *              实现BitmapPathShapeable
 *     version: 1.0
 * </pre>
 */
public class BitmapPathShape implements BitmapPathShapeable {

    @Override
    public Bitmap clipPathShapeInCenter(Bitmap srcBp, Path path, Rect rect, BitmapShapeOption option) {
        return clipPathShape(srcBp, path, rect, true, option);
    }

    @Override
    public Bitmap clipPathShape(Bitmap srcBp, Path path, Rect rect, BitmapShapeOption option) {
        return clipPathShape(srcBp, path, rect, false, option);
    }

    /**
     * 裁剪任意路径图片
     *
     * @param srcBp      源图片
     * @param path       裁剪的任意路径
     * @param rect       任意路径所在矩形
     * @param isInCenter 是否是处于源图片中央
     * @return 返回裁剪好的图片
     */
    private Bitmap clipPathShape(Bitmap srcBp, Path path, Rect rect, boolean isInCenter, BitmapShapeOption option) {
        if (srcBp == null) {
            return null;
        }
        int width = srcBp.getWidth();
        int height = srcBp.getHeight();
        int wideLength = width;
        int highLength = width;
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
        if (path != null) {
            canvas.clipPath(path);
        }
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        canvas.drawBitmap(srcBp, srcRect, destRect, paint);
        BitmapUtils.drawShapeOption(canvas, paint, path, option);
        return destBp;
    }
}
