package io.alauda.user.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Builder;

import java.io.Serializable;
import java.sql.Date;

@AllArgsConstructor
@Builder
@Data
public class Message implements Serializable {

    private Long id;
    private Long userId;
    private Long projectId;
    private String type;
    private String content;
    private Date createTime;
}
