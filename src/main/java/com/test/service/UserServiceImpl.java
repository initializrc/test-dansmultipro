package com.test.service;


import com.test.entity.User;
import com.test.model.UserModel;
import com.test.model.UserRequestModel;
import com.test.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.HttpServerErrorException;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public UserModel register(UserRequestModel requestModel) {
        User userByUsername = userRepository.findByUsername(requestModel.getUsername());
        if (userByUsername != null && userByUsername.getId() != null)
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "Username already exists");

        User user = new User();

        user.setUsername(requestModel.getUsername());
        user.setPassword(requestModel.getPassword());
        user.setUrl(requestModel.getUrl());
        user.setCompany(requestModel.getCompany());
        user.setCompany_url(requestModel.getCompany_url());
        user.setLocation(requestModel.getLocation());
        user.setTitle(requestModel.getTitle());
        user.setDescription(requestModel.getDescription());
        user.setHow_to_apply(requestModel.getHow_to_apply());
        user.setCompany_logo(requestModel.getCompany_logo());
        user.setType(User.Type.valueOf(requestModel.getType().toUpperCase()));
        user = userRepository.save(user);

        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(user, userModel);
        return userModel;
    }
}
