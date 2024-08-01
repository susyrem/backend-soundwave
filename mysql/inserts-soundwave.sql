USE soundwave;

-- Insertar 5 usuarios en la tabla `users`
INSERT INTO `soundwave`.`users` (`username`, `phone`, `email`, `created_at`, `password`) 
VALUES ('user1', '1234567890', 'user1@example.com', '2024-08-01', 'password1');

INSERT INTO `soundwave`.`users` (`username`, `phone`, `email`, `created_at`, `password`) 
VALUES ('user2', '2345678901', 'user2@example.com', '2024-08-01', 'password2');

INSERT INTO `soundwave`.`users` (`username`, `phone`, `email`, `created_at`, `password`) 
VALUES ('user3', '3456789012', 'user3@example.com', '2024-08-01', 'password3');

INSERT INTO `soundwave`.`users` (`username`, `phone`, `email`, `created_at`, `password`) 
VALUES ('user4', '4567890123', 'user4@example.com', '2024-08-01', 'password4');

INSERT INTO `soundwave`.`users` (`username`, `phone`, `email`, `created_at`, `password`) 
VALUES ('user5', '5678901234', 'user5@example.com', '2024-08-01', 'password5');


-- Insertar 5 perfiles en la tabla `profile`
INSERT INTO `soundwave`.`profile` (`name`, `description`, `user_img`, `birthday_date`, `location`, `user_id`) 
VALUES ('Profile 1', 'Description for profile 1', 'img1.jpg', '1990-01-01', 'Location 1', 1);

INSERT INTO `soundwave`.`profile` (`name`, `description`, `user_img`, `birthday_date`, `location`, `user_id`) 
VALUES ('Profile 2', 'Description for profile 2', 'img2.jpg', '1991-02-01', 'Location 2', 2);

INSERT INTO `soundwave`.`profile` (`name`, `description`, `user_img`, `birthday_date`, `location`, `user_id`) 
VALUES ('Profile 3', 'Description for profile 3', 'img3.jpg', '1992-03-01', 'Location 3', 3);

INSERT INTO `soundwave`.`profile` (`name`, `description`, `user_img`, `birthday_date`, `location`, `user_id`) 
VALUES ('Profile 4', 'Description for profile 4', 'img4.jpg', '1993-04-01', 'Location 4', 4);

INSERT INTO `soundwave`.`profile` (`name`, `description`, `user_img`, `birthday_date`, `location`, `user_id`) 
VALUES ('Profile 5', 'Description for profile 5', 'img5.jpg', '1994-05-01', 'Location 5', 5);


-- Insertar 5 posts en la tabla `posts`
INSERT INTO `soundwave`.`posts` (`content`, `url_spotify`, `creation_date`, `user_id`) 
VALUES ('Post content 1', 'http://spotify.com/track1', '2024-08-01 12:00:00', 1);

INSERT INTO `soundwave`.`posts` (`content`, `url_spotify`, `creation_date`, `user_id`) 
VALUES ('Post content 2', 'http://spotify.com/track2', '2024-08-01 13:00:00', 2);

INSERT INTO `soundwave`.`posts` (`content`, `url_spotify`, `creation_date`, `user_id`) 
VALUES ('Post content 3', 'http://spotify.com/track3', '2024-08-01 14:00:00', 3);

INSERT INTO `soundwave`.`posts` (`content`, `url_spotify`, `creation_date`, `user_id`) 
VALUES ('Post content 4', 'http://spotify.com/track4', '2024-08-01 15:00:00', 4);

INSERT INTO `soundwave`.`posts` (`content`, `url_spotify`, `creation_date`, `user_id`) 
VALUES ('Post content 5', 'http://spotify.com/track5', '2024-08-01 16:00:00', 5);


-- Insertar 5 comentarios en la tabla `comments`
INSERT INTO `soundwave`.`comments` (`content`, `date_comment`, `user_id`) 
VALUES ('Comment content 1', '2024-08-01 17:00:00', 1);

INSERT INTO `soundwave`.`comments` (`content`, `date_comment`, `user_id`) 
VALUES ('Comment content 2', '2024-08-01 18:00:00', 2);

INSERT INTO `soundwave`.`comments` (`content`, `date_comment`, `user_id`) 
VALUES ('Comment content 3', '2024-08-01 19:00:00', 3);

INSERT INTO `soundwave`.`comments` (`content`, `date_comment`, `user_id`) 
VALUES ('Comment content 4', '2024-08-01 20:00:00', 4);

INSERT INTO `soundwave`.`comments` (`content`, `date_comment`, `user_id`) 
VALUES ('Comment content 5', '2024-08-01 21:00:00', 5);


-- Insertar 5 notificaciones en la tabla `notifications`
INSERT INTO `soundwave`.`notifications` (`user_id`, `type`, `message`, `is_read`, `created_at`) 
VALUES (1, 'comment', 'You have a new comment!', FALSE, '2024-08-01 22:00:00');

INSERT INTO `soundwave`.`notifications` (`user_id`, `type`, `message`, `is_read`, `created_at`) 
VALUES (2, 'like', 'Someone liked your post!', FALSE, '2024-08-01 23:00:00');

INSERT INTO `soundwave`.`notifications` (`user_id`, `type`, `message`, `is_read`, `created_at`) 
VALUES (3, 'friend_request', 'You have a new friend request!', TRUE, '2024-08-02 00:00:00');

INSERT INTO `soundwave`.`notifications` (`user_id`, `type`, `message`, `is_read`, `created_at`) 
VALUES (4, 'message', 'You have a new message!', FALSE, '2024-08-02 01:00:00');

INSERT INTO `soundwave`.`notifications` (`user_id`, `type`, `message`, `is_read`, `created_at`) 
VALUES (5, 'comment', 'Your post has a new comment!', TRUE, '2024-08-02 02:00:00');


-- Insertar 5 amistades en la tabla `friends`
INSERT INTO `soundwave`.`friends` (`user_id1`, `user_id2`, `status`) 
VALUES (1, 2, 'accepted');

INSERT INTO `soundwave`.`friends` (`user_id1`, `user_id2`, `status`) 
VALUES (2, 3, 'pending');

INSERT INTO `soundwave`.`friends` (`user_id1`, `user_id2`, `status`) 
VALUES (3, 4, 'rejected');

INSERT INTO `soundwave`.`friends` (`user_id1`, `user_id2`, `status`) 
VALUES (4, 5, 'accepted');

INSERT INTO `soundwave`.`friends` (`user_id1`, `user_id2`, `status`) 
VALUES (5, 1, 'pending');



-- Insertar 5 reacciones en la tabla `reactions`
INSERT INTO `soundwave`.`reactions` (`post_id`, `user_id`, `type`, `created_at`) 
VALUES (1, 2, 'like', '2024-08-01 12:30:00');

INSERT INTO `soundwave`.`reactions` (`post_id`, `user_id`, `type`, `created_at`) 
VALUES (2, 3, 'like', '2024-08-01 13:30:00');

INSERT INTO `soundwave`.`reactions` (`post_id`, `user_id`, `type`, `created_at`) 
VALUES (3, 4, 'like', '2024-08-01 14:30:00');

INSERT INTO `soundwave`.`reactions` (`post_id`, `user_id`, `type`, `created_at`) 
VALUES (4, 5, 'like', '2024-08-01 15:30:00');

INSERT INTO `soundwave`.`reactions` (`post_id`, `user_id`, `type`, `created_at`) 
VALUES (5, 1, 'like', '2024-08-01 16:30:00');






