package com.jkb.support.photopicker.config;

/**
 * 图片选择器的配置类
 * Created by yj on 2017/5/16.
 */

public interface PhotoPickConfig {

    /**
     * 图片选择模式
     */
    interface PickMode {
        int SINGLE = 1001;//单张
        int MULTI = 1002;//多张
    }

    /**
     * 图片裁剪模式
     */
    interface ClipMode {
        int CIRCLE = 1001;//圆形
        int RECTANGLE = 1002;//方形
    }

    interface KeyBundle {
        String PHOTO_PICK = "photoPick";
        String PHOTO_PREVIEW_POSITION = "photo.preview.position";
        String PHOTO_PHOTOS = "photo.photos";

        String FRAGMENT_TAG_PICK = "fragment.tag.pick";
        String FRAGMENT_TAG_CLIP = "fragment.tag.clip";
        String FRAGMENT_TAG_PREVIEW = "fragment.tag.preView";
    }

    /**
     * 权限请求
     */
    interface RequestCode {
        int PERMISSION_SDCARD = 100;
        int PERMISSION_CAMERA = 200;

        int CAMERA = 1001;
    }
}
