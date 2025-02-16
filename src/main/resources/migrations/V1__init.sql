CREATE TABLE employee
(
    id SERIAL PRIMARY KEY ,
    name TEXT NOT NULL,
    salary NUMERIC(10,2) NOT NULL,
    department TEXT NOT NULL,
    manager BOOLEAN NOT NULL,
    created_at TIMESTAMP NOT NULL
);