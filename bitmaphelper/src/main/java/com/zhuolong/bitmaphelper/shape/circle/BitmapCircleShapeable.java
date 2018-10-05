package com.zhuolong.bitmaphelper.shape.circle;

import android.graphics.Bitmap;
import android.graphics.Rect;

import com.zhuolong.bitmaphelper.shape.BitmapShapeOption;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/10/3
 *     desc   : 圆形图片裁剪实现接口
 *     version: 1.0
 * </pre>
 */
public interface BitmapCircleShapeable {

    /**
     * 裁剪圆形图片，以源图片中心点为裁剪图片中点
     *
     * @param srcBp  源图片
     * @param option 额外选项
     * @return 返回裁剪好的图片
     */
    Bitmap clipCircleShapeInCenter(Bitmap srcBp, BitmapShapeOption option);

    /**
     * 按比例裁剪圆形图片，以源图片中心点为裁剪图片中点
     *
     * @param srcBp  源图片
     * @param scale  裁剪比例
     * @param option 额外选项
     * @return 返回按比例裁剪好的图片
     */
    Bitmap clipCircleShapeInCenter(Bitmap srcBp, float scale, BitmapShapeOption option);

    /**
     * 按比例裁剪圆形图片
     *
     * @param srcBp  源图片
     * @param rect   裁剪图形所在矩形
     * @param option 额外选项
     * @return 返回按比例裁剪好的图片
     */
    Bitmap clipCircleShape(Bitmap srcBp, Rect rect, BitmapShapeOption option);
}
