CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    balanse INT NOT NULL
);

CREATE TABLE orders (
    id SERIAL PRIMARY KEY,
    ordsum INT NOT NULL,
    iduser INT NOT NULL REFERENCES users(id),
    ordnum TEXT NOT NULL
);
