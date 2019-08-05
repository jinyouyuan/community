package itnova.com.cn.community.dto;

import lombok.Data;

/**
 * @author jin
 * @date 2019/7/18 - 14:02
 */
@Data
public class GitHubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
