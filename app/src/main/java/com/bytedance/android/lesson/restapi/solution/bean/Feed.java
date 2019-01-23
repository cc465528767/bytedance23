package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:18
 */
public class Feed {
    /**
     * student_id : 3220180750
     * user_name : wenjiahao
     * image_url : http://10.108.10.39:8080/minidouyin/storage/image?path=3220180750/wenjiahao/1548168445735/1401852806.tmp
     * video_url : http://10.108.10.39:8080/minidouyin/storage/video?path=3220180750/wenjiahao/1548168445735/Screenrecorder-2019-01-21-21-48-53-171.mp4
     */
    @SerializedName("student_id")
    private String student_id;
    @SerializedName("user_name")
    private String user_name;
    @SerializedName("image_url")
    private String image_url;
    @SerializedName("video_url")
    private String video_url;

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }



}
