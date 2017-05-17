package com.etong.mall.domain;

public class CommonGoodsVOWithBLOBs extends CommonGoodsVO {
    /** 图片路径 */
    private String imagePath;

    /** 页面描述 */
    private String pageDesc;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    public String getPageDesc() {
        return pageDesc;
    }

    public void setPageDesc(String pageDesc) {
        this.pageDesc = pageDesc == null ? null : pageDesc.trim();
    }
}