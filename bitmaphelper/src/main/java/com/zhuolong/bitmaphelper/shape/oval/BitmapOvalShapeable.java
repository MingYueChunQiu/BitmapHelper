package com.zhuolong.bitmaphelper.shape.oval;

import android.graphics.Bitmap;
import android.graphics.Rect;

import com.zhuolong.bitmaphelper.shape.BitmapShapeOption;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/10/4
 *     desc   : 椭圆形图片裁剪实现接口
 *     version: 1.0
 * </pre>
 */
public interface BitmapOvalShapeable {

    /**
     * 裁剪椭圆形图片，以源图片中心点为裁剪图片中点
     *
     * @param srcBp  源图片
     * @param option 额外选项
     * @return 返回裁剪好的图片
     */
    Bitmap clipOvalShapeInCenter(Bitmap srcBp, BitmapShapeOption option);

    /**
     * 按比例裁剪椭圆形图片，以源图片中心点为裁剪图片中点
     *
     * @param srcBp  源图片
     * @param scale  裁剪比例
     * @param option 额外选项
     * @return 返回按比例裁剪好的图片
     */
    Bitmap clipOvalShapeInCenter(Bitmap srcBp, float scale, BitmapShapeOption option);

    /**
     * 按比例裁剪椭圆形图片
     *
     * @param srcBp  源图片
     * @param rect   裁剪矩形
     * @param option 额外选项
     * @return 返回按比例裁剪好的图片
     */
    Bitmap clipOvalShape(Bitmap srcBp, Rect rect, BitmapShapeOption option);

    /**
     * 按比例裁剪椭圆形图片
     *
     * @param srcBp  源图片
     * @param left   裁剪矩形左边距离
     * @param top    裁剪矩形上边距离
     * @param right  裁剪矩形长度
     * @param bottom 裁剪矩形高度
     * @param option 额外选项
     * @return 返回按比例裁剪好的图片
     */
    Bitmap clipOvalShape(Bitmap srcBp, float left, float top, float right, float bottom, BitmapShapeOption option);
}
