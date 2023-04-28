package com.the.common.model;

import java.util.Date;

public interface IBaseDataRepository {

  String getCreatedBy();

  Date getCreatedDate();

  String getUpdatedBy();

  Date getUpdatedDate();
}
