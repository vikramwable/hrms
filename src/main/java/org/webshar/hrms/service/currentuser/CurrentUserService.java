package org.webshar.hrms.service.currentuser;

import org.webshar.hrms.domain.CurrentUser;

public interface CurrentUserService
{

  boolean canAccessUser(CurrentUser currentUser, Long userId);

}
