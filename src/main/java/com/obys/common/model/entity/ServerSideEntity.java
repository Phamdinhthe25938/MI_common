package com.obys.common.model.entity;

import lombok.Data;

/**
 * The type Server side entity.
 */
@Data
public class ServerSideEntity {

  private Integer size = 50;

  private Integer page = 1;

  private String sortBy;

  private Boolean sortDesc;
}
