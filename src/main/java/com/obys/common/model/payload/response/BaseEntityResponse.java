package com.obys.common.model.payload.response;

import lombok.Data;

import java.util.Date;

/**
 * The type Base data.
 */
@Data
public abstract class BaseEntityResponse {

  private String createdBy;
  private Date createdDate;
  private String updatedBy;
  private Date updatedDate;
}
