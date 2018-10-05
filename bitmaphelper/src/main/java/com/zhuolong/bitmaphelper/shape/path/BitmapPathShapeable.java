package com.zhuolong.bitmaphelper.shape.path;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Rect;

import com.zhuolong.bitmaphelper.shape.BitmapShapeOption;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/10/4
 *     desc   : 任意路径图片裁剪实现接口
 *     version: 1.0
 * </pre>
 */
public interface BitmapPathShapeable {

    /**
     * 裁剪任意路径图片，以源图片中心点为裁剪图片中点
     *
     * @param srcBp  源图片
     * @param path   裁剪的任意路径
     * @param rect   裁剪图形所在矩形
     * @param option 额外选项
     * @return 返回裁剪好的图片
     */
    Bitmap clipPathShapeInCenter(Bitmap srcBp, Path path, Rect rect, BitmapShapeOption option);

    /**
     * 裁剪任意路径图片
     *
     * @param srcBp  源图片
     * @param path   裁剪的任意路径
     * @param rect   裁剪图形所在矩形
     * @param option 额外选项
     * @return 返回裁剪好的图片
     */
    Bitmap clipPathShape(Bitmap srcBp, Path path, Rect rect, BitmapShapeOption option);
}
