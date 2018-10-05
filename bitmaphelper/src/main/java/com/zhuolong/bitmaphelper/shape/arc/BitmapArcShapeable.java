package com.zhuolong.bitmaphelper.shape.arc;

import android.graphics.Bitmap;
import android.graphics.Rect;

import com.zhuolong.bitmaphelper.shape.BitmapShapeOption;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/10/4
 *     desc   : 弧形图片裁剪实现接口
 *     version: 1.0
 * </pre>
 */
public interface BitmapArcShapeable {

    /**
     * 裁剪弧形图片，以源图片中心点为裁剪图片中点
     *
     * @param srcBp      源图片
     * @param startAngle 起始角度
     * @param sweepAngle 跨越角度
     * @param option     额外选项
     * @return 返回裁剪好的图片
     */
    Bitmap clipArcShapeInCenter(Bitmap srcBp, float startAngle, float sweepAngle, BitmapShapeOption option);

    /**
     * 按比例裁剪弧形图片，以源图片中心点为裁剪图片中点
     *
     * @param srcBp      源图片
     * @param startAngle 起始角度
     * @param sweepAngle 跨越角度
     * @param scale      裁剪比例
     * @param option     额外选项
     * @return 返回按比例裁剪好的图片
     */
    Bitmap clipArcShapeInCenter(Bitmap srcBp, float startAngle, float sweepAngle, float scale, BitmapShapeOption option);

    /**
     * 裁剪弧形图片
     *
     * @param srcBp      源图片
     * @param startAngle 起始角度
     * @param sweepAngle 跨越角度
     * @param rect       裁剪图形所在矩形
     * @param option     额外选项
     * @return 返回裁剪好的图片
     */
    Bitmap clipArcShape(Bitmap srcBp, float startAngle, float sweepAngle, Rect rect, BitmapShapeOption option);
}
