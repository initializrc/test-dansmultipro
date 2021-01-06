package com.test.service;

import com.test.model.UserModel;
import com.test.model.UserRequestModel;

public interface UserService {

    UserModel register(UserRequestModel requestModel);
}
