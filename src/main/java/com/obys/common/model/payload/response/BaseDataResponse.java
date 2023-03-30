package com.obys.common.model.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * The type Base data.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BaseDataResponse<T> {

  private T userDetails;
  private T userList;
  private T operationDetails;
  private T operationList;
  private String refreshToken;
  private String accessToken;
  private Date expireDate;
}
