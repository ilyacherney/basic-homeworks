create table tests (
    id integer not null,
    test_name varchar,
    constraint tests_pk primary key (id)
);

create table questions (
    id integer not null,
    question_text varchar,
    test_id integer not null,
    constraint questions_pk primary key (id),
    constraint question_test_fk foreign key (test_id) references tests (id)
);

create table answers (
    id integer not null,
    answer_text varchar,
    question_id integer not null,
    constraint answers_pk primary key (id),
    constraint answer_question_fk foreign key (question_id) references questions (id)
);
