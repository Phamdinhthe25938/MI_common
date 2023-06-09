package com.the.common.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public abstract class BaseEntity {

  @CreatedBy
  @Column(name = "created_by", updatable = false, length = 100)
  private String createdBy;

  @CreatedDate
  @Temporal(TemporalType.TIMESTAMP)
  @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
  @Column(name = "created_date", updatable = false)
  private Date createdDate;

  @LastModifiedBy
  @Column(name = "updated_by", length = 100)
  private String updatedBy;

  @LastModifiedDate
  @Temporal(TemporalType.TIMESTAMP)
  @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
  @Column(name = "updated_date")
  private Date updatedDate;
}
