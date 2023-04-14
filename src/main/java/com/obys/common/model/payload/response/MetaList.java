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
  private Integer pageNum = 50;
  private Integer pageSize = 0;
  private String sortBy = "id";
  private Boolean sortDesc = true;
}
