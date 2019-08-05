package itnova.com.cn.community.dto;

import lombok.Data;

/**
 * @author jin
 * @date 2019/7/18 - 13:18
 */
@Data
public class AccessTokenDTO {

    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
