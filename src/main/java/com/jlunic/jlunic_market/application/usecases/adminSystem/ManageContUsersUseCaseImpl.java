package com.jlunic.jlunic_market.application.usecases.adminSystem;

import com.jlunic.jlunic_market.domain.models.User;
import com.jlunic.jlunic_market.domain.ports.input.adminSystem.ManageContUsersUseCase;
import com.jlunic.jlunic_market.domain.ports.output.UserRepositoryPort;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@AllArgsConstructor
@RequiredArgsConstructor
public class ManageContUsersUseCaseImpl implements ManageContUsersUseCase {
    private final UserRepositoryPort userRepositoryPort;
    private PasswordEncoder passwordEncoder;

    @Override
    public User save(User user)
    {
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return userRepositoryPort.save(user);
    }
}
