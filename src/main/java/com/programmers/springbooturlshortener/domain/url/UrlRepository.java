package com.programmers.springbooturlshortener.domain.url;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UrlRepository extends JpaRepository<Url, Long> {

    Optional<Url> findByOriginUrl(String originUrl);
}