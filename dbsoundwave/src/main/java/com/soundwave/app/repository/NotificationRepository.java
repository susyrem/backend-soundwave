package com.soundwave.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.soundwave.app.model.Notification;


public interface NotificationRepository extends CrudRepository<Notification, Long> {

}