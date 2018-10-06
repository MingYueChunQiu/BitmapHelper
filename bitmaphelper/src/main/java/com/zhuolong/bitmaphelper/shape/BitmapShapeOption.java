package com.zhuolong.bitmaphelper.shape;

/**
 * <pre>
 *     author : 明月春秋
 *     e-mail : xiyujieit@163.com
 *     time   : 2018/10/5
 *     desc   : 画笔形状额外选项类
 *     version: 1.0
 * </pre>
 */
public class BitmapShapeOption {

    private int mStrokeWidth;//画笔线宽
    private int mStrokeColor;//画笔线颜色
    private boolean hasInverseEvenOdd;//是否反转判断图片内外的奇偶规则

    public BitmapShapeOption() {
    }

    public BitmapShapeOption(Builder builder) {
        if (builder == null) {
            return;
        }
        mStrokeWidth = builder.strokeWidth;
        mStrokeColor = builder.strokeColor;
        this.hasInverseEvenOdd = hasInverseEvenOdd;
    }

    public int getStrokeWidth() {
        return mStrokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        mStrokeWidth = strokeWidth;
    }

    public int getStrokeColor() {
        return mStrokeColor;
    }

    public void setStrokeColor(int strokeColor) {
        mStrokeColor = strokeColor;
    }

    public boolean isHasInverseEvenOdd() {
        return hasInverseEvenOdd;
    }

    public void setHasInverseEvenOdd(boolean hasInverseEvenOdd) {
        this.hasInverseEvenOdd = hasInverseEvenOdd;
    }

    public static class Builder {
        private int strokeWidth;//画笔线宽
        private int strokeColor;//画笔线颜色
        private boolean hasInverseEvenOdd;//是否反转判断图片内外的奇偶规则

        public BitmapShapeOption build() {
            return new BitmapShapeOption(this);
        }

        public int getStrokeWidth() {
            return strokeWidth;
        }

        public Builder setStrokeWidth(int strokeWidth) {
            this.strokeWidth = strokeWidth;
            return this;
        }

        public int getStrokeColor() {
            return strokeColor;
        }

        public Builder setStrokeColor(int strokeColor) {
            this.strokeColor = strokeColor;
            return this;
        }

        public boolean isHasInverseEvenOdd() {
            return hasInverseEvenOdd;
        }

        public Builder setHasInverseEvenOdd(boolean hasInverseEvenOdd) {
            this.hasInverseEvenOdd = hasInverseEvenOdd;
            return this;
        }
    }
}
