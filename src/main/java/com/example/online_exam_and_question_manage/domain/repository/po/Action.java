package com.example.online_exam_and_question_manage.domain.repository.po;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Action {
  @Id
  @GeneratedValue
  private long actionId;

  private String actionName;

  private String actionDescription;

  private long defaultCheck;
}
