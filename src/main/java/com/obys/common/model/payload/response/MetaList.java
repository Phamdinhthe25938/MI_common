package com.obys.common.model.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MetaList {

  private Long total;
  private Integer pageNum;
  private Integer pageSize;
  private String sortBy;
  private Boolean sortDesc;
}
