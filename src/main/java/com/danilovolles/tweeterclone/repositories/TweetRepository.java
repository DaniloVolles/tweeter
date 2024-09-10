package com.danilovolles.tweeterclone.repositories;

import com.danilovolles.tweeterclone.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
