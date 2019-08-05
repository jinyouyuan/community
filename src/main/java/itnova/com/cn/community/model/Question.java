package itnova.com.cn.community.model;

import lombok.Data;

/**
 * @author jin
 * @date 2019/7/30 - 15:03
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private long gmtCreate;
    private long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
}
