package com.example.demo.custom;

import com.example.demo.model.User;
import org.assertj.core.api.AbstractAssert;

public class UserAssert extends AbstractAssert<UserAssert, User> {

    UserAssert(User user) {
        super(user, UserAssert.class);
    }

    public static UserAssert assertThat(User actual) {
        return new UserAssert(actual);
    }

    public UserAssert hasRegistrationDate() {
        isNotNull();
        if (actual.getRegistrationDate() == null) {
            failWithMessage(
                    "Expected user to have a registration date, but it was null"
            );
        }
        return this;
    }
}