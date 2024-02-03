package com.gmail.renish.ecommerce.mapper;

import com.gmail.renish.ecommerce.domain.Review;
import com.gmail.renish.ecommerce.domain.User;
import com.gmail.renish.ecommerce.dto.RegistrationRequest;
import com.gmail.renish.ecommerce.dto.review.ReviewRequest;
import com.gmail.renish.ecommerce.dto.user.UpdateUserRequest;
import com.gmail.renish.ecommerce.dto.user.UserResponse;
import com.gmail.renish.ecommerce.util.TestConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    private ModelMapper modelMapper;

    @Test
    public void convertUserRequestDtoToEntity() {
        UpdateUserRequest userRequest = new UpdateUserRequest();
        userRequest.setFirstName(TestConstants.FIRST_NAME);

        User user = modelMapper.map(userRequest, User.class);
        assertEquals(userRequest.getFirstName(), user.getFirstName());
    }

    @Test
    public void convertRegistrationRequestDtoToEntity() {
        RegistrationRequest registrationRequest = new RegistrationRequest();
        registrationRequest.setFirstName(TestConstants.FIRST_NAME);
        registrationRequest.setEmail(TestConstants.USER_EMAIL);
        registrationRequest.setPassword(TestConstants.USER_PASSWORD);

        User user = modelMapper.map(registrationRequest, User.class);
        assertEquals(registrationRequest.getFirstName(), user.getFirstName());
        assertEquals(registrationRequest.getEmail(), user.getEmail());
        assertEquals(registrationRequest.getPassword(), user.getPassword());
    }

    @Test
    public void convertReviewToEntity() {
        ReviewRequest reviewRequest = new ReviewRequest();
        reviewRequest.setAuthor(TestConstants.FIRST_NAME);
        reviewRequest.setMessage("Hello World!");

        Review review = modelMapper.map(reviewRequest, Review.class);
        assertEquals(reviewRequest.getAuthor(), review.getAuthor());
        assertEquals(reviewRequest.getMessage(), review.getMessage());
    }

    @Test
    public void convertToResponseDto() {
        User user = new User();
        user.setFirstName(TestConstants.FIRST_NAME);
        user.setEmail(TestConstants.USER_EMAIL);

        UserResponse userRequestDto = modelMapper.map(user, UserResponse.class);
        assertEquals(user.getFirstName(), userRequestDto.getFirstName());
        assertEquals(user.getEmail(), userRequestDto.getEmail());
    }
}
