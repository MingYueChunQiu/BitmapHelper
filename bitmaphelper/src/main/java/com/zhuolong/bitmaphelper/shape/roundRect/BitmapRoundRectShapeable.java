package com.zhuolong.bitmaphelper.shape.roundRect;

import android.graphics.Bitmap;
import android.graphics.Rect;

import com.zhuolong.bitmaphelper.shape.BitmapShapeOption;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/10/4
 *     desc   : 圆角矩形图片裁剪实现接口
 *     version: 1.0
 * </pre>
 */
public interface BitmapRoundRectShapeable {

    /**
     * 裁剪圆角矩形图片，以源图片中心点为裁剪图片中点
     *
     * @param srcBp  源图片
     * @param radius 裁剪的圆角半径（四个角半径一致）
     * @param option 额外选项
     * @return 返回裁剪好的图片
     */
    Bitmap clipRoundRectShapeInCenter(Bitmap srcBp, float radius, BitmapShapeOption option);

    /**
     * 裁剪圆角矩形图片，以源图片中心点为裁剪图片中点
     *
     * @param srcBp  源图片
     * @param radius 裁剪的圆角半径数组（上左；上右；下右；下左）
     * @param option 额外选项
     * @return 返回裁剪好的图片
     */
    Bitmap clipRoundRectShapeInCenter(Bitmap srcBp, float[] radius, BitmapShapeOption option);

    /**
     * 按比例裁圆角矩形图片，以源图片中心点为裁剪图片中点
     *
     * @param srcBp  源图片
     * @param radius 裁剪的圆角半径（四个角半径一致）
     * @param scale  裁剪比例
     * @param option 额外选项
     * @return 返回裁剪好的图片
     */
    Bitmap clipRoundRectShapeInCenter(Bitmap srcBp, float radius, float scale, BitmapShapeOption option);

    /**
     * 按比例裁圆角矩形图片，以源图片中心点为裁剪图片中点
     *
     * @param srcBp  源图片
     * @param radius 裁剪的圆角半径数组（上左；上右；下右；下左）
     * @param scale  裁剪比例
     * @param option 额外选项
     * @return 返回裁剪好的图片
     */
    Bitmap clipRoundRectShapeInCenter(Bitmap srcBp, float[] radius, float scale, BitmapShapeOption option);

    /**
     * 按比例裁圆角矩形图片
     *
     * @param srcBp  源图片
     * @param radius 裁剪的圆角半径（四个角半径一致）
     * @param rect   裁剪图形所在矩形
     * @param option 额外选项
     * @return 返回裁剪好的图片
     */
    Bitmap clipRoundRectShape(Bitmap srcBp, float radius, Rect rect, BitmapShapeOption option);

    /**
     * 按比例裁圆角矩形图片
     *
     * @param srcBp  源图片
     * @param radius 裁剪的圆角半径数组（上左；上右；下右；下左）
     * @param rect   裁剪图形所在矩形
     * @param option 额外选项
     * @return 返回裁剪好的图片
     */
    Bitmap clipRoundRectShape(Bitmap srcBp, float[] radius, Rect rect, BitmapShapeOption option);
}
