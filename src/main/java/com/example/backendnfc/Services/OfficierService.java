package com.example.backendnfc.Services;

import com.example.backendnfc.DTOs.AuthRequest;
import com.example.backendnfc.DTOs.OfficierDto;
import com.example.backendnfc.Entities.Officier;
import com.example.backendnfc.Mappers.OfficierMapping;
import com.example.backendnfc.Repositories.OfficierRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class OfficierService implements UserDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(OfficierService.class);

    @Autowired
    private  OfficierRepository officierRepository;
    @Autowired
    private OfficierMapping officierMapping;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.debug("Recherche de l'utilisateur : {}", username);
        Officier officier = findOfficierByUsername(username);
        return new User(officier.getUsername(), officier.getPassword(), getGrantedAuthorities(officier.getRole()));
    }

    private List<GrantedAuthority> getGrantedAuthorities(String role) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
        return authorities;
    }

    public OfficierDto getUserInfo(String username) {
        Officier officier = findOfficierByUsername(username);
        return officierMapping.fromOfficier(officier);
    }

    public Officier findByUsername(String username) {
        return findOfficierByUsername(username);
    }
    private Officier findOfficierByUsername(String username) {
        Officier officier = officierRepository.findByUsername(username);
        if (officier == null) {
            logger.error("Officier non trouvé avec le nom d'utilisateur : {}", username);
            throw new UsernameNotFoundException("Officier non trouvé avec le nom d'utilisateur : " + username);
        }
        return officier;
    }

}
