package com.obys.common.model.payload.response;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
