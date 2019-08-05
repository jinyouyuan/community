package itnova.com.cn.community.dto;

import itnova.com.cn.community.model.User;
import lombok.Data;

/**
 * @author jin
 * @date 2019/8/5 - 15:58
 */
@Data
public class QuestionDTO {
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
    private User user;
}
