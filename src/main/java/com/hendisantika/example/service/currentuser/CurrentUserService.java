package com.hendisantika.example.service.currentuser;

import com.hendisantika.example.domain.CurrentUser;

public interface CurrentUserService {

  boolean canAccessUser(CurrentUser currentUser, Long userId);

}
