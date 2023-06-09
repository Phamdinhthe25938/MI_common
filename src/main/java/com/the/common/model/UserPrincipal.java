package com.the.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserPrincipal {

  private String username;

  private String email;

  private String name;

  private Long roleId;

  private String constructionSiteId;

  @Default
  private List<? extends GrantedAuthority> grantedAuthorities = new ArrayList<>();
}
