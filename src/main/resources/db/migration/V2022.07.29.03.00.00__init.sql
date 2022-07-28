create table `flywaytestdb`.`review`
(
    `id`         binary(16)   not null,
    `user_id`    binary(16)   not null,
    `place_id`   binary(16)   not null,
    `content`    varchar(255) not null,
    `created_on` datetime(6)  not null,
    `updated_on` datetime(6)  not null,
    primary key (`id`)
) engine = InnoDB
  default charset = utf8mb4
  collate = utf8mb4_unicode_ci;
