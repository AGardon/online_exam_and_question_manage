package com.example.online_exam_and_question_manage.domain.user.repository.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "role")
public class Role {

    /** 角色表主键id */
    @Id
    @Column(name = "role_id")
    private Long roleId;

    /** 角色名称 */
    @Column(name = "role_name")
    private String roleName;

    /** 角色的描述 */
    @Column(name = "role_description")
    private String roleDescription;

    /** 角色的详细功能阐述 */
    @Column(name = "role_detail")
    private String roleDetail;

    /** 当前角色所能访问的页面的id集合 */
    @Column(name = "role_page_ids")
    private String rolePageIds;
}
