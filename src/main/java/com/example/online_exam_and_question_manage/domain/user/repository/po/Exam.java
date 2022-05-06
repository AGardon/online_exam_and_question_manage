package com.example.online_exam_and_question_manage.domain.user.repository.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/** @Description @Author AGarden @Date 2022-04-11 @Email w2603494062@gmail.com */
@Data
@Entity
public class Exam {

    /** 考试表的主键 */
    @Id private String examId;

    /** 考试名称 */
    private String examName;

    /** 考试的预览图 */
    private String examAvatar;

    /** 考试描述 */
    private String examDescription;

    /** 当前考试下的题目的id用-连在一起地字符串 */
    private String examQuestionIds;

    /** 当前考试下的题目单选题的id用-连在一起地字符串 */
    private String examQuestionIdsRadio;

    /** 当前考试下的题目多选题的id用-连在一起地字符串 */
    private String examQuestionIdsCheck;

    /** 当前考试下的题目判断题的id用-连在一起地字符串 */
    private String examQuestionIdsJudge;

    /** 当前考试的总分数 */
    private Integer examScore;

    /** 当前考试每个单选题的分数 */
    private Integer examScoreRadio;

    /** 当前考试每个多选题的分数 */
    private Integer examScoreCheck;

    /** 当前考试每个判断题的分数 */
    private Integer examScoreJudge;

    /** 考试创建者的用户id */
    private String examCreatorId;

    /** 考试的时间限制，单位为分钟 */
    private Integer examTimeLimit;

    /** 考试有效期开始时间 */
    private Date examStartDate;

    /** 考试有效期结束时间 */
    private Date examEndDate;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;
}
