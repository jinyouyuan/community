package itnova.com.cn.community.model;

import lombok.Data;

/**
 * @author jin
 * @date 2019/7/19 - 11:01
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private long gmtModified;
    private String avatarUrl;
}
